package ensure.cell.facility;

/**
 * @class Park
 * Park merupakan facility yang merepresentasikan taman dalam kebun binatang
 * Created by rufus on 3/26/2017.
 */
public class Park extends Facility {
    public Park() {
        super();
        type = "Park";
        name = "Park";
    }

    public Park(int x, int y) {
        super(x,y,"Park", "Park");
    }
}
