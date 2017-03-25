package animal.Pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Shark is a type of Pisces
 */
public class Shark extends Pisces {
    //methods
    public Shark(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blublub!");
    }
}
