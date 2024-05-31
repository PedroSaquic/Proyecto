/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class BDatos {
    public static ArrayList<Libro> BLibros = new ArrayList<>();
    
    public static void agregarLibro(Libro libro){
           BLibros.add(libro);
        
    }
}
