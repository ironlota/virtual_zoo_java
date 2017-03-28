package ensure.animal.aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class BirdOfParadise is a type of aves
 */
public class BirdOfParadise extends Aves {
    //methods
    public BirdOfParadise(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
        symbol = 'b';
    }

    public void interact(){
        System.out.println("Hueeekkk!");
    }
}
