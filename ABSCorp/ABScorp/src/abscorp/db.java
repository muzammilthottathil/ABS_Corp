/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abscorp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author muzammil
 */
public class db {
    
       
    Connection conn = null;
    
    public static Connection java_db(){
        
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABS_Corp","root", "Password@123");
           
            return conn;
//            /home/muzammil/Documents/mysql connector java 8.0.20
            
            
        }catch (Exception e){
             JOptionPane.showMessageDialog(null,"Connection Error");
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
        
        
    }
    
    
    
}
