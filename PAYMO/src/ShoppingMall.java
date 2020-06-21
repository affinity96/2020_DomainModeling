import java.util.Scanner;

public class ShoppingMall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Seller seller = new Seller();
		CategoryList catalog = new CategoryList();
		Scanner input = new Scanner(System.in);

		System.out.print("***********************************\n");
		System.out.print("******** WELCOME TO PAYMO *********\n");
		System.out.print("***********************************\n");
		System.out.println(" ________< R O L E >________");
		System.out.println(" 1. Customer               ");
		System.out.println(" 2. Seller                 ");
		System.out.println(" ---------------------------");
		System.out.print("Please Select Role: ");
		int selectedRole = input.nextInt();

		if (selectedRole == 1) {
			System.out.println(" ________< LOG IN >_________");
			System.out.print("Please Enter ID (INT) : ");
			int customerID = input.nextInt();

			/* CUSTOMER 객체 생성해야함 */
			System.out.print("____________< CATEGORY >____________\n");
			catalog.showCategory();
			System.out.printf("Please Select Category: ");
			int catalogID = input.nextInt();
			catalog.selectCategory(catalogID);
			System.out.print("____________< ITEM LIST >____________\n");

			System.out.println();
			System.out.printf("Please Select Item: ");
			int selectedItem = input.nextInt();
			catalog.showItemDescription(catalogID, selectedItem);
			int selectedOption = input.nextInt();

		} else if (selectedRole == 2) {
			System.out.print("Please Enter ID (INT) : ");
			int sellerID = input.nextInt();
			seller.setSellerID(sellerID);
			System.out.print("____________< OrderList >____________\n");
			System.out.println();

			/* seller part */
		}
	}
}
