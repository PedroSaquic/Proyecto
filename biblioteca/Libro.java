package biblioteca;

public class Libro {
    //atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int aniop;
    private int disponible;
    
    //constructores
    public Libro(String ISBN, String titulo, String autor, int aniop, int disponible){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.aniop = aniop;
        this.disponible = disponible;
    }
    
    //metodos
    public void agregarL(){
        System.out.println("agregado");
    }

    //getters
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAniop() {
        return aniop;
    }
    
    public int getDisponible(){
        return disponible;
    }

    //setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAniop(int aniop) {
        this.aniop = aniop;
    }
    
    public void setDisponible(int disponible){
        this.disponible = disponible;
    }
    
    
    @Override
    public String toString(){
        return "ISBN: " + ISBN + " - titulo: " + titulo +
               "\nAutor: " + autor + " - Año " + aniop + 
               "\nDisponibilidad: " + disponible;
    }
}
