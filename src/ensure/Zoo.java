package ensure;

import ensure.animal.Animal;
import ensure.cell.Cell;
import ensure.cell.facility.Road;

import java.util.ArrayList;

import static ensure.configstore.Utility.clearWait;

/**
 * Zoo
 * Zoo merupakan class yang merepresentasikan sebuah kebun binatang
 * Created by rayandrew on 3/27/2017.
 */
public class Zoo {

  private static int maxCell = 40;
  private static Zoo zoo = new Zoo(maxCell);
  private ArrayList<Animal> animal_ = new ArrayList<>();
  private ArrayList<ArrayList<Cell>> cell_;

  /**
   * Constructor.
   * Melakukan inisialisasi kelas
   */
  public Zoo() {
    cell_ = new ArrayList<>(maxCell);
    for (int i = 0; i < maxCell; i++) {
      cell_.add(new ArrayList<>(maxCell));
    }
    for (int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        if (i == maxCell - 1 || j == maxCell - 1) {
          cell_.get(i).add(j, new Road(i, j, "RoadExit", '_'));
        } else {
          cell_.get(i).add(j, new Road(i, j, "Road", ' '));
        }
      }
    }
  }

  /**
   * Constructor(int).
   * Melakukan inisialisasi kelas dengan memasukkan konstanta integer n
   */
  private Zoo(int n) {
    maxCell = n;
    cell_ = new ArrayList<>(maxCell);
    for (int i = 0; i < maxCell; i++) {
      cell_.add(new ArrayList<>());
    }

    for (int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        if (i == maxCell - 1 || j == maxCell - 1) {
          cell_.get(i).add(j, new Road(i, j, "RoadExit", '_'));
        } else {
          cell_.get(i).add(j, new Road(i, j, "Road", ' '));
        }
      }
    }
  }

  /**
   * get
   * Mengembalikan Zoo class
   */
  public static Zoo Get(int n) {
    maxCell = n;
    return zoo;
  }

  /**
   * getMaxCell
   * Mengembalikan max cell
   */
  public static int getMaxCell() {
    return maxCell;
  }

  /**
   * getCell
   * Mengembalikan pointer cell di dalam arrayList cell_
   */
  public Cell getCell(int x, int y) {
    return cell_.get(x).get(y);
  }

  /**
   * setCell
   * Menginisialisasi animal dan turunannya pada suatu cell
   */
  public <A extends Cell> void setCell(int x, int y, A c) {
    cell_.get(y).set(x, c);
  }

  /**
   * setMaxCell
   * Menginisialisasi animal dan turunannya pada suatu cell
   */
  public void setMaxCell(int n) {
    maxCell = n;
  }

  /**
   * getAllCell
   * Mengembalikan pointer semua cell di dalam vektor of vektor cell_
   */
  public ArrayList<ArrayList<Cell>> getAllCell() {
    return cell_;
  }

  /**
   * @param a memberikan value animal yang ingin dimasukan SetAnimal Berfungsi untuk meletakan
   * animal Asumsi bahwa animal sudah terdefinisi
   */
  public <A extends Animal> void SetAnimal(A a) {
    if (a != null) {
      cell_.get(a.getLocX()).get(a.getLocY()).setAnimalPtr(a);
      animal_.add(a);
    }
  }

  /**
   * @param x input lokasi x
   * @param y input lokasi y
   * @return Pointer to Animal GetAnimal Berfungsi untuk mengambil animal Asumsi bahwa vector animal
   * sudah terdefinisi
   */
  public Animal GetAnimal(int x, int y) {
    if (cell_.get(x).get(y).getAnimal() != null) {
      return cell_.get(x).get(y).getAnimal();
    } else {
      return null;
    }
  }

    /* METODE LAIN */

  /**
   * update
   * Metode untuk update status posisi dari tiap animal
   */
  void update() {
    for (Animal temp : animal_) {
      int temp_x = temp.getLocX();
      int temp_y = temp.getLocY();
      boolean up = false;
      boolean down = false;
      boolean right = false;
      boolean left = false;

      if (temp_y > 0) {
        up = (cell_.get(temp_x).get(temp_y - 1).getAnimal() == null) &&
            (cell_.get(temp_x).get(temp_y - 1).getCageId() == cell_.get(temp_x).get(temp_y)
                .getCageId()) &&
            (cell_.get(temp_x).get(temp_y - 1).getCellType()
                .equals(cell_.get(temp_x).get(temp_y).getCellType()));
      }
      if (temp_y < maxCell - 1) {
        down = (cell_.get(temp_x).get(temp_y + 1).getAnimal() == null) &&
            (cell_.get(temp_x).get(temp_y + 1).getCageId() == cell_.get(temp_x).get(temp_y)
                .getCageId()) &&
            (cell_.get(temp_x).get(temp_y + 1).getCellType()
                .equals(cell_.get(temp_x).get(temp_y).getCellType()));
      }
      if (temp_x > 0) {
        left = (cell_.get(temp_x - 1).get(temp_y).getAnimal() == null) &&
            (cell_.get(temp_x - 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y)
                .getCageId()) &&
            (cell_.get(temp_x - 1).get(temp_y).getCellType()
                .equals(cell_.get(temp_x).get(temp_y).getCellType()));
      }
      if (temp_x < maxCell - 1) {
        right = (cell_.get(temp_x + 1).get(temp_y).getAnimal() == null) &&
            (cell_.get(temp_x + 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y)
                .getCageId()) &&
            (cell_.get(temp_x + 1).get(temp_y).getCellType()
                .equals(cell_.get(temp_x).get(temp_y).getCellType()));
      }

      int movement = temp.move(up, down, right, left);
      //Swap binatang
      switch (movement) {
        case 0: {
          cell_.get(temp_x).get(temp_y - 1).setAnimalPtr(temp);
          temp.setLocY(temp.getLocY() - 1);
          cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
          break;
        }
        case 1: {
          cell_.get(temp_x).get(temp_y + 1).setAnimalPtr(temp);
          temp.setLocY(temp.getLocY() + 1);
          cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
          break;
        }
        case 2: {
          cell_.get(temp_x + 1).get(temp_y).setAnimalPtr(temp);
          temp.setLocX(temp.getLocX() + 1);
          cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
          break;
        }
        case 3: {
          cell_.get(temp_x - 1).get(temp_y).setAnimalPtr(temp);
          temp.setLocX(temp.getLocX() - 1);
          cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
          break;
        }
        default:
          break;
      }
    }
  }

  /**
   * Tour
   * Metode untuk melakukan tour dari posisi i dan j
   *
   * @param current_x adalah entrance x
   * @param current_y adalah entrance y
   */
  void tour(int current_y, int current_x) {
    boolean[][] visited = new boolean[maxCell][maxCell];
    for (int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        visited[i][j] = false;
      }
    }
    /*for(int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        if (cell_.get(i).get(j).getName().equals("RoadEntrance")) {
          System.out.println(i + " " + j + " " + cell_.get(i).get(j).getSymbol());
        }
      }
    }*/
    //System.out.println(current_y + " " + current_x + " " + cell_.get(current_x).get(current_y).getName());
    while (!cell_.get(current_x).get(current_y).getName().equals("RoadExit")) {
      visited[current_x][current_y] = true;
      Boolean[] side = new Boolean[4];

      for (int i = 0; i < 4; i++) {
        side[i] = false;
      }

      System.out.println(
          current_x + " " + current_y + " " + cell_.get(current_x).get(current_y).getName());
      if (current_y < maxCell - 1) {
        System.out.print("Bawah : " + cell_.get(current_x).get(current_y + 1).getName() + " ");
        side[0] =
            cell_.get(current_x).get(current_y + 1).getName().equals("Road") && !visited[current_x][
                current_y + 1];
        if (side[0]) {
          side[1] = side[2] = side[3] = false;
        }
      }

      if (current_x < maxCell - 1) {
        System.out.print("Kanan : " + cell_.get(current_x + 1).get(current_y).getName() + " ");
        side[1] =
            cell_.get(current_x + 1).get(current_y).getName().equals("Road") && !visited[current_x
                + 1][current_y];
        if (side[1]) {
          side[0] = side[2] = side[3] = false;
        }
      }

      if (current_y > 0) {
        System.out.print("Atas : " + cell_.get(current_x).get(current_y - 1).getName() + " ");
        side[2] =
            cell_.get(current_x).get(current_y - 1).getName().equals("Road") && !visited[current_x][
                current_y - 1];
        if (side[2]) {
          side[0] = side[1] = side[3] = false;
        }
      }

      if (current_x > 0) {
        System.out.print("Kiri : " + cell_.get(current_x - 1).get(current_y).getName() + " ");
        side[3] =
            cell_.get(current_x - 1).get(current_y).getName().equals("Road") && !visited[current_x
                - 1][current_y];
        if (side[3]) {
          side[0] = side[1] = side[2] = false;
        }
      }

      for (int i = 0; i < 4; i++) {
        System.out.print(side[i] + " ");
      }
      System.out.println();
      if (side[0]) { //bawah
        current_y++;
      } else if (side[1]) { //kanan
        current_x++;
      } else if (side[2]) { //atas
        current_y--;
      } else if (side[3]) { //kiri
        current_x--;
      } else {
        break;
      }

      for (int i = 0; i < maxCell; i++) {
        for (int j = 0; j < maxCell; j++) {
          if (i == current_x && j == current_y) {
            System.out.print('@');
          } else {
            if (cell_.get(i).get(j).getAnimal() != null) {
              System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
            } else {
              System.out.print(cell_.get(i).get(j).getSymbol());
            }
          }
        }
        System.out.println();
      }
      System.out.println();
      //clearWait(1);
    }
    //last print
    for (int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        if (i == current_x && j == current_y) {
          System.out.print('@');
        } else {
          if (cell_.get(i).get(j).getAnimal() != null) {
            System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
          } else {
            System.out.print(cell_.get(i).get(j).getSymbol());
          }
        }
      }
      System.out.println();
    }
    System.out.print("Tour Finished!");
  }

  /**
   * TotalFood
   * Metode untuk mengambil total makanan dari semua binatang
   */
  void TotalFood() throws InterruptedException {
    float meat = 0;
    float grass = 0;
    for (Animal temp : animal_) {
      switch (temp.getFoodType()) {
        case "Carnivore":
          meat += temp.getTotalFood();
          break;
        case "Herbivore":
          grass += temp.getTotalFood();
          break;
        case "Omnivore":
          meat += 0.5 * temp.getTotalFood();
          grass += 0.5 * temp.getTotalFood();
          break;
      }
      System.out.println(temp.getName() + " eats " + temp.getTotalFood() + " kg");
      System.out.println("Total meat for Carnivores and Omnivores = " + meat + " kg");
      System.out.println("Total grass for Herbivores and Omnivores = " + grass + " kg");
      clearWait(1);
    }
  }

  /**
   * toString
   * Metode untuk menampilkan isi zoo ke layar
   */
  public String toString() {
    StringBuilder temp_str = new StringBuilder();
    for (int i = 0; i < maxCell; i++) {
      for (int j = 0; j < maxCell; j++) {
        if (zoo.getCell(i,j).getAnimal() != null) {
          temp_str.append(zoo.getCell(i,j).getAnimal().getSymbol());
          temp_str.append(" ");
        } else {
          temp_str.append(zoo.getCell(i,j).getSymbol());
          temp_str.append(" ");
        }
      }
      temp_str.append("\n");
    }
    return temp_str.toString();
  }
}
