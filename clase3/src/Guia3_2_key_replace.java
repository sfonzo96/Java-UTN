public class Guia3_2_key_replace {

  public static void main(String[] args) {
    String texto = "prueba";
    String abecedario = "abcdefghijklmnñopqrstuvwxyz";
    int desplazamiento = 2;

    String encriptado = encriptar(texto, desplazamiento, abecedario);

    String desencriptado = desencriptar(encriptado, desplazamiento, abecedario);

    System.out.printf("El texto encriptado es: %s.%n", encriptado);

    System.out.printf("El texto desencriptado es: %s.%n", desencriptado);

    if (texto.equals(desencriptado)) {
      System.out.println("Program working OK");
    }

  }

  private static String encriptar(String texto, int desplazamiento, String abecedario) {

    String encriptado = "";

    for (int i = 0; i < texto.length(); i++) {

      // recorrer texto introducido
      // identificar cada caracter con text.charAt(i) y guardar el valor en una variable que se crea en cada vuelta del for

      String ch = String.valueOf( texto.toLowerCase().charAt(i) ); // Como charAt devuelve un chat y quiero concatenar strings tengo que convertirlo

      // ver en qué posición está esa letra dentro del abecedario.
      int posiciónEnAbc = abecedario.indexOf(ch);

      // sumar desplazamiento a la posición posiciónNueva abecedario.indexOf(char) + desplazamiento
      int nuevaPosición = posiciónEnAbc + desplazamiento;

      // buscar nuevo caracter
      String nuevoCh = String.valueOf(abecedario.charAt(nuevaPosición)); // uso String.valueOf por la misma razón

      // reemplazar viejo caracter por nuevo
      ch = ch.replace(ch, nuevoCh);

      // concatenar en una nueva variable string y retornar al final del for
      encriptado = encriptado + ch;
    }

    return encriptado;
  }

  private static String desencriptar(String texto, int desplazamiento, String abecedario) {

    String desencriptado = "";

    for (int i = 0; i < texto.length(); i++) {

      // recorrer texto introducido
      // identificar cada caracter con text.charAt(i) y guardar el valor en una variable que se crea en cada vuelta del for

      String ch = String.valueOf( texto.toLowerCase().charAt(i) ); // Como charAt devuelve un chat y quiero concatenar strings tengo que convertirlo

      // ver en qué posición está esa letra dentro del abecedario.
      int posiciónEnAbc = abecedario.indexOf(ch);

      // sumar desplazamiento a la posición posiciónNueva abecedario.indexOf(char) + desplazamiento
      int nuevaPosición = posiciónEnAbc - desplazamiento;

      // buscar nuevo caracter
      String nuevoCh = String.valueOf(abecedario.charAt(nuevaPosición)); // uso String.valueOf por la misma razón

      // reemplazar viejo caracter por nuevo
      ch = ch.replace(ch, nuevoCh);

      // concatenar en una nueva variable string y retornar al final del for
      desencriptado = desencriptado + ch;
    }

    return desencriptado;
  }
}