
public class ProductDescription {
	int itemID ;
	int price;
	String[] option;
	String description;
	
	
	public ProductDescription(int itemID, int price, String[] option, String description) {
		super();
		this.itemID = itemID;
		this.price = price;
		this.option = option;
		this.description = description;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getOption() {
		return option;
	}
	public void setOption(String[] option) {
		this.option = option;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
