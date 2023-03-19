package Guia;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CartItemsGenerator {
  // Read products from file logic
  public static CartItem[] getProductsFromFile(String path) {
    CartItem[] items = new CartItem[0];
    try {
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
                          Double.parseDouble(splitted[1])
                  ));
        } else if (splitted.length == 3) {
          // if line in file has name, price and quantity, instances CartItem with name and price (which will define the product) and then the quantity
          items[index] = new CartItem(
                  new Product(
                          splitted[0],
                          Double.parseDouble(splitted[1])
                  ),
                  Integer.parseInt(splitted[2]));
        }
        index++;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return items;
  }
}
