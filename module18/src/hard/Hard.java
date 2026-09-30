package hard;

import java.sql.*;

public class Hard {

    public static void main(String[] args) {
        String url = "jdbc:h2:./test";

        try (Connection connection = DriverManager.getConnection(url, "", "");
             Statement statement = connection.createStatement()) {

            statement.execute("DROP TABLE IF EXISTS EMPLOYEE");
            statement.execute("CREATE TABLE EMPLOYEE ("
                    + "id INT NOT NULL, "
                    + "name VARCHAR(50) NOT NULL)");

            statement.execute("INSERT INTO EMPLOYEE (id, name) VALUES (1, 'Иванов')");

            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}