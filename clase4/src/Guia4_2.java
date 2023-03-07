import java.nio.file.*;

public class Guia4_2 {
  public static void main(String[] args) throws Exception {
    String pathFile = ".\\src\\numbers.txt"; // Dependent on where it's executed from, default considered is project folder

    // item 2a
    System.out.println("Default operation will be addition");
    System.out.printf("The sum of all the numbers in the file is: %d.%n", operateFileNumbers(pathFile));

    // item 2b
    String operation = "multiplication"; // Any other value results in addition
    System.out.printf("The result of the operation performed is: %d.%n", operateFileNumbers(pathFile, operation));
  }

  private static int operateFileNumbers(String pathFile) throws Exception {

    int sum = 0;

    for (String line : Files.readAllLines(Paths.get(pathFile))) {
      int number = Integer.parseInt(line);
      sum += number;
    }

    return sum;
  }

  private static int operateFileNumbers(String pathFile, String operation) throws Exception {

    if (operation.equals("multiplication")) {
      int product = 1;

      for (String line : Files.readAllLines(Paths.get(pathFile))) {
        product *= Integer.parseInt(line);
      }

      return product;
    } else if (operation.equals("addition")){
      return operateFileNumbers(pathFile);
    }

    System.out.println("No operation was specified so output is 0.");

    return 0;
  }
}
