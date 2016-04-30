
public class Move{
	double randomNumber;
	Terrain CurentTerrain;
	public void moves(){
		int aux = 0;
		while(aux!=1){
			randomNumber = 10*Math.random();
			CurentTerrain = new Terrain();
				 
			
			if (randomNumber < 7){
				CurentTerrain.type = "sidewalk";
				System.out.println(BattleController.blue.name + " moved to a sidewalk terrain");
			}
			if (randomNumber >= 7){
				CurentTerrain.type = "grass";
				System.out.println(BattleController.blue.name + " moved to a grass terrain");
			}
			
			if(randomNumber <= 2){
				System.out.println("The battle began");
				Battle b = new Battle(BattleController.blue,BattleController.red);
				aux = 1;
				b.battleBeggins();
			}
			if(randomNumber >= 9){
				System.out.println("A wild Charmander appeared!");
				Battle b = new Battle(BattleController.blue,BattleController.wildPkmn);
				aux = 1;
				b.battleBeggins();
			}
		}
	
	}
	
}