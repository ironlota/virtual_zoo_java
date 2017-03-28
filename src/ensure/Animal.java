package ensure;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Girvandi on 3/25/2017.
 * Animal is a class that can be derived to any animal.
 */
public class Animal {
    //private data member
    private String name;
    private double weight;
    private boolean tamed;
    private int loc_x;
    private int loc_y;
    private String foodType;
    private String habitatType;
    private static int min = 0; //0 = up, 1 = down, 2 = right, 3 = left
    private static int max = 4;
    protected char symbol;

    public Animal() {

    }
    //Default Constructor
    public Animal(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat) {
        name = inputName;
        weight = inputWeight;
        tamed = isTamed;
        loc_x = x;
        loc_y = y;
        foodType = inputFoodType;
        habitatType = inputHabitat;
        switch (name) {
            case "AfricanFrog":
                symbol = 'a';
                break;
            case "Caecilia":
                symbol = 'c';
                break;
            case "FlyingFish":
                symbol = 'y';
                break;
            case "Ostrich":
                symbol = 'i';
                break;
            case "Salamander":
                symbol = 'r';
                break;
            case "BirdOfParadise":
                symbol = 'b';
                break;
            case "Eagle":
                symbol = 'e';
                break;
            case "Hawk":
                symbol = 'k';
                break;
            case "Peacock":
                symbol = 'p';
                break;
            case "Owl":
                symbol = 'o';
                break;
            case "Bear":
                symbol = 'b';
                break;
            case "Deer":
                symbol = 'd';
                break;
            case "Elephant":
                symbol = 'n';
                break;
            case "Girrafe":
                symbol = 'g';
                break;
            case "Tiger":
                symbol = 't';
                break;
            case "Lion":
                symbol = 'l';
                break;
            case "Mantaray":
                symbol = 'm';
                break;
            case "Piranha":
                symbol = 'p';
                break;
            case "Seahorse":
                symbol = 'h';
                break;
            case "Shark":
                symbol = 's';
                break;
            case "Starfish":
                symbol = 'f';
                break;
        }
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getWeight() {
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
    public char getSymbol() {
        return symbol;
    }

    //Setters
    public void setName(String inputName) {
        name = inputName;
    }
    public void setWeight(double inputWeight) {
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
    public double getTotalFood() {
      return (double) (getWeight() * 0.15);
    }
    /**
     * @brief interact is function that prints out a message
     * */
    public void interact() {
        switch (getName()) {
            case "AfricanFrog":
                System.out.println("Kroakk!");
                break;
            case "Caecilia":
                System.out.println("Caeciliaaaa!");
                break;
            case "FlyingFish":
                System.out.println("Swush!");
                break;
            case "Ostrich":
                System.out.println("Ooookkk!");
                break;
            case "Salamander":
                System.out.println("Shhhh!");
                break;
            case "BirdOfParadise":
                System.out.println("Hueeekkk!");
                break;
            case "Eagle":
                System.out.println("Hiiiikkk!");
                break;
            case "Hawk":
                System.out.println("Oaakkkkk!");
                break;
            case "Peacock":
                System.out.println("Akkk!");
                break;
            case "Owl":
                System.out.println("Kukrukk!");
                break;
            case "Bear":
                System.out.println("Roar!");
                break;
            case "Deer":
                System.out.println("Ngiiikkk");
                break;
            case "Elephant":
                System.out.println("Uaaaakkkk!");
                break;
            case "Girrafe":
                System.out.println("Brrrr!");
                break;
            case "Tiger":
                System.out.println("Growl!");
                break;
            case "Lion":
                System.out.println("Hauummm!");
                break;
            case "Mantaray":
                System.out.println("Blubub!");
                break;
            case "Piranha":
                System.out.println("BiteBiteBite!");
                break;
            case "Seahorse":
                System.out.println("Swimming!");
                break;
            case "Shark":
                System.out.println("Blukbluk!");
                break;
            case "Starfish":
                System.out.println("Sshhhhh!");
                break;
        }
    }

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
