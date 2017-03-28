package ensure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


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
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),"Water",null,Integer.parseInt(tokens[2]),"",'~'));
                            } else if (tokens[3].equals("LandHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),"Land",null,Integer.parseInt(tokens[2]),"",'x'));
                            } else if (tokens[3].equals("FlyingHabitat")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),"Flying",null,Integer.parseInt(tokens[2]),"",'O'));
                            }
                        }
                    }
                }

                if (sCurrentLine.equals("[Animal]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Animal]")) {
                        String[] tokens = sCurrentLine.split(",");
                        Zoo.Get(n).SetAnimal(new Animal(tokens[2],Float.parseFloat(tokens[4]),tokens[3].equals("True") ? true : false,Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[6], tokens[5]));
                    }
                }


                if (sCurrentLine.equals("[Facility]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Facility]")) {
                        String[] tokens = sCurrentLine.split(",");
                        if(tokens[2].equals("Restaurant")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[2],null,-1,tokens[3],'R'));
                        } else if(tokens[2].equals("Park")) {
                            Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[2],null,-1,tokens[3],'P'));
                        } else {
                            if (tokens[3].equals("RoadExit") || tokens[3].equals("RoadEntrance")) {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[2],null,-1,tokens[3],'_'));
                            } else {
                                Zoo.Get(n).setCell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),new Cell(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[0]),tokens[2],null,-1,tokens[3],' '));
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            //e.printStackTrace();

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

