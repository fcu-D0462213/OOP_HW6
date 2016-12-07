package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static Player fight(Player...players)
	{
		int i;
		int player1=0;
		int player2=0;
		Random r=new Random();
		for(i=0;i<players[1].getPokemons().length;i++)
		{
			if(players[0].getPokemons()[i].getType().equals(players[1].getPokemons()[i].getType()))
			{
				if(players[0].getPokemons()[i].getCp()>players[1].getPokemons()[i].getCp())
				{
					player1++;
				}
				else if(players[0].getPokemons()[i].getCp()<players[1].getPokemons()[i].getCp())
				{
					player2++;
				}
				else
				{
					if(r.nextInt(100)%2==0)
					{
						player1++;
					}
					else
					{
						player2++;
					}
				}
			}
			else if(players[0].getPokemons()[i].getType()==PokemonType.FIRE&&players[1].getPokemons()[i].getType()==PokemonType.GRASS)
			{
				player1++;
			}
			else if(players[0].getPokemons()[i].getType()==PokemonType.GRASS&&players[1].getPokemons()[i].getType()==PokemonType.WATER)
			{
				player1++;
			}
			else if(players[0].getPokemons()[i].getType()==PokemonType.WATER&&players[1].getPokemons()[i].getType()==PokemonType.FIRE)
			{
				player1++;
			}
			else
			{
				player2++;
			}
		}
		if(player1>=2)
		{
			System.out.println("Winner is "+players[0].getPlayerName()+",and his/her level becomes "+players[0].getLevel());
		}
		else
		{
			System.out.println("Winner is "+players[1].getPlayerName()+",and his/her level becomes "+players[1].getLevel());
		}
		return null;
	}
}
