package hard1.model;


import javax.crypto.Cipher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCipherService {

    private final CaesarCipher cipher;

    public FileCipherService(CaesarCipher cipher) {
        if (cipher == null) {
            throw new IllegalArgumentException("cipher cannot be null");
        }
        this.cipher = cipher;
    }


    public void process(String inputFile, String outputFile, boolean encryptMode, int key) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(inputFile));
        } catch (IOException e) {
            throw new IllegalStateException("Error reading file " + inputFile, e);
        }
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (encryptMode) {
                result.add(cipher.encrypt(line, key));
            } else {
                result.add(cipher.decrypt(line, key));
            }
        }
        try (PrintWriter pr = new PrintWriter(new FileWriter(outputFile))){
            for (String line : result){
                pr.println(line);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Error writing file " + outputFile, e);
        }
    }
}
