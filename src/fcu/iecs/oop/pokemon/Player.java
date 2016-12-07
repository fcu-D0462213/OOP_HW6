package fcu.iecs.oop.pokemon;

public class Player {
	private String PlayerName;
	private int level=1;
	private Pokemon[] pokemons;
	
	public Player(String playerName) {
		PlayerName = playerName;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getLevel() {
		return level+1;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	
	
	
}
