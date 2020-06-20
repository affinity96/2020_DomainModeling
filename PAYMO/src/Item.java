import java.util.Scanner;

public class Item {
	
	int itemID;
	int price;
	String[] option;
	String description;
	//여기까지는 product description. 상속을 써야하나 고민중임.
	
	int selectedOptionIndex;
	
	public Item(int itemID, int price, String[] option, String description, int selectedOptionIndex) {
		super();
		this.itemID = itemID;
		this.price = price;
		this.option = option;
		this.description = description;
		this.selectedOptionIndex = selectedOptionIndex;
		getItemQuantity();
	}
	
	public void getItemQuantity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 선택된 상품" + "아이디 " + this.itemID + " 가격"+ this.price +"옵션 "+ this.option[this.selectedOptionIndex]);
		System.out.printf("Please input quantity: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		int itemPrice = this.price*quantity;
		OrderLineItem ol = new OrderLineItem(quantity, itemPrice, this.itemID, this.description, this.price, this.option, this.selectedOptionIndex);
	}

}
