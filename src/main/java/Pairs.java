import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pairs extends CardType {

	@Override
	boolean isVaildCardType(Player player, List<Card> cardList) {
		if (cardList.size() == 2) {
			// 判斷是否一樣
			if (cardList.get(0).rank() == cardList.get(1).rank()) {
				return true;
			}
		}
		return false;
	}

	@Override
	boolean rankingCard(List<Card> topCardList, List<Card> cardList) {
		if (cardList.size() == 2) {
			// 判斷是否一樣
			if (topCardList.get(0).rank() == topCardList.get(1).rank()
					&& cardList.get(0).rank() == cardList.get(1).rank()) {
				// 排序，協助接下來的判斷
				Collections.sort(topCardList, new Comparator<Card>() {
					public int compare(Card c1, Card c2) {
						return Integer.valueOf(c1.rank().ordinal()).compareTo(Integer.valueOf(c2.rank().ordinal()));
					}
				});

				Collections.sort(cardList, new Comparator<Card>() {
					public int compare(Card c1, Card c2) {
						return Integer.valueOf(c1.rank().ordinal()).compareTo(Integer.valueOf(c2.rank().ordinal()));
					}
				});

				// 比大小
				if (Integer.valueOf(topCardList.get(0).rank().ordinal())
						.compareTo(Integer.valueOf(cardList.get(0).rank().ordinal())) > 0) {
					return true;
				} else if (Integer.valueOf(topCardList.get(0).rank().ordinal())
						.compareTo(Integer.valueOf(cardList.get(0).rank().ordinal())) == 0) {
					// 大小一樣，比花色
					if (Integer.valueOf(topCardList.get(0).suit().ordinal())
							.compareTo(Integer.valueOf(cardList.get(0).suit().ordinal())) > 0) {
						return true;
					}
				} else {
					return false;
				}
			}

		}
		return false;
	}

	@Override
	String cardType() {
		return "Pairs";
	}

}
