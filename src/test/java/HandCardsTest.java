import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class HandCardsTest {

	private static final int HANDCARDS_AMOUNT_THIRTEEN = 13;
	private static final int PLAYER_AMOUNT_FOUR = 4;
	private static final int TOTAL_CARD_COUNT = 52;

	@Test
	void testGameInitialHaveFourPlayer() {
		BigTwo game = new BigTwo(Arrays.asList(new Player("big mussle"), new Player("handsome"), new Player("white"), new Player("beauty")));
		assertEquals(PLAYER_AMOUNT_FOUR, game.getPlayerList().size());
	}
	
	@Test
	void testDeckCard_isFiftyTwo() {
		// 牌桌52張牌
		List<Card> deckCardList = Deck.newDeck();
		assertEquals(TOTAL_CARD_COUNT, deckCardList.size());
	}
	
	@Test
	void testGameInitialHandCardsIsThirteen() {
		// WHEN 遊戲開始4人進入
		BigTwo game = new BigTwo(Arrays.asList(new Player("big mussle"), new Player("handsome"), new Player("white"), new Player("beauty")));

		// 牌桌52張牌
		List<Card> deckCardList = Deck.newDeck();

		// THEN 初始發牌給各花色13張
		for (Player playerObj : game.getPlayerList()) {
			HandCards hand = new HandCards();
			hand.addCards(Deck.deal(deckCardList, HANDCARDS_AMOUNT_THIRTEEN));
			playerObj.setHandcards(hand);
			
			// THEN 檢查手牌必須是13張
			assertEquals(HANDCARDS_AMOUNT_THIRTEEN, hand.getCardCount());
		}

	}

}
