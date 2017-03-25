package animal;

import animal.Mamalia.Lion;
import animal.Mamalia.Tiger;
import animal.Aves.Eagle;
import animal.Aves.Hawk;
import animal.Amphibi.AfricanFrog;
import animal.Amphibi.Salamander;
import animal.Pisces.Piranha;
import animal.Pisces.Shark;

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
