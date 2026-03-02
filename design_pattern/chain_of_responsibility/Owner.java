public class Owner extends BaseHandler{

    @Override
    public void handle(Order order)
    {
        if(order.amount >2000)
        {
            System.out.println("owner approved");
        }
    }
}
