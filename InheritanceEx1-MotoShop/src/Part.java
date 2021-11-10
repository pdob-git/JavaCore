//Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, przechowuje nazwę producenta, model i serię produktu

public class Part {
    private int serialNumber;
    private String producer;
    private String model;
    private String series;

    public Part() {
    }

    public Part(int serialNumber, String producer, String model, String series) {
        this.serialNumber = serialNumber;
        this.producer = producer;
        this.model = model;
        this.series = series;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String info() {
        return this.serialNumber +
                ", " + this.producer +
                ", " + this.model +
                ", " + this.series;
    }
}




