import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HandCardsTest {

	private static final int THIRTEEN = 13;
	
	@Test
	void testGameInitialHandCardsIsThirteen() {
		// 檢查手牌必須是13張
		HandCards hand = new HandCards();
		assertTrue(THIRTEEN == hand.getCardCount());
	}

}
