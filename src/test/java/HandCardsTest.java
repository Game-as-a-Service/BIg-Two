import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class HandCardsTest {

	private static final int THIRTEEN = 13;

	@Test
	void testGameInitialHandCardsIsThirteen() {
		// 遊戲開始4人進入
		BigTwo game = new BigTwo(Arrays.asList(new Player("大壯"), new Player("小帥"), new Player("捲毛"), new Player("小美")));

		// 檢查手牌必須是13張
		HandCards hand = new HandCards();
		assertEquals(THIRTEEN, hand.getCardCount());
	}

}
