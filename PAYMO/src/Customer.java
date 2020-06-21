public class Customer {
    int id;
    Cart c;

    public Customer(int id) {
        this.id = id;
        startShopping();
    }

    public int getID() {
        return this.id;
    }

    public Cart getCart() {
        return this.c;
    }

    public void startShopping() {
        c = new Cart();

    }
}