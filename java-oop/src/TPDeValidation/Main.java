package TPDeValidation;

import TPDeValidation.accessoire.*;
import TPDeValidation.mecanisme.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println();
        MecAnalogique analogique = new MecAnalogique(now.format(time), now.format(date));
        Montre montreAnalogique = new Montre(2, analogique);
        montreAnalogique.add(new Bracelet("cuir", 10));
        montreAnalogique.add(new Fermoir("en acier", 5));
        montreAnalogique.add(new Boitier("en acier", 15));
        montreAnalogique.add(new Vitre("en verre de quartz", 20));
        montreAnalogique.display();

        System.out.println();
        MecDigital digital = new MecDigital(10, now.format(time), "06:00");
        Montre montreDigital = new Montre(70, digital);
        montreDigital.add(new Bracelet("cuir", 20));
        montreDigital.add(new Boitier("en acier", 25));
        montreDigital.display();

        System.out.println();
        MecDouble double_ = new MecDouble(49.99, now.format(time), now.format(date), "06:00");
        Montre montreDouble = new Montre(100, double_);
        montreDouble.add(new Bracelet("nato gris", 17.80));
        montreDouble.add(new Fermoir("en acier", 15));
        montreDouble.add(new Boitier("en acier", 30));
        montreDouble.add(new Vitre("en verre de quartz", 25));
        montreDouble.display();
    }
}
