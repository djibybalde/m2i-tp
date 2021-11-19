package TP6;

public class PersonnelManagement {
    private final String NAME;
    private final int YEAR;

    public PersonnelManagement(String name, int year) {
        this.NAME = name;
        this.YEAR = year;
    }

    public int getYear() {
        return YEAR;
    }

    public boolean isStudent() {
        return false;
    }

    public void display() {
        System.out.println("\tNom : " + this.NAME + "\n" + "\tAnnee : " + this.YEAR);
    }
}
