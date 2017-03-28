package ensure.cell.habitat;

import ensure.animal.Animal;

/**
 * WaterHabitat
 * WaterHabitat merupakan habitat untuk hewan yang tinggal di air
 * Created by rayandrew on 3/26/2017.
 */
public class WaterHabitat extends Habitat {
  public WaterHabitat () {
    super();
    type = "Water";
    symbol = '~';
  }

  public <A extends Animal> WaterHabitat (int x, int y, A a, int id) {
    super(x, y, "Water", a, id, "", '~');
  }
}
