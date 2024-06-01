/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class ConexionBD {
    private String url = "jdbc:postgresql://bubble.db.elephantsql.com:5432/jlvqtyqs";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private ConexionBD () {
        properties.setProperty("user", "jlvqtyqs");
        properties.setProperty("password", "gdaDkM3i7WWeDUfIx5YKZk2qSIT7Ht6H");
        
        try {
            conn = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
               ConexionBD c = new ConexionBD();
               return c.conn;
        }
        else {
            return conn;
        }
    }
    
}
