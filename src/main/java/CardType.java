import java.util.List;

public abstract class CardType {
	private List<Card> cardList;

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	abstract boolean isVaildCardType(Player player, List<Card> cardList);

	abstract boolean rankingCard(List<Card> topCardList, List<Card> cardList);

	abstract String cardType();

}
