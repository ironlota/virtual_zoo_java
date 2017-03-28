package ensure.animal.pisces;

import ensure.animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 *
 * pisces is a type of animal
 */
abstract public class Pisces extends Animal {
  //methods
  Pisces (String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat, char symbol_) {
    super(inputName, inputWeight, isTamed, x, y, inputFoodType, inputHabitat, symbol_);
  }

  public double getTotalFood () {
    return (super.getWeight() * 0.15);
  }

  //TODO make some private data members
}
