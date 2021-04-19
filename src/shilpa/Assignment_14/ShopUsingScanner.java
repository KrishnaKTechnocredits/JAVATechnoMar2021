//Assignment  14 : 8th April 2021 

//Create a system (Shop) which maintains each item's quantity.

package shilpa.Assignment_14;

import java.util.Scanner;

public class ShopUsingScanner {
	int maggieQuantity, dosaQuantity, oilQuantity, panipuriQuantity, masalaQuantity;

	void Inventory(int maggie, int dosa, int oil, int panipuri, int masala) {
		maggieQuantity = maggie;
		dosaQuantity = dosa;
		oilQuantity = oil;
		panipuriQuantity = panipuri;
		masalaQuantity = masala;
	}

	void customer(int maggieOrder, int dosaOrder, int oilOrder, int panipuriOrder, int masalaOrder) {
		if (maggieQuantity == 0) {
			System.out.println("Maggie Packets running out of stock");
		} else if (maggieQuantity < maggieOrder) {
			int remainingmaggy = maggieOrder - maggieQuantity;
			System.out.println("Sorry we have only " + maggieQuantity + " packets of maggie available, please purchase "
					+ remainingmaggy + " Packets later.");
			maggieQuantity = 0;
		} else {
			maggieQuantity = maggieQuantity - maggieOrder;
		}
		if (dosaQuantity == 0) {
			System.out.println("Dosa Packets running out of stock");
		} else if (dosaQuantity < dosaOrder) {
			int remainingdosa = dosaOrder - dosaQuantity;
			System.out.println("Sorry we have only " + dosaQuantity + " packets of Dosa available, please purchase "
					+ remainingdosa + " Packets later.");
			dosaQuantity = 0;
		} else {
			dosaQuantity = dosaQuantity - dosaOrder;
		}
		if (oilQuantity == 0) {
			System.out.println("Oil Packets running out of stock");
		} else if (oilQuantity < oilOrder) {
			int remainingoil = oilOrder - oilQuantity;
			System.out.println("Sorry we have only " + oilQuantity + " packets of Oil available, please purchase "
					+ remainingoil + " Packets later.");
			oilQuantity = 0;
		} else {
			oilQuantity = oilQuantity - oilOrder;
		}

		if (panipuriQuantity == 0) {
			System.out.println("Panipuri Packets running out of stock");
		} else if (panipuriQuantity < panipuriOrder) {
			int remainingpanipuri = panipuriOrder - panipuriQuantity;
			System.out.println("Sorry we have only " + panipuriQuantity
					+ " packets of Panipuri available, please purchase " + remainingpanipuri + " Packets later.");
			panipuriQuantity = 0;
		}

		else {
			panipuriQuantity = panipuriQuantity - panipuriOrder;
		}

		if (masalaQuantity == 0) {
			System.out.println("Masala Packets running out of stock");
		} else if (masalaQuantity < masalaOrder) {
			int remainingmasala = masalaOrder - masalaQuantity;
			System.out.println("Sorry we have only " + masalaQuantity + " packets of Masala available, Please purchase "
					+ remainingmasala + " Packets later.");
			masalaQuantity = 0;
		} else {
			masalaQuantity = masalaQuantity - masalaOrder;
		}
	}

	void OutOfStockItems() {
		System.out.println("Out of stock items");
		if (maggieQuantity == 0) {
			System.out.println("Maggie");
		}
		if (dosaQuantity == 0) {
			System.out.println("Dosa Packets");
		}
		if (oilQuantity == 0) {
			System.out.println("Oil Packets");
		}

		if (panipuriQuantity == 0) {
			System.out.println("Panipuri Packets");
		}

		if (masalaQuantity == 0) {
			System.out.println("Masala Packets");
		}
	}

	void ItemsInStock() {
		System.out.println("Items in Stock");
		if (maggieQuantity > 0) {
			System.out.println("Maggie Packets - " + maggieQuantity);
		}
		if (dosaQuantity > 0) {
			System.out.println("Dosa Packets - " + dosaQuantity);
		}
		if (oilQuantity > 0) {
			System.out.println("Oil Packets - " + oilQuantity);
		}
		if (panipuriQuantity > 0) {
			System.out.println("Panipuri Packets - " + panipuriQuantity);
		}
		if (masalaQuantity > 0) {
			System.out.println("Masala Packets - " + masalaQuantity);
		}
	}

	public static void main(String[] args) {
		ShopUsingScanner shop = new ShopUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("maggy packets available in inventary:-");
		int maggyqty = scanner.nextInt();
		System.out.println("Dosa packets available in inventary:-");
		int dosaqty = scanner.nextInt();
		System.out.println("oil packets available in inventary:-");
		int oilqty = scanner.nextInt();
		System.out.println("Panipuri packets available in inventary:-");
		int panipuriqty = scanner.nextInt();
		System.out.println("Masala packets available in inventary:-");
		int masalaqty = scanner.nextInt();
		shop.Inventory(maggyqty, dosaqty, oilqty, panipuriqty, masalaqty);

		System.out.println("Enter Maggie Order:-");
		int maggieord = scanner.nextInt();
		System.out.println("Enter Dosa Order:-");
		int dosaord = scanner.nextInt();
		System.out.println("Enter oil Order:-");
		int oilord = scanner.nextInt();
		System.out.println("Enter Panipuri Order:-");
		int panipuriord = scanner.nextInt();
		System.out.println("Enter Masala Order:-");
		int masalaord = scanner.nextInt();
		shop.customer(maggieord, dosaord, oilord, panipuriord, masalaord);
		System.out.println(" ");
		shop.OutOfStockItems();
		System.out.println(" ");
		shop.ItemsInStock();
		scanner.close();
	}
}
