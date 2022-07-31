
import template.ShawarmaDP3;
import template.ChickenShawarma;
import template.VegeShawarma;
import template.ShawarmaVideo;
import beach.Female;
import beach.Male;
import beach.Person;
import beach.PersonFactory;
import beach.Run;
import beach.Swim;
import beach.Walk;
import facade.BeachFacade;
import facade.LightHouse;
import facade.Music;
import facade.Sky;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public class FXMLController implements Initializable {
    
    // INITIALIZE ALL BUTTONS 
    @FXML
    private Button btnMC;
    @FXML
    private Button btnFT;
    @FXML
    private Button btnFC;
    @FXML
    private Button btnMA;
    @FXML
    private Button btnMT;
    @FXML
    private Button btnFA;
    @FXML
    private Button btnFASwim;
    @FXML
    private Button btnFAWalk;
    @FXML
    private Button btnFARun;
    @FXML
    private Button btnFTSwim;
    @FXML
    private Button btnFTWalk;
    @FXML
    private Button btnFTRun;
    @FXML
    private Button btnFCSwim;
    @FXML
    private Button btnFCWalk;
    @FXML
    private Button btnFCRun;
    @FXML
    private Button btnMASwim;
    @FXML
    private Button btnMAWalk;
    @FXML
    private Button btnMARun;
    @FXML
    private Button btnMTSwim;
    @FXML
    private Button btnMTWalk;
    @FXML
    private Button btnMTRun;
    @FXML
    private Button btnMCSwim;
    @FXML
    private Button btnMCWalk;
    @FXML
    private Button btnMCRun;
    
//  -----------------------------------------------------------------------------------------------------------------------------------
    
    // INITIALIZE ALL IMAGES
    @FXML
    private ImageView imgMC;
    @FXML
    private ImageView imgFC;
    @FXML
    private ImageView imgMT;
    @FXML
    private ImageView imgFT;
    @FXML
    private ImageView imgMA;
    @FXML
    private ImageView imgFA;
    @FXML
    private ImageView imgFCSwim;
    @FXML
    private ImageView imgFCWalk;
    @FXML
    private ImageView imgFCRun;
    @FXML
    private ImageView imgMCSwim;
    @FXML
    private ImageView imgMCWalk;
    @FXML
    private ImageView imgMCRun;
    @FXML
    private ImageView imgMTSwim;
    @FXML
    private ImageView imgMTWalk;
    @FXML
    private ImageView imgMTRun;
    @FXML
    private ImageView imgMASwim;
    @FXML
    private ImageView imgFTSwim;
    @FXML
    private ImageView imgFASwim;
    @FXML
    private ImageView imgMAWalk;
    @FXML
    private ImageView imgMARun;
    @FXML
    private ImageView imgFTWalk;
    @FXML
    private ImageView imgFTRun;
    @FXML
    private ImageView imgFAWalk;
    @FXML
    private ImageView imgFARun;
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // DECLARE ALL IMAGES
    // MALE CHILD
    Image MC = new Image(getClass().getResourceAsStream("assets/maleChild.png"));
    Image MCRun = new Image(getClass().getResourceAsStream("assets/mcRun.gif"));
    Image MCSwim = new Image(getClass().getResourceAsStream("assets/mcSwim.gif"));
    Image MCWalk = new Image(getClass().getResourceAsStream("assets/mcWalk.gif"));
    // MALE TEENAGE
    Image MT = new Image(getClass().getResourceAsStream("assets/maleTeenage.png"));
    Image MTRun = new Image(getClass().getResourceAsStream("assets/mtRun.gif"));
    Image MTSwim = new Image(getClass().getResourceAsStream("assets/mtSwim.gif"));
    Image MTWalk = new Image(getClass().getResourceAsStream("assets/mtWalk.gif"));
    // MALE ADULT
    Image MA = new Image(getClass().getResourceAsStream("assets/maleAdult.png"));
    Image MARun = new Image(getClass().getResourceAsStream("assets/maRun.gif"));
    Image MASwim = new Image(getClass().getResourceAsStream("assets/maSwim.gif"));
    Image MAWalk = new Image(getClass().getResourceAsStream("assets/maWalk.gif"));
    // FEMALE CHILD
    Image FC = new Image(getClass().getResourceAsStream("assets/femaleChild.png"));
    Image FCRun = new Image(getClass().getResourceAsStream("assets/fcRun.gif"));
    Image FCSwim = new Image(getClass().getResourceAsStream("assets/fcSwim.gif"));
    Image FCWalk = new Image(getClass().getResourceAsStream("assets/fcWalk.gif"));
    // FEMALE TEENAGE
    Image FT = new Image(getClass().getResourceAsStream("assets/femaleTeenage.png"));
    Image FTRun = new Image(getClass().getResourceAsStream("assets/ftRun.gif"));
    Image FTSwim = new Image(getClass().getResourceAsStream("assets/ftSwim.gif"));
    Image FTWalk = new Image(getClass().getResourceAsStream("assets/ftWalk.gif"));
    // FEMALE ADULT
    Image FA = new Image(getClass().getResourceAsStream("assets/femaleAdult.png"));
    Image FARun = new Image(getClass().getResourceAsStream("assets/faRun.gif"));
    Image FASwim = new Image(getClass().getResourceAsStream("assets/faSwim.gif"));
    Image FAWalk = new Image(getClass().getResourceAsStream("assets/faWalk.gif"));

//  -----------------------------------------------------------------------------------------------------------------------------------

    // CREATE OBJECT OF PERSON
    PersonFactory female = new Female();
    PersonFactory male = new Male();

//  -----------------------------------------------------------------------------------------------------------------------------------

    // INITIALIZE PERSON
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    Person person5;
    Person person6;
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // INITIALIZER
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnFASwim.setDisable(true);
        btnFAWalk.setDisable(true);
        btnFARun.setDisable(true);
        btnFTSwim.setDisable(true);
        btnFTWalk.setDisable(true);
        btnFTRun.setDisable(true);
        btnFCSwim.setDisable(true);
        btnFCWalk.setDisable(true);
        btnFCRun.setDisable(true);
        btnMASwim.setDisable(true);
        btnMAWalk.setDisable(true);
        btnMARun.setDisable(true);
        btnMTSwim.setDisable(true);
        btnMTWalk.setDisable(true);
        btnMTRun.setDisable(true);
        btnMCSwim.setDisable(true);
        btnMCWalk.setDisable(true);
        btnMCRun.setDisable(true);
    }    

