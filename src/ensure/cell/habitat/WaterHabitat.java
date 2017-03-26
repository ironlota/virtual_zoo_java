package ensure.cell.habitat;

import ensure.cell.Cell;

/**
 * @class WaterHabitat
 * WaterHabitat merupakan habitat untuk hewan yang tinggal di air
 * Created by rayandrew on 3/26/2017.
 */
public class WaterHabitat extends Cell {
    public WaterHabitat() {
        super();
        type = "Water";
    }

    public WaterHabitat(int x, int y, int id) {
        super(x,y,"Water", id, "");
    }
}
