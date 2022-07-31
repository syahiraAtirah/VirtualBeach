/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author User
 */
public class ShawarmaVideo extends Application{
    public static Stage stage;
    private Scene scene;
    private BorderPane borderPane;
    
    private Media media;
    private MediaPlayer mediaPlayer;
    private MediaView mediaView;
    
    private String shawarma;
    private String ChickenURL = "src/assets/ChickenShawarma.mp4";
    private String VegeURL = "src/assets/VegeShawarma.mp4";
    
    
    public void setShawarma(String shawarma){
        this.shawarma = shawarma;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        stage = primaryStage;
        borderPane = new BorderPane();
        String url = "";
        if(shawarma!= null){
            if(shawarma.equals("C")){
                url = ChickenURL;
            }
            else{
                url = VegeURL;
            }
        media = new Media(Paths.get(url).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnReady(()-> stage.sizeToScene());
        
        mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setOnEndOfMedia(()->{
            stage.hide();
        });
        borderPane.setCenter(mediaView);
        scene = new Scene(borderPane, 640,480);
        stage.setScene(scene);
        stage.setTitle("Shawarma Video");
        stage.show();
        
        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
                @Override
                public void handle(WindowEvent event) {
                    mediaPlayer.stop();
                }
            
        });
    }
    }
    
}
