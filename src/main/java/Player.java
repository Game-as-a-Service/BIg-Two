import java.util.List;

public class Player {
	private String name;
	private HandCards handcards = new HandCards();

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHandcards(HandCards handcards) {
		this.handcards = handcards;
	}

	public List<Card> getHandCards() {
		return handcards.getCards();
	}

}