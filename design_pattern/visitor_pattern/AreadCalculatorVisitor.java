public class AreadCalculatorVisitor implements ShapeVisitor{


    @Override
    public void visit(Circle circle) {
        System.out.println(" circle area "+ circle.getRadius()* circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectange) {
        System.out.println("reactange area "+rectange.getLength()* rectange.getBreadth());
    }
}
