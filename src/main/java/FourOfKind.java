import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FourOfKind extends CardType {

	@Override
	boolean isVaildCardType(Player player, List<Card> cardList) {
		if (cardList.size() == 5) {
			Collections.sort(cardList, new Comparator<Card>() {
				public int compare(Card c1, Card c2) {
					return Integer.valueOf(c1.rank().ordinal()).compareTo(Integer.valueOf(c2.rank().ordinal()));
				}
			});
			
			if (cardList.get(0).rank() == cardList.get(1).rank()) {
				if (cardList.get(1).rank() == cardList.get(2).rank()
						&& cardList.get(2).rank() == cardList.get(3).rank()) {
					if (cardList.get(3).rank() == cardList.get(4).rank()) {
						return false;
					}
					return true;
				}
			} else if (cardList.get(1).rank() == cardList.get(2).rank()
					&& cardList.get(2).rank() == cardList.get(3).rank()
					&& cardList.get(3).rank() == cardList.get(4).rank()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	boolean rankingCard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	String cardType() {
		return "FourOfKind";
	}

}
