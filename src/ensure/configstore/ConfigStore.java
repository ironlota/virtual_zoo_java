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
 * @class ConfigStore
 * ConfigStore merupakan kelas loader and parser untuk melakukan pengambilan konfigurasi dari file eksternal
 */
public class ConfigStore {
    private String FILENAME = "./data/base.vze";
    public static ConfigStore configStore = new ConfigStore();

    /** @brief get
     * Mengembalikan Zoo class
     */
    public static int Get(String argv) {
        return configStore.parseFile(argv);
    }

    public int parseFile(String argv) {
        FILENAME = argv;
        int n = 40;
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.equals("[Cage]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Cage]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if (Integer.parseInt(tokens[0]) < n && Integer.parseInt(tokens[1]) < n) {
                            if (tokens[3].equals("WaterHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new WaterHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), null, Integer.parseInt(tokens[2])));
                            } else if (tokens[3].equals("LandHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new LandHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), null, Integer.parseInt(tokens[2])));
                            } else if (tokens[3].equals("FlyingHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new FlyingHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), null, Integer.parseInt(tokens[2])));
                            }
                        }
                    }
                }

                if (sCurrentLine.equals("[Animal]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Animal]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if (tokens[2].equals("AfricanFrog")) {
                            Zoo.Get(n).SetAnimal(new AfricanFrog(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Caecilia")) {
                            Zoo.Get(n).SetAnimal(new Caecilia(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Exolotl")) {
                            Zoo.Get(n).SetAnimal(new Exolotl(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("FlyingFish")) {
                            Zoo.Get(n).SetAnimal(new FlyingFish(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Ostrich")) {
                            Zoo.Get(n).SetAnimal(new Ostrich(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Salamander")) {
                            Zoo.Get(n).SetAnimal(new Salamander(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("BirdOfParadise")) {
                            Zoo.Get(n).SetAnimal(new BirdOfParadise(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Eagle")) {
                            Zoo.Get(n).SetAnimal(new Eagle(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Hawk")) {
                            Zoo.Get(n).SetAnimal(new Hawk(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Owl")) {
                            Zoo.Get(n).SetAnimal(new Owl(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Peacock")) {
                            Zoo.Get(n).SetAnimal(new Peacock(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Bear")) {
                            Zoo.Get(n).SetAnimal(new Bear(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Deer")) {
                            Zoo.Get(n).SetAnimal(new Deer(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Elephant")) {
                            Zoo.Get(n).SetAnimal(new Elephant(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Girrafe")) {
                            Zoo.Get(n).SetAnimal(new Girrafe(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Lion")) {
                            Zoo.Get(n).SetAnimal(new Lion(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Tiger")) {
                            Zoo.Get(n).SetAnimal(new Tiger(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Lion")) {
                            Zoo.Get(n).SetAnimal(new Lion(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Mantaray")) {
                            Zoo.Get(n).SetAnimal(new Mantaray(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Piranha")) {
                            Zoo.Get(n).SetAnimal(new Piranha(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Seahorse")) {
                            Zoo.Get(n).SetAnimal(new Seahorse(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Shark")) {
                            Zoo.Get(n).SetAnimal(new Shark(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        } else if (tokens[2].equals("Starfish")) {
                            Zoo.Get(n).SetAnimal(new Starfish(tokens[2], Float.parseFloat(tokens[4]), tokens[3].equals("True"), Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[6], tokens[5]));
                        }
                    }
                }


                if (sCurrentLine.equals("[Facility]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Facility]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if (tokens[2].equals("Restaurant")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new Restaurant(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), tokens[3]));
                        } else if (tokens[2].equals("Park")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new Park(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0])));
                        } else {
                            if (tokens[3].equals("RoadExit") || tokens[3].equals("RoadEntrance")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new Road(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), tokens[3], '_'));
                            } else {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), new Road(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), tokens[3], ' '));
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

                return 0;
            } catch (IOException ex) {

                ex.printStackTrace();
                return -1;
            }

        }


    }
}
