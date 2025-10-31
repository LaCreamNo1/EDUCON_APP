/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Matematicas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author bebed
 */
public class MatematicasController implements Initializable {

    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private TextField txtresult;
    @FXML
    private Button btnvolver;
    @FXML
    private Button btnsuma;
    @FXML
    private Button btnresta;
    @FXML
    private Button btnborrar;
    @FXML
    private Button multiplicacion;
    @FXML
    private Button btndividir;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volver(ActionEvent event) {
        
        
    }
  
    @FXML
    private void borrar(ActionEvent event) {
        txtnum2.setText("");
        txtnum1.setText("");
        txtresult.setText("");
    }

    @FXML
    private void suma(ActionEvent event) {
        int valor1 = Integer.parseInt((txtnum1.getText()));
        int valor2 = Integer.parseInt((txtnum2.getText()));
        
        int resultado = valor1+valor2;
        System.out.println(resultado);
        txtresult.setText(resultado+" ");
    }

    @FXML
    private void resta(ActionEvent event) {
        int valor1 = Integer.parseInt((txtnum1.getText()));
        int valor2 = Integer.parseInt((txtnum2.getText()));
        
        int resultado = valor1-valor2;
        System.out.println(resultado);
        txtresult.setText(resultado+" ");
    }

    @FXML
    private void multiplicacion(ActionEvent event) {
        int valor1 = Integer.parseInt((txtnum1.getText()));
        int valor2 = Integer.parseInt((txtnum2.getText()));
        
        int resultado = valor1*valor2;
        System.out.println(resultado);
        txtresult.setText(resultado+" ");
    }

    @FXML
    private void dividir(ActionEvent event) {
        Float valor1 = Float.parseFloat((txtnum1.getText()));
        Float valor2 = Float.parseFloat((txtnum2.getText()));
        
        Float resultado = valor1/valor2;
        System.out.println(resultado);
        txtresult.setText(resultado+" ");
    }
    
    
    
}
