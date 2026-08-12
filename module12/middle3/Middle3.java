import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Middle3 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();

        try (FileReader fr = new FileReader("Test.txt");
             BufferedReader br = new BufferedReader(fr);
             PrintWriter out = new PrintWriter("Res.txt")) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        listStr.add(word);
                    }
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = listStr.size() - 1; i >= 0; i--) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(listStr.get(i));
            }

            out.println(result.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}