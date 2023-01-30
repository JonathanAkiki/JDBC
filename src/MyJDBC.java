import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/devoir1";
            String user="Jonathan";
            String pass= "Akiki";
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from voiture");

            while (resultSet.next()) {
               System.out.println(resultSet.getString("name"));
            }
        }
        catch (Exception e) {
        e.printStackTrace();
        }
    }
}
