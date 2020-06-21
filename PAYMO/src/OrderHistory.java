import java.util.ArrayList;

public class OrderHistory {
    ArrayList<Order> orders;

    public OrderHistory() {

    }

    // add new Order to Arraylist
    public void addOrder(Order o) {
        orders.add(o);
    }

    public ArrayList<Order> getOrder() {
        return this.orders;
    }

    public void showOrderHistory() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.print(orders.get(i).total + " ");
        }
        System.out.print("\n");
    }

    public void testSetOrders() {
        String[] o = { "s", "xl" };
        OrderLineItem oli = new OrderLineItem(1, 13000, 2, "OMG!", 13000, o, 2);
        Order ordertest = new Order(12, oli, "done");
        orders.add(ordertest);
    }
}
