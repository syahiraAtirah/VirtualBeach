/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package template;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class ShawarmaDP3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        TextArea text = new TextArea();
        text.setEditable(false);
        text.setPrefWidth(480);
        text.setPrefHeight(360);
        
        Button Chicken = new Button();
        Chicken.setPrefWidth(150);
        Chicken.setText("Chicken Shawarma");
        Chicken.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                ShawarmaVideo video = new ShawarmaVideo();
                video.setShawarma("C");
                Stage stage = new Stage();
                try {
                    ChickenShawarma chicken = new ChickenShawarma();
                    String chickenText = chicken.prepare();
                    text.setText(chickenText);
                    video.start(stage);
                    
                    
                } catch (Exception ex) {
                    Logger.getLogger(ShawarmaDP3.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
        
        Button Vege = new Button();
        Vege.setPrefWidth(150);
        Vege.setText("Vege Shawarma");
        Vege.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                ShawarmaVideo video = new ShawarmaVideo();
                video.setShawarma("V");
                VegeShawarma vege= new VegeShawarma();
                    String vegeText = vege.prepare();
                    text.setText(vegeText);
                    System.out.println(vegeText);
                Stage stage = new Stage();
                try {
                    video.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(ShawarmaDP3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        
        AnchorPane root = new AnchorPane();
        
        AnchorPane.setRightAnchor(text, 80.0);
        AnchorPane.setTopAnchor(text, 20.0);
        
        AnchorPane.setLeftAnchor(Chicken, 60.0);
        AnchorPane.setBottomAnchor(Chicken, 20.0);
        
        AnchorPane.setRightAnchor(Vege, 60.0);
        AnchorPane.setBottomAnchor(Vege, 20.0);
        root.getChildren().addAll(text, Chicken, Vege);
        
        
        Scene scene = new Scene(root, 640, 480);
        
        primaryStage.setTitle("Template Shawarma");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
