package pbiblioteca;
        
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
            
        ArrayList <Libro> libros = new ArrayList<>();
     
        
        
        
            
    }
}

