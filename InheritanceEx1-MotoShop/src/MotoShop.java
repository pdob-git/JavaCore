//123, SuperTire, ProContact, Winter pro, 17, 225.0
//987, Noisy Parts, Turbo Brum, Noisy Exhaust, true

public class MotoShop {
    public static void main(String[] args) {
        Tire tire = new Tire(123, "SuperTire", "ProContact", "Winter pro", 17,
                225.0);
        ExhaustPart exhaustPart = new ExhaustPart(987, "Noisy Parts", "Turbo Brum",
                "Noisy Exhaust", true);

        System.out.println(tire.info());
        System.out.println(exhaustPart.info());
    }
}
