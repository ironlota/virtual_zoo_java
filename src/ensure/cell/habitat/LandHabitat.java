package ensure.cell.habitat;

import ensure.animal.Animal;

/**
 * LandHabitat
 * LandHabitat merupakan habitat untuk hewan yang tinggal di darat
 * Created by Tasya on 3/26/2017.
 */
public class LandHabitat extends Habitat {
  public LandHabitat () {
    super();
    type = "Land";
    symbol = 'x';
  }

  public <A extends Animal> LandHabitat (int x, int y, int id) {
    super(x, y, "Land", null, id, 'x');
  }
}
