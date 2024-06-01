/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import pbiblioteca.BDatos;
import pbiblioteca.Cliente;
import pbiblioteca.Libro;
import pbiblioteca.LibroBD;
import pbiblioteca.PBiblioteca;

/**
 * FXML Controller class
 *
 * @author pedro
 */
public class MenuAdminController implements Initializable {

    @FXML
    private TextField Isb;
    @FXML
    private TextField Titulo;
    @FXML
    private TextField Autor;
    @FXML
    private TextField AnoPublicacion;
    @FXML
    private TextField Editorial;
    @FXML
    private Button Create;

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
    private Button Create1;
    @FXML
    private Label idcliente;
    @FXML
    private TextField contrasena;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
    }

    public void closeWindows() {

    }

    @FXML
    private void Create(ActionEvent event) {

        String año = AnoPublicacion.getText();
        
        if (año.matches("\\d+")){
            
            int año2 = Integer.parseInt(año);
            
            if (año2 >= 0) {
               Libro libro = new Libro(Isb.getText(), Titulo.getText(), 
                       Autor.getText(), año2, Editorial.getText());
                BDatos.agregarLibro(libro);
                LibroBD librobd = new LibroBD();
           
           librobd.create(libro);
                Isb.clear();
                Titulo.clear();
                Autor.clear();
                AnoPublicacion.clear();
                Editorial.clear();
            } else {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Alerta");
                alert.setHeaderText(null);
                alert.setContentText("¡El año de publicación debe ser un número positivo!");
                alert.showAndWait();
            }
        }else{
             Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Alerta");
                alert.setHeaderText(null);
                alert.setContentText("¡El año de publicación debe ser un número!");
                alert.showAndWait();
        }  
    }
    
    
        @FXML
        private void Create1(ActionEvent event) {
            
            String IDc = IdC.getText();
            String Tel = TelefonoC.getText();
            
            if (IDc.matches("\\d+") || Tel.matches("\\d+")){
                int IDc2 = Integer.parseInt(IDc);
                int Tel2 = Integer.parseInt(Tel);
            if (IDc2 >= 0 || Tel2 >= 0){    
        Cliente cliente = new Cliente(NombreC.getText(), Integer.parseInt(IdC.getText()), 
                Integer.parseInt(TelefonoC.getText()),Direccion.getText(),contrasena.getText());
        
        idcliente.setText(String.valueOf(BDatos.BClientes.size()) + " IDcliente");
        
                   BDatos.agregarCliente(cliente);
                   NombreC.clear();
                   IdC.clear();
                   TelefonoC.clear();
                   Direccion.clear();
                   contrasena.clear();
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
        }
    }
        
    
