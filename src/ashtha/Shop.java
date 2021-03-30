package ashtha;

public class Shop {

	int initialMaggieStocks;
	int initialDosaStocks;
	int initialPouchesStocks;
	int initialPanipuriStocks;
	int initialMasalaStocks;
	
	/*method to set the inventory values*/
	void setInventory (int maggieStock, int dosaStock, int pouchesStock, int panipuriStock, int masalaStock) {
		initialMaggieStocks = maggieStock;
		initialDosaStocks = dosaStock;
		initialPouchesStocks = pouchesStock;
		initialPanipuriStocks = panipuriStock;
		initialMasalaStocks = masalaStock;
	}
	
	/*method to update the inventory value*/
	void updateInventory (int requestedMaggieQty, int requestedDosaQty, int requestedPouchesQty, int requestedPanipuriQty, int requestedMasalaQty, boolean partial) {
		/* to update maggie stock*/
		if (initialMaggieStocks >= requestedMaggieQty) {
			initialMaggieStocks = initialMaggieStocks - requestedMaggieQty;
		}else if (initialMaggieStocks == 0) {
			System.out.println("Maggie is currently out of stock");
		}else if (true) {
			System.out.println("You requested for "+requestedMaggieQty +" maggie packets but only "+initialMaggieStocks+" packets available in stock. Do you want to proceed with the cart?");
			System.out.println("Order placed successfully for "+initialMaggieStocks +" maggie packets.");
			initialMaggieStocks = 0;
		}
		/*to update Dosa stock*/
		if (initialDosaStocks >= requestedDosaQty) {
			initialDosaStocks = initialDosaStocks - requestedDosaQty;
		}else if (initialDosaStocks == 0) {
			System.out.println("Dosa is currently out of stock");
		}else if (true) {
			System.out.println("You requested for "+requestedDosaQty +" dosa but only "+initialDosaStocks+" available in stock. Do you want to proceed with the cart?");
			System.out.println("Order placed successfully for "+initialDosaStocks +" dosa.");
			initialDosaStocks = 0;
		}
		/*to update Pouches stock*/
		if (initialPouchesStocks >= requestedPouchesQty) {
			initialPouchesStocks = initialPouchesStocks - requestedPouchesQty;
		}else if (initialPouchesStocks == 0) {
			System.out.println("Pouches are currently out of stock");
		}else if (true) {
			System.out.println("You requested for "+requestedPouchesQty +" oil pouches but only "+initialPouchesStocks+" available in stock. Do you want to proceed with the cart?");
			System.out.println("Order placed successfully for "+initialPouchesStocks +" oil pouches.");
			initialPouchesStocks = 0;
		}
		/*to update Panipuri stock*/
		if (initialPanipuriStocks >= requestedPanipuriQty) {
			initialPanipuriStocks = initialPanipuriStocks - requestedPanipuriQty;
		}else if (initialPanipuriStocks == 0) {
			System.out.println("Panipuri is currently out of stock");
		}else if (true) {
			System.out.println("You requested for "+ requestedPanipuriQty +" panipuri but only "+initialPanipuriStocks+" available in stock. Do you want to proceed with the cart?");
			System.out.println("Order placed successfully for "+initialPanipuriStocks +" panipuri.");
			initialPanipuriStocks = 0;
		}
		/*to update Masala stock*/
		if (initialMasalaStocks >= requestedMasalaQty) {
			initialMasalaStocks = initialMasalaStocks - requestedMasalaQty;
		}else if (initialMasalaStocks == 0) {
			System.out.println("Masala is currently out of stock");
		}else if (true) {
			System.out.println("You requested for "+ requestedMasalaQty +" masala packets but only "+initialMasalaStocks+" available in stock. Do you want to proceed with the cart?");
			System.out.println("Order placed successfully for "+initialMasalaStocks +" masala packets.");
			initialMasalaStocks = 0;
		}
	}
	
	/* Method to display out of stock items*/
	void displayOutOfStockItems () {
		System.out.println("Out of stock items are :");
		if (initialMaggieStocks == 0) {
			System.out.println("Maggie");
		}
		if (initialDosaStocks == 0) {
			System.out.println("Dosa");
		}
		if (initialPouchesStocks == 0) {
			System.out.println("Pouches");
		}
		if (initialPanipuriStocks == 0) {
			System.out.println("Panipuri");
		}
		if (initialMasalaStocks == 0) {
			System.out.println("Masala");
		}
	}
	
	/*Method to display available items*/
	void displayAvailableInStockItem () {
		System.out.println("Items available in stock are :");
		if (initialMaggieStocks > 0) {
			System.out.println("Maggie, Available Quantity: "+initialMaggieStocks);
		}
		if (initialDosaStocks > 0) {
			System.out.println("Dosa, Available Quantity: "+initialDosaStocks);
		}
		if (initialPouchesStocks > 0) {
			System.out.println("Pouches, Available Quantity: "+initialPouchesStocks);
		}
		if (initialPanipuriStocks > 0) {
			System.out.println("Panipuri, Available Quantity: "+initialPanipuriStocks);
		}
		if (initialMasalaStocks > 0) {
			System.out.println("Masala, Available Quantity: "+initialMasalaStocks);
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInventory(50,100,30,150,0);
		shop.updateInventory(70,80,23,200,3,true);
		shop.displayOutOfStockItems();
		shop.displayAvailableInStockItem();
	}
}
