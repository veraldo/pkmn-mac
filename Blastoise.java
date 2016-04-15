public class Blastoise extends Pokemon{
  name = "Blastoise";
  hp_max = 150;
  hp_actual = 150;
  type = "water";
  fainted = false;
  
  public class Scratch extends Event{
    
    public void action(Trainer1.current_pokemon, Trainer2.current_pokemon){
      
    }
  }
}
