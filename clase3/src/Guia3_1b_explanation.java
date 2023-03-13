import java.util.Arrays; // Esta importación similar a la que hacíamos con archivos en clase 4
                          // te deja usar métodos propios de la clase del tipo de dato como Array.sort(array que ordena)
                          // Importante notar que Array está con mayúscula, no es una variable sino una clase nativa de Java
                          // Clase nativa = propia del lenguaje con métodos predefinidos
public class Guia3_1b_explanation {
  public static void main(String[] args ) {
    int[] numbers;
    numbers = new int[]{1,23,15}; // se define array de 3 enteros
    String order = "desc"; // se define el orden, asc = ascendente y desc = descendente

    System.out.println(Arrays.toString(sortArray(numbers, order)));
    // Se convierte el array a un string con el método toString de la clase Array (Array.toString(array a convertir en string)
    // De otra manera se imprime una representación del array (un código "random") y no el array en sí como se quiere ver
    // Se imprime el array en la terminal
  }

  private static int[] sortArray(int[] array, String order){
    Arrays.sort(array); // el método sort ordena de menor a mayor el array que se le pasa entre () IMP: modifica al array original

    if (order.equals("desc")) { // algo.equals(otra cosa) compara los valores de algo y otra cosa
                                // devuelve true si son iguales, false caso contrario, si es "desc" / descendente se ejecuta el codigo del if

      int[] reversed; // creo nuevo array
      reversed = new int[array.length]; // defino que tan largo es de acuerdo a la longitud del array que ya viene ordenado por el .sort

      for (int i = 0, j = array.length -1; i <= array.length - 1; i++, j-- ) {
        reversed[j] = array [i]; // i es el índice que recorre el array ordenado de izquierda a derecha (va aumentando)
      }                          // j es el índice que recorre el array nuevo de derecha a izquierda (va disminuyendo)
                                  // entonces el valor que está primero del array ascendente se pasa como último en el array descendente
                                  // el resultado es el orden ascendente invertido, o sea descendente

      return reversed; // se retorna el array invertido y se corta la función
    }

    return array; // en caso de que no se haya cortado antes la función, es decir, el if no se ejecutó porque order era distinto de desc
                  // se devuelve este array que es el que se ordenó de forma ascendente con el .sort
  }
}
