class Car {
    private static final double FUEL_CONSUMPTION = 8; // 8l/100km
    private static final double MAX_FUEL = 50;
    private double fuel;

    void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_FUEL - fuel));
        else
            fuel += additionalFuel;
    }

    void drive() {
        if(fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za mało paliwa na podróż, zatankuj.");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}