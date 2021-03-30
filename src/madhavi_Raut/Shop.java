/*
Assignment 07
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
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */
package madhavi_Raut;

public class Shop {
	int totalMaggieQty = 50, totalDosaQty = 43, totalOilQty = 39, totalPanipuriQty = 43, totalMasalaQty = 73;

	void purchaseMaggie(int maggieRequiredQty) {
		if (totalMaggieQty > 0) {
			if (maggieRequiredQty > 0) {
				if (maggieRequiredQty <= totalMaggieQty)
					totalMaggieQty -= maggieRequiredQty;
				else {
					System.out.println("For Maggie, customer requested " + maggieRequiredQty + " quantity" + " but we have provided " + totalMaggieQty + " quantity which were available with us." + "\n");
					totalMaggieQty = 0;
				}
			} else
				System.out.println("Please enter correct quantity for Maggie." + "\n");
		} else
			System.out.println("Maggie running out of stock!" + "\n");
	}

	void purchaseDosa(int dosaRequiredQty) {
		if (totalDosaQty > 0) {
			if (dosaRequiredQty > 0) {
				if (dosaRequiredQty <= totalDosaQty)
					totalDosaQty -= dosaRequiredQty;
				else {
					System.out.println(
							"For Dosa, customer requested " + dosaRequiredQty + " quantity" + " but we have provided " + totalDosaQty + " quantity which were available with us." + "\n");
					totalDosaQty = 0;
				}
			} else
				System.out.println("Please enter correct quantity for Dosa." + "\n");
		} else
			System.out.println("Dosa running out of stock!" + "\n");
	}

	void purchaseOil(int oilRequiredQty) {
		if (totalOilQty > 0) {
			if (oilRequiredQty > 0) {
				if (oilRequiredQty <= totalOilQty)
					totalOilQty -= oilRequiredQty;
				else {
					System.out.println("For Oil, customer requested " + oilRequiredQty + " quantity" + " but we have provided "	+ totalOilQty + " quantity which were available with us." + "\n");
					totalOilQty = 0;
				}
			} else
				System.out.println("Please enter correct quantity for Oil." + "\n");
		} else
			System.out.println("Oil running out of stock!" + "\n");
	}

	void purchasePanipuri(int panipuriRequiredQty) {
		if (totalPanipuriQty > 0) {
			if (panipuriRequiredQty > 0) {
				if (panipuriRequiredQty <= totalPanipuriQty)
					totalPanipuriQty -= panipuriRequiredQty;
				else {
					System.out.println("For Panipuri, customer requested " + panipuriRequiredQty + " quantity" + " but we have provided " + totalPanipuriQty + " quantity which were available with us." + "\n");
					totalPanipuriQty = 0;
				}
			} else
				System.out.println("Please enter correct quantity for Panipuri." + "\n");
		} else
			System.out.println("Panipuri running out of stock!" + "\n");
	}

	void purchaseMasala(int masalaRequiredQty) {
		if (totalMasalaQty > 0) {
			if (masalaRequiredQty > 0) {
				if (masalaRequiredQty <= totalMasalaQty)
					totalMasalaQty -= masalaRequiredQty;
				else {
					System.out.println("For Masala, customer requested " + masalaRequiredQty + " quantity" + " but we have provided " + totalMasalaQty + " quantity which were available with us." + "\n");
					totalMasalaQty = 0;
				}
			} else
				System.out.println("Please enter correct quantity for Masala." + "\n");
		} else
			System.out.println("Masala running out of stock!" + "\n");
	}

	void displayOutOfStockItems() {
		System.out.println("Out of Stock items are: ");
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
		Shop shop = new Shop();
		shop.purchaseMaggie(60);
		shop.purchaseDosa(20);
		shop.purchaseOil(40);
		shop.purchasePanipuri(-1);
		shop.purchaseMasala(0);
		shop.displayOutOfStockItems();
		shop.displayAvailableInStockItems();
	}
}
