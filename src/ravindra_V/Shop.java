package ravindra_V;

class Shop {
	int initialMaggieQty;
	int initialDosaQty;
	int initialOilQty;
	int initialPanipuriQty;  
	int initialMasalaQty;

	void setInitialQty(int maggie, int dosa, int oil, int panipuri, int masala) {
	initialMaggieQty = maggie;
	initialDosaQty = dosa;
	initialOilQty = oil;
	initialPanipuriQty = panipuri;  
	initialMasalaQty = masala;
}

	void customerPurchase(int maggieQty, int dosaQty, int oilQty, int panipuriQty, int masalaQty) {
		if (maggieQty > 0 ) {
		if (maggieQty <= initialMaggieQty) {
			System.out.println("Maggie packets sold to the customer are: " + maggieQty);
			initialMaggieQty = initialMaggieQty - maggieQty;
			} else {
			System.out.println("Maggie packets sold to the customer are: " + initialMaggieQty);
			initialMaggieQty = 0;
		}
		} else
		System.out.println("Maggie packets requirement cannot be 0 or less");
	

		if (dosaQty > 0 ) {
		if (dosaQty <= initialDosaQty) {
			System.out.println("Dosa packets sold to the customer are: " + dosaQty);
			initialDosaQty = initialDosaQty - dosaQty;
		} else {
			System.out.println("Dosa packets sold to the customer are: " + initialDosaQty);
			initialDosaQty = 0;
		}
		} 	else
		System.out.println("Dosa packets requirement cannot be 0 or less");
		
		if (oilQty > 0 ) {
		if (oilQty <= initialOilQty) {
			System.out.println("Oil pouches sold to the customer are: " + oilQty);
			initialOilQty = initialOilQty - oilQty;
		} else {
			System.out.println("Oil pouches sold to the customer are: " + initialOilQty);
			initialOilQty = 0;
		}
		} else
		System.out.println("Oil pouch requirement cannot be 0 or less");
	
		if (panipuriQty > 0 ) {
		if (panipuriQty <= initialPanipuriQty) {
			System.out.println("Panipuri packets sold to the customer are: " + panipuriQty);
			initialPanipuriQty = initialPanipuriQty - panipuriQty;
		} else {
			System.out.println("Panipuri packets sold to the customer are: " + initialPanipuriQty);
			initialPanipuriQty = 0;
		}
		} else
		System.out.println("Panipuri packets requirement cannot be 0 or less");
	
		if (masalaQty > 0 ) {
		if (masalaQty <= initialMasalaQty) {
			System.out.println("Panipuri packets sold to the customer are: " + masalaQty);
			initialMasalaQty = initialMasalaQty - masalaQty;
		} else {
			System.out.println("Masala packets sold to the customer are: " + initialMasalaQty);
			initialMasalaQty = 0;
		}
		} else
		System.out.println("Masala packets requirement cannot be 0 or less");
	}

	void outOfStock() {
		System.out.println("\n---List of items which are not in stock---");		
		if (initialMaggieQty == 0)
			System.out.println("Maggie is Out of Stock");
		if (initialDosaQty == 0)
			System.out.println("Dosa is Out of Stock");
		if (initialOilQty == 0)
			System.out.println("Oil is Out of Stock");
		if (initialPanipuriQty == 0)
			System.out.println("Panipuri is Out of Stock");
		if (initialMasalaQty == 0)
			System.out.println("Masala is Out of Stock");
	}
	
	void inStockItems() {
		System.out.println("\n---List of items which are in stock---");	
		if (initialMaggieQty > 0)
			System.out.println("Maggie available in stock: " + initialMaggieQty);
		if (initialDosaQty > 0)
			System.out.println("Dosa available in stock: " + initialDosaQty);
		if (initialOilQty > 0)
			System.out.println("Oil available in stock: " + initialOilQty);
		if (initialPanipuriQty > 0)
			System.out.println("Panipuri available in stock: " + initialPanipuriQty);
		if (initialMasalaQty > 0)
			System.out.println("Masala available in stock: " + initialMasalaQty);
		}
	
	
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.setInitialQty(54, 44, 40, 44, 74);
		shop.customerPurchase(20, 30, 40, 46, -79);
		shop.outOfStock();
		shop.inStockItems();
		
	}
	
}	
