abstract class Pokemon{
	String name;
	long hp;
	boolean fainted;
	boolean typeChart[][];
	
	abstract void damage(long n);
	abstract void heal(long n);
	
	abstract public long hp();
	
	abstract public String name();
	
	abstract void attack(Pokemon inimigo, int index);
	
	abstract boolean fainted();
}