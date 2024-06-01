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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pbiblioteca.BDatos;
import pbiblioteca.Cliente;

/**
 * FXML Controller class
 *
 * @author pedro
 */
public class RegistrarseController implements Initializable {

    @FXML
    private TextField NombreC;
    @FXML
    private TextField IdC;
    @FXML
    private TextField TelefonoC;
    @FXML
    private TextField Direccion;
    @FXML
    private Label IDCliente;
    @FXML
    private TextField Contrasena;
    @FXML
    private Button Registrar;
    @FXML
    private Button Back;
    @FXML
    private Button Cerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
    public void closeWindows(){
    }


    @FXML
    private void Registrar(ActionEvent event) {
        String IDc = IdC.getText();
            String Tel = TelefonoC.getText();
            
            if (IDc.matches("\\d+") || Tel.matches("\\d+")){
                int IDc2 = Integer.parseInt(IDc);
                int Tel2 = Integer.parseInt(Tel);
            if (IDc2 >= 0 || Tel2 >= 0){    
        Cliente cliente = new Cliente(NombreC.getText(), Integer.parseInt(IdC.getText()), 
                Integer.parseInt(TelefonoC.getText()),Direccion.getText(),Contrasena.getText());
        
                   BDatos.agregarCliente(cliente);
                   NombreC.clear();
                   IdC.clear();
                   TelefonoC.clear();
                   Direccion.clear();
                   Contrasena.clear();
            }else{
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Alerta");
                alert.setHeaderText(null);
                alert.setContentText("Numeros no validos");
                alert.showAndWait();
            }
        }else{
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Alerta");
                alert.setHeaderText(null);
                alert.setContentText("Please, ID cliente y Telefono - solo numeros");
                alert.showAndWait();
            }
            
            
            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PrincipalBib.fxml"));
            
            Parent root = loader.load();
            PrincipalBibController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest (e -> controlador.closeWindows());
            
            Stage myStage = (Stage) this.Registrar.getScene().getWindow();
            myStage.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(RegistrarseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Back(ActionEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Index.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.initOwner(ventanaActual);

        stage.setScene(scene);
        stage.show();

    } catch (IOException ex) {
        Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void Cerrar(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
