import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class HandCardsTest {

	private static final int HANDCARDS_AMOUNT_THIRTEEN = 13;
	private static final int PLAYER_AMOUNT_FOUR = 4;
	private static final int TOTAL_CARD_COUNT = 52;

	@Test
	void testGameInitialHandCardsIsThirteen() {
		// WHEN 遊戲開始4人進入
		BigTwo game = new BigTwo(Arrays.asList(new Player("大壯"), new Player("小帥"), new Player("捲毛"), new Player("小美")));
		assertEquals(PLAYER_AMOUNT_FOUR, game.getPlayerList().size());

		// 牌桌52張牌
		List<Card> deckCardList = Deck.newDeck();
		assertEquals(TOTAL_CARD_COUNT, deckCardList.size());

		HandCards hand = new HandCards();

		// THEN 檢查手牌必須是13張
		assertEquals(HANDCARDS_AMOUNT_THIRTEEN, hand.getCardCount());
	}

}
