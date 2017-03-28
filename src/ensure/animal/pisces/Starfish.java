package ensure.animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 *
 * Starfish is a type of pisces
 */
public class Starfish extends Pisces {
  //methods
  public Starfish (String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'f');
  }

  public void interact () {
    System.out.println("Sshhhhh!");
  }
}
