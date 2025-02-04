package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MyConnection {
	 public void test() {
	        // TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        
	        // Create an array to store customer data (id, name, age, address)
	        Object[][] customerData = new Object[3][4]; // 3 customers, 4 attributes (id, name, age, address)
	        
	        try {
	            String username = "root";
	            String password = "pass@word1";
	            String url = "jdbc:mysql://localhost:3306/kpmg";
	            
	            // Establish the connection
	            Connection con = DriverManager.getConnection(url, username, password);
	            System.out.println("Connection Successful");
	

}catch (SQLException e) {
    // Handle SQL exceptions
    e.printStackTrace();
    }
	 }
}
	 
