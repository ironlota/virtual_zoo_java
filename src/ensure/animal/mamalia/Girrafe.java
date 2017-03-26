package ensure.animal.mamalia;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Giraffe is a type of mammal
 */
public class Girrafe extends Mamalia {
    //methods
    public Girrafe(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public double getTotalFood() {
        return (double) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Brrrr!");
    }
}
