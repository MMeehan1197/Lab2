package base;

import java.util.ArrayList;
import java.util.Collections;

import Enums.eCardSuit;
import Enums.eCardValue;

/**
 * 
 * @author Michael
 *
 */
public class Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		for(short q = 0; q <= 3; q++){
			eCardSuit SuitValue = eCardSuit.values()[q];
			for(short i = 2; i <= 14; i++){
				eCardValue CardValue = eCardValue.values()[i];
				Card NewCard = new Card(SuitValue, CardValue, (13));
				deck.add(NewCard);
			}
		}
		Collections.shuffle(deck);
	}
	
	
	public Card Draw(){
		return deck.remove(0);
	}
}
