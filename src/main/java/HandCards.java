import java.util.List;

public class HandCards {
	private List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	public void addCards(List<Card> cardList) {
		cards = cardList;
	}

	public int getCardCount() {
		return getCards().size();
	}
	
	public Card showCard(int cardIndex) {
		return cards.remove(cardIndex);
	}
}
