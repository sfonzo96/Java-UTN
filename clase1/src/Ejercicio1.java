public class Ejercicio1 {
  public static void main(String[] args) {

    int a = 2;
    int b =  20;

    // 1.a Mostrar números entre extremos a y b:

    int ex1a = a;
    System.out.println("1.a Mostrar números entre extremos a y b:");
    while (ex1a <= b) {
      System.out.println(ex1a);
      ex1a++;
    }
    System.out.println();


    //  1.b Mostrar números pares entre extremos a y b:

    int ex1b = a;
    System.out.println("1.b Mostrar números pares entre extremos a y b:");
    while (ex1b <= b) {
      if (ex1b % 2 == 0) {
        System.out.println(ex1b);
      }
      ex1b++;
    }
    System.out.println();


    // 1.c Con una variable extra decidir si se muestran impares o pares:

    boolean showOddNumbers = false; //Si es false muestra solo pares (even), caso true muestra impares (odd)
    int ex1c = a;
    System.out.println("1.c Con una variable extra decidir si se muestran impares o pares:");
    while (ex1c <= b) {
      if (showOddNumbers && ex1c % 2 != 0) {
        System.out.println(ex1c);
      } else if (!showOddNumbers && ex1c % 2 == 0) {
        System.out.println(ex1c);
      }
      ex1c++;
    }
    System.out.println();


    // 1.d Hacer lo mismo que en b pero con una sentencia for invirtiendo el orden:

    System.out.println("1.d Hacer lo mismo que en b pero con una sentencia for invirtiendo el orden:");
    for (int i = b; i >= a; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    System.out.println();
  }
}