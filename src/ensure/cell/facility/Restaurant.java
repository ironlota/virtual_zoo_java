package ensure.cell.facility;

import ensure.cell.Cell;
/**
 * @class Restaurant
 * Restaurant merupakan facility yang merepresentasikan sebuah restoran dalam kebun binatang
 * Created by rayandrew on 3/26/2017.
 */
public class Restaurant extends Cell {
    public Restaurant() {
        super();
        type = "Restaurant";
        name = "Restaurant";
    }

    public Restaurant(int x, int y, String name_) {
        super(x,y,"Restaurant", -1, name_);
    }
}
