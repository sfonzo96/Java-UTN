public class Guia3_2 {

  public static void main(String[] args) {
    String text = "testingg";
    String key = "abcdefghijklmnñopqrstuvwxyz";
    int displacement = 2;

    String encryptedText = encrypt(text, displacement, key);
    String decryptedText = decrypt(encryptedText, displacement, key);

    System.out.printf("The encryption result is: %s.%n", encryptedText);

    System.out.printf("The decryption result is: %s.%n", decryptedText);

    if (text.equals(decryptedText)) {
      System.out.println("Program working OK");
    }

  }

  private static String encrypt(String text, int displacement, String key) {

    StringBuilder encrypted = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {

      char ch = text.toLowerCase().charAt(i);

      char newCh;
      if (key.indexOf(ch) >= 0 && key.indexOf(ch) + displacement < key.length()) { // Not found or outside key length after displacement
        newCh = key.charAt(key.indexOf(ch) + displacement);
      } else {
        newCh = ch; // If out of the string length character is not changed
      }
      encrypted.append(newCh);
    }

    return encrypted.toString();
  }

  private static String decrypt(String encryptedText, int displacement, String key) {
    StringBuilder encrypted = new StringBuilder();

    for (int i = 0; i < encryptedText.length(); i++) {

      char ch = encryptedText.toLowerCase().charAt(i);

      char newCh;
      if (key.indexOf(ch) >= 0 && key.indexOf(ch) - displacement >= 0) { // Not found or outside key length after displacement
        newCh = key.charAt(key.indexOf(ch) - displacement);
      } else {
        newCh = ch; // If out of the string length character is not changed
      }
      encrypted.append(newCh);
    }

    return encrypted.toString();
  }
}