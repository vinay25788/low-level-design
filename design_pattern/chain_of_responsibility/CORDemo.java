public class CORDemo {

    public static void main(String[] args) {
        OrderHandler cashier = new Cashier();
        OrderHandler manager = new Manager();
        OrderHandler owner = new Owner();

        cashier.setNext(manager);   // ✅ must compile
        manager.setNext(owner);

        Order order = new Order(2500);
        cashier.handle(order);
    }
}
