package app;

import controller.PointController;
import data.Point;

public class PointApplication {
    public static void main(String[] args) {
        PointController pointController = new PointController();
        Point point = new Point(10,20);

        System.out.println(point);

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;
        switch (option) {
            case addX:
                pointController.addX(point);
                break;
            case addY:
                pointController.addY(point);
                break;
            case minusX:
                pointController.minusX(point);
                break;
            case minusY:
                pointController.minusY(point);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }
        System.out.println(point);
    }
}
