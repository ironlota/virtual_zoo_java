package ensure.cell.facility;

import ensure.cell.Cell;

/**
 * Abstract class Facility
 * Created by Girvandi on 3/26/2017.
 */
abstract public class Facility extends Cell {
  public Facility () {
    super();
  }

  public Facility (int x, int y, String type_, String name_, char symbol_) {
    super(x, y, type_, null, -1, name_, symbol_);
  }
}
