package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
    
    public Connection getConnection() {
     
     try {
    	 	
         return DriverManager.getConnection("jdbc:mysql://localhost:3306/buscapet?useSSL=false","root","l33t.m4st3r");
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
     
 }
}
