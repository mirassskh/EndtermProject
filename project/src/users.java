import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PostgreSQLExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/shop";
        String user = "postgres";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("подключение установлено!");
        } catch (SQLException e) {
            System.out.println("ошибка подключения:");
            e.printStackTrace();
        }
    }
}

public class users {
}
