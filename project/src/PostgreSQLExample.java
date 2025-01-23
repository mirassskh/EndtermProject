import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/your_database";
        String user = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("подключение установлено!");
        } catch (SQLException e) {
            System.out.println("ошибка подключения:");
            e.printStackTrace();
        }
    }
}

