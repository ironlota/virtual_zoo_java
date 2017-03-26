package animal;

import animal.mamalia.Lion;
import animal.mamalia.Tiger;
import animal.aves.Eagle;
import animal.aves.Hawk;
import animal.amphibi.AfricanFrog;
import animal.amphibi.Salamander;
import animal.pisces.Piranha;
import animal.pisces.Shark;

public class Main {
    public static void main(String[] args) {
        Animal animals[] = new Animal[8];
        animals[0] = new Lion("lion", 50, false, 1,1,"carnivore");
        animals[1] = new Tiger("tiger", 50, false, 1,1,"carnivore");
        animals[2] = new Eagle("eagle", 5, false, 1,1,"carnivore");
        animals[3] = new Hawk("hawk", 4, false, 1,1,"carnivore");
        animals[4] = new AfricanFrog("frog", 2, false, 1,1,"carnivore");
        animals[5] = new Salamander("salamander", 50, false, 1,1,"carnivore");
        animals[6] = new Piranha("piranha", 5, false, 1,1,"carnivore");
        animals[7] = new Shark("shark", 20, false, 1,1,"carnivore");

        Animal lion, tiger;

        //testing inheritance
        for(int i = 0; i < animals.length; i++){
            animals[i].interact();
        }
    }
}
