package animal.Aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Hawk is a type of Aves
 */
public class Hawk extends Aves {
    //methods
    public Hawk(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Oaakkkkk!");
    }
}
