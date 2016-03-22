package pokerBase;
import java.util.ArrayList;
import java.util.UUID;
public class Game {
private UUID gameID;
private ArrayList<Player> GamePlayers;

public UUID getGameID() {
	return gameID;
}
public ArrayList<Player> getGamePlayers() {
	return GamePlayers;
}
public void setGamePlayers(ArrayList<Player> gamePlayers) {
	GamePlayers = gamePlayers;
}

public Game(ArrayList<Player> gamePlayers) {
	super();
	gameID = UUID.randomUUID();
	GamePlayers = gamePlayers;
}
public void AddPlayerToGame(Table table, Player player) {
	table.AddPlayerToTable(player);
	setGamePlayers(table.getTablePlayers());
}

}
