public class BattleController{
	
	public static void main(String[] args){
		
		Trainer t1 = new Trainer("Ash");
		Trainer t2 = new Trainer("Brock");
		t1.party = new Pokemon[2];
		t2.party = new Pokemon[2];
		
		t1.party[0] = new Charmander();
		t1.party[1] = new Pikachu();
		
		t2.party[0] = new Pikachu();
		t2.party[1] = new Charmander();

		t1.party[0].activate();
		t2.party[0].activate();
		
		while(!t1.lost() && !t2.lost()){
			t1.refresh();
			t2.refresh();
			t1.refreshTarget(t2.party);
			t2.refreshTarget(t1.party);
			Event temp1 = t1.think(t2.party);
			Event temp2 = t2.think(t1.party);
			if(t1.current.fainted()){
				temp1.action();
				continue;
			}
			if(t2.current.fainted()){
				temp2.action();
				continue;
			}
			
			if(temp2.priority() > temp1.priority()){
				t2.refreshTarget(t1.party);
				temp2.action();
				t1.refreshTarget(t2.party);
				temp1.action();
				System.out.println("");
			}
			else {
				t1.refreshTarget(t2.party);
				temp1.action();
				t2.refreshTarget(t1.party);
				temp2.action();
				System.out.println("");
			}
			
		}
		
		if(t2.lost()) System.out.print(t1.name()+" defeated "+t2.name()+"!");
		else System.out.print(t2.name()+" defeated "+t1.name()+"!");
	}
	
}