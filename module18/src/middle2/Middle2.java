package middle2;

import java.sql.*;

public class Middle2 {

    public static void main(String[] args) {
        String url = "jdbc:h2:./office";

        try (Connection connection = DriverManager.getConnection(url, "", "")) {
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS EMPLOYEE");
            statement.execute("DROP TABLE IF EXISTS CAR");

            statement.execute("CREATE TABLE CAR ("
                    + "id INT NOT NULL PRIMARY KEY, "
                    + "mark VARCHAR(30) NOT NULL)");

            statement.execute("CREATE TABLE EMPLOYEE ("
                    + "id INT NOT NULL PRIMARY KEY, "
                    + "name VARCHAR(50) NOT NULL, "
                    + "id_car INT NOT NULL, "
                    + "FOREIGN KEY (id_car) REFERENCES CAR(id))");

            statement.execute("INSERT INTO CAR (id, mark) VALUES (1, 'Reno'), (2, 'KioRio'), (3, 'BMW')");
            statement.execute("INSERT INTO EMPLOYEE (id, name, id_car) VALUES "
                    + "(1, 'Иванов', 1), (2, 'Петров', 2), (3, 'Сидоров', 3)");

            ResultSet rs = statement.executeQuery(
                    "SELECT EMPLOYEE.NAME FROM EMPLOYEE JOIN CAR ON EMPLOYEE.ID_CAR = CAR.ID");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            rs = statement.executeQuery(
                    "SELECT EMPLOYEE.NAME, CAR.MARK FROM EMPLOYEE JOIN CAR ON EMPLOYEE.ID_CAR = CAR.ID");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " - " + rs.getString(2));
            }

            rs = statement.executeQuery(
                    "SELECT EMPLOYEE.NAME FROM EMPLOYEE JOIN CAR ON EMPLOYEE.ID_CAR = CAR.ID "
                            + "WHERE CAR.MARK = 'BMW'");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
