/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

/**
 *
 * @author pedro
 */
public class Admin extends Usuario{
    private String adminPass;
    
   public Admin(String nombre, int id, int telefono, String adminPass){
       super(nombre, id, telefono);  
       this.adminPass = adminPass;
   }
   
   

    @Override
    public String toString() {
        return  "\nAdministrador: " + getNombre() 
                + "\nId: " + getId() + getTelefono() 
                +"\nadminPass: " + adminPass + "\n";
    }
   
    
   
}
