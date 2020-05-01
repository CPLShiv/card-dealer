//Caleb Garcia

public class CardsDemo {
	
	public static void main(String[] args) {
		System.out.println("Getting deck for dealing...");
		Deck deck = Deck.getInstance();
		System.out.println("Deck ID: " + deck.getID());
		System.out.println("Dealing player 1 hand...");
		Player player1 = new Player(deck.dealHand());
		System.out.println("Player 1's hand:\n" + player1.getHand());
		System.out.println("Getting deck for dealing...");
		deck = Deck.getInstance();
		System.out.println("Deck ID: " + deck.getID());
		System.out.println("Dealing player 2 hand...");
		Player player2 = new Player(deck.dealHand());
		System.out.println("Player 2's hand:\n" + player2.getHand());
		
		
	}
	
}