package ensure.cell.habitat;

import ensure.animal.Animal;
import ensure.cell.Cell;

/**
 * @class Habitat
 * Habitat merupakan cell yang merepresentasikan tempat tinggal dari suatu hewan
 * Created by rayandrew on 3/26/2017.
 */
abstract public class Habitat extends Cell {
    public Habitat() {
        super();
    }

    public <A extends Animal> Habitat(int x, int y, String type_, A a, int id, String name_, char symbol_) {
        super(x,y,type_,a,id,name_,symbol_);
    }
}
