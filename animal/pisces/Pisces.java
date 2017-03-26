package animal.pisces;

import animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class pisces is a type of animal
 */
abstract class Pisces extends Animal {
    //methods
    public Pisces(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    //TODO make some private data members
}
