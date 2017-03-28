package ensure;



/**
 * @class Cell
 * Cell merupakan container dan parent dari kelas-kelas yang merepresentasikan satu kotak pada zoo
 *
 * Created by Girvandi on 3/25/2017.
 */
public class Cell {
    protected int LocX, LocY;
    protected String name,type;
    protected int cage_id;
    protected Animal animal;
    protected char symbol;

    public Cell() {
        LocX = 0;
        LocY = 0;
        type = "";
        name = "";
        symbol = ' ';
        animal = null;
        cage_id = 0;
    }

    public Cell(int x, int y, String type_, Animal a, int id, String name_, char symbol_) {
        LocX = x;
        LocY = y;
        type = type_;
        cage_id = id;
        animal = a;
        name = name_;
        symbol = symbol_;
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

    public Animal getAnimal(){
        return animal;
    }

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

    public void setAnimalPtr(Animal a) {
        animal = a;
    }

    public void setCageId(int i) {
        cage_id = i;
    }

    public void setName(String name_) {
        name = name_;
    }
    /** @brief GetName
     * Setter variable name
     */
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
