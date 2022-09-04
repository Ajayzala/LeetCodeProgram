/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author hp
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
public class ConnectionTest {
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/localdatabase","root","root");  
//here sonoo is database name, root is username and password  

if(con != null){
    System.out.println("Done..");
}
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}
