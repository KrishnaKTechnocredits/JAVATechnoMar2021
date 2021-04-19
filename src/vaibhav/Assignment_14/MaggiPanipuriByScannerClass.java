package vaibhav.Assignment_14;

import java.util.Scanner;

import vaibhav.Assignment_7.Shop;

public class MaggiPanipuriByScannerClass {
	
int iMaggie, iPanipuri;
	
	void setInitialQualtiy (int qMaggie, int qPanipuri) {
		iMaggie = qMaggie;
		iPanipuri = qPanipuri;
	}
		
	void requestedItems( int reqMaggie , int reqPanipuri, boolean pAllowed) {
		
		/// Maggie Check
		if (iMaggie == 0) {
			System.out.println("Maggie is running out of stock");		
		}else if (reqMaggie <= iMaggie) {
			iMaggie = iMaggie - reqMaggie;
		}else {
			System.out.println("Insufficient Maggie available in stock. We can serve you only " + iMaggie + " Maggie out of " + reqMaggie );
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iMaggie = 0;
		}
				
				
		
		// Panipuri Check
		if (iPanipuri == 0) {
			System.out.println("Panipuri is running out of stock");
		}else if (reqPanipuri <= iPanipuri) {
			iPanipuri = iPanipuri - reqPanipuri;
		}else{
			System.out.println("Insufficient Panipuri available in stock. We can serve you only " + iPanipuri + " Panipuri out of " + reqPanipuri);
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iPanipuri = 0;
		}
		
	
		
	}
		
	void outOfStockItems() {
		System.out.println(" ");
		System.out.println("Out of stock items are : ");
		
		if (iMaggie==0 || iPanipuri == 0) {
			if (iMaggie == 0)
				System.out.println("Maggie");
			if (iPanipuri == 0)
				System.out.println("Panipuri");
		}else {
			System.out.println("None");
		}
	}
		
	void avilableInStockItems() {
		System.out.println(" ");
		System.out.println("Avaiable in stock items are : ");
		if (iMaggie > 0)
			System.out.println("Maggie : " + iMaggie);
		if (iPanipuri > 0)
			System.out.println("Panipuri : " + iPanipuri);
	}
		
	public static void main (String[] args) {
		MaggiPanipuriByScannerClass maggiPanipuriByScannerClass = new MaggiPanipuriByScannerClass();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the Initial Quantity available in stock for Maggie & Panipuri");
		maggiPanipuriByScannerClass.setInitialQualtiy(scanner.nextInt(), scanner.nextInt());

		System.out.println("Please enter the Required Quantity available in stock for Maggie & Panipuri");
		maggiPanipuriByScannerClass.requestedItems(scanner.nextInt(),scanner.nextInt(),scanner.nextBoolean());
		
		maggiPanipuriByScannerClass.outOfStockItems();
		maggiPanipuriByScannerClass.avilableInStockItems();
		scanner.close();
	}
	
	
	

}
