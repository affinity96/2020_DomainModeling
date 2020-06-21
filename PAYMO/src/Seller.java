public class Seller {
    int sellerID;
    OrderHistory oh;

    public Seller() {
        oh = new OrderHistory();
    }

    public void setSellerID(int ID) {
        this.sellerID = ID;
    }

    // Order history
    public void initialize_OH_for_test() {

    }

}