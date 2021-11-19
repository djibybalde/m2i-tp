package TP6;

import TP6.personnel.*;
import TP6.student.*;

public class Main {
    public static void main(String[] args) {
        Direction direction = new Direction();
        direction.add(new RegularStudent("Christian Lisangola", 2018, "SSC", 17));
        direction.add(new RegularStudent("Lionel Messi", 2016, "SSC", 15));
        direction.add(new ExchangeStudent("Alexandro Del Pierro", 2017, "Informatique", "KTH"));
        direction.add(new Professor("Lance Armstrong", 2015, "LMEP", 10000, "Physique"));
        direction.add(new Secretary("Sophie Scribona", 2013, "LMT", 5000));
        direction.describe();
        direction.display();
    }
}