package pokerBase;

import java.util.UUID;

public class Player {
	private UUID playerID;
	private String playerName;
	private int playerPostion;

	public Player(String playerName, int playerPostion) {
		super();
		this.playerName = playerName;
		this.playerPostion = playerPostion;
	}

	public UUID getPlayerID() {
		return playerID;
	}

	public void setPlayerID(UUID playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerPostion() {
		return playerPostion;
	}

	public void setPlayerPostion(int playerPostion) {
		this.playerPostion = playerPostion;
	}
}
