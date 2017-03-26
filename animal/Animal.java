package animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Animal is an abstract class that can be derived to any animal.
 */
abstract public class Animal {
    //private data member
    private String name;
    private float weight;
    private boolean tamed;
    private int loc_x;
    private int loc_y;
    private String foodType;

    //Default Constructor
    public Animal(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType) {
        name = inputName;
        weight = inputWeight;
        tamed = isTamed;
        loc_x = x;
        loc_y = y;
        foodType = inputFoodType;
    }

    //Getters
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public boolean isTamed(){
        return tamed;
    }
    public int getLocX() {
        return loc_x;
    }
    public int getLocY() {
        return loc_y;
    }
    public String getFoodType() {
        return foodType;
    }

    //Other Methods
    protected abstract float getTotalFood();
    protected abstract void interact();

    //TODO need to save habitat type
}
