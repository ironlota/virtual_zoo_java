package animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Seahorse is a type of pisces
 */
public class Seahorse extends Pisces {
    //methods
    public Seahorse(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blub!");
    }
}
