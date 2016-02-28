package base;

import java.awt.Image;

public class Card {

	private int suit;
	private int value;
	private Image image;
	
	
	public Card(int suit, int value){
		this.suit = suit;
		this.value = value;
	}


	protected int getSuit() {
		return suit;
	}


	protected void setSuit(int suit) {
		this.suit = suit;
	}


	protected int getValue() {
		return value;
	}


	protected void setValue(int value) {
		this.value = value;
	}


	protected Image getImage() {
		return image;
	}


	protected void setImage(Image image) {
		this.image = image;
	}
	
}