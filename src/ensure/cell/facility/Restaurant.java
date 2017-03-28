package ensure.cell.facility;

/**
 * Restaurant
 * Restaurant merupakan facility yang merepresentasikan sebuah restoran dalam kebun binatang
 * Created by rayandrew on 3/26/2017.
 */
public class Restaurant extends Facility {
  public Restaurant () {
    super();
    type = "Restaurant";
    name = "Restaurant";
    symbol = 'R';
  }

  public Restaurant (int x, int y, String name_) {
    super(x, y, "Restaurant", name_, 'R');
  }
}
