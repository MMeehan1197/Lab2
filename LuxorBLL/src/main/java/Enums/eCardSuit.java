package Enums;

public enum eCardSuit {
	Heart(0), Spade(1), Club(2), Diamond(3);
	
	private final int cardSuit;
	
	private eCardSuit(int cardSuit){
		this.cardSuit = cardSuit;
	}

	private int getCardSuit() {
		return cardSuit;
	}
}
