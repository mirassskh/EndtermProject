import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class customers {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/shop"; // замени на свое
        String user = "postgres"; // твой логин
        String password = "123456"; // твой пароль

        String insertQuery = "INSERT INTO customers (customer_id, name, phone, email) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            // установка значений для первого вставляемого клиента
            preparedStatement.setInt(1, 1); // customer_id
            preparedStatement.setString(2, "алихан"); // name
            preparedStatement.setString(3, "1234567890"); // phone
            preparedStatement.setString(4, "ali@gmail.com"); // email
            preparedStatement.executeUpdate(); // выполняем вставку

            // установка значений для второго клиента
            preparedStatement.setInt(1, 2); // customer_id
            preparedStatement.setString(2, "амина"); // name
            preparedStatement.setString(3, "9876543210"); // phone
            preparedStatement.setString(4, "amina@gmail.com"); // email
            preparedStatement.executeUpdate(); // выполняем вставку

            System.out.println("данные успешно вставлены!");

        } catch (SQLException e) {
            System.out.println("ошибка вставки данных:");
            e.printStackTrace();
        }
    }
}
