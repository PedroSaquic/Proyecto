package biblioteca;

public class Usuario {
    //atributos
    private String nombre;
    private String id;
    private int telefono;
    
    //constructores
    public Usuario(String nombre, String id, int telefono){
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }
    
    //getters
    public String getNombre(){
        return nombre;
    }
    
    public String getId(){
        return id;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " -Identificacion: " + id + 
               "\nTelefono: " + telefono;
    }
    
}
