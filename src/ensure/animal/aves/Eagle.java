package ensure.animal.aves;

/**
 * Created by Tasya on 3/25/2017.
 *
 * Eagle is a type of aves
 */
public class Eagle extends Aves {
  //methods
  public Eagle (String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'e');
  }

  public void interact () {
    System.out.println("Hiiiikkk!");
  }
}
