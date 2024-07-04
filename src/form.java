import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class form {
    private JButton button1;
    public JPanel panel;
    private JLabel nombreTXT;

    public form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url="jdbc:mysql://localhost:3306/clase";
                String user="root";
                String password="123456";

                try (Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("Conectado a la base de datos");
                    String query="select * from estudiante";
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);
                    while(resultSet.next()){
                        System.out.println(resultSet.getString("nombre"));
                        nombreTXT.setText(resultSet.getString("nombre"));
                    }
                }catch (SQLException e1){
                    System.out.println(e1);}
            }

        });
    }
}
