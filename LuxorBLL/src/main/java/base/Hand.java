package base;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> cardsInHand;
	private ArrayList<Card> bestCardsInHand;
	private HandScore handScore;
	private boolean bScored = false;
	
	
	public Hand() {
		cardsInHand = new ArrayList<Card>();
		bestCardsInHand = new ArrayList<Card>();
	}

	public boolean isbScored() {
		return bScored;
	}

	public void setbScored(boolean bScored) {
		this.bScored = bScored;
	}

	public ArrayList<Card> getCardsInHand() {
		return cardsInHand;
	}

	public ArrayList<Card> getBestCardsInHand() {
		return bestCardsInHand;
	}

	public HandScore getHandScore() {
		return handScore;
	}
	
	public Hand RemoveCardFromHand(Card c){
		cardsInHand.remove(c);
		return this;
	}
	
	public Hand AddCardToHand(Card c){
		cardsInHand.add(c);
		return this;
	}

	public Hand Draw(Deck d){
		cardsInHand.add(d.Draw());
		return this;
	}
}
