import java.util.Date;
import java.util.ArrayList;

public class Order {
    int ordererID;
    Date dateTime;
    int total;
    String OrderStatus;
    ArrayList<OrderLineItem> orderlineitem;

    // 다수의 order line item 들어옵니다
    public Order(int ordererID, ArrayList<OrderLineItem> orderlineitem, String OrderStatus) {
        this.dateTime = new Date();
        this.orderlineitem = orderlineitem;
        this.OrderStatus = OrderStatus;
    }

    // 하나의 order line item 들어옵니다
    public Order(int ordererID, OrderLineItem oli, String OrderStatus) {
        this.orderlineitem = new ArrayList<>();
        this.orderlineitem.add(oli);
        this.OrderStatus = OrderStatus;
    }

    public void showOrderDetails() {
        System.out.print("[" + this.ordererID + "]");
        System.out.print("[" + this.dateTime + "\n");
        System.out.print("[" + this.total + "\n");
        System.out.print("[" + this.OrderStatus + "\n");
    }
}