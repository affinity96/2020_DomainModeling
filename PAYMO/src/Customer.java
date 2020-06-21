public class Customer {
    int id;
    Cart cart;

    public Customer(int id) {
        this.id = id;
        startShopping();
    }

    public int getID() {
        return this.id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void startShopping() {
        cart = new Cart();

    }
}