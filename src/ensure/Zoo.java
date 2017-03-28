package ensure;

import ensure.animal.Animal;
import ensure.cell.Cell;
import ensure.cell.facility.Road;

import java.util.ArrayList;

/**
 * Zoo
 * Zoo merupakan class yang merepresentasikan sebuah kebun binatang
 * Created by rayandrew on 3/27/2017.
 */
public class Zoo {
    private static int maxCell = 40;
    public static Zoo zoo = new Zoo(maxCell);
    private ArrayList<Animal> animal_ = new ArrayList<Animal>();
    private ArrayList<ArrayList<Cell>> cell_;

    /** Constructor.
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
                } else {
                    cell_.get(i).add(j,new Road(i,j,"Road", ' '));
                }
            }
        }
    }
    /** Constructor(int).
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
                } else {
                    cell_.get(i).add(j,new Road(i,j,"Road", ' '));
                }
            }
        }
    }

    /** get
     * Mengembalikan Zoo class
     */
    public static Zoo Get(int n) {
        return zoo;
    }

    /** getMaxCell
     * Mengembalikan max cell
     */
    public static int getMaxCell() {
        return maxCell;
    }

    /** getCell
     * Mengembalikan pointer cell di dalam arrayList cell_
     */
    public Cell getCell(int x, int y) {
        return cell_.get(x).get(y);
    }

    /** setCell
     * Menginisialisasi animal dan turunannya pada suatu cell
     */
    public <A extends Cell> void setCell(int x,int y, A c) {
        cell_.get(y).set(x,c);
    }

    /** setMaxCell
     * Menginisialisasi animal dan turunannya pada suatu cell
     */
    public void setMaxCell(int n) {
        maxCell = n;
    }

    /** getAllCell
     * Mengembalikan pointer semua cell di dalam vektor of vektor cell_
     */
    public ArrayList<ArrayList<Cell>> getAllCell() {
        return cell_;
    }

    /** SetAnimal
     * Berfungsi untuk meletakan animal
     * Asumsi bahwa animal sudah terdefinisi
     * @param a memberikan value animal yang ingin dimasukan
     */
    public <A extends Animal> void SetAnimal(A a) {
        if(a instanceof Animal) {
            cell_.get(a.getLocX()).get(a.getLocY()).setAnimalPtr(a);
            animal_.add(a);
        }
    }
    /** GetAnimal
     * Berfungsi untuk mengambil animal
     * Asumsi bahwa vector animal sudah terdefinisi
     * @return Pointer to Animal
     * @param x posisi x
     * @param y posisi y
     */
    public Animal GetAnimal(int x,int y) {
        if(cell_.get(x).get(y).getAnimal() instanceof Animal) {
            return cell_.get(x).get(y).getAnimal();
        } else {
            return null;
        }
    }

    /* METODE LAIN */

