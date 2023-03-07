import java.nio.file.*;
public class Guia4_3 {
  public static void main(String[] args) {
    String operation = "encrypt"; // Takes "encrypt" or "decrypt" as valid values

    // to encrypt
    String toEncryptPath = ".\\src\\toEncrypt.txt";
    String encryptedPath = ".\\src\\encrypted.txt";

    // to decrypt
    String toDecryptPath = ".\\src\\toDecrypt.txt";
    String decryptedPath = ".\\src\\decrypted.txt";

    int displacement = 2;
    try {
      encryptDecrypt(operation, displacement, toEncryptPath, encryptedPath);

      System.out.println("Process finished");
    } catch (Exception e) {
      System.out.printf("Process interrupted: %s.", e.getMessage());
    }
  }

  private static void encryptDecrypt(String operation, int displacement, String inputPath, String outputPath) throws Exception {
    if (operation.equals("encrypt")) {
      String encryptedText = encrypt(inputPath, displacement);
      writeFile(outputPath, encryptedText);

    } else if (operation.equals("decrypt")) {
      String decryptedText = decrypt(inputPath, displacement);
      writeFile(outputPath, decryptedText);
    }
  }
  private static void writeFile(String path, String text) throws Exception {
    Files.writeString(Paths.get(path), text);
  }

  private static String encrypt(String filePath, int displacement) throws Exception {
    StringBuilder newLine = new StringBuilder();
     for (String line : Files.readAllLines(Paths.get(filePath))) {
       for (int i = 0; i < line.length(); i++) {
         char ch = line.charAt(i);

         int asciiCode = (int) ch + displacement;
         char newCh;

         if (asciiCode > 128) { // If falls out ot ascii code won't change
           newCh = ch;
         } else {
           newCh = (char) asciiCode;
         }
         newLine.append(newCh);
       }
       newLine.append("\n");
    }
     return String.valueOf(newLine);
  }

  private static String decrypt(String filePath, int displacement) throws Exception {
    StringBuilder newLine = new StringBuilder();
    for (String line : Files.readAllLines(Paths.get(filePath))) {

      for (int i = 0; i < line.length(); i++) {
        char ch = line.charAt(i);

        int asciiCode = (int) ch - displacement;
        char newCh;

        if (asciiCode < 0) {
          newCh = ch; // If falls out ot ascii code won't change
        } else {
          newCh = (char) asciiCode;
        }
        newLine.append(newCh);
      }
      newLine.append("\n");
    }
    return String.valueOf(newLine);
  }
}
