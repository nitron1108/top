import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase base = new DataBase();
        base.statement = base.getConnect();
        Menu menu = new Menu(base);
        menu.logic();
        /*base.addEmployee(base.statement);
        System.out.println("-------------------------");
        base.showAll();
        System.out.println("-------------------------");
        base.deleteEmployee(base.statement);
        System.out.println("-------------------------");
        base.showAll();*/
    }
}