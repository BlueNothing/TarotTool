import java.util.ArrayList;

public class Deck {
	public static ArrayList<Card> cleanDeck(){
	ArrayList<Card> deck = new ArrayList<Card>();
	deck.add(new Card("0 - The Fool"));
	deck.add(new Card("I - The Magician"));
	deck.add(new Card("II - The High Priestess"));
	deck.add(new Card("III - The Empress"));
	deck.add(new Card("IV - The Emperor"));
	deck.add(new Card("V - The Hierophant"));
	deck.add(new Card("VI - The Lovers"));
	deck.add(new Card("VII - The Chariot"));
	deck.add(new Card("VIII - Strength"));
	deck.add(new Card("IX - The Hermit"));
	deck.add(new Card("X - Wheel of Fortune"));
	deck.add(new Card("XI - Justice"));
	deck.add(new Card("XII - The Hanged Man"));
	deck.add(new Card("XIII - Death"));
	deck.add(new Card("XIV - Temperance"));
	deck.add(new Card("XV - The Devil"));
	deck.add(new Card("XVI - The Tower"));
	deck.add(new Card("XVII - The Star"));
	deck.add(new Card("XVIII - The Moon"));
	deck.add(new Card("XIX - The Sun"));
	deck.add(new Card("XX - Judgement"));
	deck.add(new Card("XXI - The World"));
	for(int i = 0; i < 4; i++) {
		for (int j = 1; j < 15; j++) {
			String value = "Ace";
			String suit = "";
			switch(i) {
			case 0:
				suit = "Wands";
				break;
			case 1:
				suit = "Pentacles";
				break;
			case 2:
				suit = "Cups";
				break;
			case 3:
				suit = "Swords";
				break;
			}
			switch(j) {
			case 1:
				value = "Ace";
				break;
			case 2:
				value = "Two";
				break;
			case 3:
				value = "Three";
				break;
			case 4:
				value = "Four";
				break;
			case 5:
				value = "Five";
				break;
			case 6:
				value = "Six";
				break;
			case 7:
				value = "Seven";
				break;
			case 8:
				value = "Eight";
				break;
			case 9:
				value = "Nine";
				break;
			case 10:
				value = "Ten";
				break;
			case 11:
				value = "Page";
				break;
			case 12:
				value = "Knight";
				break;
			case 13:
				value = "Queen";
				break;
			case 14:
				value = "King";
				break;
			}
			deck.add(new Card("The " + value + " of " + suit));
		}
	}
	for(Card card: deck) {
		System.out.println(card.toString());
	}
	return deck;
	}
	
	public static ArrayList<Card> shuffle(ArrayList<Card> deckTemplate){
		ArrayList<Card> deck = new ArrayList<Card>();
		for(int i = 0; i < deckTemplate.size(); i++) {
		int index = (int) ((Math.random() * (deckTemplate.size() - i)));
		Card card = deckTemplate.get(index);
		deckTemplate.remove(index);
		double reversalVal = Math.random();
		if(reversalVal >= 0.5) {
			card.setReversed(true);
		}
		deck.add(card);
		}
		return deck;
	}
	
	public static ArrayList<Card> draw(String query, ArrayList<Card> deck, int spreadSize){
		ArrayList<Card> drawSet = new ArrayList<Card>();
		for(int i = 0; i < spreadSize; i++) {
			drawSet.add(deck.get(i));
		}
		return drawSet;
	}

}
