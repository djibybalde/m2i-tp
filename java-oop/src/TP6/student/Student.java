package TP6.student;

import TP6.PersonnelManagement;

class Student extends PersonnelManagement {
    private final String SECTION;
    private double score;

    public Student(String name, int year, String section, double score) {
        super(name, year);
        this.SECTION = section;
        this.score = score;
    }

    public Student(String name, int year, String section) {
        super(name, year);
        this.SECTION = section;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean isStudent() {
        return true;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\tSection : " + this.SECTION);
    }
}