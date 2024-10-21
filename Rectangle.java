public class Rectangle extends Shape{
    private double length;
    private double width;

    //constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //getter length
    public double getLength() {
        return length;
    }

    //setter length
    public void setLength(double length) {
        this.length = length;
    }

    //getter width
    public double getWidth() {
        return width;
    }

    //setter width
    public void setWidth(double width) {
        this.width = width;
    }

    //calculate perimeter
    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.printf("Perimeter of the rectangle is %.4f\n", perimeter);
        return perimeter;
    }

    //calculate area
    @Override
    public double calculateArea() {
        double area = length * width;
        System.out.printf("Area of the rectangle is %.4f\n", area);
        return area;
    }
}