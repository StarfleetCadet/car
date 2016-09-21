/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author aviva
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnRun;
    @FXML
    private Button btnStop;
    @FXML
    private Label carLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        carLabel.setText("Auto parkt");
    }
    
    @FXML
    public void runCar(ActionEvent event)
    {
        carLabel.setText("Auto Fährt");
      
    }
    
    @FXML
    public void stopCar(ActionEvent event)
    {
      carLabel.setText("Auto parkt");
    }
}
