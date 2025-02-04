//package Test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class ConnectionExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			String username = "root";
//			String password = "pass@word1";
//			String url = "jdbc:mysql://localhost:3306/kpmg";
//			
//			Connection con = DriverManager.getConnection(url,username,password);
//			System.out.println("Connection Successful");
//			String query = "Select * from customer";
//			Statement s1 = con.createStatement();
//			s1.executeQuery(query);
//			ResultSet rs = s1.executeQuery(query);
//			while(rs.next()) {
//				int id= rs.getInt(1);
//				String name=rs.getString(2);
//				int age=rs.getInt(3);
//				String address=rs.getString(4);
//				System.out.println(id+" "+name+" "+age+" "+address+" ");
//				System.out.println("-----------------------------------------");
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}




//----------------------------------------------------------------------------------

//package Test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class ConnectionExample {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        try {
//            String username = "root";
//            String password = "pass@word1";
//            String url = "jdbc:mysql://localhost:3306/kpmg";
//            
//            // Establish the connection
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("Connection Successful");
//
//            // SQL insert query - ensure the column names match those in your table
//            String query = "INSERT INTO customer (id, name, age, address) " +
//                           "VALUES (108, 'Drona', 21, 'MI')";
//            
//            // Create a statement
//            Statement s1 = con.createStatement();
//            
//            // Execute the insert query
//            int rowsAffected = s1.executeUpdate(query);
//            
//            // Check if insertion was successful
//            if (rowsAffected > 0) {
//                System.out.println("Data inserted successfully!");
//            } else {
//                System.out.println("Data insertion failed.");
//            }
//            
//            // Optionally, you can also verify by querying the data
//            String selectQuery = "SELECT * FROM customer";
//            ResultSet rs = s1.executeQuery(selectQuery);
//            
//            // Display the result of the query
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String name = rs.getString(2);
//                int age = rs.getInt(3);
//                String address = rs.getString(4);
//                System.out.println(id + " " + name + " " + age + " " + address);
//                System.out.println("-----------------------------------------");
//            }
//            
//            // Close the connection
//            con.close();
//
//        } catch (SQLException e) {
//            // Handle SQL exceptions
//            e.printStackTrace();
//        }
//    }
//}



//------------------------------------------------------
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionExample {

    public static void main(String[] args) {
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

            // Taking user input for 3 customers
            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter details for customer " + (i + 1) + ":");
                
                System.out.print("Enter customer id: ");
                int id = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character after nextInt()
                
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter customer age: ");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character after nextInt()

                System.out.print("Enter customer address: ");
                String address = scanner.nextLine();

                // Store the input data in the array
                customerData[i][0] = id;
                customerData[i][1] = name;
                customerData[i][2] = age;
                customerData[i][3] = address;

                // SQL insert query using user inputs
                String query = "INSERT INTO customer1 (id, name, age, address) " +
                               "VALUES (" + id + ", '" + name + "', " + age + ", '" + address + "')";
                
                // Create a statement
                Statement s1 = con.createStatement();
                
                // Execute the insert query
                int rowsAffected = s1.executeUpdate(query);
                
                // Check if insertion was successful
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully for customer " + (i + 1));
                } else {
                    System.out.println("Data insertion failed for customer " + (i + 1));
                }
            }

            // Optionally, you can also verify by querying the data
            String selectQuery = "SELECT * FROM customer1";
            Statement s1 = con.createStatement();
            ResultSet rs = s1.executeQuery(selectQuery);
            
            // Display the result of the query
            System.out.println("\nDisplaying all customers from the database:");
            while (rs.next()) {
                int dbId = rs.getInt(1);
                String dbName = rs.getString(2);
                int dbAge = rs.getInt(3);
                String dbAddress = rs.getString(4);
                System.out.println(dbId + " " + dbName + " " + dbAge + " " + dbAddress);
                System.out.println("-----------------------------------------");
            }
            
            // Close the connection
            con.close();
            scanner.close();  // Close the scanner

        } catch (SQLException e) {
            // Handle SQL exceptions
            e.printStackTrace();
        }
    }
}




