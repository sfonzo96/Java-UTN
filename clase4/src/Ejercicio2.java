import java.nio.file.*;


public class Ejercicio2 {
  public static void main(String[] args) throws Exception {

    String pathFile = ".\\phrases.txt";
    char character = ' ';

    iterateLines(pathFile, character);
  }

  private static void iterateLines(String pathFile,char character) throws Exception {
    int i = 0;
    for (String line : Files.readAllLines(Paths.get(pathFile))){
      int ocurrences = countOcurrences(line, character);
      System.out.printf("The line number %d has %d.%n", i, ocurrences);
      i++;
    }
  }
  private static int countOcurrences(String str, char ch) {
    return str.length() - str.replace(String.valueOf(ch),"").length();
  }
}
