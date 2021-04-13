package krati_Jain.Assignment_14;

import java.util.Scanner;

public class ShopUserInput {
	
	int initialMaggieQty;
	int initialDosaQty;
	int initialOilQty;
	int initialPanipuriQty;  
	int initialMasalaQty;
	
void setInitialQty() {
	System.out.println("Set initial quantity of the items:");
	Scanner scan = new Scanner(System.in);
	System.out.println("Set initial quantity of Maggie-");
	initialMaggieQty = scan.nextInt();
	System.out.println("Set initial quantity of Dosa-");
	initialDosaQty = scan.nextInt();
	System.out.println("Set initial quantity of Oil-");
	initialOilQty = scan.nextInt();
	System.out.println("Set initial quantity of Panipuri-");
	initialPanipuriQty = scan.nextInt();
	System.out.println("Set initial quantity of Masala-");
	initialMasalaQty = scan.nextInt();
	}


void customerPurchase(int maggieQty, int dosaQty, int oilQty, int panipuriQty, int masalaQty) {
	//System.out.println("Entered customerPurchase method" + maggieQty);
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
			System.out.println("Masala packets sold to the customer are: " + masalaQty);
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
	
	void requiredQuantity() {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Maggi packets customer wants?");
		int maggieQuantity = scan.nextInt();
		System.out.println("How many Dosa packets customer wants?");
		int dosaQuantity = scan.nextInt();
		System.out.println("How many Oil pouches customer wants?");
		int oilQuantity = scan.nextInt();
		System.out.println("How many Panipuri packets customer wants?");
		int panipuriQuantity = scan.nextInt();
		System.out.println("How many Masala packets customer wants?");
		int masalaQuantity = scan.nextInt();
		
		customerPurchase(maggieQuantity, dosaQuantity, oilQuantity, panipuriQuantity, masalaQuantity);
		
	}
	
	public static void main(String[] a) {
		ShopUserInput shop = new ShopUserInput();
		shop.setInitialQty();
		shop.requiredQuantity();
		shop.outOfStock();
		shop.inStockItems();
		
	}
}
