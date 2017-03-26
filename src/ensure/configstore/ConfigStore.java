package ensure.configstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import ensure.cell.facility.*;
import ensure.cell.habitat.*;
import ensure.animal.*;
import ensure.animal.amphibi.*;
import ensure.animal.aves.*;
import ensure.animal.mamalia.*;
import ensure.animal.pisces.*;

/**
 * @class ConfigStore
 * ConfigStore merupakan kelas loader and parser untuk melakukan pengambilan konfigurasi dari file eksternal
 */
public class ConfigStore {
    private static final String FILENAME = "./data/base.vze";

    public static void main(String[] args) {
        ArrayList<Animal> arrAnimal;
        ArrayList<Habitat> arrHabitat;
        ArrayList<Facility> arrFacility;

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
                    }
                }

                if(sCurrentLine.equals("[Animal]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Animal]")) {
                        String[] tokens = sCurrentLine.split(",");
                    }
                }

                if(sCurrentLine.equals("[Facility]")) {
                    while (!(sCurrentLine = br.readLine()).equals("[END OF Facility]")) {
                        String[] tokens = sCurrentLine.split(",");
                    }
                }
            }
            /**
            while ((sCurrentLine = br.readLine()) != null && (!sCurrentLine.equals("[END OF Animal]"))) {
                System.out.println(sCurrentLine);
            }
            */
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

