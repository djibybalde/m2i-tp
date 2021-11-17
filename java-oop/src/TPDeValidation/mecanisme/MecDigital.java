package TPDeValidation.mecanisme;

public class MecDigital extends Mecanisme implements DigitalReveilInterface {
    private final String REVEIL;

    public MecDigital(double prix, String heure, String reveil) {
        super(prix, heure);
        this.REVEIL = "un reveil: " + reveil;
    }

    public MecDigital(String heure, String reveil) {
        super(heure);
        this.REVEIL = "un reveil: " + reveil;
    }

    @Override
    public String getDigitalReveil() {
        return REVEIL;
    }

    @Override
    protected String getMecType() {
        return "digital";
    }

    @Override
    public String getCadran() {
        return super.getCadran() + ", " + this.getDigitalReveil();
    }
}
