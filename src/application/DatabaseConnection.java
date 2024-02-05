package application;
import java.sql.*;
public class DatabaseConnection {
	
	public Connection DatabaseLink;

    public Connection getConnection() {
       String databaseuser ="root";
       String databasepassword ="12345678";
        
        String url = "jdbc:mysql://localhost:3306/bazazasemafor?serverTimezone=GMT";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DatabaseLink = DriverManager.getConnection(url, databaseuser, databasepassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DatabaseLink;
        
    }

}
