import java.util.ArrayList;
import java.util.Scanner;

public class Tarot {
	/*
	 * How to go about doing this?
	 * 
	 * To start out, model a simple cleansing.
	 * According to one source, laying out the major arcana, then the suits, each in order, then randomly assigning the cards to positions in the deck should suffice.
	 * 
	 * At this point, the querent should specify their question and preferred spread.
	 * 
	 * Each card should be defined by its name, and each instance of a card should have an orientation randomly specified after a shuffle.
	 * 
	 * Afterwards, conduct a selection-without-replacement on the deck, storing each result.
	 */
	public static void main(String[] args) {
		ArrayList<Card> startDeck = Deck.cleanDeck();
		/*
		 * Query should be prepared here, number of cards to be drawn should be checked here.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you ask of your tarot deck?");
		String query = scan.nextLine();
		System.out.println("How many cards do you want in your spread? 1, 3, 5, and 10 are common spread sizes.");
		int spreadSize = scan.nextInt();
		startDeck = Deck.shuffle(startDeck);
		ArrayList<Card> response = Deck.draw(query, startDeck, spreadSize);
		int i = 1;
		for(Card card : response) {
			System.out.println(i + ". " + card.toString());
		}
	}
}
