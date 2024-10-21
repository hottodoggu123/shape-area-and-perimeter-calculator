public class Shape {
    private String name;

    //constructor
    public Shape(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //calculate perimeter
    public double calculatePerimeter() {
        System.out.println("Calculating perimeter of " + name);
        return 0;
    }

    //calculate area
    public double calculateArea() {
        System.out.println("Calculating area of " + name);
        return 0;
    }

}