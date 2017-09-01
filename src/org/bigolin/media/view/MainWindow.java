/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bigolin.media.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.bigolin.media.model.MediaCalculator;

/**
 * FXML Controller class
 *
 * @author marcio
 */
public class MainWindow implements Initializable {

    @FXML
    private TextField nota;
    @FXML
    private Label resultado;
    @FXML
    private ListView lv1;
    @FXML
    private ListView<String> lista;
    
    private MediaCalculator mc = new MediaCalculator();
    private ObservableList<String> notas ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        notas = lista.getItems();
    }    
    
    @FXML
    public void add(){
        String notaTemp = nota.getText();
        mc.addNota(Double.parseDouble(notaTemp));
        notas.add(notaTemp);
       
    }
    
    @FXML
    public void calcularMedia(){
        resultado.setText("Média: "+ mc.calcular());
    }
    
    @FXML
    public void sair(){
        System.exit(0);
    }
    
    
    
}
