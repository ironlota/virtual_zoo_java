package animal.Pisces;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Piranha is a type of Pisces
 */
public class Piranha extends Pisces {
    //methods
    public Piranha(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Blub!");
    }
}
