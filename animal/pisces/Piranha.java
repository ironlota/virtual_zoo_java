package animal.pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Piranha is a type of pisces
 */
public class Piranha extends Pisces {
    //methods
    public Piranha(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blub!");
    }
}