//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF MALE CHILD AND ITS BEHAVIOR
    @FXML
    private void clickMC(ActionEvent event) {
        btnMCSwim.setDisable(false);
        btnMCWalk.setDisable(false);
        btnMCRun.setDisable(false);
        person1 = male.getPerson("child");
        imgMC.setImage(MC);
    }

    @FXML
    private void MCswim(ActionEvent event) {
        btnMC.setDisable(true);
        imgMCSwim.setImage(MCSwim);
        imgMC.setVisible(false);
        imgMCSwim.setVisible(true);
        imgMCWalk.setVisible(false);
        imgMCRun.setVisible(false);
        System.out.println("\nClick Male Child swim");
        person1.setMove(new Swim());
        person1.performMove();
    }

    @FXML
    private void MCwalk(ActionEvent event) {
        btnMC.setDisable(true);
        imgMCWalk.setImage(MCWalk);
        imgMC.setVisible(false);
        imgMCSwim.setVisible(false);
        imgMCWalk.setVisible(true);
        imgMCRun.setVisible(false);
        System.out.println("\nClick Male Child walk");
        person1.setMove(new Walk());
        person1.performMove();
    }

    @FXML
    private void MCrun(ActionEvent event) {
        btnMC.setDisable(true);
        imgMCRun.setImage(MCRun);
        imgMC.setVisible(false);
        imgMCSwim.setVisible(false);
        imgMCWalk.setVisible(false);
        imgMCRun.setVisible(true);
        System.out.println("\nClick Male Child run");
        person1.setMove(new Run());
        person1.performMove();
    }
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF MALE TEENAGE AND ITS BEHAVIOR
    @FXML
    private void clickMT(ActionEvent event) {
        btnMTSwim.setDisable(false);
        btnMTWalk.setDisable(false);
        btnMTRun.setDisable(false);
        person2 = male.getPerson("teenager");
        imgMT.setImage(MT);
    }
    
    @FXML
    private void MTswim(ActionEvent event) {
        btnMT.setDisable(true);
        imgMTSwim.setImage(MTSwim);
        imgMT.setVisible(false);
        imgMTSwim.setVisible(true);
        imgMTWalk.setVisible(false);
        imgMTRun.setVisible(false);
        System.out.println("\nClick Male Teenager swim");
        person2.setMove(new Swim());
        person2.performMove();
    }

    @FXML
    private void MTwalk(ActionEvent event) {        
        btnMT.setDisable(true);
        imgMTWalk.setImage(MTWalk);
        imgMT.setVisible(false);
        imgMTSwim.setVisible(false);
        imgMTWalk.setVisible(true);
        imgMTRun.setVisible(false);
        System.out.println("\nClick Male Teenager walk");
        person2.setMove(new Walk());
        person2.performMove();
    }

    @FXML
    private void MTrun(ActionEvent event) {
        btnMT.setDisable(true);
        imgMTRun.setImage(MTRun);
        imgMT.setVisible(false);
        imgMTSwim.setVisible(false);
        imgMTWalk.setVisible(false);
        imgMTRun.setVisible(true);
        System.out.println("\nClick Male Teenager run");
        person2.setMove(new Run());
        person2.performMove();
    }
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF MALE ADULT AND ITS BEHAVIOR
    @FXML
    private void clickMA(ActionEvent event) {
        btnMASwim.setDisable(false);
        btnMAWalk.setDisable(false);
        btnMARun.setDisable(false);
        person3 = male.getPerson("adult");
        imgMA.setImage(MA);
    }

    @FXML
    private void MAswim(ActionEvent event) {        
        btnMA.setDisable(true);
        imgMASwim.setImage(MASwim);
        imgMA.setVisible(false);
        imgMASwim.setVisible(true);
        imgMAWalk.setVisible(false);
        imgMARun.setVisible(false);
        System.out.println("\nClick Male Adult swim");
        person3.setMove(new Swim());
        person3.performMove();
    }

    @FXML
    private void MAwalk(ActionEvent event) {
        btnMA.setDisable(true);
        imgMAWalk.setImage(MAWalk);
        imgMA.setVisible(false);
        imgMASwim.setVisible(false);
        imgMAWalk.setVisible(true);
        imgMARun.setVisible(false);
        System.out.println("\nClick Male Adult walk");
        person3.setMove(new Walk());
        person3.performMove();
    }

    @FXML
    private void MArun(ActionEvent event) {
        btnMA.setDisable(true);
        imgMARun.setImage(MARun);
        imgMA.setVisible(false);
        imgMASwim.setVisible(false);
        imgMAWalk.setVisible(false);
        imgMARun.setVisible(true);
        System.out.println("\nClick Male Adult run");
        person3.setMove(new Run());
        person3.performMove();
    }
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF FEMALE CHILD AND ITS BEHAVIOR
    @FXML
    private void clickFC(ActionEvent event) {
        btnFCSwim.setDisable(false);
        btnFCWalk.setDisable(false);
        btnFCRun.setDisable(false);
        person4 = female.getPerson("child");
        imgFC.setImage(FC);
    }
 
    @FXML
    private void FCswim(ActionEvent event) {
        btnFC.setDisable(true);
        imgFCSwim.setImage(FCSwim);
        imgFC.setVisible(false);
        imgFCSwim.setVisible(true);
        imgFCWalk.setVisible(false);
        imgFCRun.setVisible(false);
        System.out.println("\nClick Female Child swim");
        person4.setMove(new Swim());
        person4.performMove();
    }

    @FXML
    private void FCwalk(ActionEvent event) {
        btnFC.setDisable(true);
        imgFCWalk.setImage(FCWalk);
        imgFC.setVisible(false);
        imgFCSwim.setVisible(false);
        imgFCWalk.setVisible(true);
        imgFCRun.setVisible(false);
        System.out.println("\nClick Female Child walk");
        person4.setMove(new Walk());
        person4.performMove();
    }

    @FXML
    private void FCrun(ActionEvent event) {
        btnFC.setDisable(true);
        imgFCRun.setImage(FCRun);
        imgFC.setVisible(false);
        imgFCSwim.setVisible(false);
        imgFCWalk.setVisible(false);
        imgFCRun.setVisible(true);
        System.out.println("\nClick Female Child run");
        person4.setMove(new Run());
        person4.performMove();
    }
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF FEMALE TEENAGE AND ITS BEHAVIOR
    @FXML
    private void clickFT(ActionEvent event) {
        btnFTSwim.setDisable(false);
        btnFTWalk.setDisable(false);
        btnFTRun.setDisable(false);
        person5 = female.getPerson("teenager");
        imgFT.setImage(FT);
    }

    @FXML
    private void FTswim(ActionEvent event) {
        btnFT.setDisable(true);
        imgFTSwim.setImage(FTSwim);
        imgFT.setVisible(false);
        imgFTSwim.setVisible(true);
        imgFTWalk.setVisible(false);
        imgFTRun.setVisible(false);
        System.out.println("\nClick Female Teenager swim");
        person5.setMove(new Swim());
        person5.performMove();
    }

    @FXML
    private void FTwalk(ActionEvent event) {
        btnFT.setDisable(true);
        imgFTWalk.setImage(FTWalk);
        imgFT.setVisible(false);
        imgFTSwim.setVisible(false);
        imgFTWalk.setVisible(true);
        imgFTRun.setVisible(false);
        System.out.println("\nClick Female Teenager walk");
        person5.setMove(new Walk());
        person5.performMove();
    }

    @FXML
    private void FTrun(ActionEvent event) {
        btnFT.setDisable(true);
        imgFTRun.setImage(FTRun);
        imgFT.setVisible(false);
        imgFTSwim.setVisible(false);
        imgFTWalk.setVisible(false);
        imgFTRun.setVisible(true);
        System.out.println("\nClick Female Teenager run");
        person5.setMove(new Run());
        person5.performMove();
    }
    
