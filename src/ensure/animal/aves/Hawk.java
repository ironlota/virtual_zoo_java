package ensure.animal.aves;

/**
 * Created by Tasya on 3/25/2017.
 *
 * Hawk is a type of aves
 */
public class Hawk extends Aves {

  //methods
  public Hawk(String inputName, double inputWeight, boolean isTamed, int x, int y,
      String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'k');
  }

  public void interact() {
    System.out.println("Oaakkkkk!");
  }
}
