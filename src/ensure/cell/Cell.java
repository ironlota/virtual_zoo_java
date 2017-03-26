package ensure.cell;

/**
 * @class Cell
 * Cell merupakan container dan parent dari kelas-kelas yang merepresentasikan satu kotak pada zoo
 *
 * Created by rayandrew on 3/25/2017.
 */
abstract public class Cell {
    protected int LocX, LocY;
    protected String name="",type;
    protected int cage_id;

    public Cell() {
        LocX = 0;
        LocY = 0;
        type = "";
        name = "";
        cage_id = 0;
    }

    public Cell(int x, int y, String type_, int id, String name_) {
        LocX = x;
        LocY = y;
        type = type_;
        //animalPtr = A;
        cage_id = id;
        name = name_;
    }

    public int getLocX() {
        return LocX;
    }

    public int getLocY() {
        return LocY;
    }

    public String getCellType(){
        return type;
    }

    //Animal getAnimalPtr(){
        //return animalPtr;
    //}

    public int getCageId () {
        return cage_id;
    }

    public void setLocX(int x) {
        LocX = x;
    }

    public void setLocY(int y) {
        LocY = y;
    }

    public void setType(String s) {
        type = s;
    }

   // public void setAnimalPtr(Animal* A) {
    //    animalPtr = A;
    //}

    public void getCageId(int i) {
        cage_id = i;
    }

    public void setName(String name_) {
        name = name_;
    }
    /** @brief GetName
     * Setter variable name
     */
    public String setName() {
        return name;
    }
}
