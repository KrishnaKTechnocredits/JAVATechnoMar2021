package anubhav.scannerexamples;

import java.util.Scanner;

/*1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
	print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
	Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

public class ShopScanner {
	
	int maggiQuantity; int dosaQuantity; int oilPouchQuantity; int panipuriQuantity; int masalaQuantity;
	int maggiPicked; int dosaPicked; int oilPouchPicked; int panipuriPicked; int masalaPicked;
	
	void quantityPicked (){
		
		if (maggiPicked>0){
			maggiQuantity= maggiQuantity-maggiPicked;
			if (maggiQuantity<0){
				System.out.println("Insufficient maggi stock");
			}
			 else if (maggiQuantity==0){
				System.out.println("Maggi running our of stock");
			}
		}
		
		if (dosaPicked>0){
			dosaQuantity= dosaQuantity-dosaPicked;
			if (dosaQuantity<0){
				System.out.println("Insufficient dosa stock");
			}	
			else if (dosaQuantity==0){
				System.out.println("Dosa running our of stock");
			}
		}
		
		if (oilPouchPicked>0){
			oilPouchQuantity= oilPouchQuantity-oilPouchPicked;
			if (oilPouchQuantity<0){
				System.out.println("Insufficient oil pouch stock");
			}
			else if (oilPouchQuantity==0){
				System.out.println("Oil pouch running our of stock");
			}
		}
		
		if (panipuriPicked>0){
			panipuriQuantity= panipuriQuantity-panipuriPicked;
			if (panipuriQuantity <0){
				System.out.println("Insufficient panipuri stock");
			}
			else if (panipuriQuantity == 0){
				System.out.println("Panipuri running our of stock");
			}
		}
		
		if (masalaPicked>0){
			masalaQuantity= masalaQuantity-masalaPicked;
			if (masalaQuantity<0){
				System.out.println("Insufficient masala stock");
			}
			else if (masalaQuantity==0) {
				System.out.println("Masala running our of stock");
			}
		}
	}

		void remainingQuantity() {
		System.out.println("----RESTOCK or ITEM & QUANTITY AVAILABLE----");
		if (maggiQuantity>0) {
			System.out.println("Maggi available in stock is : " + maggiQuantity);
		}
		
		if (dosaQuantity>0) {
			System.out.println("Dosa available in stock is : " + dosaQuantity);
		}
		
		if (oilPouchQuantity>0) {
			System.out.println("Oil pouch available in stock is : " + oilPouchQuantity);
		}
		
		if (panipuriQuantity>0) {
			System.out.println("Panipuri available in stock is : " + panipuriQuantity);
		}
		
		if (masalaQuantity>0) {
			System.out.println("Masala's available in stock is : " + masalaQuantity);
		}
	}
	
	void outOfStock() {
		System.out.println("----ITEMS OUT OF STOCK----");
		if (maggiQuantity<=0) {
			System.out.println("Maggi not available");
		}
		
		if (dosaQuantity<=0) {
			System.out.println("Dosa not available");
		}
		
		if (oilPouchQuantity<=0) {
			System.out.println("Oil Pouch not available");
		}
		
		if (panipuriQuantity<=0) {
			System.out.println("Panipuri not available");
		}
		
		if (masalaQuantity<=0) {
			System.out.println("Masala not available");
		}
	}
	
	public static void main (String[] args) {
		ShopScanner shopScanner= new ShopScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter quanitities of items available");
		int maggiAvailable1=scanner.nextInt();
		shopScanner.maggiQuantity= maggiAvailable1;
		int dosaAvailable1=scanner.nextInt();
		shopScanner.dosaQuantity= dosaAvailable1;
		int oilPouchAvailable1=scanner.nextInt();
		shopScanner.oilPouchQuantity= oilPouchAvailable1;
		int panipuriAvailable1=scanner.nextInt();
		shopScanner.panipuriQuantity= panipuriAvailable1;
		int masalaAvailable1=scanner.nextInt();
		shopScanner.masalaQuantity= masalaAvailable1;
		
		System.out.println("Enter quantities of items picked: ");
		int maggiPicked1=scanner.nextInt();
		shopScanner.maggiPicked= maggiPicked1;
		int dosaPicked1=scanner.nextInt();
		shopScanner.dosaPicked= dosaPicked1;
		int oilPouchPicked1=scanner.nextInt();
		shopScanner.oilPouchPicked= oilPouchPicked1;
		int panipuriPicked1=scanner.nextInt();
		shopScanner.panipuriPicked= panipuriPicked1;
		int masalaPicked1=scanner.nextInt();
		shopScanner.masalaPicked= masalaPicked1;

		shopScanner.quantityPicked();
		shopScanner.remainingQuantity();
		shopScanner.outOfStock();
	}
}


