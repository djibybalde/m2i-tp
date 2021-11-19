package TP7;


import java.util.ArrayList;

class KitVoyage {
    private final ArrayList<OptionVoyage> VOYAGES;
    private final String DEPART;
    private final String DESTINATION;

    public KitVoyage(String depart, String destination) {
        this.VOYAGES = new ArrayList<OptionVoyage>();
        this.DEPART = depart;
        this.DESTINATION = destination;
    }

    public double getPrice() {
        double sumPrice = 0.0;
        for (OptionVoyage ov : VOYAGES) sumPrice += ov.getPrice();
        return sumPrice;
    }

    public void addOption(OptionVoyage ov) {
        if (ov == null) {
            System.out.println("Pas d'ajout d'option");
        } else {
            VOYAGES.add(ov);
        }
    }

    public void cancel() {
        VOYAGES.clear();
    }

    public int getNumberOfOptions() {
        return VOYAGES.size();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Voyage de " + DEPART + " à " + DESTINATION + ", avec pour options : \n");
        for (OptionVoyage ov : VOYAGES) str.append("\t- ").append(ov).append("\n");
        str.append("Prix total : ").append(getPrice()).append(" €\n");
        return str.toString();
    }
}
