import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	static Connection con=null;
	public static Connection getMyConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DetailsOfProducts","root","13Gow1999V!Bhav");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
