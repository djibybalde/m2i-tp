package TP6.personnel;

public class Professor extends Personnel {
    private final String SECTION;

    public Professor(String name, int year, String laboratory, int salary, String section) {
        super(name, year, laboratory, salary);
        this.SECTION = section;
    }

    @Override
    public void display() {
        System.out.println("Enseignant:");
        super.display();
        System.out.println("\tSection d'enseignement : " + this.SECTION);
    }
}