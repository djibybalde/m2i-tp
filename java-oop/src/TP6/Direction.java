package TP6;

import java.util.ArrayList;
import java.util.Calendar;

class Direction {
    private final ArrayList<PersonnelManagement> UNIV_PERSONNEL;

    public Direction() {
        this.UNIV_PERSONNEL = new ArrayList<PersonnelManagement>();
    }

    public void add(PersonnelManagement person) {
        if (person != null) UNIV_PERSONNEL.add(person);
    }

    public void describe() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int countYear = 0;
        int countStudent = 0;
        for (PersonnelManagement p : UNIV_PERSONNEL) {
            countYear += (currentYear - p.getYear());
            if (p.isStudent()) countStudent++;
        }
        System.out.println("Parmi les " + UNIV_PERSONNEL.size() + " CLBTiens, " + countStudent + " sont des etudiants.");
        double average = (double) countYear / UNIV_PERSONNEL.size();
        System.out.println("Ils sont ici depuis en moyenne " + average + " ans");
    }

    public void display() {
        System.out.println("Liste des CLBTiens: ");
        for (PersonnelManagement p : UNIV_PERSONNEL) p.display();
    }
}
