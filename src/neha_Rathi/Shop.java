/*
 * Assignment7 
 * Create a system (Shop) which maintains each item's quantity.
 */
package neha_Rathi;

public class Shop {
	int maggieQ;
	int dosaQ;
	int pouchesQ;
	int panipuriQ;
	int masalaQ;

	void intialQ(int maggieQuantity, int dosaQuantityQ, int pouchesQuantity, int panipuriQuantity, int masalaQuantity) {
		maggieQ = maggieQuantity;
		dosaQ = dosaQuantityQ;
		pouchesQ = pouchesQuantity;
		panipuriQ = panipuriQuantity;
		masalaQ = masalaQuantity;
	}

	void requestedQ(boolean reqType, int maggieQuantity, int dosaQuantity, int pouchesQuantity, int panipuriQuantity,
			int masalaQuantity) {
		if (maggieQ < 1) {
			System.out.println("Sorry Maggie running out of stock");
		} else if (maggieQ >= maggieQuantity) {
			System.out.println("We served your request for maggie");
			maggieQ = maggieQ - maggieQuantity;
		} else if (reqType) {
			System.out.println("We served your request for maggie partially & quantity provided is: " + maggieQ);
			maggieQ = 0;
		}
		if (dosaQ < 1) {
			System.out.println("Sorry Dosa running out of stock");
		} else if (dosaQ >= dosaQuantity) {
			System.out.println("We served your request for Dosa with quantity: " + dosaQuantity);
			dosaQ = dosaQ - dosaQuantity;
		} else if (reqType) {
			System.out.println("We served your request for dosa partially& quantity provided is: " + dosaQ);
			dosaQ = 0;
		}
		if (pouchesQ < 1) {
			System.out.println("Sorry pouches running out of stock");
		} else if (pouchesQ >= pouchesQuantity) {
			System.out.println("We served your request for pouches with quantity: " + pouchesQuantity);
			pouchesQ = pouchesQ - pouchesQuantity;
		} else if (reqType) {
			System.out.println("we served your request for pouches partially & quantity provided is: " + pouchesQ);
			pouchesQ = 0;
		}
		if (panipuriQ < 1) {
			System.out.println("Sorry panipuri running out of stock");
		} else if (panipuriQ >= panipuriQuantity) {
			System.out.println("We served your request for panipuri with quantity: " + panipuriQuantity);
			panipuriQ = panipuriQ - panipuriQuantity;
		} else if (reqType) {
			System.out.println("We served your request for panipuri partially & quantity provided is: " + panipuriQ);
			panipuriQ = 0;
		}
		if (masalaQ < 1) {
			System.out.println("Sorry masala running out of stock");
		} else if (masalaQ >= masalaQuantity) {
			System.out.println("We served your request for masala with quantity: " + masalaQuantity);
			masalaQ = masalaQ - masalaQuantity;
		} else if (reqType) {
			System.out.println("We served your request for masala partially & quantity provided is: " + masalaQ);
			masalaQ = 0;
		}
	}

	void outOfStockItem() {
		if (maggieQ < 1)
			System.out.println("Maggie");
		if (dosaQ < 1)
			System.out.println("Dosa");
		if (pouchesQ < 1)
			System.out.println("Pouches");
		if (panipuriQ < 1)
			System.out.println("Panipuri");
		if (masalaQ < 1)
			System.out.println("Masala");
	}

	void availableStockItem() {
		if (maggieQ > 0)
			System.out.println("Maggie Quantity is: " + maggieQ);
		if (dosaQ > 0)
			System.out.println("Dosa Quantity is: " + dosaQ);
		if (pouchesQ > 0)
			System.out.println("Pouches Quantity is: " + pouchesQ);
		if (panipuriQ > 0)
			System.out.println("Panipuri Quantity is: " + panipuriQ);
		if (masalaQ > 0)
			System.out.println("Masala Quantity is: " + masalaQ);
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.intialQ(10, 43, 0, 45, 73);
		shop.requestedQ(true, 60, 22, 32, 45, 55);
		System.out.println("----------------------------------------------------");
		System.out.println("List of items Available:");
		shop.availableStockItem();
		System.out.println("----------------------------------------------------");
		System.out.println("List of items running out of Stock:");
		shop.outOfStockItem();
	}

}
