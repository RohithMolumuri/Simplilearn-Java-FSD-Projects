import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {
	public static void main (String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation", "root", "Rohith@8328685315");
		if(con!=null) {
			System.out.println("connection is established with DB");
		}
			else {
				System.out.println("Please check with the connection");
		}
		Statement stmt=con.createStatement();
		String sql="insert into Student values(27,'Rohith')";
		int record=stmt.executeUpdate(sql);
		if(record>0) {
			System.out.println(record + "rows inserted ");
		}
		else {
			System.out.println("insertion failed");
		}
	}

}
