/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pedro
 */
public class IndexController implements Initializable {

    @FXML
    private TextField Usuario;
    @FXML
    private TextField Contrasena;
    @FXML
    private Button Ingresar;
    @FXML
    private Button Registrarse;
    @FXML
    private Button Cerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }  

    @FXML
    private void Cerrar(ActionEvent event) { 
        
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
        
    }

    @FXML
    private void Ingresar(ActionEvent event) {
        if(Usuario.getText().equals("Administrador") && Contrasena.getText().equals("Admin123")){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/MenuAdmin.fxml"));
            
            Parent root = loader.load();
            MenuAdminController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest (e -> controlador.closeWindows());
            
            Stage myStage = (Stage) this.Ingresar.getScene().getWindow();
            myStage.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }else{
            System.out.println("no existe");
        }
        
    }

    @FXML
    private void Registrarse(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Registrarse.fxml"));
            
            Parent root = loader.load();
            RegistrarseController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest (e -> controlador.closeWindows());
            
            Stage myStage = (Stage) this.Registrarse.getScene().getWindow();
            myStage.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    
}
