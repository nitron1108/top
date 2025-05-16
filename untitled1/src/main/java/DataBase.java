import java.sql.*;
import java.util.Scanner;

public class DataBase {
    Scanner scanner=new Scanner(System.in);
    String jdbcURL
            = "jdbc:postgresql://localhost:5432/car_shop";
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
        result = statement.executeQuery("SELECT * FROM empioyees");
        while (result.next()){
            String name = result.getString("name");
            String salary = result.getString("salary");
            System.out.println(name + " - " + salary);
        }
    }
    ResultSet addEmployee(Statement statement) throws SQLException{
        System.out.println("enter some name:");
        String name=scanner.nextLine();
        System.out.println("enter some type of work::");
        String work_type=scanner.nextLine();
        System.out.println("enter some date:");
        String birthday=scanner.nextLine();

        String query=String.format("insert into employees values(%s,%s,0,%s)",
                name,work_type,birthday);
        return statement.executeQuery(query);
    }
}