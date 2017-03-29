package ensure.animal.pisces;

/**
 * Created by rayandrew on 3/25/2017.
 *
 * Seahorse is a type of pisces
 */
public class Seahorse extends Pisces {

  //methods
  public Seahorse(String inputName, double inputWeight, boolean isTamed, int x, int y,
      String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'h');
  }

  public void interact() {
    System.out.println("Swimming!");
  }
}
