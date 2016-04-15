abstract class Pokemon{
  private String name;
  private int hp_max;
  private int hp_actual;
  private String type;

  abstract void scratch(Pokemon enemy);
  abstract void impact(Pokemon enemy);
  abstract void type_attack(Pokemon enemy);
  
  
}
