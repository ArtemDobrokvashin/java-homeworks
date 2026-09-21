package middle1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UserView extends JFrame {
    private JTextField userNameField; //поле для ввода
    private JButton submitButton; //кнопка
    private JLabel userNameLabel;

    public UserView() {
        userNameField = new JTextField();
        userNameField.setBounds(10, 10, 80, 20);//позиционирование

        submitButton = new JButton("Submit");
        submitButton.setBorder(new LineBorder(Color.BLACK)); //указание цвета кнопки
        submitButton.setBounds(10, 40, 50, 20);//позиционирование

        add(userNameField); //добавляем объекты на фрейм
        add(submitButton);
        setTitle("User Information");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        userNameLabel = new JLabel(""); // инициализация
        userNameLabel.setBounds(10, 70, 200, 20);
        add(userNameLabel); // добавление на форму
        submitButton.addActionListener(e -> {
            showUserName(userNameField.getText());
        });
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public String getUserName() {
        return userNameField.getText();
    }

    public void showUserName(String userName) {
        userNameLabel.setText(userName);

    }
}