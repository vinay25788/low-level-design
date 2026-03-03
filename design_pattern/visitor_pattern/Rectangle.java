public class Rectangle implements Shape{

    int length =0, breadth=0;

    Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth()
    {
        return this.breadth;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
