/*Assignment  7  : 30th March 2021 

1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/
package aparna.assignment8;

public class Shop {
	int totalMaggiePacks, totalDosaPacks, totalOilPouches, totalPanipuriPacks, totalMasalaPacks;

	void initialStocks(int maggiePack, int dosaPack, int oilPouch, int panipuriPack, int masalaPack) {
		totalMaggiePacks = maggiePack;
		totalDosaPacks = dosaPack;
		totalOilPouches = oilPouch;
		totalPanipuriPacks = panipuriPack;
		totalMasalaPacks = masalaPack;
	}

	void requestedQuantity(int reqMaggiePack, int reqDosaPack, int reqOilPouch, int reqPanipuriPack, int reqMasalaPack,
			boolean partialAllowedStatus) {

		if (totalMaggiePacks != 0 && reqMaggiePack <= totalMaggiePacks) {
			totalMaggiePacks = totalMaggiePacks - reqMaggiePack;
		} else {
			if (partialAllowedStatus) {
				System.out.println("Sorry, not sufficient Maggy Packets quantity available , So we can give you only : "
						+ totalMaggiePacks + " Maggy Packets Only ");
				totalMaggiePacks = 0;

			} else
				System.out.println("Maggy Packets Actual Quantity is: " + totalMaggiePacks
						+ " and requested Quantity is : " + reqMaggiePack + " So could not serve the Demand");
		}

		if (totalDosaPacks != 0 && reqDosaPack <= totalDosaPacks) {
			totalDosaPacks = totalDosaPacks - reqDosaPack;
		} else {
			if (partialAllowedStatus) {
				System.out.println("Sorry, not sufficient Dosa Packets quantity available , So we can give you only : "
						+ totalDosaPacks + " Dosa Packets Only ");
				totalDosaPacks = 0;
			} else
				System.out.println("Dosa Packets Actual Quantity is: " + totalDosaPacks
						+ " and requested Quantity is : " + reqDosaPack + " So could not serve the Demand");

		}

		if (totalOilPouches != 0 && reqOilPouch <= totalOilPouches) {
			totalOilPouches = totalOilPouches - reqOilPouch;
		} else {
			if (partialAllowedStatus) {
				System.out.println("Sorry, not sufficient Oil Packets quantity available , So we can give you only : "
						+ totalOilPouches + " Oil Packets Only ");
				totalOilPouches = 0;
			} else
				System.out.println("Oil Packets Actual Quantity is: " + totalOilPouches
						+ " and requested Quantity is : " + reqOilPouch + " So could not serve the Demand");

		}

		if (totalPanipuriPacks != 0 && reqPanipuriPack <= totalPanipuriPacks) {
			totalPanipuriPacks = totalPanipuriPacks - reqPanipuriPack;
		} else {
			if (partialAllowedStatus) {
				System.out.println(
						"Sorry, not sufficient Panipuri Packets quantity available , So we can give you only : "
								+ totalPanipuriPacks + " Paniputi Packets Only ");
				totalPanipuriPacks = 0;
			} else
				System.out.println("Panipuri Packets Actual Quantity is: " + totalPanipuriPacks
						+ " and requested Quantity is : " + reqPanipuriPack + " So could not serve the Demand");
		}

		if (totalMasalaPacks != 0 && reqMasalaPack <= totalMasalaPacks) {
			totalMasalaPacks = totalMasalaPacks - reqMasalaPack;
		} else {
			if (partialAllowedStatus) {
				System.out
						.println("Sorry, not sufficient Masala Packets quantity available , So we can give you only : "
								+ totalMasalaPacks + " Masala Packets Only ");
				totalMasalaPacks = 0;
			} else
				System.out.println("Masala Packets Actual Quantity is: " + totalMasalaPacks
						+ " and requested Quantity is : " + reqMasalaPack + " So could not serve the Demand");

		}

	}

	void displayOutOfStockItems() {
		System.out.println("Out of stock items list are: ");
		if (totalMaggiePacks == 0)
			System.out.println("Maggy Packets are out of stock");

		if (totalDosaPacks == 0) {
			System.out.println("Dosa Packets are out of stock");
		}

		if (totalOilPouches == 0) {
			System.out.println("Oil Poches are out of stock");
		}

		if (totalPanipuriPacks == 0) {
			System.out.println("Panipuri Packets are out of stock");
		}

		if (totalMasalaPacks == 0) {
			System.out.println("Masala Packets are out of stock");
		}

	}

	void quantityAvailablInStock() {
		System.out.println("Items available in Stock after sell are : ");
		if (totalMaggiePacks > 0) {
			System.out.println(" Available Maggie Packets are:  " + totalMaggiePacks);
		}

		if (totalDosaPacks > 0) {
			System.out.println("Available Dosa Packets are:  " + totalDosaPacks);
		}

		if (totalOilPouches > 0) {
			System.out.println("Available Oil Pouches are:  " + totalOilPouches);
		}

		if (totalPanipuriPacks > 0) {
			System.out.println("Available Panipuri Packets are:  " + totalPanipuriPacks);
		}

		if (totalMasalaPacks > 0) {
			System.out.println("Available Masala Packets are:  " + totalMasalaPacks);
		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();

		shop.initialStocks(50, 40, 39, 43, 73);
		shop.requestedQuantity(47, 50, 45, 35, 100, true);

		shop.displayOutOfStockItems();

		shop.quantityAvailablInStock();

		shop.initialStocks(0, 40, 100, 90, 90);
		shop.requestedQuantity(5, 50, 50, 80, 100, false);

		shop.displayOutOfStockItems();

		shop.quantityAvailablInStock();

	}

}
