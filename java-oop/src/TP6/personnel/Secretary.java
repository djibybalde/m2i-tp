package TP6.personnel;

public class Secretary extends Personnel {
    public Secretary(String name, int year, String laboratory, int salary) {
        super(name, year, laboratory, salary);
    }

    @Override
    public void display() {
        System.out.println("Secretaire:");
        super.display();
    }
}