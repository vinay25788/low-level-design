public class VisitorPatternDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6)
        };

        // Operation 1: Calculate Area
        System.out.println("---- Area Calculation ----");
        ShapeVisitor areaCalculator = new AreadCalculatorVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }


    }
}
