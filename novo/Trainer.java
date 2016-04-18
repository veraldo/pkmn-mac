public class Trainer{
	String name;
	public Pokemon[] party;
	int current_pokemon=0;
	boolean lost = false;
	boolean flee = false;
	Pokemon target;
	Pokemon current;
	
	public Trainer(String s){
		name = s;
	}
	
	private class Attack extends Event{
		final long priority = 1;
		int index;
		public Attack(Pokemon foe){
			target = foe;
		}
		void action(){
			party[current_pokemon].attack(target, index);
		}
		public String description(){
			return "Blank";
		}
		
		
	}
	private class Item extends Event{
		private long priority = 2;
		void action(){
			party[current_pokemon].heal(30);
		}
		public String description(){
			return "Blank";
		}
		
	}
	private class Swap extends Event{
		final long priority = 3;
		void action(){
			current_pokemon ++;
			current = party[current_pokemon];
		}
		
		public String description(){
			return "Blank";
		}
	}
	Event think(Pokemon foe){
		if(party[current_pokemon].fainted()) {
			if(!lost()){
				current_pokemon++;
				System.out.println(name+" sent "+party[current_pokemon].name());
			}
		}
		if(foe.hp() < 20){
			return new Attack(foe);
		}
		if(party[current_pokemon].hp() < 50){
			return new Item();
		}
		return new Attack(foe);
	}
	
	boolean lost(){
		int count=0;
		lost = true;
		while(count < party.length){
			if(!party[count].fainted()) lost = false;
			count++;
		}
		if (flee == true) lost = true;
		return lost;
	}
	
	String name(){
		return name;
	}
	
	void refresh(){
		current = party[current_pokemon];
	}
}