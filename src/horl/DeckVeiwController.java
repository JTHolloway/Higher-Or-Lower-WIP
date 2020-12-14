/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author James
 */
public class DeckVeiwController implements Initializable {

    private DeckOfCards deck;
    private int CardsDrawn = 1;
    @FXML
    private ImageView FirstCardImageVeiw;
    @FXML
    private ImageView SeccondCardVeiw;
    @FXML
    private ImageView ThirdImageVeiw;
    @FXML
    private ImageView FourthImageVeiw;
    @FXML
    private ImageView FifthImageVeiw;
    @FXML
    private ImageView SixthImageVeiw;
    @FXML
    private ImageView SeventhImageVeiw;
    @FXML
    private ImageView EighthImageVeiw;
    @FXML
    private ImageView NinethImageVeiw;
    @FXML
    private ImageView TenthImageVeiw;
    @FXML
    private ImageView EleventhImageVeiw;
    @FXML
    private ImageView TwelfthImageVeiw;
    @FXML 
    private ImageView DeckImageVeiw;
    @FXML
    Button PlaceBet;

    /**
     * initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deck = new DeckOfCards();
        
        DeckImageVeiw.setImage(deck.getFaceDownCard()); 
        FirstCardImageVeiw.setImage(deck.dealTopCard().getImage());
        SeccondCardVeiw.setImage(deck.getFaceDownCard());
        ThirdImageVeiw.setImage(deck.getFaceDownCard());
        FourthImageVeiw.setImage(deck.getFaceDownCard());
        FifthImageVeiw.setImage(deck.getFaceDownCard());
        SixthImageVeiw.setImage(deck.getFaceDownCard());
        SeventhImageVeiw.setImage(deck.getFaceDownCard());
        EighthImageVeiw.setImage(deck.getFaceDownCard());
        NinethImageVeiw.setImage(deck.getFaceDownCard());
        TenthImageVeiw.setImage(deck.getFaceDownCard());
        EleventhImageVeiw.setImage(deck.getFaceDownCard());
        TwelfthImageVeiw.setImage(deck.getFaceDownCard());
    } 
    
    @FXML
    public void PlaceBetButtonPushed(){
        CardsDrawn++;
        switch(CardsDrawn){
            case 2:
               SeccondCardVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 3:
               ThirdImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 4:
               FourthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 5:
               FifthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 6:
               SixthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 7:
               SeventhImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 8:
               EighthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 9:
               NinethImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 10:
               TenthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 11:
               EleventhImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            case 12:
               TwelfthImageVeiw.setImage(deck.dealTopCard().getImage());
               break;
            default:
                CardsDrawn = 1;
        }
    }
    
}
