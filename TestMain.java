import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestMain {
    public static void main(String[] args) {
        boolean continueProgram;

        do {
            String[] shapes = { "Circle", "Rectangle", "Triangle" };

            String selectedShape = (String) JOptionPane.showInputDialog(null, "Choose a shape:",
                    "Shape Selection", JOptionPane.QUESTION_MESSAGE, null, shapes, shapes[0]);

            if (selectedShape == null) {
                JOptionPane.showMessageDialog(null, "No shape selected. Ending program.");
                System.exit(0);
            }

            switch (selectedShape) {
                case "Circle":
                    boolean validCircleInput = false;
                    while (!validCircleInput) {
                        JTextField radiusField = new JTextField();
                        Object[] circleMessage = { "Enter the radius of the circle:", radiusField };
                        int circleOption = JOptionPane.showConfirmDialog(null, circleMessage, "Circle Input", JOptionPane.OK_CANCEL_OPTION);

                        if (circleOption == JOptionPane.OK_OPTION) {
                            try {
                                double radius = Double.parseDouble(radiusField.getText());
                                Circle circle = new Circle(radius);

                                String circleOutput = "<html>"
                                        + "<b>Shape:</b> " + circle.getName() + "<br><br>"
                                        + "<b>Perimeter:</b> " + String.format("%.4f", circle.calculatePerimeter()) + "<br>"
                                        + "<b>Area:</b> " + String.format("%.4f", circle.calculateArea())
                                        + "</html>";

                                JOptionPane.showMessageDialog(null, circleOutput, "Circle Output", JOptionPane.INFORMATION_MESSAGE);
                                validCircleInput = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid numeric value for the radius.");
                            }
                        } else {
                            break;
                        }
                    }
                    break;

                case "Rectangle":
                    boolean validRectangleInput = false;
                    while (!validRectangleInput) {
                        JTextField lengthField = new JTextField();
                        JTextField widthField = new JTextField();
                        Object[] rectangleMessage = {
                            "Enter the length of the rectangle:", lengthField,
                            "Enter the width of the rectangle:", widthField
                        };
                        int rectangleOption = JOptionPane.showConfirmDialog(null, rectangleMessage, "Rectangle Input", JOptionPane.OK_CANCEL_OPTION);

                        if (rectangleOption == JOptionPane.OK_OPTION) {
                            try {
                                double length = Double.parseDouble(lengthField.getText());
                                double width = Double.parseDouble(widthField.getText());
                                Rectangle rectangle = new Rectangle(length, width);

                                String rectangleOutput = "<html>"
                                        + "<b>Shape:</b> " + rectangle.getName() + "<br><br>"
                                        + "<b>Perimeter:</b> " + String.format("%.4f", rectangle.calculatePerimeter()) + "<br>"
                                        + "<b>Area:</b> " + String.format("%.4f", rectangle.calculateArea())
                                        + "</html>";

                                JOptionPane.showMessageDialog(null, rectangleOutput, "Rectangle Output", JOptionPane.INFORMATION_MESSAGE);
                                validRectangleInput = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numeric values for length and width.");
                            }
                        } else {
                            break;
                        }
                    }
                    break;

                case "Triangle":
                    boolean validTriangleInput = false;
                    while (!validTriangleInput) {
                        JTextField side1Field = new JTextField();
                        JTextField side2Field = new JTextField();
                        JTextField side3Field = new JTextField();
                        Object[] triangleMessage = {
                            "Enter the first side of the triangle:", side1Field,
                            "Enter the second side of the triangle:", side2Field,
                            "Enter the third side of the triangle:", side3Field
                        };
                        int triangleOption = JOptionPane.showConfirmDialog(null, triangleMessage, "Triangle Input", JOptionPane.OK_CANCEL_OPTION);

                        if (triangleOption == JOptionPane.OK_OPTION) {
                            try {
                                double side1 = Double.parseDouble(side1Field.getText());
                                double side2 = Double.parseDouble(side2Field.getText());
                                double side3 = Double.parseDouble(side3Field.getText());
                                Triangle triangle = new Triangle(side1, side2, side3);

                                String triangleOutput = "<html>"
                                        + "<b>Shape:</b> " + triangle.getName() + "<br><br>"
                                        + "<b>Perimeter:</b> " + String.format("%.4f", triangle.calculatePerimeter()) + "<br>"
                                        + "<b>Area:</b> " + String.format("%.4f", triangle.calculateArea())
                                        + "</html>";

                                JOptionPane.showMessageDialog(null, triangleOutput, "Triangle Output", JOptionPane.INFORMATION_MESSAGE);
                                validTriangleInput = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numeric values for the sides of the triangle.");
                            }
                        } else {
                            break;
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid shape selected.");
                    break;
            }

            int retryOption = JOptionPane.showConfirmDialog(null, "Do you want to try another shape?", "Continue?", JOptionPane.YES_NO_OPTION);
            continueProgram = (retryOption == JOptionPane.YES_OPTION);

        } while (continueProgram);

        JOptionPane.showMessageDialog(null, "End of the program");
    }
}