import java.util.*;

public class Ejercicio1 {
  public static void main(String[] args) {
    int max = getMax(setNumbers());
    System.out.printf("The maximum number amongst introduced is: %d.%n", max);

    int sum = sum(setNumbers());
    System.out.printf("The sum of all numbers introduced is: %d.%n", sum);
  }

  private static int[] setNumbers() {
    System.out.println("Enter the quantity of numbers you want to use:");
    Scanner quantityInput = new Scanner(System.in);
    int quantity = Integer.parseInt(quantityInput.next());

    int[] numbers;
    numbers = new int[quantity];

    int index = 0;
    for (int number : numbers) {
      System.out.println("Enter a number:");
      Scanner input = new Scanner(System.in);
      int newNumb = Integer.parseInt(input.next());

      numbers[index] = newNumb;
      index++;
    }

    return numbers;
  }

  public static int sum(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum = sum + number;
    }

    return sum;
  }
  public static int getMax(int[] numbers) {
    int maximo = 0;

    for (int number : numbers) {
      if (number > maximo) {
        maximo = number;
      }
    }

    return maximo;
  }
}

