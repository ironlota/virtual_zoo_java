package animal.amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Ostrich is a type of amphibi
 */
public class Ostrich extends Amphibi {
    //methods
    public Ostrich(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.01);
    }
    public void interact(){
        System.out.println("Ooookkk!");
    }
}
