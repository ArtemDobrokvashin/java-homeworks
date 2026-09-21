package middle2.controller;

import middle2.model.AuthService;
import middle2.view.LoginView;

import javax.swing.*;

public class LoginController {

    private final AuthService authService;
    private final LoginView view;

    public LoginController(AuthService authService, LoginView view) {
        if (authService == null) {
            throw new IllegalArgumentException("authService cannot be null");
        }
        if (view == null) {
            throw new IllegalArgumentException("view cannot be null");
        }
        this.authService = authService;
        this.view = view;
        view.onLoginClick(this::handleLogin);   // подписка на кнопку — здесь
    }

    private void handleLogin() {
        String login = view.getLogin();
        String password = view.getPassword();

        if (authService.authenticate(login, password)) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать, " + login);
        } else {
            JOptionPane.showMessageDialog(null, "Неверный логин или пароль",
                    "Ошибка входа", JOptionPane.ERROR_MESSAGE);
        }
    }
}