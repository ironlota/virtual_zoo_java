package ensure.animal.aves;

/**
 * Created by Tasya on 3/25/2017.
 *
 * Peacock is a type of aves
 */
public class Peacock extends Aves {

  //methods
  public Peacock(String inputName, double inputWeight, boolean isTamed, int x, int y,
      String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'p');
  }

  public void interact() {
    System.out.println("Akkk!");
  }
}
