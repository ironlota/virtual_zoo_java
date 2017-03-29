package ensure.configstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ensure.cell.facility.*;
import ensure.cell.habitat.*;

import ensure.animal.amphibi.*;
import ensure.animal.aves.*;
import ensure.animal.mamalia.*;
import ensure.animal.pisces.*;

import ensure.Zoo;

/**
 * ConfigStore ConfigStore merupakan kelas loader and parser untuk melakukan pengambilan konfigurasi
 * dari file eksternal
 */
public class ConfigStore {
  private static ConfigStore configStore = new ConfigStore();

  /**
   * get
   * Mengembalikan Zoo class
   */
  public static int Get(int n_) {
    return configStore.parseFile(n_);
  }

  private int parseFile(int n_) {
    int n = n_;
    BufferedReader br = null;
    FileReader fr = null;

    try {

      fr = new FileReader("./data/base.vze");
      br = new BufferedReader(fr);

      String sCurrentLine;

      br = new BufferedReader(new FileReader("./data/base.vze"));

      while ((sCurrentLine = br.readLine()) != null) {
        if (sCurrentLine.equals("[Cage]")) {
          while (!(sCurrentLine = br.readLine()).equals("[END OF Cage]")) {
            String[] tokens = sCurrentLine.split(",");
            if (Integer.parseInt(tokens[0]) < n && Integer.parseInt(tokens[1]) < n) {
              switch (tokens[3]) {
                case "WaterHabitat":
                  Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                      new WaterHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                          Integer.parseInt(tokens[2])));
                  break;
                case "LandHabitat":
                  Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                      new LandHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                          Integer.parseInt(tokens[2])));
                  break;
                case "FlyingHabitat":
                  Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                      new FlyingHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                          Integer.parseInt(tokens[2])));
                  break;
              }
            }
          }
        }

        if (sCurrentLine.equals("[Animal]")) {
          while (!(sCurrentLine = br.readLine()).equals("[END OF Animal]")) {
            String[] tokens = sCurrentLine.split(",");
            switch (tokens[2]) {
              case "AfricanFrog":
                Zoo.Get(n).SetAnimal(new AfricanFrog(tokens[2], Float.parseFloat(tokens[4]),
                    tokens[3].equals("True"), Integer.parseInt(tokens[0]),
                    Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                break;
              case "Caecilia":
                Zoo.Get(n).SetAnimal(
                    new Caecilia(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Exolotl":
                Zoo.Get(n).SetAnimal(
                    new Exolotl(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "FlyingFish":
                Zoo.Get(n).SetAnimal(
                    new FlyingFish(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Ostrich":
                Zoo.Get(n).SetAnimal(
                    new Ostrich(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Salamander":
                Zoo.Get(n).SetAnimal(
                    new Salamander(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "BirdOfParadise":
                Zoo.Get(n).SetAnimal(new BirdOfParadise(tokens[2], Float.parseFloat(tokens[4]),
                    tokens[3].equals("True"), Integer.parseInt(tokens[0]),
                    Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                break;
              case "Eagle":
                Zoo.Get(n).SetAnimal(
                    new Eagle(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Hawk":
                Zoo.Get(n).SetAnimal(
                    new Hawk(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Owl":
                Zoo.Get(n).SetAnimal(
                    new Owl(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Peacock":
                Zoo.Get(n).SetAnimal(
                    new Peacock(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Bear":
                Zoo.Get(n).SetAnimal(
                    new Bear(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Deer":
                Zoo.Get(n).SetAnimal(
                    new Deer(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Elephant":
                Zoo.Get(n).SetAnimal(
                    new Elephant(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Girrafe":
                Zoo.Get(n).SetAnimal(
                    new Girrafe(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Tiger":
                Zoo.Get(n).SetAnimal(
                    new Tiger(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Lion":
                Zoo.Get(n).SetAnimal(
                    new Lion(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Mantaray":
                Zoo.Get(n).SetAnimal(
                    new Mantaray(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Piranha":
                Zoo.Get(n).SetAnimal(
                    new Piranha(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Seahorse":
                Zoo.Get(n).SetAnimal(
                    new Seahorse(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Shark":
                Zoo.Get(n).SetAnimal(
                    new Shark(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
              case "Starfish":
                Zoo.Get(n).SetAnimal(
                    new Starfish(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"),
                        Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6],
                        tokens[5]));
                break;
            }
          }
        }

        if (sCurrentLine.equals("[Facility]")) {
          while (!(sCurrentLine = br.readLine()).equals("[END OF Facility]")) {
            String[] tokens = sCurrentLine.split(",");
            switch (tokens[2]) {
              case "Restaurant":
                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                    new Restaurant(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                        tokens[3]));
                break;
              case "Park":
                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                    new Park(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0])));
                break;
              default:
                if (tokens[3].equals("RoadExit")) {
                  Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                      new Road(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), "RoadExit",
                          '_'));
                } else {
                  Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                      new Road(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]),
                          "RoadEntrance", '_'));
                }
                break;
            }
          }
        }
      }
    } catch (IOException e) {
      //e.printStackTrace();

      return -1;
    } finally {

      try {

        if (br != null) {
          br.close();
        }

        if (fr != null) {
          fr.close();
        }

        return 0;
      } catch (IOException ex) {

        ex.printStackTrace();
        return -1;
      }

    }
        /*
        //testing update
        Zoo.Get(n).update();
        System.out.println("next");
        for(int i = 0; i < n; i++) {
            for(Cell temp : Zoo.Get(n).getAllCell().get(i)) {
                if(temp.getAnimal() != null) {
                    System.out.print(temp.getAnimal().getSymbol() + " ");
                } else {
                    System.out.print(temp.getSymbol() + " ");
                }
            }
            System.out.println();
        }
        */
    //testing tour
    //Zoo.Get(n).tour(0,6);

    //Zoo.Get(n).totalFood();
  }
}

