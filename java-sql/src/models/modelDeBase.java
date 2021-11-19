package models;

abstract public class modelDeBase {
    private int id;

    public modelDeBase(int id) {
        this.id = id;
    }
    public modelDeBase() {
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
