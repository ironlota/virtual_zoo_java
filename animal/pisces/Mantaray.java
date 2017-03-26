package animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Mantaray is a type of pisces
 */
public class Mantaray extends Pisces {
    //methods
    public Mantaray(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blub!");
    }
}
