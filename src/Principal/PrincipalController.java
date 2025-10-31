/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Inicio;

import Metodos.Metodos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author bebed
 */
public class InicioController implements Initializable {

    Metodos objMensj = new Metodos();
    @FXML
    private Button btninicio;
    @FXML
    private Button btnopciones;
    @FXML
    private Button btnsalir;

    /**
     * Initializes the controller class.
     */
    
        @FXML
    private void abrirOtraVentana() {
        try {
            // Cargar el otro FXML (como están en el mismo paquete, no necesitas rutas largas)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Opciones/Opciones.fxml"));
            Parent root = loader.load();

            // Mostrar en una nueva ventana
            Stage stage = new Stage();
            stage.setTitle("OPCIONES");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inicio(ActionEvent event) {
        objMensj.CambioOpciones();
    }

    @FXML
    private void opciones(ActionEvent event) {
        System.out.println("Opciones");
        
    }

    @FXML
    private void salir(ActionEvent event) {
        System.out.println("Salir");
    }
    
}