//  -----------------------------------------------------------------------------------------------------------------------------------

    // OBJECT OF FEMALE ADULT AND ITS BEHAVIOR
    @FXML
    private void clickFA(ActionEvent event) {
        btnFASwim.setDisable(false);
        btnFAWalk.setDisable(false);
        btnFARun.setDisable(false);
        person6 = female.getPerson("adult");
        imgFA.setImage(FA);
    }
    
    @FXML
    private void FAswim(ActionEvent event) {
        btnFA.setDisable(true);
        imgFASwim.setImage(FASwim);
        imgFA.setVisible(false);
        imgFASwim.setVisible(true);
        imgFAWalk.setVisible(false);
        imgFARun.setVisible(false);
        System.out.println("\nClick Female Adult swim");
        person6.setMove(new Swim());
        person6.performMove();
    }

    @FXML
    private void FAwalk(ActionEvent event) {
        btnFA.setDisable(true);
        imgFAWalk.setImage(FAWalk);
        imgFA.setVisible(false);
        imgFASwim.setVisible(false);
        imgFAWalk.setVisible(true);
        imgFARun.setVisible(false);
        System.out.println("\nClick Female Adult walk");
        person6.setMove(new Walk());
        person6.performMove();
    }

    @FXML
    private void FArun(ActionEvent event) {
        btnFA.setDisable(true);
        imgFARun.setImage(FARun);
        imgFA.setVisible(false);
        imgFASwim.setVisible(false);
        imgFAWalk.setVisible(false);
        imgFARun.setVisible(true);
        System.out.println("\nClick Female Adult run");
        person6.setMove(new Run());
        person6.performMove();
    }

