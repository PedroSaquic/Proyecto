package pbiblioteca;
//cd onedrive/desktop/umgt/progra/pbiblioteca/src       
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pedro
 */
public class PBiblioteca extends Application {
    
    @Override
    public void start(Stage stageInicio) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/Index.fxml"));
        
        Scene scene = new Scene(root);
        
        stageInicio.setScene(scene);
        stageInicio.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        /*usuario de administrador*/
        Admin admin1 = new Admin("Administrador", 001, 31979411, "Admin123");
        ArrayList <Usuario> usuarios = new ArrayList<>();
            usuarios.add(admin1);
            System.out.println(usuarios);  
       
            
       ArrayList<Libro> libros = BDatos.BLibros;
       
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println("LibroID " + (i + 1) + ": " + libro);
        }
        
        ArrayList<Cliente> clientes = BDatos.BClientes;
        
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println("Cliente ID " + (i + 1) + ": " + cliente);
        }
        
    } 
}

