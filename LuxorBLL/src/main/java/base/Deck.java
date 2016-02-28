package base;

import java.util.ArrayList;

public class Deck {

	protected static ArrayList<Card> deck;
	protected static ArrayList<Card> standardDeck;
	protected static Card c;
	
	
	
	public Deck(ArrayList<Card> deck) {
		super();
		this.deck = deck;
		
	}
	
	protected Deck Initialize(){
		for(int q = 0; q <= 3; q++){
			for(int i = 2; i <= 14; i++){
				standardDeck.add(new Card(q,i));
			}
		}
		Deck sd = new Deck(standardDeck);
		return sd;
	}
	
	protected static Deck Shuffle(){
		ArrayList<Card> newdeck = new ArrayList<Card>(null);
		
		for(Card c : deck){
			int index = (int) Math.random() * deck.size();
			newdeck.add(deck.get(index));
			deck.remove(index);
		}
		
		Deck d = new Deck(newdeck);
		return d;
	}

}
