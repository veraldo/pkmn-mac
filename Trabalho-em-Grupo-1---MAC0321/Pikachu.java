public class Pikachu extends Pokemon{
	final String name = "Pikachu";
	long hp;
	final int type = 2;
	final long hpmax = 110;
	boolean fainted = false;
	boolean active = false;
	
	public Pikachu(){
		hp = hpmax;
	}
	
	public String name(){
		return name;
	}
	
	public long hp(){
		return hp;
	}
	
	void damage(long n){
		System.out.println(name +" lost "+n+" hp");
		hp -= n;
		if(hp<=0){
			hp = 0;
			fainted = true;
			deactivate();
			System.out.println(name+" has fainted");
		}
	}
	void heal(long n){
		if(!fainted){
			long temp = hp;
			hp += n;
			if(hp > hpmax) hp = hpmax;
			long diff = hp - temp;
			System.out.println(name +" recovered "+ diff +" hp");
			
		}
	}
	
	void attack(Pokemon foe, int index){
		if(!fainted && !foe.fainted()){
			if(index == 0){ //tackle
				System.out.println(name + " used tackle");
				TypeChart t = new TypeChart();
				int damage = 35; 
				if( t.typeCompare(type,foe.type())>0){
					damage *= 2;
					System.out.println("It's super effective!");
				}
				if( t.typeCompare(type,foe.type())<0){
					System.out.println("It's not very effective...");
					damage /= 2;
				}

				foe.damage(damage);
			}
			if(index == 1){ //thundershock
				System.out.println(name + " used thundershock");
				foe.damage(65);
			}
		}
	}
	
	boolean fainted(){
		return fainted;
	}
	
	boolean isActive(){
		return active;
	}
	
	void activate(){
		active = true;
	}
	void deactivate(){
		active = false;
	}
	
	int type(){
		return type;
	}
}