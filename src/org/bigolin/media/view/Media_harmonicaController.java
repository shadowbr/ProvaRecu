package org.bigolin.media.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.bigolin.media.model.MediaHarmonicaCalculator;

/**
 * FXML Controller class
 *
 * @author Lucas Sombra <precutshadow@gmail.com>
 */
public class Media_harmonicaController implements Initializable {

    @FXML
    private TextField descricaoTextField;
    @FXML
    private TextField pesoTextField;
    @FXML
    private TextField notaTextField;
    @FXML
    private Button CalButton; 
    @FXML
    private Button SalButton;
    @FXML
    private ListView<String> decListView;
    @FXML
    private ListView<String> PesListView;
    @FXML
    private ListView<String> NotListView;
    @FXML
    private Button AdiButton;

    
    private MediaHarmonicaCalculator mc = new MediaHarmonicaCalculator();
    //Inicializa tudoooo
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        descricaoTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        pesoTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        notaTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        CalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        SalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        /*decListView;
        PesListView;
        NotListView;*/
        
       AdiButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
    }    
    
}
