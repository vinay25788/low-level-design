public class Circle implements  Shape{

   int radius;
   Circle(int radius)
   {
       this.radius = radius;
   }

   public int getRadius()
   {
       return this.radius;
   }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
