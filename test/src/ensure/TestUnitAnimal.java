package ensure;

import ensure.animal.Animal;
import ensure.animal.mamalia.Bear;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Class for Animal Testing Unit
 * Created by rufus on 3/29/2017.
 */
public class TestUnitAnimal {
  private Animal a;

  @Before
  public void initialize() {
    a = new Bear("Bear",100,false,1,1,"Carnivore", "Land");
    System.out.println("New class Bear for Testing");
    System.out.println("inputname : Bear, inputWeight : 100, isTamed : false, LocX : 1, LocY : 1, FoodType : Carnivore, HabitatType : Land");
  }

  @Test
  public void TestAll() {
    System.out.println("Bear Tester");
    System.out.println("  Tester GetName : " + a.getName());
    assertEquals(a.getName(), "Bear");
    System.out.println("  Tester GetWeight : " + a.getWeight());
    assertEquals(String.valueOf(a.getWeight()), "100.0");
    System.out.println("  Tester GetHabitat : " + a.getHabitatType());
    assertEquals(a.getHabitatType(), "Land");
    System.out.println();
  }
}
