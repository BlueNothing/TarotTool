
public class Card {
	String cardName;
	boolean reversed;
	
	public Card(String name, boolean reversed){
		cardName = name;
		reversed = this.reversed;
	}
	
	public Card(String name){
		cardName = name;
		reversed = false;
	}
	
	public boolean isReversed() {
		return reversed;
	}

	public void setReversed(boolean reversed) {
		this.reversed = reversed;
	}

	@Override
	public String toString() {
		if(reversed) {
			return cardName + " Reversed";
		} else {
			return cardName;
		}
	}
}
