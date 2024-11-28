
import java.sql.*;

public class DataBase {
    String jdbcURL
            = "jdbc:postgresql://localhost:5432/animals";
    String username = "postgres";
    String password = "1234";
    Connection connection;
    Statement statement;
    ResultSet result;

    Statement getConnect() throws SQLException {
        connection = DriverManager.getConnection(
                jdbcURL,username,password);
        return connection.createStatement();
    }
    void showAll() throws SQLException {
        result = statement.executeQuery("SELECT * FROM products");
        while (result.next()){
            String name = result.getString("product_name");
            int age = result.getInt("unit_price");
            System.out.println(name + " - " + age);
        }
    }
}