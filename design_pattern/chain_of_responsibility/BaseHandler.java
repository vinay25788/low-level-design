 abstract class BaseHandler implements OrderHandler {

    protected OrderHandler next;

     @Override
    public void setNext(OrderHandler orderHandler)
    {
        this.next = orderHandler;
    }

    protected void forward(Order order)
    {
        if(next != null)
        {
            next.handle(order);
        }
    }
}
