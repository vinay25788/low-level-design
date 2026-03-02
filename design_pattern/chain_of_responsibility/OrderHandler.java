public interface OrderHandler {

    void setNext(OrderHandler order);
    void handle(Order order);
}
