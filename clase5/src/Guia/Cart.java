package Guia;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cart {

  private CartItem[] items;
  private double subtotal;
  private int totalQuantity;

  public Cart(CartItem[] items) {
    this.items = items;
    this.setTotalQuantity();
    this.setSubtotal();
  }

  private void setTotalQuantity() {
    for (int i = 0; i < this.items.length; i++) { // for loop executes only if element is a non-null value (same for for-each?)
      this.totalQuantity++;
    }
  }

  private void setSubtotal() {
    double subtotal = 0.0;

    int index = 0;
    for (CartItem item : items) {
      subtotal = subtotal + item.getProductTotal();
      index++;
    }

    this.subtotal = subtotal;
  }

  public int getTotalQuantity() {
    return this.totalQuantity;
  }

  public double getSubtotal() {
    return this.subtotal;
  }

  // Read products from file logic
  public static CartItem[] getProductsFromFile(String path) throws Exception {
    CartItem[] items;
    Path filePath = Paths.get(path);
    // Defines the amount of products that the cart will have by counting the lines in the file
    int linesNumber = (int) Files.lines(filePath).count();
    items = new CartItem[linesNumber];

    // Runs over every line in the file and splits the data from each line where ; is present
    int index = 0;
    for (String line : Files.readAllLines(filePath)) {
      String[] splitted = line.split("; ");

      // Hardcoded validation of supposed data format (hoping name;price;quantity
      if (splitted.length > 5 || splitted.length < 2) {
        continue;
        // continues iterating ignoring the line with the wrong format or data
        // alternative: throw new Exception("Error on file format or wrong data");
      }

      // if line in file only has name and price, instances CartItem with name and price
      if (splitted.length == 2) {
        items[index] = new CartItem(
                new Product(
                        splitted[0],
                        Double.valueOf(splitted[1])
                ));
      } else if (splitted.length == 3) {
        // instances CartItem with name and price (which will define the product) and then the quantity
        items[index] = new CartItem(
                new Product(
                        splitted[0],
                        Double.valueOf(splitted[1])
                        ),
                Integer.valueOf(splitted[2]));
      } else {
        if (splitted[3].equals("fixed")) {
          items[index] = new CartItem(
                  new Product(
                          splitted[0],
                          Double.valueOf(splitted[1]),
                          new FixedDiscount(Integer.valueOf(splitted[4]))
                          ),
                  Integer.valueOf(splitted[2]));
        } else {
          items[index] = new CartItem(
                  new Product(
                          splitted[0],
                          Double.valueOf(splitted[1]),
                          new PercentualDiscount(Integer.valueOf(splitted[4]))
                  ),
                  Integer.valueOf(splitted[2]));
        }
      }

      index++;
    }

    return items;
  }

  public static void main(String[] args) {

    // FROM FILE
    String fileDir = ".\\src\\Guia\\products.txt";

    try {
      CartItem[] products = getProductsFromFile(fileDir);
      Cart cart = new Cart(products);
      System.out.printf("The subtotal of the cart is: %f.", cart.getSubtotal());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
