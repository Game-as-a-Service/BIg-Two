import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PlayCardTest {
	
	private final Card firstCard = new Card(Rank.THREE, Suit.CLUBS);
	@Test
	void test_firstCard_is_threeOfClubs() {
		List<Card> cardList = new ArrayList<>();
		Card card = new Card(Rank.THREE, Suit.CLUBS);
		cardList.add(card);
		HandCards hand = new HandCards();
		hand.addCards(cardList);
		
		BigTwo game = new BigTwo(Arrays.asList(new Player("big mussle"), new Player("handsome"), new Player("white"), new Player("beauty")));
		
		for (Player playerObj : game.getPlayerList()) {
			if ("big mussle".equals(playerObj.getName())) {
				playerObj.setHandcards(hand);
				Card playCard = playerObj.playCard();
				assertEquals(playCard.toString(), firstCard.toString());
			}
		}
	}

}
