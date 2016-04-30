public class BattleController{
	static public Trainer blue = new Trainer("Blue");
	static public Trainer red = new Trainer("Red");
	static public Trainer wildPkmn = new Trainer("WildPkmn");
	
	public static void main(String[] args){
		
		wildPkmn.party = new Pokemon [1];
		blue.party = new Pokemon[6];
		red.party = new Pokemon[6];
		
		wildPkmn.party[0] = new Charmander();
		
		blue.party[0] = new Squirtle();
		blue.party[1] = new Charmander();
		blue.party[2] = new Pikachu();
		blue.party[3] = new Vaporeon();
		blue.party[4] = new Bulbasaur();
		blue.party[5] = new Pikachu();
		
		red.party[0] = new Bulbasaur();
		red.party[1] = new Pikachu();
		red.party[2] = new Vaporeon();
		red.party[3] = new Charmander();
		red.party[4] = new Pikachu();
		red.party[5] = new Squirtle();

		blue.party[0].activate();
		red.party[0].activate();
		wildPkmn.party[0].activate();
		
		Move M = new Move();
		M.moves();
	}
}