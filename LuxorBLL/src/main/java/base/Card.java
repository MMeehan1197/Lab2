package base;

import java.awt.Image;
import Enums.eCardSuit;
import Enums.eCardValue;

public class Card implements Comparable{

	private eCardSuit eSuit;
	private eCardValue eValue;
	private int iNumber;
	


	public Card(eCardSuit eSuit, eCardValue eValue, int iNumber) {
		super();
		this.eSuit = eSuit;
		this.eValue = eValue;
		this.iNumber = iNumber;
	}

	public eCardSuit geteSuit() {
		return eSuit;
	}

	public eCardValue geteValue() {
		return eValue;
	}

	public int getiNumber() {
		return iNumber;
	}

	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteValue().compareTo(this.geteValue());
	}

}