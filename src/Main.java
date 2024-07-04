import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mibdd";
        String user = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado a la base de datos");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}