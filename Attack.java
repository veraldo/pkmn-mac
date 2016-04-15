public class Attack extends Event{
  private int damage;
  private String type;
  
  public void action(Pokemon pkmn1, Pokemon pkmn2){
    pkmn2.damage(20);
  }
}
