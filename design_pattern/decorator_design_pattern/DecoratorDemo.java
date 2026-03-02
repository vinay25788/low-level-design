public class DecoratorDemo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCofee();
        System.out.println("description"+ coffee.getDescription() +" "+coffee.getCost());

        Coffee milkCoffee= new MilkDecoratorCoffee(coffee);

        System.out.println("description  "+milkCoffee.getDescription() + "  pice "+ milkCoffee.getCost());

        Coffee sugarAdded  = new SugarDecoratedCofee(milkCoffee);

        System.out.println("description "+ sugarAdded.getDescription() +" price "+sugarAdded.getCost());
    }
}
