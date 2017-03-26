package ensure.cell.habitat;

import ensure.cell.Cell;

/**
 * @class LandHabitat
 * LandHabitat merupakan habitat untuk hewan yang tinggal di darat
 * Created by rayandrew on 3/26/2017.
 */
public class LandHabitat extends Cell {
    public LandHabitat() {
        super();
        type = "Land";
    }

    public LandHabitat(int x, int y, int id) {
        super(x,y,"Land", id, "");
    }
}
