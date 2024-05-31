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

    public Cliente(String nombre, int id, int telefono) {
        super(nombre, id, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{"+ getNombre() + getId() + getTelefono() + "direccion=" + direccion + '}';
    }
    
}
