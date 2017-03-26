package ensure.cell.habitat;

import ensure.animal.Animal;

/**
 * @class LandHabitat
 * LandHabitat merupakan habitat untuk hewan yang tinggal di darat
 * Created by rayandrew on 3/26/2017.
 */
public class LandHabitat extends Habitat {
    public LandHabitat() {
        super();
        type = "Land";
    }

    public <A extends Animal> LandHabitat(int x, int y, A a, int id) {
        super(x,y,"Land",a, id, "");
    }
}
