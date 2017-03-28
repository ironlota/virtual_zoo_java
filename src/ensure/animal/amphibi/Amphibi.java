package ensure.animal.amphibi;

import ensure.animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class amphibi is a type of animal
 */
abstract public class Amphibi extends Animal {
    //methods
    public Amphibi(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat, char symbol_){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat,symbol_);
    }


    public double getTotalFood() {
        return (double) (super.getWeight() * 0.01);
    }
    //TODO make some private data members
}