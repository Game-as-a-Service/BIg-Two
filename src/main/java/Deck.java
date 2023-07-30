import java.util.ArrayList;
import java.util.List;

public class Deck {
	private static final List<Card> protoDeck = new ArrayList<>();

	static {
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				protoDeck.add(new Card(rank, suit));
	}

	public static ArrayList<Card> newDeck() {
		return new ArrayList<>(protoDeck);
	}

}
