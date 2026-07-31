import javax.swing.*;

import javax.swing.JFileChooser;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class OpenFile {
    public String readTextFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                return Files.readString(Paths.get(fileChooser.getSelectedFile().getAbsolutePath()));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        "Не удалось прочитать файл", "Ошибка", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }
}


