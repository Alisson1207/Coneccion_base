import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clase";
        String user = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado a la base de datos");
            String query = "SELECT * FROM estudiante";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println("Nombre: "+resultSet.getString("nombre"));
                System.out.println("Nota b1: "+resultSet.getString("b1")); //b1: es el nombre de la tabla en mysql
                System.out.println("Nota b2: "+resultSet.getString("b2"));

            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}