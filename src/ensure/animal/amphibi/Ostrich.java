package ensure.animal.amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Ostrich is a type of amphibi
 */
public class Ostrich extends Amphibi {
    //methods
    public Ostrich(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
        symbol = 'i';
    }

    public void interact(){
        System.out.println("Ooookkk!");
    }
}
