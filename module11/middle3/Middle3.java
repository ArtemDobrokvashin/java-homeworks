import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Middle3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // ← обязательно!
            OpenFile openFile = new OpenFile();
            String text = openFile.readTextFromFile(); // ← String, не Path!

            if (text != null) {
                processText(text); // ← сразу обрабатываем!
            } else {
                System.out.println("Файл не был выбран");
            }
        });
    }

    private static void processText(String text) {
        String[] words = text.split("[^\\p{L}]+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.merge(word.toLowerCase(), 1, Integer::sum);
            }
        }

        int max = 0;
        String key = null;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                key = word;
            }
        }
        System.out.println(key + " " + max);
    }
}
