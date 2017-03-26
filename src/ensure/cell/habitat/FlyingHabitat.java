package ensure.cell.habitat;

import ensure.cell.Cell;

/**
 * @class FlyingHabitat
 * FlyingHabitat merupakan habitat untuk hewan yang tinggal di udara
 * Created by rayandrew on 3/26/2017.
 */
public class FlyingHabitat extends Cell {
    public FlyingHabitat() {
        super();
        type = "Flying";
    }

    public FlyingHabitat(int x, int y, int id) {
        super(x,y,"Flying", id, "");
    }
}
