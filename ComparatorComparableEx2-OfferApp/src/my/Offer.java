package my;

import java.util.Locale;
import java.util.Objects;

public class Offer implements Comparable<Offer> {
    private String city;
    private double price; // price in zł
    private double area; // area in mkw

    public Offer(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPricePerSquareMeter() {
        return this.price / this.area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Double.compare(offer.price, price) == 0 && Double.compare(offer.area, area) == 0 && Objects.equals(city, offer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, price, area);
    }

    @Override
    public int compareTo(Offer o) {
        double pricePerSquareMeterToCompare = o.getPricePerSquareMeter();
        if (getPricePerSquareMeter() > pricePerSquareMeterToCompare) {
            return 1;
        } else if (getPricePerSquareMeter() < pricePerSquareMeterToCompare) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return city + ", " +
                price + "zł, " +
                area + "mkw, " +
                String.format(Locale.US, "%.2f", getPricePerSquareMeter()) + "zł/mkw";
    }

}
