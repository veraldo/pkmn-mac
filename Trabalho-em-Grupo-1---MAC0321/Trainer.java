public class Trainer{
	public String name;
	public Pokemon[] party;
	int current_pokemon = 0;
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
			party[current_pokemon].heal(20);
		}
		public String description(){
			return "Blank";
		}
		
	}
	private class Swap extends Event{
		final long priority = 3;
		void action(){
			party[current_pokemon].deactivate();
			current_pokemon ++;
			if(current_pokemon > party.length) current_pokemon = 0;
			current = party[current_pokemon];
			current.activate();
			System.out.println(name+" sent "+party[current_pokemon].name());
		}
		
		public String description(){
			return "Blank";
		}
	}
	Event think(Pokemon[] foeParty){
		if(party[current_pokemon].fainted()) {
			if(!lost()){
				return new Swap();
			}
		}
		refreshTarget(foeParty);
		if(target.hp() < 20){
			return new Attack(target);
		}
		if(party[current_pokemon].hp() < 40){
			return new Item();
		}
		return new Attack(target);
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
	void refreshTarget(Pokemon[] foeParty){
		int count = 0;
		while(count < foeParty.length){
			if(foeParty[count].isActive()){
				target = foeParty[count];
				break;
			}
			count++;
		}
		
	}
}