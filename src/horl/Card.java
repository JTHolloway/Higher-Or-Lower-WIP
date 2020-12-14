package horl;

import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;

public class Card {

    private String face, suit;
    private Image image;

    public Card(String face, String suit) {
        setFace(face);
        setSuit(suit);
        //System.out.println(toString());
        
        String fileName;
        if(getFace().equals("joker")){
            fileName = suit+"_"+face+".png";
        }else{
            fileName = face+"_of_"+suit+".png";
        }
        image = new Image("./images/"+fileName);
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        List<String> ValidFace = getValidFace();
        face = face.toLowerCase();

        if (ValidFace.contains(face)) {
            this.face = face;
        } else if (face.equals("joker")) {
            this.face = face;
        } else {
            throw new IllegalArgumentException("Invalid face");
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> ValidSuit = getValidSuit();
        suit = suit.toLowerCase();

        if (ValidSuit.contains(suit)) {
            this.suit = suit;
        } else if (suit.equals("black") || suit.equals("red")) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Invalid face");
        }
    }

    public static List<String> getValidFace() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
    }

    public static List<String> getValidSuit() {
        return Arrays.asList("hearts", "diamonds", "clubs", "spades");
    }

    public String toString() {
        if (face.equals("joker")) {
            return String.format("%s %s", suit, face);
        } else {
            return String.format("%s of %s", face, suit);
        }
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public static int getFaceCode(String Face){
        switch(Face){
            case "ace":
                return 1;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return Integer.parseInt(Face);
            case "jack":
                return 11;
            case "queen":
                return 12;
            case "king":
                return 13;
            case "joker":
                return 14;
            default:
                throw new IllegalArgumentException("Invalid Face");
        }
    }

}
