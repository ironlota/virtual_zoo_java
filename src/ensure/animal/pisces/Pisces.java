package ensure.animal.pisces;

import ensure.animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class pisces is a type of animal
 */
abstract class Pisces extends Animal {
    //methods
    public Pisces(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public double getTotalFood() {
        return (double) (super.getWeight() * 0.15);
    }

    //TODO make some private data members
}
