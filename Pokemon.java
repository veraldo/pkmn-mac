abstract class Pokemon{
  private String name;
  private long hp_max;
  private long hp_actual;
  private String type;

  abstract void scratch(Pokemon enemy);
  abstract void attack02(Pokemon enemy);
  abstract void attack03(Pokemon enemy);
  
  
}
