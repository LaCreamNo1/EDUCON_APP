/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Geografia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author bebed
 */
public class GeografiaController implements Initializable {

    @FXML
    private Button btnlozalizar;
    @FXML
    private Button btnvolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void localizar(ActionEvent event) {
        System.out.println("Localizar");
    }

    @FXML
    private void volver(ActionEvent event) {
        System.out.println("Volver");
        
    }
    
}
