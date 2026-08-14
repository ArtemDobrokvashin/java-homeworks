package middle1;

import java.util.Scanner;

public class middle1 {

    public static void main(String[] args) throws LoginIsNullException, IlligallFormatException, PasswordNullException {
        Scanner input = new Scanner(System.in);
        String login = input.nextLine();
        if ((login == null) || login.trim().isEmpty()) {
            throw new LoginIsNullException("Логин не может быть пустым");
        }
        for (char c : login.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IlligallFormatException("Логин не может содержать цифры");
            }

        }
        String password = input.nextLine();
        if ((password == null) || password.trim().isEmpty()) {
            throw new PasswordNullException("Пароль не может быть пустым");
        }
    }
}
