package animal.Aves;

import animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Aves is a type of animal
 */
abstract class Aves extends Animal {
    //methods
    public Aves(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    //TODO make some private data members
}
