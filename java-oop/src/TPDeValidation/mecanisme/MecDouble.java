package TPDeValidation.mecanisme;

public class MecDouble extends MecAnalogique implements DigitalReveilInterface {
    private final String REVEIL;

    public MecDouble(double prix, String heure, String date, String reveil) {
        super(prix, heure, date);
        this.REVEIL = "un reveil: " + reveil;
    }

    public MecDouble(String heure, String date, String reveil) {
        super(heure, date);
        this.REVEIL = "un reveil: " + reveil;
    }

    @Override
    protected String getMecType() {
        return "double";
    }

    @Override
    public String getDigitalReveil() {
        return REVEIL;
    }

    @Override
    public String getCadran() {
        return super.getCadran() + ", " + this.getDigitalReveil();
    }
}
