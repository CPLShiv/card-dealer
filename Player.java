//Caleb Garcia

import java.util.ArrayList;

public class Player {
	
	public ArrayList<Card> playerHand;
	
	public Player(ArrayList<Card> hand) {
		playerHand = hand;
	}
	
	public String getHand() {
		String hand = "";
		for (Card card : playerHand) {
			hand = hand + card.getValue() + " of " + card.getSuit() + "\n";
		}
		
		return hand;
	}
	
}