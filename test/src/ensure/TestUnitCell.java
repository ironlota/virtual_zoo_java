package ensure;

import ensure.cell.Cell;
import ensure.cell.facility.Road;
import ensure.cell.habitat.WaterHabitat;
import ensure.animal.mamalia.Bear;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Class for unit cell testing
 * Created by rufus on 3/29/2017.
 */
public class TestUnitCell {
  private Cell road;
  private Cell habitat;

  @Before
  public void initialize() {
      road = new Road(1,1,"RoadExit",'_');
      System.out.println("New class Road for Testing");
      System.out.println("LocX : 1, LocY : 1, Name : RoadExit, symbol : _");
      System.out.println();

      habitat = new WaterHabitat(1,1, 1);
      System.out.println("New class WaterHabitat for Testing");
      System.out.println("LocX : 1, LocY : 1, Name : Water, symbol : ~, cage_id : 1");
      System.out.println();
  }

  @Test
  public void TestAll() {
    System.out.println("Road Tester");
    System.out.println("  Tester getName : " + road.getName());
    assertEquals(road.getName(), "RoadExit");
    System.out.println("  Tester getSymbol : " + road.getSymbol());
    assertEquals(String.valueOf(road.getSymbol()), "_");
    System.out.println("  Tester getLocX : " + road.getLocX());
    assertTrue(road.getLocX() == 1);
    System.out.println("  Tester getLocX : " + road.getLocY());
    assertTrue(road.getLocY() == 1);

    System.out.println();
    System.out.println("WaterHabitat Tester");
    System.out.println("  Tester getName : " + habitat.getName());
    assertEquals(habitat.getName(), "");
    System.out.println("  Tester getLocX : " + habitat.getLocX());
    assertTrue(habitat.getLocX() == 1);
    System.out.println("  Tester getLocX : " + habitat.getLocY());
    assertTrue(habitat.getLocY() == 1);
    System.out.println("  Tester getAnimal : " + habitat.getAnimal());
    assertNull(habitat.getAnimal());
    System.out.println("  Tester getSymbol : " + habitat.getSymbol());
    assertEquals(String.valueOf(habitat.getSymbol()), "~");
    System.out.println();
    System.out.println("Adding Bear Class to Cell");
    System.out.println("  inputname : Bear, inputWeight : 100, isTamed : false, LocX : 1, LocY : 1, FoodType : Carnivore, HabitatType : Land");
    habitat.setAnimalPtr(new Bear("Bear",100,false,1,1,"Carnivore", "Land"));
    System.out.println("  Tester getAnimal : " + habitat.getAnimal());
    System.out.println("  Tester getAnimal -> getName : " + habitat.getAnimal().getName());
    assertEquals(habitat.getAnimal().getName(), "Bear");
  }
}
