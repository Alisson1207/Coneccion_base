import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        String url = "jdbc:mysql://localhost:3306/clase";
        String user = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado a la base de datos");
            String query = "SELECT * FROM estudiante";
               /*
            Para buscar algo que el usuario solicite
            Scanner sc =  new Scanner(System.in);
            System.out.printf("Ingrese un nombre de usuario: ");
            String nombre = sc.nextLine();
            String query2 = "SELECT * FROM estudiante WHERE nombre = '" + nombre + "'";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println("Nombre: "+resultSet.getString("nombre"));
                System.out.println("Nota b1: "+resultSet.getString("b1")); //b1: es el nombre de la tabla en mysql
                System.out.println("Nota b2: "+resultSet.getString("b2"));

                Double b1 = resultSet.getDouble("b1");
                Double b2 = resultSet.getDouble("b2");
                Double b3 = b1+b2;
                if(b3>28){
                    System.out.println("paso");
                }else{
                    System.out.println("No paso");
                }

            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        */

        JFrame frame = new JFrame("Mi aplicación Calculadora");
        frame.setContentPane(new form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(800,600);
    }
}