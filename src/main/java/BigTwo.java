import java.util.List;

public class BigTwo {

	private List<Player> playerList;

	public BigTwo(List<Player> asList) {
		setPlayerList(asList);
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void playGame(Player player, int index) throws FirstCardNotThreeOfClubs {
		player.playCard(index);
	}

}
