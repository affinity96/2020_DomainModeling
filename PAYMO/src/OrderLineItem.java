
public class OrderLineItem {

	
	int quantity = 0;
	int itemPrice = 0;
	int itemID = 0;
	String description;
	int price;
	String[] option;
	int selectedOptionIndex;
	
	public OrderLineItem(int quantity, int itemPrice, int itemID, String description, int price, String[] option, int selectedOptionIndex) {
		super();
		this.quantity = quantity;
		this.itemPrice = itemPrice;
		this.itemID = itemID;
		this.description = description;
		this.price = price;
		this.option = option;
		this.selectedOptionIndex = selectedOptionIndex;
		goToCart();
	}
	
	public void goToCart() {
	//	Cart cart = new Cart( quantity, itemPrice, itemID,  description,price,  option, selectedOptionIndex)
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	

	
	

}
