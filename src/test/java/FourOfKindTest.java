import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FourOfKindTest {

	@Test
	void test_cardType_is_fourOfKind() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		cardList.add(new Card(Rank.FOUR, Suit.H));
		cardList.add(new Card(Rank.FOUR, Suit.S));
		assertTrue(fourOfLindType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_fourOfKind2() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		cardList.add(new Card(Rank.FOUR, Suit.H));
		cardList.add(new Card(Rank.FOUR, Suit.S));
		cardList.add(new Card(Rank.THREE, Suit.C));
		assertTrue(fourOfLindType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_fourOfKind3() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.H));
		cardList.add(new Card(Rank.FOUR, Suit.S));
		assertTrue(fourOfLindType.isVaildCardType(player, cardList));
	}

	@Test
	void test_cardType_is_not_fourOfKind() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.FOUR, Suit.H));
		cardList.add(new Card(Rank.FOUR, Suit.S));
		assertFalse(fourOfLindType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_not_fourOfKind2() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.D));
		cardList.add(new Card(Rank.FOUR, Suit.D));
		cardList.add(new Card(Rank.FOUR, Suit.H));
		cardList.add(new Card(Rank.FOUR, Suit.S));
		assertFalse(fourOfLindType.isVaildCardType(player, cardList));
	}
	
	@Test
	void test_cardType_is_not_fourOfKind_cardsAreAllThree() {
		FourOfKind fourOfLindType = new FourOfKind();
		Player player = new Player("big mussle");
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.D));
		cardList.add(new Card(Rank.THREE, Suit.D));
		cardList.add(new Card(Rank.THREE, Suit.H));
		cardList.add(new Card(Rank.THREE, Suit.S));
		assertFalse(fourOfLindType.isVaildCardType(player, cardList));
	}
}
