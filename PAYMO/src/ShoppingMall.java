import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryList catalog= new CategoryList();
		
		
		System.out.print("***********************************\n");
		System.out.print("******** WELCOME TO MAYMO *********\n");
		System.out.print("***********************************\n");
		System.out.print("Please Select Category\n");
		Scanner input = new Scanner(System.in);
		catalog.showCategory();
		System.out.printf("select: ");
		int catalogID=input.nextInt();
		catalog.selectCategory(catalogID);
		System.out.println();
		System.out.printf("select item: ");
		int selectedItem = input.nextInt();
		catalog.showItemDescription(catalogID, selectedItem);
		System.out.println("?이건모지");
		int selectedOption = input.nextInt();
		
	}

}
