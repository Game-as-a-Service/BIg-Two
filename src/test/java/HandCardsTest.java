import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class HandCardsTest {

	private static final int DEFAULT_CARD_AMOUNT_THIRTEEN = 13;
	private static final int DEFAULT_PLAYER_AMOUNT_FOUR = 4;

	@Test
	void testGameInitialHandCardsIsThirteen() {
		// 遊戲開始4人進入
		BigTwo game = new BigTwo(Arrays.asList(new Player("大壯"), new Player("小帥"), new Player("捲毛"), new Player("小美")));
		assertEquals(DEFAULT_PLAYER_AMOUNT_FOUR, game.getPlayerList().size());
		
		// 檢查手牌必須是13張
		HandCards hand = new HandCards();

		assertEquals(DEFAULT_CARD_AMOUNT_THIRTEEN, hand.getCardCount());
	}

}
