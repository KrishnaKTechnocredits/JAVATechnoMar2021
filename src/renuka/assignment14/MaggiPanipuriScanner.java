package renuka.assignment14;

import java.util.Scanner;

public class MaggiPanipuriScanner {
	
	int initialMaggieQty;
	int initialPanipuriQty; 
	
	void setInitialQty() {
		System.out.println("Set initial quantity of the items:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Set initial quantity of Maggie-");
		initialMaggieQty = scan.nextInt();
		System.out.println("Set initial quantity of Panipuri-");
		initialPanipuriQty = scan.nextInt();
		//scan.close();
		}
	
	void customerPurchase(int maggieQty, int panipuriQty) {
		
		if (maggieQty > 0 ) {
			if (maggieQty <= initialMaggieQty) {
				System.out.println("Maggie packets sold to the customer are: " + maggieQty);
				initialMaggieQty = initialMaggieQty - maggieQty;
				} else {
				System.out.println("Maggie packets sold to the customer are: " + initialMaggieQty);
				initialMaggieQty = 0;
			}
		} 
		else
			System.out.println("Maggie packets requirement cannot be 0 or less");


		if (panipuriQty > 0 ) {
			if (panipuriQty <= initialPanipuriQty) {
				System.out.println("Panipuri packets sold to the customer are: " + panipuriQty);
				initialPanipuriQty = initialPanipuriQty - panipuriQty;
			} else {
				System.out.println("Panipuri packets sold to the customer are: " + initialPanipuriQty);
				initialPanipuriQty = 0;
			}
		} 
		else 
			System.out.println("Panipuri packets requirement cannot be 0 or less");
		}

		void outOfStock() {
			System.out.println("\n---List of items which are not in stock---");		
		if (initialMaggieQty == 0)
				System.out.println("Maggie is Out of Stock");
		if (initialPanipuriQty == 0)
			System.out.println("Panipuri is Out of Stock");
		}

		void inStockItems() {
			System.out.println("\n---List of items which are in stock---");	
			if (initialMaggieQty > 0)
				System.out.println("Maggie available in stock: " + initialMaggieQty);
			if (initialPanipuriQty > 0)
				System.out.println("Panipuri available in stock: " + initialPanipuriQty);
		}

		void requiredQuantity() {
			Scanner scan = new Scanner(System.in);
			System.out.println("How many Maggi packets customer wants?");
			int maggieQuantity = scan.nextInt();
			System.out.println("How many Panipuri packets customer wants?");
			int panipuriQuantity = scan.nextInt();
			scan.close();
			customerPurchase(maggieQuantity, panipuriQuantity);
			
	}
	
		


	public static void main(String[] args) {
		MaggiPanipuriScanner sc = new MaggiPanipuriScanner();
		sc.setInitialQty();
		sc.requiredQuantity();
		sc.outOfStock();
		sc.inStockItems();
	}
		// TODO Auto-generated method stub
}
	


