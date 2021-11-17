package TPDeValidation.mecanisme;

public class MecAnalogique extends Mecanisme {

    private final String DATE;

    public MecAnalogique(double prix, String heure, String date) {
        super(prix, heure);
        this.DATE = "une date: " + date;
    }

    public MecAnalogique(String heure, String date) {
        super(heure);
        this.DATE = "une date: " + date;
    }

    public String getDate() {
        return this.DATE;
    }

    @Override
    protected String getMecType() {
        return "analogique";
    }

    @Override
    protected String getCadran() {
        return super.getCadran() + ", " + this.getDate();
    }
}
