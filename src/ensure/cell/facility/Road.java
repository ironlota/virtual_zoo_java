package ensure.cell.facility;

/**
 * @class Road
 * Road merupakan facility yang merepresentasikan sebuah jalan di dalam kebun binatang
 * Created by rayandrew on 3/26/2017.
 */
public class Road extends Facility {
    public Road() {
        super();
        type = "Road";
        name = "Road";
        symbol = ' ';
    }

    public Road(int x, int y, String name_, char symbol_) {
            super(x,y,"Road", name_,' ');
    }
}
