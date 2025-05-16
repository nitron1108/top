

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase base = new DataBase();
        base.statement = base.getConnect();
        base.addEmployee(base.statement);
        base.showAll();
    }
}
