package ensure.cell.habitat;

import ensure.animal.Animal;
/**
 * @class FlyingHabitat
 * FlyingHabitat merupakan habitat untuk hewan yang tinggal di udara
 * Created by rayandrew on 3/26/2017.
 */
public class FlyingHabitat extends Habitat {
    public FlyingHabitat() {
        super();
        type = "Flying";
    }

    public <A extends Animal> FlyingHabitat(int x, int y, A a, int id) {
        super(x,y,"Flying",a, id, "");
    }
}
