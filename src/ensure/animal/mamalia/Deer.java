package ensure.animal.mamalia;

/**
 * Class Deer
 * Extends of Mamalia
 * Created by rayandrew on 3/27/2017.
 */
public class Deer extends Mamalia {
  //methods
  public Deer (String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, 'd');
  }

  public void interact () {
    System.out.println("Ngiiikkk");
  }
}
