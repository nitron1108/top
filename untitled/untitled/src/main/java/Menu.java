import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    DataBase dataBase;
    int choice;
    Scanner scanner = new Scanner(System.in);
    public Menu(DataBase dataBase){
        this.dataBase = dataBase;
    }
    void start(){
        System.out.println("Hello my dear friend");
        System.out.println("Press 1 to show your employees");
        System.out.println("Press 2 to add your employees");
        System.out.println("Press 3 to fired your employees");
        System.out.print("Enter your answer: ");
        choice = scanner.nextInt();
    }
    void logistic() throws SQLException {
        switch(choice){
            case 1: dataBase.showAll();
                    break;
            case 2: dataBase.addEmployee(dataBase.statement);
                    break;
            case 3: dataBase.deleteEmployee(dataBase.statement);
                    break;
            case 0: System.exit(0);
            default:
                System.out.println("error!");
        }
        System.out.println("---------------");
    }
    void logic() throws SQLException{
        while(true){
            start();
            logistic();
        }
    }
}
