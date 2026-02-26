package JDBCDEMO;
import java.sql.*;
// insert into student values
//('20231COM71','Lazy',5.6)
public class TEST11 {
	public static void main(String[] args)throws Exception {
       //Step1- Loading the driver
		Class.forName("com.mysql.jdbc.Driver");
	// step2- Getting the connection
		Connection c=
		DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/6com1",
				"root","root");
		//step3- getting the prompt
		Statement s=c.createStatement();
		//step4 - sending the query
		String sql="insert into student values('20231COM71','Lazt',5.6)";
		int response=s.executeUpdate(sql);
		//step5=getting the response
		System.out.println(response+" record inserted");
		c.close();
	}

}



