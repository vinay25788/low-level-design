public class MilkDecoratorCoffee extends CoffeeDecorator {

    MilkDecoratorCoffee(Coffee coffee)
    {
        super(coffee);
    }


    public String getDescription()
    {
        return "decorated with milk "+ coffee.getDescription();
    }

    public int getCost()

    {
        return 10+ coffee.getCost();
    }

}
