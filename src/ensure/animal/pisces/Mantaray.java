package ensure.animal.pisces;

/**
 * Created by rayandrew on 3/25/2017.
 *
 * Mantaray is a type of pisces
 */
public class Mantaray extends Pisces {
  //methods
  public Mantaray (String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'm');
  }

  public void interact () {
    System.out.println("Blubub!");
  }
}
