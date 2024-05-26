package biblioteca;
public class Biblioteca{

    public static void main(String[] args) {
    Libro libro1 = new Libro("a123", "Libro1", "Netbeans", 2024, 5);
        System.out.println(libro1);
    libro1.agregarL();
    
    Usuario user1 = new Usuario("Reddragon", "3007050", 31979411);
        System.out.println("\n" +  user1);
    }
}
