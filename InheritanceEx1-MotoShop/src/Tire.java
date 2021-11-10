public class Tire extends Part {
    private int size;
    private double width;

    public Tire() {
    }

    public Tire(int serialNumber, String producer, String model, String series, int size, double width) {
        super(serialNumber, producer, model, series);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String info() {
        return super.info() +
                ", " + this.size +
                ", " + this.width;
    }
}
