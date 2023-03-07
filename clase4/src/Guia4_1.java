import java.util.*;

public class Guia4_1 {
  public static void main(String[] args) {

    // item 1a
    // int[] numbers = new int[]{1,5,10};
    // String order = "d"; //"d" for descendant "a" for ascendant

    //item 1b
    // int[] numbers = createNumbersArray();
    // String order = chooseOrder();

    System.out.printf("Ordered array is: %s.%n", Arrays.toString(sortArray()));

    // In 1a, if array and order passed to sortArray method is hardcoded it works with those
    // Different from 1a, in 1b those params can be defined asking the user and then passed to the sortArray method
    // If only array is passed it will ask the order to the user (invalid order ends with no sorting)
    // If no parameter is passed it will ask the user for those numbers and the order (invalid order ends with no sorting)
    // Applied method overloading for the optionality feature
  }

  private static int[] createNumbersArray() {
    System.out.println("Enter the quantity of numbers you want to use:");
    Scanner quantityInput = new Scanner(System.in);
    int quantity = Integer.parseInt(quantityInput.next());

    int[] numbers;
    numbers = new int[quantity];

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter a number:");
      Scanner input = new Scanner(System.in);
      int newNumb = Integer.parseInt(input.next());

      numbers[i] = newNumb;
    }

    return numbers;
  }

  private static String chooseOrder() {

    System.out.println("Set the order you want to sort the numbers (d for descendant and a for ascendant):");
    Scanner input = new Scanner(System.in);
    String order = input.next();

    return order;
  }
  private static int[] sortArray(int[] array, String order){
    if (order.equals("a")) {
      Arrays.sort(array);
      return array;
    } else if (order.equals("d")) {
      int[] reversed = new int[array.length];
      Arrays.sort(array);

      for (int i = 0, j = array.length -1; i <= array.length - 1; i++, j-- ) {
        reversed[j] = array [i];
      }

      return reversed;
    }

    System.out.println("Since order was invalid, the array wasn't ordered.");

    return array;
  }

  private static int[] sortArray(int[] array) {
    String order = chooseOrder();
    return sortArray(array, order);
  }

  private static int[] sortArray() {
    int[] numbers = createNumbersArray();
    String order = chooseOrder();

    return sortArray(numbers, order);
  }
}
