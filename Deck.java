//Caleb Garcia

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private static Deck deckInst;
	private static long deckID;
	
	static String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
	static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	
	static Random rand = new Random();
	
	private Deck() {}
	
	public static Deck getInstance() {
		if (deckInst == null) {
			deckInst = new Deck();
			System.out.println("Deck created!");
			deckID = System.currentTimeMillis();
			populateDeck();
			
		} else {
			System.out.println("You already have the deck!\n");
		}
		
		System.out.println("Deck size: " + deckOfCards.size());
		
		return deckInst;
	}
	
	private static void populateDeck() {
		for (int x = 0; x < suits.length; x++) {
			for (int y = 0; y < values.length; y++) {
				deckOfCards.add(new Card(suits[x], values[y]));
			}
		}
		
	}
	
	public static ArrayList<Card> dealHand() {
		ArrayList<Card> hand = new ArrayList<Card>();
		
		for (int i = 0; i < 7; i++) {
			hand.add(getCard());
		}
		
		return hand;
	}
	
	private static Card getCard() {
		int cardPlacement = rand.nextInt(deckOfCards.size());
		Card randCard = deckOfCards.get(cardPlacement);
		deckOfCards.remove(cardPlacement);
		return randCard;
	}
	
	public static long getID() {
		return deckID;
	}
	
}