import java.util.Arrays;
import java.util.Scanner;

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
	
	public void selectOption(String[] option ) {
		Scanner sc = new Scanner(System.in);
		System.out.printf(" Please Select Option : ");
		String selectedOption = sc.nextLine();
		
		int selectedOptionIndex = Arrays.asList(option).indexOf(selectedOption);
		while(true) {
			if(selectedOptionIndex == -1) {
				System.out.println("[Error] Unvalid option insert.");
			}else {
				Item selectedItem = new Item(this.getItemID(), this.getPrice(),
						this.getOption(), this.getDescription(), selectedOptionIndex);
				break;
			}
		}
		
	}
	
}
