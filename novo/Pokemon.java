abstract class Pokemon{
	String name;
	long hp;
	boolean fainted;
	int typeChart[][];
	boolean active = false;
	
	/*	water = 0;
	 * 	fire = 1;
	 * 	grass = 2;
	 * 
	 * 
	 */
	
	
	/*
		  A	  F	  P
	A	| 0	| 1 |-1 |
		------------
	F	|	|	|	|
		------------
	P	|	|	|	|
	*/
	
	abstract void damage(long n);
	abstract void heal(long n);
	
	abstract public long hp();
	
	abstract public String name();
	
	abstract void attack(Pokemon inimigo, int index);
	
	abstract boolean fainted();
	abstract boolean isActive();
	abstract void activate();
	abstract void deactivate();
	abstract int type();
}