//  -----------------------------------------------------------------------------------------------------------------------------------
   
    // HESWARIY
    @FXML
    private ImageView imgBeach;
    
    Music music = new Music();
    LightHouse light = new LightHouse();
    Sky sky = new Sky();
    BeachFacade facade = new BeachFacade(music, light, sky);
    
    Image dayBg = new Image(getClass().getResourceAsStream("assets/DayBg.png"));
    Image nightBg = new Image(getClass().getResourceAsStream("assets/NightBg.png"));

    String nightPath = getClass().getResource("assets/NightSound.mp3").toString();
    String dayPath = getClass().getResource("assets/DaySound.mp3").toString();
    
    Media media1 = new Media(dayPath);
    MediaPlayer mp1 = new MediaPlayer(media1);
    
    Media media2 = new Media(nightPath);
    MediaPlayer mp2 = new MediaPlayer(media2);
    
    @FXML
    private void onClickDay(ActionEvent event) {
        System.out.println("\nClick Day");
        facade.changeToDay();
        imgBeach.setImage(dayBg);
        mp1.play();
        mp2.stop();
    }

    @FXML
    private void onclickNight(ActionEvent event) {
        System.out.println("\nClick Night");
        facade.changeToNight();
        imgBeach.setImage(nightBg);
        mp2.play();
        mp1.stop();
    }

