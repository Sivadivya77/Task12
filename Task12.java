package Jdbcfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task12 {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/Employeesdb"; // Change if needed
	        String user = "root"; // Your MySQL username
	        String password = "root"; // Your MySQL password

	        try {
	            Connection conn = DriverManager.getConnection(url, user, password);
	            Statement stmt = conn.createStatement();

	            // Insert Employee Data
	            String sql1 = "INSERT INTO employees VALUES (101, 'Jenny', 25, 10000)";
	            String sql2 = "INSERT INTO employees VALUES (102, 'Jacky', 30, 20000)";
	            String sql3 = "INSERT INTO employees VALUES (103, 'Joe', 40, 40000)";
	            String sql4 = "INSERT INTO employees VALUES (104, 'John', 20, 80000)";
	            String sql5 = "INSERT INTO employees VALUES (105, 'Shameer', 25, 90000)";

	            stmt.executeUpdate(sql1);
	            stmt.executeUpdate(sql2);
	            stmt.executeUpdate(sql3);
	            stmt.executeUpdate(sql4);
	            stmt.executeUpdate(sql5);

	            System.out.println("Data inserted successfully!");

	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}