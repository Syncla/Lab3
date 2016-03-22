package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	/**
	 * @param tableID
	 * @param tablePlayers
	 */
	public Table(ArrayList<Player> tablePlayers) {
		super();
		TableID = UUID.randomUUID();
		TablePlayers = tablePlayers;
	}
	public UUID getTableID() {
		return TableID;
	}
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	
	public void AddPlayerToTable(Player player) {
		this.getTablePlayers().add(player);
		this.setTablePlayers(this.getTablePlayers());
	}
}

