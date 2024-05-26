package pbiblioteca;
        
import java.io.IOException;
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
    }
}