//  -----------------------------------------------------------------------------------------------------------------------------------

    // AMIRUL
    
    @FXML
    private ImageView shawarmaStall;
    @FXML
    private ImageView shawarmaDialog;
    
    private Image ChickenDialog = new Image(getClass().getResourceAsStream("assets/ChickenShawarma.png"));
    private Image VegeDialog = new Image(getClass().getResourceAsStream("assets/VegeShawarma.png"));
    
    @FXML
    private void clickChicShawarma(ActionEvent event) {
        System.out.println("\nPreparing Chicken Shawarma...");
        ShawarmaVideo video = new ShawarmaVideo();
                video.setShawarma("C");
                Stage stage = new Stage();
                
                try {
                    if(video.stage != null){
                        if(video.stage.isShowing()){
                            video.stage.hide();
                        }
                    }
                    ChickenShawarma chicken = new ChickenShawarma();
                    String chickenText = chicken.prepare();
                    //text.setText(chickenText);
                    System.out.println(chickenText);
                    video.start(stage);
                    
                    
                } catch (Exception ex) {
                    Logger.getLogger(ShawarmaDP3.class.getName()).log(Level.SEVERE, null, ex);
                }
                shawarmaDialog.setVisible(true);
                shawarmaDialog.setImage(ChickenDialog);
    }

    @FXML
    private void clickVegeShawarma(ActionEvent event) {
        System.out.println("\nPreparing Vege Shawarma...");
        ShawarmaVideo video = new ShawarmaVideo();
                
                try {
                    if(video.stage != null){
                        if(video.stage.isShowing()){
                            video.stage.hide();
                        }
                    }
                    video.setShawarma("V");
                VegeShawarma vege= new VegeShawarma();
                    String vegeText = vege.prepare();
                    //text.setText(vegeText);
                    System.out.println(vegeText);
                Stage stage = new Stage();
                    video.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(ShawarmaDP3.class.getName()).log(Level.SEVERE, null, ex);
                }
                shawarmaDialog.setVisible(true);
                shawarmaDialog.setImage(VegeDialog);
    }

}
