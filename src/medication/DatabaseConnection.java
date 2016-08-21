/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medication;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaurav
 */
public class DatabaseConnection {
    Connection connection = null;
    private String userName = "scdn_saurav";
    private String password = "";
    String DATABASE_URL = "jdbc:mysql://scdnlab.com:3306/scdn_pharmacyManagement";
    public DatabaseConnection(String DATABASE_URL){
        this.DATABASE_URL = DATABASE_URL; 
    }
    
    public Connection getConnection()
    {
        return connection;
    }
    public void setUsername (String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Connection startConnection(){
         try {
                    String DATABASE_URL = "jdbc:mysql://localhost:3306/mynewdatabase";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Page2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Page2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Page2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           
            connection =  DriverManager.getConnection(DATABASE_URL,userName,password);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return  connection;
    }
    
    public void closeConnection(){
        try {
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
