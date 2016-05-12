/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxworkshop_02;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

/**
 *
 * @author mhrimaz
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ComboBox<String> combo;
    @FXML
    private void handleOnAction(ActionEvent e){
        System.out.println("e = " + e);
    }
           
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combo.getItems().add("1");
         combo.getItems().add("2");
    }    
    
}
