package ensure.cell.habitat;

import ensure.animal.Animal;

/**
 * FlyingHabitat
 * FlyingHabitat merupakan habitat untuk hewan yang tinggal di udara
 * Created by rayandrew on 3/26/2017.
 */
public class FlyingHabitat extends Habitat {
  public FlyingHabitat () {
    super();
    type = "Flying";
    symbol = 'O';
  }

  public <A extends Animal> FlyingHabitat (int x, int y, A a, int id) {
    super(x, y, "Flying", a, id, "", 'O');
  }
}