    /** update
     * Metode untuk update status posisi dari tiap animal
     */
    public void update() {
        for(int i = 0; i < animal_.size(); i++){
            int temp_x = animal_.get(i).getLocX();
            int temp_y = animal_.get(i).getLocY();
            boolean up = false;
            boolean down = false;
            boolean right = false;
            boolean left = false;

            if(temp_y > 0){
                up = (cell_.get(temp_x).get(temp_y - 1).getAnimal() == null) &&
                        (cell_.get(temp_x).get(temp_y - 1).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
                        (cell_.get(temp_x).get(temp_y - 1).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
            }
            if(temp_y < maxCell-1){
                down = (cell_.get(temp_x).get(temp_y + 1).getAnimal() == null) &&
                        (cell_.get(temp_x).get(temp_y + 1).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
                        (cell_.get(temp_x).get(temp_y + 1).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
            }
            if(temp_x > 0){
                left = (cell_.get(temp_x - 1).get(temp_y).getAnimal() == null) &&
                        (cell_.get(temp_x - 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
                        (cell_.get(temp_x - 1).get(temp_y).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
            }
            if(temp_x < maxCell-1){
                right = (cell_.get(temp_x + 1).get(temp_y).getAnimal() == null) &&
                        (cell_.get(temp_x + 1).get(temp_y).getCageId() == cell_.get(temp_x).get(temp_y).getCageId()) &&
                        (cell_.get(temp_x + 1).get(temp_y).getCellType().equals(cell_.get(temp_x).get(temp_y).getCellType()));
            }
            
            int movement = animal_.get(i).move(up,down,right,left);
            //Swap binatang
            switch (movement){
                case 0 : {
                    cell_.get(temp_x).get(temp_y-1).setAnimalPtr(animal_.get(i));
                    animal_.get(i).setLocY(animal_.get(i).getLocY() - 1);
                    cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
                    break;
                }
                case 1 : {
                    cell_.get(temp_x).get(temp_y+1).setAnimalPtr(animal_.get(i));
                    animal_.get(i).setLocY(animal_.get(i).getLocY() + 1);
                    cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
                    break;
                }
                case 2 : {
                    cell_.get(temp_x+1).get(temp_y).setAnimalPtr(animal_.get(i));
                    animal_.get(i).setLocX(animal_.get(i).getLocX() + 1);
                    cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
                    break;
                }
                case 3 : {
                    cell_.get(temp_x-1).get(temp_y).setAnimalPtr(animal_.get(i));
                    animal_.get(i).setLocX(animal_.get(i).getLocX() - 1);
                    cell_.get(temp_x).get(temp_y).setAnimalPtr(null);
                    break;
                }
                default : break;
            }
        }
    }

    /** Tour
     * Metode untuk melakukan tour dari posisi i dan j
     * @param en_x adalah entrence x
     * @param en_y adalah entrence y
     */
    public void tour(int en_x, int en_y) {
        int current_x = en_x;
        int current_y = en_y;

        boolean [][] visited = new boolean[maxCell][maxCell];
        for(int i = 0; i < maxCell; i++){
            for(int j = 0; j < maxCell; j++){
                visited[i][j] = false;
            }
        }

        while(!cell_.get(current_x).get(current_y).getName().equals("RoadExit")) {
            visited[current_x][current_y] = true;
            if(current_y<maxCell-1) System.out.println(cell_.get(current_x).get(current_y + 1).getCellType());
            if(current_x<maxCell-1) System.out.println(cell_.get(current_x + 1).get(current_y).getCellType());
            if(current_y>0) System.out.println(cell_.get(current_x).get(current_y - 1).getCellType());
            if(current_x>0) System.out.println(cell_.get(current_x - 1).get(current_y).getCellType());
            //System.out.println();

            if(cell_.get(current_x).get(current_y+1).getCellType().equals("Road") && !visited[current_x][current_y+1]) { //bawah
                current_y++;
            } else if(cell_.get(current_x+1).get(current_y).getCellType().equals("Road") && !visited[current_x+1][current_y]){ //kanan
                current_x++;
            } else if(cell_.get(current_x).get(current_y-1).getCellType().equals("Road") && !visited[current_x][current_y-1]){ //atas
                current_y--;
            } else if(cell_.get(current_x-1).get(current_y).getCellType().equals("Road") && !visited[current_x-1][current_y]){ //kiri
                current_x--;
            } else {
                break;
            }

            for(int i = 0; i < maxCell; i++){
                for(int j = 0; j < maxCell; j++){
                    if(i == current_x && j == current_y){
                        System.out.print('@');
                    } else if(cell_.get(i).get(j).getAnimal() != null){
                        System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
                    } else {
                        System.out.print(cell_.get(i).get(j).getSymbol());
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        //last print
        for(int i = 0; i < maxCell; i++){
            for(int j = 0; j < maxCell; j++){
                if(i == current_x && j == current_y){
                    System.out.print('@');
                } else if(cell_.get(i).get(j).getAnimal() != null){
                    System.out.print(cell_.get(i).get(j).getAnimal().getSymbol());
                } else {
                    System.out.print(cell_.get(i).get(j).getSymbol());
                }
            }
            System.out.println();
        }
        System.out.print("Tour Finished!");
    }

    /** TotalFood
     * Metode untuk mengambil total makanan dari semua binatang
     */
    public void totalFood() {
        for(int i = 0; i < animal_.size(); i++){
            System.out.println(animal_.get(i).getName() + " eats " + animal_.get(i).getTotalFood());
        }
    }

    /** AddAnimal
     * @param Animal yang berupa masukan
     */
    /*public void <An extends Animal> AddAnimal(An A) {

    }*/
}
