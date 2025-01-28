import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/shop";
        String user = "postgres";
        String password = "123456";

        Customers customers = new Customers();
        customers.start(url, user, password);
    }
}
