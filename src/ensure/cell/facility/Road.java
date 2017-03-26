package ensure.cell.facility;

import ensure.cell.Cell;

/**
 * @class Road
 * Road merupakan facility yang merepresentasikan sebuah jalan di dalam kebun binatang
 * Created by rayandrew on 3/26/2017.
 */
public class Road extends Cell {
    public Road() {
        super();
        type = "Road";
        name = "Road";
    }

    public Road(int x, int y, String name_) {
        super(x,y,"Road", -1, name_);
    }
}
