package TP7;

class Transport extends OptionVoyage {
    public final static double LONG_RATE = 1500.0;
    public final static double BASIC_RATE = 200.0;
    private final boolean isLONG;

    public Transport(String name, double price, boolean isLong) {
        super(name, price);
        this.isLONG = isLong;
    }

    public Transport(String name, double price) {
        super(name, price);
        this.isLONG = false;
    }

    @Override
    public double getPrice() {
        return this.isLONG ? super.getPrice() + LONG_RATE : super.getPrice() + BASIC_RATE;
    }
}
