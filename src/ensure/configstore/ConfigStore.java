package ensure.configstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import ensure.cell.Cell;
import ensure.cell.facility.*;
import ensure.cell.habitat.*;
import ensure.animal.Animal;
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
    private static final String FILENAME = "./data/base.vze";

    public static void main(String[] argv) {
        int n = 40;
        ArrayList<Animal> arrAnimal = new ArrayList<Animal>();
        ArrayList<Habitat> arrHabitat = new ArrayList<Habitat>();
        ArrayList<Facility> arrFacility = new ArrayList<Facility>();

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.equals("[Cage]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Cage]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if(Integer.parseInt(tokens[0]) < n && Integer.parseInt(tokens[1]) < n) {
                            if(tokens[3].equals("WaterHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new WaterHabitat(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),null,Integer.parseInt(tokens[2])));
                            } else if(tokens[3].equals("LandHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new LandHabitat(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),null,Integer.parseInt(tokens[2])));
                            } else if(tokens[3].equals("FlyingHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new FlyingHabitat(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[0]), null, Integer.parseInt(tokens[2])));
                            }
                        }
                    }
                }

                if(sCurrentLine.equals("[Animal]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Animal]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if(tokens[2].equals("AfricanFrog")) {
                            Zoo.Get(n).SetAnimal(new AfricanFrog(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Caecilia")) {
                            Zoo.Get(n).SetAnimal(new Caecilia(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Exolotl")) {
                            Zoo.Get(n).SetAnimal(new Exolotl(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("FlyingFish")) {
                            Zoo.Get(n).SetAnimal(new FlyingFish(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Ostrich")) {
                            Zoo.Get(n).SetAnimal(new Ostrich(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Salamander")) {
                            Zoo.Get(n).SetAnimal(new Salamander(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("BirdOfParadise")) {
                            Zoo.Get(n).SetAnimal(new BirdOfParadise(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Eagle")) {
                            Zoo.Get(n).SetAnimal(new Eagle(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Hawk")) {
                            Zoo.Get(n).SetAnimal(new Hawk(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Owl")) {
                            Zoo.Get(n).SetAnimal(new Owl(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Peacock")) {
                            Zoo.Get(n).SetAnimal(new Peacock(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Bear")) {
                            Zoo.Get(n).SetAnimal(new Bear(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Deer")) {
                            Zoo.Get(n).SetAnimal(new Deer(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Elephant")) {
                            Zoo.Get(n).SetAnimal(new Elephant(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Girrafe")) {
                            Zoo.Get(n).SetAnimal(new Girrafe(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Lion")) {
                            Zoo.Get(n).SetAnimal(new Lion(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Tiger")) {
                            Zoo.Get(n).SetAnimal(new Tiger(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Lion")) {
                            Zoo.Get(n).SetAnimal(new Lion(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Mantaray")) {
                            Zoo.Get(n).SetAnimal(new Mantaray(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Piranha")) {
                            Zoo.Get(n).SetAnimal(new Piranha(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Seahorse")) {
                            Zoo.Get(n).SetAnimal(new Seahorse(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Shark")) {
                            Zoo.Get(n).SetAnimal(new Shark(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        } else if(tokens[2].equals("Starfish")) {
                            Zoo.Get(n).SetAnimal(new Starfish(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[6], tokens[5]));
                        }
                    }
                }



                if(sCurrentLine.equals("[Facility]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Facility]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if(tokens[2].equals("Restaurant")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Restaurant(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[3]));
                        } else if(tokens[2].equals("Park")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Park(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0])));
                        } else {
                            if((Integer.parseInt(tokens[0])==n-1) || (Integer.parseInt(tokens[1])==n-1)) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Road(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[3], '_'));
                            } else {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Road(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[3], ' '));
                            }
                        }
                    }
                }
                /*
                for(int i = 0; i< n; i++) {
                    for(Cell temp : Zoo.Get(n).getAllCell().get(i)) {
                        if(temp.getAnimal() instanceof Animal) {
                            System.out.println(temp.getLocX() + " " + temp.getLocY() + " " + temp.getName() + temp.getCageId() + " " + temp.getSymbol() + " " + temp.getAnimal().getName() + " " + temp.getAnimal().getSymbol());
                        } else {
                            System.out.println(temp.getLocX() + " " + temp.getLocY() + " " + temp.getName() + temp.getCageId() + " " + temp.getSymbol());
                        }
                    }
                }*/
            }
            for(int i = 0; i < n; i++) {
                for(Cell temp : Zoo.Get(n).getAllCell().get(i)) {
                    if(temp.getAnimal() instanceof Animal && temp.getAnimal() != null) {
                        System.out.print(temp.getAnimal().getSymbol() + " ");
                    } else {
                        System.out.print(temp.getSymbol() + " ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }


    }
}

