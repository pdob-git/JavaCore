package app;

import controller.PointController;
import data.Point;

public class PointApplication {
    public static void main(String[] args) {
        PointController pointController = new PointController();
        Point point = new Point(1,1);

        System.out.println(point);

        pointController.addX(point);
        System.out.println(point);
        pointController.addY(point);
        System.out.println(point);
        pointController.minusX(point);
        System.out.println(point);
        pointController.minusY(point);
        System.out.println(point);

    }
}
