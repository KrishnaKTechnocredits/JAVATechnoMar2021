/*1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
	print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
	Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/


package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class MaggiPanipuri {
	
	int totalMaggi;
	int totalDosa;
	int totalPanipuri;
	int totalMasala;
	

	void itemOutOfStock() {
		//if ((totalMaggi||totalDosa||totalPanipuri||totalPouches||totalMasala) == 0) {
			if (totalMaggi == 0)
				System.out.println("------Maggi is Out of Stock--------");
			if (totalDosa == 0)
				System.out.println("-----Dosa is Out of Stock-----");
			if (totalPanipuri == 0)
				System.out.println("------Panipuri is Out of Stock------");
			if (totalMasala == 0)
				System.out.println("------Masala is Out of Stock------");
		//}
	}
	
	void availableItems() {
		if (totalMaggi>0) {
			System.out.println(totalMaggi+" Maggi are available in stock");
		}
		if (totalDosa>0) {
			System.out.println(totalDosa+" Dosa are available in stock");
		}
		if (totalPanipuri>0) {
			System.out.println(totalPanipuri+" Panipuri are available in stock");
		}
		if (totalMasala>0) {
			System.out.println(totalMasala+" Masala are available in stock");
		}
	}
	
	void soldItems(int pickMaggi, int pickDosa, int pickPanipuri, int pickMasala) {
		if (pickMaggi > 0 && totalMaggi >= pickMaggi) {
			totalMaggi = totalMaggi - pickMaggi;
			if (totalMaggi == 0) {
				System.out.println("**Maggi is running out of stock now**");
			}
		}else if (pickMaggi > 0 && totalMaggi < pickMaggi) {
			totalMaggi =0;
			System.out.println(totalMaggi+" Maggi are available in stock");
		}
		
		if (pickDosa > 0 && totalDosa >= pickDosa) {
			totalDosa = totalDosa - pickDosa;
			if (totalDosa == 0) {
				System.out.println("**Dosa is running out of stock now**");
			}
		}else if (pickDosa > 0 && totalDosa < pickDosa) {
			totalDosa =0;
			System.out.println(totalDosa+" Dosa are available in stock");
		}
		
		if (pickPanipuri > 0 && totalPanipuri >= pickPanipuri) {
			totalPanipuri = totalPanipuri - pickPanipuri;
			if (totalPanipuri == 0) {
				System.out.println("**Panipuri is running out of stock now**");
			}
		}else if (pickPanipuri > 0 && totalPanipuri < pickPanipuri) {
			totalPanipuri =0;
			System.out.println(totalPanipuri+" Panipuri are available in stock");
		}
		
		if (pickMasala > 0 && totalMasala >= pickMasala) {
			totalMasala = totalMasala - pickMasala;
			if (totalMasala == 0) {
				System.out.println("**Masala is running out of stock now**");
			}
		}else if (pickMasala > 0 && totalMasala < pickMasala) {
			totalMasala =0;
			System.out.println(totalMasala+" Masala are available in stock");
		}
	}
	
	
	public static void main (String[] a) {
		MaggiPanipuri maggiPanipuri = new MaggiPanipuri();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter total Maggi stock");
		maggiPanipuri.totalMaggi = scanner.nextInt();
		System.out.println("Enter total Dosa stock");
		maggiPanipuri.totalDosa = scanner.nextInt();
		System.out.println("Enter total Panipuri stock");
		maggiPanipuri.totalPanipuri = scanner.nextInt();
		System.out.println("Enter total Masala stock");
		maggiPanipuri.totalMasala = scanner.nextInt();
		
		System.out.println("Enter required maggi quantity");
		int setMaggi = scanner.nextInt();		
		System.out.println("Enter required Dosa quantity");
		int setDosa = scanner.nextInt();	
		System.out.println("Enter required Panipuri quantity");
		int setPanipuri = scanner.nextInt();
		System.out.println("Enter required Masala quantity");
		int setMasala = scanner.nextInt();
		maggiPanipuri.itemOutOfStock();
		maggiPanipuri.soldItems(setMaggi, setDosa, setPanipuri, setMasala);
		maggiPanipuri.availableItems();
		
	}

}
