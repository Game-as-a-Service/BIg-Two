import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FourOfKind extends CardType {

	@Override
	boolean isVaildCardType(Player player, List<Card> cardList) {
		if (cardList.size() == 5) {
			// 排序，協助接下來的判斷
			Collections.sort(cardList, new Comparator<Card>() {
				public int compare(Card c1, Card c2) {
					return Integer.valueOf(c1.rank().ordinal()).compareTo(Integer.valueOf(c2.rank().ordinal()));
				}
			});
			
			// 先判斷第1、2張是否一樣
			if (cardList.get(0).rank() == cardList.get(1).rank()) {
				// 一樣就接續判斷剩下牌
				if (cardList.get(1).rank() == cardList.get(2).rank()
						&& cardList.get(2).rank() == cardList.get(3).rank()) {
					// 有可能遇到發牌失誤，導致全部5張數字都一樣
					if (cardList.get(3).rank() == cardList.get(4).rank()) {
						return false;
					}
					return true;
				}
			} else if (cardList.get(1).rank() == cardList.get(2).rank()
					&& cardList.get(2).rank() == cardList.get(3).rank()
					&& cardList.get(3).rank() == cardList.get(4).rank()) {
				// 第1、2張不一樣，接續判斷剩下牌
				// 這邊不用判斷5張，因為1、2張不一樣，不會有5張可能
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
