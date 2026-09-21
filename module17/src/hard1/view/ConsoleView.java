package hard1.view;


import java.util.Scanner;

public class ConsoleView {

    private final Scanner sc = new Scanner(System.in);


    public void showMessage(String message) {
        System.out.println(message);
    }

    public String readLine(String prompt) {
        showMessage(prompt);
        return sc.nextLine();
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showMessage("Это не число, попробуй ещё раз");
            }
        }


    }

    public int readMenuChoice(String prompt) {
        return readInt(prompt);
    }


}
