package ensure.animal.aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Eagle is a type of aves
 */
public class Eagle extends Aves {
    //methods
    public Eagle(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat,'e');
    }

    public void interact(){
        System.out.println("Hiiiikkk!");
    }
}
