
public class Squirtle extends Pokemon{
	final String name = "Squirtle";
	long hp;
	final long hpmax = 125;
	boolean fainted = false;
	boolean active = false;
	
	public Squirtle(){
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
				foe.damage(30);
			}
			if(index == 1){ //Water Cannon
				System.out.println(name + " used water cannon");
				foe.damage(55);
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

}