import java.util.Date;
import java.util.ArrayList;

public class Order {
    int ordererID;
    String dateTime;
    int total;
    String OrderStatus;
    ArrayList<OrderLineItem> orderlineitem;

    // 다수의 order line item 들어옵니다
    public Order(int ordererID, ArrayList<OrderLineItem> orderlineitem, String OrderStatus) {
        this.ordererID = ordererID;
        Date d = new Date();
        System.out.println(d.toString());
        this.dateTime = d.toString();
        this.orderlineitem = orderlineitem;
        this.OrderStatus = OrderStatus;
    }

    // 하나의 order line item 들어옵니다
    public Order(int ordererID, OrderLineItem oli, String OrderStatus) {
        this.orderlineitem = new ArrayList<>();
        Date d = new Date();
        this.dateTime = d.toString();
        System.out.println(d.toString());
        this.orderlineitem.add(oli);
        this.OrderStatus = OrderStatus;
        this.total = oli.itemPrice;
    }

    public void showOrderDetails() {
        System.out.print("[" + this.ordererID + "]\n");
        System.out.print("[" + this.dateTime + "]\n");
        System.out.print("[" + this.total + "]\n");
        System.out.print("[" + this.OrderStatus + "\\n");
    }
}