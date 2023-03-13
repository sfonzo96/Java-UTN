package EjerciciosClase;

import java.nio.file.*;
public class Cart {

  private Product[] products;
  private Double subtotal;
  private int totalQuantity;

  public Cart(Product[] products) {
    this.products = products;

    for(int i = 0; i < products.length; i++) { // for loop executes only if element is a non-null value
      this.totalQuantity++;
    }

    this.setSubtotal();
  }

  private void setSubtotal() {
    Double subtotal = 0.0;

    for (int i = 0; i < products.length; i++) {
      subtotal = subtotal + products[i].getPrice();
    }

    this.subtotal = subtotal;
  }

  public int getTotalQuantity() {
    return this.totalQuantity;
  }
  public Double getSubtotal() {
    return this.subtotal;
  }
  public static Product[] createProductsFromFile(String path) throws Exception{
      Product[] products;
      Path filePath = Paths.get(path);
      int linesNumber = (int) Files.lines(filePath).count();
      products = new Product[linesNumber];

      int index = 0;
      for (String line : Files.readAllLines(filePath)) {
        String[] splitted = line.split(";");
        if (splitted.length <= 1) {
          products[index] = new Product(splitted[0]);
        } else {
          products[index] = new Product(splitted[0], Double.valueOf(splitted[1]));
        }

        index++;
      }

    return products;
  }

  public static void main(String[] args) throws Exception{

    // HARDCODED

    // Product nutella = new Product("Nutella",387.76);
    // Product tuna = new Product("Tuna");
    // Product brieCheese = new Product("Brie Cheese", 1009.77);

    // Product[] products = {nutella, tuna, brieCheese};

    // Cart cart = new Cart(products);
    // System.out.printf("The subtotal of the cart is: %d.", cart.getSubtotal());

    // FROM FILE
    String fileDir = ".\\src\\EjerciciosClase\\products.txt";

    try {
      Product[] products = createProductsFromFile(fileDir);
      Cart cart = new Cart(products);
      System.out.printf("The subtotal of the cart is: %f.", cart.getSubtotal());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
