package animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Starfish is a type of pisces
 */
public class Starfish extends Pisces {
    //methods
    public Starfish(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blub!");
    }
}
