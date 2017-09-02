package org.shadowbr.media.control;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.shadowbr.media.view.Media_harmonicaController;


/**
 *
 * @author Lucas Sombra <precutshadow@gmail.com>
 * @version 1.0.0
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
            loader.setLocation(Media_harmonicaController.class.getResource("media_harmonica.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            
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
