import java.sql.*;
public class Test2 {


    /**
     * JdbcInsert1.java - Demonstrates how to INSERT data into an SQL
     * database using Java JDBC.
     */

        public static void main (String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/keeplearning";
                Connection conn = DriverManager.getConnection(url, "root", "keep1234");
                //create a Statement from the connection
                Statement st = conn.createStatement();


                conn.close();
            }catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }




    }
}