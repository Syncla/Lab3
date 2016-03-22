package pokerBase;

import java.util.ArrayList;

import exceptions.HandException;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class testing {

	public static void main(String[] args) {
		Deck d = new Deck(5);
		ArrayList<Card> h = new ArrayList<Card>();
		h.add(new Card(eSuit.JOKER,eRank.JOKER,53));
		h.add(new Card(eSuit.JOKER,eRank.JOKER,12));
		h.add(new Card(eSuit.CLUBS,eRank.QUEEN,11));
		h.add(new Card(eSuit.CLUBS,eRank.QUEEN,10));
		h.add(new Card(eSuit.CLUBS,eRank.TEN,9));
		Hand hand = new Hand();
		hand.setCardsInHand(h);
		try {
			hand=Hand.EvaluateHand(hand);
			System.out.println(hand.getHandScore().getHandStrength());
		} catch (HandException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
