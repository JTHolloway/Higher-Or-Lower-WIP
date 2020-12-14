package horl;

import java.util.*;

public class HOrL {

//    static Random r = new Random();
//    static int[] Cards = new int[54];
//    static int[] suits = new int[54];
//    static int Current;
//    static ArrayList<Card> Deck = new ArrayList<>();
//
//    HOrL() {
//        Start();
//    }
//
//    public void Start() {
//        AddCards();
//        PickCard();
//        createObjects();
//    }
//
//    public static void AddCards() {
//        int j = 1;
//        int k = 1;
//        for (int i = 0; i < 52; i++) {
//            if (j == 14) {
//                j = 1;
//                k++;
//            }
//            Cards[i] = j;
//            suits[i] = k;
//            j++;
//        }
//        Cards[Cards.length - 1] = 14;
//        Cards[Cards.length - 2] = 14;
//
//        Shuffle();
//    }
//
//    public static void Shuffle() {
//        Print();
//        for (int i = 0; i < Cards.length; i++) {
//            int First = r.nextInt(54);
//            int Second = r.nextInt(54);
//            int Temp = Cards[First];
//            Cards[First] = Cards[Second];
//            Cards[Second] = Temp;
//            
//            int TempSuit = suits[First];
//            suits[First] = suits[Second];
//            suits[Second] = TempSuit;
//            
//        }
//        System.out.println("");
//        Current = Cards[0];
//        Print();
//    }
//    
//    public static void createObjects(){
//        System.out.println("");
//        for (int i = 0; i < 54; i++) {
//            Card c = new Card(Cards[i],suits[i]);
//            Deck.add(c);
//        }
//        
//        CreateDeck(Deck);
//    }
//    
//    public static void CreateDeck(ArrayList<Card> deck){
//        DeckOfCards Deck = new DeckOfCards(deck);
//    }
//
//    public static void Print() {
//        for (int i = 0; i < Cards.length; i++) {
//            System.out.print(Cards[i] + " ");
//        }
//        System.out.println("");
//        for (int i = 0; i < Cards.length; i++) {
//            System.out.print(suits[i] + " ");
//        }
//    }
//
//    public static void PickCard() {
//        System.out.println("\n");
//        for (int i = 0; i < 10; i++) {
//            int Selection = Cards[i];
//            HoL(Selection);
//        }
//    }
//
//    public static void HoL(int s) {
//        if (s != 14 || s!=1) {
//            if (s < Current) {
//                System.out.println(s+" L " + Current);
//                Current = s;
//            } else if (s > Current) {
//                System.out.println(s+" H " + Current);
//                Current = s;
//            } else {
//                System.out.println(s+" S " + Current);
//                Current = s;
//            }
//        } else if(s==14){
//            System.out.println("joker");
//        }else if(s==1){
//            System.out.println("ace");
//        }else{
//            throw new IllegalArgumentException("Invalid card");
//        }
//    }
//
//}
