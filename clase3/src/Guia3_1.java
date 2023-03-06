import java.util.*;
public class Guia3_1 {
    public static void main(String[] args) {
        // item a
        String string = "Esternocleidomastoideo";
        String lowerCaseString = string.toLowerCase();
        char letter = 'e';

        System.out.printf("Letter %c in %s appears %d times.%n", letter, string, countLetter(lowerCaseString, letter));

        // item b

        int[] numbers;
        numbers = new int[]{1,23,15};
        String order = "desc";

        System.out.printf("Ordered array is: %s. Ascending order if not specified otherwise.%n", Arrays.toString(sortArray(numbers, order)));

        // item c
        int conditionalNumber = 17;

        System.out.printf("The sum of the numbers of %s that are minor than %d is: %d.%n", Arrays.toString(numbers), conditionalNumber, conditionalSum(numbers, conditionalNumber));

    }

    private static int conditionalSum(int[] array, int conditionalNumber) {
        int sum = 0;

        for (int number : array) {
            if (number < conditionalNumber) {
                sum+= number;
            }
        }

        return sum;
    }

    private static int[] sortArray(int[] array, String order){
        Arrays.sort(array);

        if (order.equals("desc")) {
            int[] reversed;
            reversed = new int[array.length];

            for (int i = 0, j = array.length -1; i <= array.length - 1; i++, j-- ) {
                reversed[j] = array [i];
            }

            return reversed;
        }

        return array;
    }

    private static int countLetter(String word, char letter) {
        int amountOfLetter = 0;
        for (char character:word.toCharArray() ) {
            if (letter == character) {
                amountOfLetter++;
            }
        }
        return amountOfLetter;
    }
}