package TP6.personnel;

import TP6.PersonnelManagement;

class Personnel extends PersonnelManagement {
    private final String LABORATORY;
    private final int SALARY;

    public Personnel(String name, int year, String laboratory, int salary) {
        super(name, year);
        this.LABORATORY = laboratory;
        this.SALARY = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\tLaboratoire : " + this.LABORATORY + "\n" + "\tSalaire : " + this.SALARY);
    }
}