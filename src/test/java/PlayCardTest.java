import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PlayCardTest {

	@Test
	void test_firstCard_is_threeOfClubs() throws FirstCardNotThreeOfClubs {
		BigTwo game = initGame();

		game.playGame(game.getPlayerList().get(0), 0);
	}

	@Test
	void test_firstCard_Not_threeOfClubs() {
		BigTwo game = initGame();
		assertThrows(FirstCardNotThreeOfClubs.class, () -> {
			game.playGame(game.getPlayerList().get(1), 0);
		});
	}

	private BigTwo initGame() {
		BigTwo game = new BigTwo(Arrays.asList(new Player("big mussle"), new Player("handsome"), new Player("white"),
				new Player("beauty")));

		for (Player playerObj : game.getPlayerList()) {
			if ("big mussle".equals(playerObj.getName())) {
				playerObj.setHandcards(initHandCard());
			}

			if ("handsome".equals(playerObj.getName())) {
				playerObj.setHandcards(initHandCardReverse());
			}
		}
		return game;
	}

	private HandCards initHandCard() {
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.THREE, Suit.C));
		cardList.add(new Card(Rank.FOUR, Suit.C));

		HandCards hand = new HandCards();
		hand.addCards(cardList);
		return hand;
	}

	private HandCards initHandCardReverse() {
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card(Rank.FOUR, Suit.C));
		cardList.add(new Card(Rank.THREE, Suit.C));

		HandCards hand = new HandCards();
		hand.addCards(cardList);
		return hand;
	}

}
