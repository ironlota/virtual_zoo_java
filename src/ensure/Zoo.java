package ensure;

import ensure.animal.Animal;
import ensure.cell.Cell;
import ensure.cell.facility.Road;

import java.util.ArrayList;

/**
 * @class Zoo
 * Zoo merupakan class yang merepresentasikan sebuah kebun binatang
 * Created by rayandrew on 3/27/2017.
 */
public class Zoo {
    private static int maxCell = 40;
    public static Zoo zoo = new Zoo(maxCell);
    private ArrayList<Animal> animal_ = new ArrayList<Animal>();
    private ArrayList<ArrayList<Cell>> cell_;

    /** @brief Constructor.
     * Melakukan inisialisasi kelas
     */
    public Zoo () {
        cell_ = new ArrayList<ArrayList<Cell>>(maxCell);
        for(int i = 0; i < maxCell; i++) {
            cell_.add(new ArrayList<Cell>());
        }
        for(int i = 0; i<maxCell; i++) {
            for(int j = 0; j<maxCell; j++) {
                if(i==maxCell-1 || j==maxCell-1) {
                    cell_.get(i).add(j,new Road(i,j,"RoadExit", '_'));
                } else if(i==0|| j==0) {
                    cell_.get(i).add(j,new Road(i,j,"RoadEntrance", '_'));
                } else {
                    cell_.get(i).add(j,new Road(i,j,"Road", ' '));
                }
            }
        }
    }
    /** @brief Constructor(int).
     * Melakukan inisialisasi kelas dengan memasukkan konstanta integer n
     */
    public Zoo(int n) {
        maxCell = n;
        cell_ = new ArrayList<ArrayList<Cell>>(maxCell);
        for(int i = 0; i < maxCell; i++) {
            cell_.add(new ArrayList<Cell>());
        }

        for(int i = 0; i<maxCell; i++) {
            for(int j = 0; j<maxCell; j++) {
                if(i==maxCell-1 || j==maxCell-1) {
                    cell_.get(i).add(j,new Road(i,j,"RoadExit", '_'));
                } else if(i==0|| j==0) {
                    cell_.get(i).add(j,new Road(i,j,"RoadEntrance", '_'));
                } else {
                    cell_.get(i).add(j,new Road(i,j,"Road", ' '));
                }
            }
        }
    }

    /** @brief get
     * Mengembalikan Zoo class
     */
    public static Zoo Get(int n) {
        return zoo;
    }

    /** @brief getMaxCell
     * Mengembalikan max cell
     */
    public static int getMaxCell() {
        return maxCell;
    }

    /** @brief getCell
     * Mengembalikan pointer cell di dalam arrayList cell_
     */
    public Cell getCell(int x, int y) {
        return cell_.get(x).get(y);
    }

    /** @brief setCell
     * Menginisialisasi animal dan turunannya pada suatu cell
     */
    public <A extends Cell> void setCell(int x,int y, A c) {
        cell_.get(y).set(x,c);
    }

    /** @brief setMaxCell
     * Menginisialisasi animal dan turunannya pada suatu cell
     */
    public void setMaxCell(int n) {
        maxCell = n;
    }

    /** @brief getAllCell
     * Mengembalikan pointer semua cell di dalam vektor of vektor cell_
     */
    public ArrayList<ArrayList<Cell>> getAllCell() {
        return cell_;
    }

    /** @brief SetAnimal
     * Berfungsi untuk meletakan animal
     * Asumsi bahwa animal sudah terdefinisi
     * @param Animal memberikan value animal yang ingin dimasukan
     */
    public <A extends Animal> void SetAnimal(A a) {
        if(a instanceof Animal) {
            cell_.get(a.getLocX()).get(a.getLocY()).setAnimalPtr(a);
            animal_.add(a);
        }
    }
    /** @brief GetAnimal
     * Berfungsi untuk mengambil animal
     * Asumsi bahwa vector animal sudah terdefinisi
     * @return Pointer to Animal
     * @param int x
     * @param int y
     */
    public Animal GetAnimal(int x,int y) {
        if(cell_.get(x).get(y).getAnimal() instanceof Animal) {
            return cell_.get(x).get(y).getAnimal();
        } else {
            return null;
        }
    }

    /* METODE LAIN */

    /** @brief update
     * Metode untuk update status posisi dari tiap animal
     */
    public void update() {

    }

    /** @brief Tour
     * Metode untuk melakukan tour dari posisi i dan j
     * @param int en_x adalah entrence x
     * @param int en_y adalah entrence y
     */
    void Tour(int en_x, int en_y) {

    }

    /** @brief TotalFood
     * Metode untuk mengambil total makanan dari semua binatang
     */
    public void TotalFood() {

    }

    /** @brief AddAnimal
     * @param Animal yang berupa masukan
     */
    /*public void <An extends Animal> AddAnimal(An A) {

    }*/

    /** @brief toString
     * Metode untuk menampilkan isi zoo ke layar
     */
    public String toString() {
        String temp_str = new String();
        for(int i = 0; i < maxCell; i++) {
            for(Cell temp : cell_.get(i)) {
                if(temp.getAnimal() instanceof Animal) {
                    temp_str += (temp.getAnimal().getSymbol() + " ");
                } else {
                    temp_str +=  (temp.getSymbol() + " ");
                }
            }
            temp_str += "\n";
        }
        return temp_str;
    }
}
