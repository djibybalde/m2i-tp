package TP6.student;

public class ExchangeStudent extends Student {
    private final String PREVIOUS_UNIVERSITY;

    public ExchangeStudent(String name, int year, String section, String previousUniversity) {
        super(name, year, section);
        this.PREVIOUS_UNIVERSITY = previousUniversity;
    }

    public ExchangeStudent(String name, int year, String section, double score, String previousUniversity) {
        super(name, year, section, score);
        this.PREVIOUS_UNIVERSITY = previousUniversity;
    }

    public void display() {
        System.out.println("Etudiant d'echange:");
        super.display();
        System.out.println("\tUniversité d'origine : " + this.PREVIOUS_UNIVERSITY);
    }
}
