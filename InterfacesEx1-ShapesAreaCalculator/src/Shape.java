interface Shape {
    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

    double PI = 3.1415;

    // metody są domyślnie publiczne i abstrakcyjne
    public double calculateArea();

    public double calculatePerimeter();

}