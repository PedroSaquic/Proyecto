/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class BDatos {
    public static ArrayList<Libro> BLibros = new ArrayList<>();
    public static ArrayList<Cliente> BClientes = new ArrayList<>();
            
    public static void agregarLibro(Libro libro){
        
           BLibros.add(libro); 
           JOptionPane.showMessageDialog(null, "Nuevo Libro " + libro.getTitulo());
           
    }
    
    public static void EliminarLibro(Libro libro){
           BLibros.remove(libro); 
    }
    
    
    //++++++++++++++++++++++++++++++++++++
    
    public static void agregarCliente(Cliente cliente){
        
           BClientes.add(cliente); 
           JOptionPane.showMessageDialog(null, "Bienvenido " + cliente.getNombre());
           
    }
}
