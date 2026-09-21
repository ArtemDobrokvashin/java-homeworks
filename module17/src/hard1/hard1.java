package hard1;
import hard1.controller.CipherController;
import hard1.model.*;
import hard1.view.ConsoleView;



public class hard1 {

        public static void main(String[] args) {
            CaesarCipher cipher = new CaesarCipher();
            FileCipherService fileCipherService = new FileCipherService(cipher);
            ConsoleView view = new ConsoleView();
            CipherController controller = new CipherController(fileCipherService, view);
            controller.run();
        }
}
