/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

/**
 *
 * @author pedro
 */
public class Cliente extends Usuario{
    private String direccion;
    private String contrasena;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cliente(String nombre, int id, int telefono, String direccion, String contrasena) {
        super(nombre, id, telefono);
        this.direccion = direccion;
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nCliente: " + getNombre() 
                + "\nId Cliente: " + getId() 
                + "\nTelefono: " + getTelefono() 
                + "\ndireccion: " + direccion 
                + "\ncontrasena: " + contrasena + "\n";
    }
    
}
