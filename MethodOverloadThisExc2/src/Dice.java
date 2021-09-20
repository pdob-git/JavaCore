import java.util.Random;

class Dice {
    int top;

    Dice() {
        roll();
    }

    Dice(int top) {
        this.top = top;
    }

    void roll() {
        Random random = new Random();
        top = random.nextInt(6) + 1;
    }

    void printInfo() {
        System.out.println("Liczba oczek na kostce: " + top);
    }
}