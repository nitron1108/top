

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase base = new DataBase();
        base.statement = base.getConnect();
        base.showAll();
    }
}