package middle2;

import middle2.controller.LoginController;
import middle2.model.AuthService;
import middle2.view.LoginView;

public class Middle2 {

    public static void main(String[] args) {
        AuthService authService = new AuthService();

        LoginView view = new LoginView();

        LoginController controller = new LoginController(authService, view);

        view.show();
    }
}