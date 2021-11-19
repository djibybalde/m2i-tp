package TP7;

public class OptionVoyage {
    private final String NAME;
    private final double PRICE;

    public OptionVoyage(String name, double price) {
        this.NAME = name;
        this.PRICE = price;
    }

    public String getName() {
        return NAME;
    }

    public double getPrice() {
        return PRICE;
    }

    @Override
    public String toString() {
        return String.format("%s -> %.2f CHF ", NAME, PRICE);
    }
}
