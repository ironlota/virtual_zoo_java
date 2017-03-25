package animal.Amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class AfricanFrog is a type of Amphibi
 */
public class AfricanFrog extends Amphibi {
    //methods
    public AfricanFrog(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.01);
    }
    public void interact(){
        System.out.println("Kroakk!");
    }
}
