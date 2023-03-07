public class Guia3_2_ascii {

  public static void main(String[] args) {
    String text = "testingg";
    int displacement = 2;

    String encryptedText = encrypt(text, displacement);
    String decryptedText = decrypt(encryptedText, displacement);

    System.out.printf("The encryption result is: %s.%n", encryptedText);

    System.out.printf("The decryption result is: %s.%n", decryptedText);

    if (text.equals(decryptedText)) {
      System.out.println("Program working OK");
    }

  }

  private static String encrypt(String text, int displacement) {

    StringBuilder encrypted = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {

      char ch = text.charAt(i);

      char newCh;
      int asciiCode = (int) ch + displacement;
      if (asciiCode > 128) {
        newCh = ch;
      } else {
        newCh = (char) asciiCode;
      }

      encrypted.append(newCh);
    }

    return encrypted.toString();
  }

  private static String decrypt(String encryptedText, int displacement) {
    StringBuilder encrypted = new StringBuilder();

    for (int i = 0; i < encryptedText.length(); i++) {

      char ch = encryptedText.charAt(i);
      char newCh;
      int asciiCode = (int) ch - displacement;

      if (asciiCode < 0) {
        newCh = ch;
      } else {
        newCh = (char) asciiCode;
      }

      encrypted.append(newCh);
    }

    return encrypted.toString();
  }
}