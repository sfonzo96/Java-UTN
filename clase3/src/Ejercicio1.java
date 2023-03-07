public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ocurrences = 0;

        for( int number:numbers)
        {
            if (number == 2 || number == 7) {
                ocurrences++;
            }
        }

        System.out.println("Print all the numbers");

        for(
            int number2:numbers)
        {
            System.out.println(number2);
        }

        System.out.println("Print all the even numbers");
        for(
            int number3:numbers)
        {
            if (number3 % 2 == 0) {
                System.out.println(number3);
            }
        }

        System.out.println("Print ocurrences");System.out.println(ocurrences);
    }
}
