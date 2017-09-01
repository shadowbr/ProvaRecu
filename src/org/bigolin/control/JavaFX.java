package org.bigolin.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.bigolin.media.view.MainWindow;

/**
 *
 * @author marcio
 */
public class JavaFX extends Application {
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;   
     
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(getRootLayout());
        primaryStage.show();
    }
    
     public Scene getRootLayout() {   
                
        Scene scene = null;
        try {
            // Loader
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainWindow.class.getResource("media_harmonica.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();
            
            scene = new Scene(rootLayout);
            
        } catch (IOException e) {
            System.out.println("oi");
            e.printStackTrace();
        }
        return scene;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
