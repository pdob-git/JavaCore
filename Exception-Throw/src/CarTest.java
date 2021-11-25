class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(12);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
        try {
            car.drive();
            car.drive();
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
    }
}