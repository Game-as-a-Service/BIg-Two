import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PairsTest {

	@Test
	void test_cardType_is_pairs_33() {
		Pairs pairsType = new Pairs();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.D));
		assertTrue(pairsType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_not_pairs_333() {
		Pairs pairsType = new Pairs();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.D));
		cardList.add(new Card(Rank.THREE, Suit.S));
		assertFalse(pairsType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_compare_33_and_44_topCardSmall() {
		Pairs pairsType = new Pairs();
		List<Card> topCardList = new ArrayList<>();
		topCardList.add(new Card(Rank.THREE, Suit.C));
		topCardList.add(new Card(Rank.THREE, Suit.D));
		
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		assertFalse(pairsType.rankingCard(topCardList, cardList));
	}
	
	@Test
	void test_compare_44_and_33_topCardBigger() {
		Pairs pairsType = new Pairs();
		List<Card> topCardList = new ArrayList<>();
		topCardList.add(new Card(Rank.FOUR, Suit.C));
		topCardList.add(new Card(Rank.FOUR, Suit.D));
		
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.D));
		assertTrue(pairsType.rankingCard(topCardList, cardList));
	}
	
	@Test
	void test_compare_s33_and_33_topCardBigger() {
		Pairs pairsType = new Pairs();
		// 黑桃、磚塊
		List<Card> topCardList = new ArrayList<>();
		topCardList.add(new Card(Rank.THREE, Suit.S));
		topCardList.add(new Card(Rank.THREE, Suit.D));
		
		// 梅花、紅心
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.H));
		assertTrue(pairsType.rankingCard(topCardList, cardList));
	}
	
	@Test
	void test_compare_33_and_33_topCardSmall() {
		Pairs pairsType = new Pairs();
		// 梅花、紅心
		List<Card> topCardList = new ArrayList<>();
		topCardList.add(new Card(Rank.THREE, Suit.C));
		topCardList.add(new Card(Rank.THREE, Suit.D));

		// 黑桃、磚塊
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.S));
		cardList.add(new Card(Rank.THREE, Suit.H));
		assertFalse(pairsType.rankingCard(topCardList, cardList));
	}
	
}
