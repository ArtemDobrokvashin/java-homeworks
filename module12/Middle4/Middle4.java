import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Middle4 {

    public static void main(String[] args) {


        try (FileReader fr = new FileReader("test.txt");
             BufferedReader br = new BufferedReader(fr);
             PrintWriter pw = new PrintWriter("Res.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                String cleaned = line.replaceAll("[0-9]", "");
                pw.println(cleaned);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
