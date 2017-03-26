package animal.mamalia;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Bear is a type of mammal
 */
public class Bear extends Mamalia {
    //methods
    public Bear(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Roar!");
    }
}
