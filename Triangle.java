public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getter side1
    public double getSide1() {
        return side1;
    }

    //setter side1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //getter side2
    public double getSide2() {
        return side2;
    }

    //setter side2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //getter side3
    public double getSide3() {
        return side3;
    }

    //setter side3
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //calculate perimeter
    @Override
    public double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.printf("Perimeter of the triangle is %.4f\n", perimeter);
        return perimeter;
    }

    //calculate area
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("Area of the triangle is %.4f\n", area);
        return area;
    }
}