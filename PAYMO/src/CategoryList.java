
public class CategoryList {
	
	ProductCatalog[] productCatalog=new ProductCatalog[5];
	
	public CategoryList() {
		
		String[] category = {"Top", "Bottom", "Accesary", "etc", "onepiece"};
	 
		for(int i=0; i<category.length; i++) {
			ProductCatalog p = new ProductCatalog(i,category[i]);
			productCatalog[i] =p;
		}
		
		
	}
	public void showItemDescription(int index, int selectedItemId) {
//		this.productCatalog.
//			System.out.print
			productCatalog[index].getItemDescription(selectedItemId);
			
		}
	public void selectCategory(int index) {
//	this.productCatalog.
//		System.out.print
		productCatalog[index].getItemlist();
		
	}
	public void showCategory() {
		for(int i=0; i<this.productCatalog.length; i++) {
			System.out.print(" "+this.productCatalog[i].CatalogID+" "+this.productCatalog[i].CatalogName);
		}
		System.out.println();
	}
}
