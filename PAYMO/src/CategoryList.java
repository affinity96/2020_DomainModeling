
public class CategoryList {

	ProductCatalog[] productCatalog = new ProductCatalog[5];

	public CategoryList() {

		String[] category = { "Top", "Bottom", "Accesary", "etc", "onepiece" };

		for (int i = 0; i < category.length; i++) {
			ProductCatalog p = new ProductCatalog(i, category[i]);
			productCatalog[i] = p;
		}

	}

	public void showItemDescription(int categoryID, int selectedItemId) {
		// this.productCatalog.
		// System.out.print
		productCatalog[categoryID].getItemDescription(selectedItemId);

	}

	public void selectCategory(int categoryID) {
		// this.productCatalog.
		// System.out.print
		productCatalog[categoryID].getItemlist();

	}

	public void showCategory() {
		for (int i = 0; i < this.productCatalog.length; i++) {
			System.out.print(" " + this.productCatalog[i].CatalogID + " " + this.productCatalog[i].CatalogName);
		}
		System.out.println();
	}
}
