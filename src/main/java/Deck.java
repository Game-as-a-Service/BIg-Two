import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private static List<Card> protoDeck;

	public static synchronized List<Card> newDeck() {
		if (null == protoDeck || protoDeck.isEmpty()) {
			protoDeck = new ArrayList<>();
			for (Suit suit : Suit.values())
				for (Rank rank : Rank.values())
					protoDeck.add(new Card(rank, suit));
			shuffle(protoDeck);
		}
		return new ArrayList<>(protoDeck);
	}

	private static List<Card> shuffle(List<Card> deckCardList) {
		Random rand = new Random();
		int numberOfElements = 52;

		for (int i = 0; i < numberOfElements; i++) {

			int randomIndex = rand.nextInt(deckCardList.size());
			Card randomElement = deckCardList.get(randomIndex);
			deckCardList.set(randomIndex, deckCardList.get(i));
			deckCardList.set(i, randomElement);
		}

		return deckCardList;
	}

	public static List<Card> deal(List<Card> deckCardList, int handCardSize) {
		int deckSize = deckCardList.size();
	    List<Card> hand = new ArrayList<>(deckCardList.subList(deckSize - handCardSize, deckSize));
	    deckCardList.subList(deckSize - handCardSize, deckSize).clear();
	    return hand;
	}
}
