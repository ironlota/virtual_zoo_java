package animal.mamalia;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Tiger is a type of Mamal
 */
public class Tiger extends Mamalia {
    //methods
    public Tiger(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public float getTotalFood(){
        return (float) (super.getWeight() * 0.1);
    }
    public void interact(){
        System.out.println("Growl!");
    }
}
