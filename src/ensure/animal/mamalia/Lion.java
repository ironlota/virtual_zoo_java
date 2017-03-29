package ensure.animal.mamalia;

/**
 * Created by Aldrich on 3/25/2017.
 *
 * Lion is a type of mammal
 */
public class Lion extends Mamalia {

  //methods
  public Lion(String inputName, double inputWeight, boolean isTamed, int x, int y,
      String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'l');
  }

  public void interact() {
    System.out.println("Hauummm!");
  }
}
