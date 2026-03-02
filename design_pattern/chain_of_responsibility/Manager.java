public class Manager extends BaseHandler{



    @Override
    public void handle(Order order) {
        if(order.amount> 1000)
        {
            System.out.println("manager approved");
        }

        forward(order);
    }
}
