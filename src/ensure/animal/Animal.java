package ensure.animal;

import java.util.concurrent.ThreadLocalRandom;

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
    private String habitatType;
    private static int min = 0; //0 = up, 1 = down, 2 = right, 3 = left
    private static int max = 4;

    //Default Constructor
    public Animal(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
        name = inputName;
        weight = inputWeight;
        tamed = isTamed;
        loc_x = x;
        loc_y = y;
        foodType = inputFoodType;
        habitatType = inputHabitat;
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
    public String getHabitatType() {
        return habitatType;
    }

    //Setters
    public void setName(String inputName) {
        name = inputName;
    }
    public void setWeight(float inputWeight) {
        weight = inputWeight;
    }
    public void setTamed(boolean inputTamed){
        tamed = inputTamed;
    }
    public void setLocX(int x) {
        loc_x = x;
    }
    public void setLocY(int y) {
        loc_y = y;
    }
    public void setFoodType(String inputFoodType) {
        foodType = inputFoodType;
    }
    public void setHabitatType(String inputHabitat) {
        habitatType = inputHabitat;
    }

    //Other Methods
    /**
     * @brief getTotalFood is a function to get the total food that an animal eats
     * @return float depends on each animal
     * */
    protected abstract float getTotalFood();
    /**
     * @brief interact is function that prints out a message
     * */
    protected abstract void interact();
    /**
     * @brief move is a method to switch places
     * @param up left available
     * @param down down available
     * @param right right available
     * @param left left available
     * */
    public int move(boolean up, boolean down, boolean right, boolean left) {
        if(!up && !down && !right && !left){
            return -1;
        } else {
            boolean found = false;
            int random = -1;
            while(!found){
                random = ThreadLocalRandom.current().nextInt(min,max+1);
                found = ((random == 0 && up)||(random == 1 && down)||(random == 2 && right)||(random == 3 && left));
            }
            return random;
        }
    }

    //TODO need to save habitat type
}
