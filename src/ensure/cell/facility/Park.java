package ensure.cell.facility;

import ensure.cell.Cell;

/**
 * @class Park
 * Park merupakan facility yang merepresentasikan taman dalam kebun binatang
 * Created by rufus on 3/26/2017.
 */
public class Park extends Cell {
    public Park() {
        super();
        type = "Park";
        name = "Park";
    }

    public Park(int x, int y) {
        super(x,y,"Park", -1, "Park");
    }
}
