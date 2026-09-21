package middle2.view;

import javax.swing.*;

public class LoginView {

    private final JTextField loginField;
    private final JPasswordField passwordField;
    private final JButton loginButton;
    private final JFrame frame;

    public LoginView() {
        frame = new JFrame("Вход в систему");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 180);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel loginLabel = new JLabel("Логин:");
        loginLabel.setBounds(20, 15, 80, 25);
        loginField = new JTextField();
        loginField.setBounds(100, 15, 180, 25);

        JLabel passwordLabel = new JLabel("Пароль:");
        passwordLabel.setBounds(20, 50, 80, 25);
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 180, 25);

        loginButton = new JButton("Войти");
        loginButton.setBounds(100, 90, 180, 25);

        frame.add(loginLabel);
        frame.add(loginField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
    }

    public void show() {
        frame.setVisible(true);
    }

    public String getLogin() {
        return loginField.getText().trim();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void onLoginClick(Runnable action) {
        loginButton.addActionListener(e -> action.run());
    }
}