package ensure.animal.aves;

import ensure.animal.Animal;

/**
 * Created by Girvandi on 3/25/2017.
 *
 * aves is a type of animal
 */
abstract public class Aves extends Animal {

  //methods
  Aves(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType,
      String inputHabitat, char symbol_) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, symbol_);
  }

  public double getTotalFood() {
    return (super.getWeight() * 0.15);
  }
  //TODO make some private data members
}
