package animal.amphibi;

import animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class amphibi is a type of animal
 */
abstract class Amphibi extends Animal {
    //methods
    public Amphibi(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    //TODO make some private data members
}
