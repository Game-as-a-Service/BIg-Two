import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StraightFlush extends CardType {

	@Override
	boolean isVaildCardType(Player player, List<Card> cardList) {
		if (cardList.size() == 5) {
			// 判斷花色是否5張都一樣
			if (cardList.get(0).suit() == cardList.get(1).suit() && cardList.get(1).suit() == cardList.get(2).suit()
					&& cardList.get(2).suit() == cardList.get(3).suit()
					&& cardList.get(3).suit() == cardList.get(4).suit()) {

				// 排序，協助接下來的判斷
				Collections.sort(cardList, new Comparator<Card>() {
					public int compare(Card c1, Card c2) {
						return Integer.valueOf(c1.rank().ordinal()).compareTo(Integer.valueOf(c2.rank().ordinal()));
					}
				});

				// 判斷是否為順序排列
				int temp = cardList.get(0).rank().ordinal();
				boolean flag = true;
				for (var i = 1; i < cardList.size(); i++) {
					if (cardList.get(i).rank().ordinal() == (temp + 1)) {
						temp = cardList.get(i).rank().ordinal();
					} else {
						flag = false;
						break;
					}
				}
				return flag;

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
