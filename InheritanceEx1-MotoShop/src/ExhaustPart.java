public class ExhaustPart extends Part {
    private boolean europeanStandard;

    public ExhaustPart() {
    }

    public ExhaustPart(int serialNumber, String producer, String model, String series, boolean europeanStandard) {
        super(serialNumber, producer, model, series);
        this.europeanStandard = europeanStandard;
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    @Override
    public String info() {
        return super.info() +
                ", " + this.europeanStandard;
    }
}
