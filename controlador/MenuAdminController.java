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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pbiblioteca.Libro;
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
    private void Create(ActionEvent event) {
        
      Libro libro = new Libro (Isb.getText(), Titulo.getText(), Autor.getText(),
                              Integer.parseInt(AnoPublicacion.getText()), Editorial.getText());
      
      
      Isb.clear();
      Titulo.clear();
      Autor.clear();
      AnoPublicacion.clear();
      Editorial.clear();
      
    }
    
}
