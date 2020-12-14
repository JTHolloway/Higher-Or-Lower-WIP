package horl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.scene.image.Image;

public class DeckOfCards {

    private ArrayList<Card> CardDeck;
    private Image FaceDownCard;

    public DeckOfCards() {
        List<String> suits = Card.getValidSuit();
        List<String> face = Card.getValidFace();

        CardDeck = new ArrayList<>();

        for (String Suits : suits) {
            for (String Faces : face) {
                CardDeck.add(new Card(Faces, Suits));
            }
        }
        CardDeck.add(new Card("joker", "black"));
        CardDeck.add(new Card("joker", "red"));
        
        Shuffle();
        Print();

        FaceDownCard = new Image("./images/BackOfCard.png");
    }

    public void Shuffle(){
        for(int i = 0; i <100; i++){
          Collections.shuffle(CardDeck);  
        }
    }
    
    public ArrayList<Card> getCardDeck() {
        return CardDeck;
    }

    public void setCardDeck(ArrayList<Card> CardDeck) {
        this.CardDeck = CardDeck;
    }

    public Image getFaceDownCard() {
        return FaceDownCard;
    }

    public void setFaceDownCard(Image FaceDownCard) {
        this.FaceDownCard = FaceDownCard;
    }
    
    public void Print(){
        System.out.println(CardDeck.toString());
    }
    
    public Card dealTopCard(){
        if (CardDeck.size()>0){
            return CardDeck.remove(0);
        }else{
            return null;
        }
    }

}
