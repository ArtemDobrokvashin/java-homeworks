package middle2.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private final Map<String, String> users = new HashMap<>();

    public AuthService() {
        try (BufferedReader br = new BufferedReader(new FileReader("password.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }
                if (!line.contains("=")) {
                    throw new IllegalStateException(
                            "Неверный формат строки: '" + line + "'. Ожидался формат логин=пароль");
                }
                String[] parts = line.split("=");
                String username = parts[0].trim();
                String password = parts[1].trim();
                users.put(username, password);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Не удалось прочитать файл паролей", e);
        }
    }

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return users.containsKey(username) && users.get(username).equals(password);
    }
}