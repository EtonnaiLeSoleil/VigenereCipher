import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String cle = "BBBB"; // Clé de chiffrement
        Path inputPath = Paths.get("data/input.txt");
        Path outputPath = Paths.get("data/output.txt");

        try {
            String readContent = Files.readString(inputPath);
            
            if (readContent.isEmpty()) {
                System.err.println("Erreur 1 : Le fichier est vide.");
                return;
            }

            System.out.println("Original Content:\n" + readContent + "\n");
            String encrypted = VigenereCipher.encrypt(readContent, cle);
            String decrypt = VigenereCipher.decrypt(encrypted, cle);
            System.out.println("Encrypted : " + encrypted + "\n");
            System.out.println("Decrypted : " + decrypt + "\n");

            OutputWriter.toFile(readContent, encrypted, decrypt, outputPath);

        } catch (IOException e) {
            System.err.println("Erreur 2 : Impossible de lire le fichier : " + e.getMessage());
        }
    }
}
