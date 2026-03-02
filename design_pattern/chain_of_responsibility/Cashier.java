class Cashier extends BaseHandler {


    public void handle(Order order) {
        System.out.println("Cashier checked order.");
        forward(order);
    }
}