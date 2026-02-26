package JDBCDEMO;
import java.sql.*;
// table creation
// student table(id name cgpa)
public class TEST10 {
	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection(
    		"jdbc:mysql://localhost:3306/6com1", 
    		"root", "root");
    Statement s=c.createStatement();
    s.execute("create table student(id varchar(10) primary key,name varchar(30), cgpa double)");
    System.out.println("1 table created");
    c.close();
    		
	}

}
