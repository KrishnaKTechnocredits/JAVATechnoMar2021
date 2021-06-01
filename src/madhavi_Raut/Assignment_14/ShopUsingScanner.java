package madhavi_Raut.Assignment_14;

import java.util.Scanner;

/*Assignment 14_Program_03
1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
print "running out of stock" message if a particular item is sold out 

otherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

public class ShopUsingScanner {
	int totalMaggieQty = 50, totalDosaQty = 43, totalOilQty = 39, totalPanipuriQty = 43, totalMasalaQty = 73;

	void purchaseItemName(String itemName, int itemRequiredQuantity, int itemTotalQuantity) {
		if (itemTotalQuantity > 0) {
			if (itemRequiredQuantity > 0) {
				if (itemRequiredQuantity <= itemTotalQuantity) {
					itemTotalQuantity -= itemRequiredQuantity;
					System.out.println("We have processed the request of " + itemRequiredQuantity
							+ " quantity successfully for " + itemName + ".");
					if (itemName.equals("Maggie"))
						totalMaggieQty = itemTotalQuantity;
					else if (itemName.equals("Dosa"))
						totalDosaQty = itemTotalQuantity;
					else if (itemName.equals("Oil"))
						totalOilQty = itemTotalQuantity;
					else if (itemName.equals("Panipuri"))
						totalPanipuriQty = itemTotalQuantity;
					else
						totalMasalaQty = itemTotalQuantity;
				} else {
					System.out.println("For " + itemName + ", customer requested " + itemRequiredQuantity + " quantity"
							+ " but we have provided " + itemTotalQuantity + " quantity which were available with us.");
					itemTotalQuantity = 0;
					if (itemName.equals("Maggie"))
						totalMaggieQty = itemTotalQuantity;
					else if (itemName.equals("Dosa"))
						totalDosaQty = itemTotalQuantity;
					else if (itemName.equals("Oil"))
						totalOilQty = itemTotalQuantity;
					else if (itemName.equals("Panipuri"))
						totalPanipuriQty = itemTotalQuantity;
					else
						totalMasalaQty = itemTotalQuantity;
				}
				if (itemTotalQuantity == 0)
					System.out.println(itemName + " is out of stock after processing the request successfully.");
			} else
				System.out.println("Please enter correct quantity for " + itemName + ".");
		} else
			System.out.println("We cannot process your request of " + itemRequiredQuantity
					+ " quantity as we are out of stock for " + itemName + ".");
	}

	void purchaseMaggie(int maggieRequiredQty) {
		purchaseItemName("Maggie", maggieRequiredQty, totalMaggieQty);
	}

	void purchaseDosa(int dosaRequiredQty) {
		purchaseItemName("Dosa", dosaRequiredQty, totalDosaQty);
	}

	void purchaseOil(int oilRequiredQty) {
		purchaseItemName("Oil", oilRequiredQty, totalOilQty);
	}

	void purchasePanipuri(int panipuriRequiredQty) {
		purchaseItemName("Panipuri", panipuriRequiredQty, totalPanipuriQty);
	}

	void purchaseMasala(int masalaRequiredQty) {
		purchaseItemName("Masala", masalaRequiredQty, totalMasalaQty);
	}

	void displayOutOfStockItems() {
		System.out.println("\nOut of Stock items are: ");
		if (totalMaggieQty == 0)
			System.out.println("Maggie");
		if (totalDosaQty == 0)
			System.out.println("Dosa");
		if (totalOilQty == 0)
			System.out.println("Oil");
		if (totalPanipuriQty == 0)
			System.out.println("Panipuri");
		if (totalMasalaQty == 0)
			System.out.println("Masala");
	}

	void displayAvailableInStockItems() {
		System.out.println("\n" + "Items available in stock are: ");
		if (totalMaggieQty > 0)
			System.out.println("Maggie: " + totalMaggieQty);
		if (totalDosaQty > 0)
			System.out.println("Dosa: " + totalDosaQty);
		if (totalOilQty > 0)
			System.out.println("Oil: " + totalOilQty);
		if (totalPanipuriQty > 0)
			System.out.println("Panipuri: " + totalPanipuriQty);
		if (totalMasalaQty > 0)
			System.out.println("Masala: " + totalMasalaQty);
	}

	public static void main(String[] args) {
		ShopUsingScanner shopUsingScanner = new ShopUsingScanner();
		Scanner scanner = new Scanner(System.in);
		//Getting required quantity from user.
		System.out.println("Enter quantity for Maggie.");
		int maggieRequiredQuantity = scanner.nextInt();
		System.out.println("Enter quantity for Dosa.");
		int dosaRequiredQuantity = scanner.nextInt();
		System.out.println("Enter quantity for Oil.");
		int oilRequiredQuantity = scanner.nextInt();
		System.out.println("Enter quantity for Panipuri.");
		int panipuriRequiredQuantity = scanner.nextInt();
		System.out.println("Enter quantity for Masala.");
		int masalaRequiredQuantity = scanner.nextInt();

		shopUsingScanner.purchaseMaggie(maggieRequiredQuantity);
		System.out.println();
		shopUsingScanner.purchaseDosa(dosaRequiredQuantity);
		System.out.println();
		shopUsingScanner.purchaseOil(oilRequiredQuantity);
		System.out.println();
		shopUsingScanner.purchasePanipuri(panipuriRequiredQuantity);
		System.out.println();
		shopUsingScanner.purchaseMasala(masalaRequiredQuantity);
		shopUsingScanner.displayOutOfStockItems();
		shopUsingScanner.displayAvailableInStockItems();
		
		scanner.close();
	}
}
