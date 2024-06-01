/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class LibroBD {
    Connection conn;
    
    public LibroBD() {
        conn = ConexionBD.getConnection();
    }
    
    public void create(Libro libro) {
        
    PreparedStatement st = null;
    
        try {
            String sql = """
                         INSERT INTO Libro (isbn, titulo, autor, anio, editorial) 
                                            VALUES (?, ?, ?, ?, ?)
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, libro.getIsbn());
            st.setString(2, libro.getTitulo());
            st.setString(3, libro.getAutor());
            st.setInt(4, libro.getAño());
            st.setString(5, libro.getEditorial());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(LibroBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LibroBD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
