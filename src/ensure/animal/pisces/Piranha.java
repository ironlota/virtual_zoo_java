package ensure.animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Piranha is a type of pisces
 */
public class Piranha extends Pisces {
    //methods
    public Piranha(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat,'p');
    }

    public void interact(){
        System.out.println("BiteBiteBite!");
    }
}
