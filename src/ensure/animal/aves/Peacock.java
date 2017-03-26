package ensure.animal.aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Peacock is a type of aves
 */
public class Peacock extends Aves {
    //methods
    public Peacock(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Akkk!");
    }
}
