import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class OutputWriter {
    public static void toFile(String original, String encrypted, String decrypted, Path outputPath) {
        String content = "Original  : " + original + "\n"
                       + "Encrypted : " + encrypted + "\n"
                       + "Decrypted : " + decrypted + "\n";
        try {
            Files.writeString(outputPath, content);
            System.out.println("Résultat sauvegardé dans : " + outputPath);
        } catch (IOException e) {
            System.err.println("Erreur écriture : " + e.getMessage());
        }
    }
}
