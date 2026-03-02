public class SugarDecoratedCofee extends CoffeeDecorator{


    SugarDecoratedCofee(Coffee coffee)
    {
        super(coffee);
    }

    public String getDescription()
    {
        return "decoratord with Sugar "+ coffee.getDescription();
    }

    public int getCost()
    {
        return 20 + coffee.getCost();
    }
}
