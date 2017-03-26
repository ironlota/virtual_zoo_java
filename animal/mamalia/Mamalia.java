package animal.mamalia;

import animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Mammal is a type of animal
 */
abstract class Mamalia extends Animal {
    //methods
    public Mamalia(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    //TODO make some private data members
}
