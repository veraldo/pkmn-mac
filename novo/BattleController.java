public class BattleController{
	
	public static void main(String[] args){
		
		Trainer t1 = new Trainer("Ash");
		Trainer t2 = new Trainer("Brock");
		t1.party = new Pokemon[2];
		t2.party = new Pokemon[2];
		
		t1.party[0] = new Charmander();
		t1.party[1] = new Charmander();
		
		t2.party[0] = new Charmander();
		t2.party[1] = new Charmander();
		
		while(!t1.lost() && !t2.lost()){
			t1.refresh();
			t2.refresh();
			Event temp1 = t1.think(t2.current);
			Event temp2 = t2.think(t1.current);

			if(temp2.priority() > temp1.priority()){
				temp2.action();
				temp1.action();
				System.out.println("");
			}
			else {
				temp1.action();
				temp2.action();
				System.out.println("");
			}
		}
		
		if(t2.lost()) System.out.println(t1.name()+" defeated "+t2.name()+"!");
		else System.out.println(t2.name()+" defeated "+t1.name()+"!");
	}
	
}