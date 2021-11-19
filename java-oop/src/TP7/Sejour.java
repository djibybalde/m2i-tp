package TP7;

class Sejour extends OptionVoyage {
    private final int NUMBER_OF_NIGHTS;
    private final double NIGHTLY_PRICE;

    public Sejour(String name, double price, int numberOfNights, double nightlyPrice) {
        super(name, price);
        NUMBER_OF_NIGHTS = numberOfNights;
        NIGHTLY_PRICE = nightlyPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (this.NUMBER_OF_NIGHTS * this.NIGHTLY_PRICE);
    }
}
