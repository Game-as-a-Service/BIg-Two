import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StraightFlushTest {

	@Test
	void test_cardType_is_StraightFlush_34567() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FIVE, Suit.C));
		cardList.add(new Card(Rank.SIX, Suit.C));
		cardList.add(new Card(Rank.SEVEN, Suit.C));
		assertTrue(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_StraightFlush_12345() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FIVE, Suit.C));
		cardList.add(new Card(Rank.ACE, Suit.C));
		cardList.add(new Card(Rank.DEUCE, Suit.C));
		assertTrue(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_StraightFlush_910JQK() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.KING, Suit.D));
		cardList.add(new Card(Rank.QUEEN, Suit.D));
		cardList.add(new Card(Rank.NINE, Suit.D));
		cardList.add(new Card(Rank.TEN, Suit.D));
		cardList.add(new Card(Rank.JACK, Suit.D));
		assertTrue(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_not_StraightFlush_12356() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.ACE, Suit.C));
		cardList.add(new Card(Rank.DEUCE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FIVE, Suit.C));
		cardList.add(new Card(Rank.SIX, Suit.C));
		assertFalse(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_not_StraightFlush_12345_suit_NotAllSame() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		cardList.add(new Card(Rank.FIVE, Suit.C));
		cardList.add(new Card(Rank.SIX, Suit.C));
		cardList.add(new Card(Rank.SEVEN, Suit.C));
		assertFalse(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_not_StraightFlush_13579_suit_NotAllSame() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.ACE, Suit.D));
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FIVE, Suit.C));
		cardList.add(new Card(Rank.SEVEN, Suit.C));
		cardList.add(new Card(Rank.NINE, Suit.C));
		assertFalse(straightFlushType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_not_StraightFlush_empty_CardList() {
		StraightFlush straightFlushType = new StraightFlush();
		Player player = new Player("big mussle");
		assertFalse(straightFlushType.isVaildCardType(player, new ArrayList<>()));
	}
	
	
}
