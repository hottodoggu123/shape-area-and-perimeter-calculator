public class Circle extends Shape {
    private double radius;

    //constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }
    
    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //calculate perimeter
    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter of the circle is %.4f\n", perimeter);
        return perimeter;
    }

    //calculate area
    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle is %.4f\n", area);
        return area;
    }
}