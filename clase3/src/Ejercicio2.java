public class Ejercicio2 {
    public static void main(String[] args) {

        // inciso a
        System.out.println();
        String string = "No cualquier murciélago";

        String loweCaseString = string.toLowerCase();

        int amountOfVowels = 0;
        for (char letter:loweCaseString.toCharArray() ) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'á' || letter == 'é' || letter == 'í' || letter == 'ó' || letter == 'ú') {
                amountOfVowels++;
            }
        }
        System.out.println("Amount of vowels: " + amountOfVowels);

        // inciso b
        System.out.println();
        String welcome = "Bienvenidos al curso de Java";
        int length = welcome.length() / 2;
        
        String firstHalf = welcome.substring(0, length);
        String secondHalf = welcome.substring(length);
        
        System.out.println("This is the first half: " + firstHalf);

        System.out.println("This is the second half: " + secondHalf);

        // inciso c
        System.out.println();
        String string2 = "Idioma Español no añadido";

        String replacedString2 = string2.replace('ñ', 'n');
        System.out.println(replacedString2);
    }
}
