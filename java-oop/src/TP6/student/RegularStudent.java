package TP6.student;

public class RegularStudent extends Student {

    public RegularStudent(String name, int year, String section, double score) {
        super(name, year, section, score);
    }

    @Override
    public void display() {
        System.out.println("Etudiant regulier:");
        super.display();
        System.out.println("\tMoyenne : " + super.getScore());
    }
}
