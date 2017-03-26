package ensure.cell;

import ensure.animal.Animal;

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
    protected Animal animal;

    public Cell() {
        LocX = 0;
        LocY = 0;
        type = "";
        name = "";
        animal = null;
        cage_id = 0;
    }

    public <A extends Animal> Cell(int x, int y, String type_, A a, int id, String name_) {
        LocX = x;
        LocY = y;
        type = type_;
        if(a instanceof Animal) {
            animal = a;
        } else {
            animal = null;
        }
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

    Animal getAnimal(){
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

    public <A extends Animal> void setAnimalPtr(A a) {
        animal = a;
    }

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
