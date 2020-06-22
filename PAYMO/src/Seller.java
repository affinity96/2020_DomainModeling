public class Seller {
    int sellerID;
    OrderHistory oh = new OrderHistory();;

    public Seller() {
        System.out.print("***********************************\n");

    }

    public void setSellerID(int ID) {
        this.sellerID = ID;
    }

    public void showHistory() {
        this.oh.showOrderHistory();

    }

    public void showSelectedHistory(int index) {
        this.oh.showSelectedOrder(index);

    }

}
