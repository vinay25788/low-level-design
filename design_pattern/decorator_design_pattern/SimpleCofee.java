public class SimpleCofee implements Coffee{


    @Override
    public String getDescription()
    {
        return "simple coffee";
    }

    @Override
    public int getCost()
    {
        return 10;
    }
}
