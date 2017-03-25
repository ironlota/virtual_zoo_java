package animal.Mamalia;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Lion is a type of mammal
 */
public class Lion extends Mamalia {
    //methods
    public Lion(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Roar!");
    }
}
