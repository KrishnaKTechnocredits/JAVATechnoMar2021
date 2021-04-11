/* Write below code Using scanner class. 
  Assignment  14  : 8th April 2021

1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities,
print "running out of stock" message if a particular item is sold out otherwise deduct requested 
quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

package simmi.assignment_14;

import java.util.Scanner;

public class Shop {
	int maggieQty, dosaQty, pouchesQty, panipuriQty, masalaQty;
	
	void setQuantity(int reqMaggie,int reqDosa,int reqPouches, int reqPaniuri, int reqMasala) {
		maggieQty = reqMaggie;
		dosaQty = reqDosa;
		pouchesQty = reqPouches;
		panipuriQty = reqPaniuri;
		masalaQty = reqMasala;
	} 
	
	void order(int reqMaggie, int reqDosa, int reqPouches, int reqPaniuri, int reqMasala) {
		System.out.println("ITEMS SOLD DETAILS");
		
		if(reqMaggie > 0) {
			maggieQty = maggieQty - reqMaggie;
				if(maggieQty < 0)
					System.out.println("Invalid input given");
			 }
			 else if(maggieQty == 0) {
				 System.out.println("Item running out of stock");
			 }

		 if(reqDosa > 0) {
			 dosaQty = dosaQty - reqDosa;
				if(dosaQty < 0)
					System.out.println("Invalid input given");
			 }
			 else if(dosaQty == 0) {
				 System.out.println("Item running out of stock");
			 }
		
		 if(reqPouches > 0) {
			 pouchesQty = pouchesQty - reqPaniuri;
				if(pouchesQty < 0)
					System.out.println("Invalid input given");
			 }
			 else if(pouchesQty == 0) {
				 System.out.println("Item running out of stock");
			 }
		 
		 if(reqPaniuri > 0) {
			 panipuriQty = panipuriQty - reqPaniuri;
				if(panipuriQty < 0)
					System.out.println("Invalid input given");
			 }
			 else if(panipuriQty == 0) {
				 System.out.println("Item running out of stock");
			 }
		 
		 if(reqMasala > 0) {
			masalaQty = masalaQty - reqMasala;
			if(masalaQty < 0)
				System.out.println("Invalid input given");
		 }
		 else if(masalaQty == 0) {
			 System.out.println("Item running out of stock");
		 }
	}
	
	void outOfStock() {
		System.out.println("");
		System.out.println("Items OUT OF STOCK are :");
		if (maggieQty<=0) {
			System.out.println("Maggie packets are OUT OF STOCK");
		}	
		if (dosaQty<=0) {
			System.out.println("Dosa Batter are OUT OF STOCK");
		}	
		if (pouchesQty<=0) {
			System.out.println("Oil packets are OUT OF STOCK");
		}	
		if (panipuriQty<=0) {
			System.out.println("Panipuri are OUT OF STOCK");
		}	
		if (masalaQty<=0) {
			System.out.println("Masala Packets are OUT OF STOCK");
		}	
		
	}
	
	void avaliableStock() {
		if(maggieQty > 0) {
		System.out.println("Available number of Maggie packets - "+maggieQty);
		}
		if(dosaQty > 0) {
		System.out.println("Available number of Dosa Batter - "+dosaQty);
		}
		if(pouchesQty > 0) {
		System.out.println("Available number of Oil Packets - "+pouchesQty);
		}
		if(panipuriQty > 0) {
		System.out.println("Available number of Panipuri packets - "+panipuriQty);
		}
		if(masalaQty > 0) {
		System.out.println("Available number of Masala packets - "+masalaQty);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available number of Maggie packets");
		int maggieQuantity = scanner.nextInt();
		System.out.println("Available number of dosa packets");
		int dosaQuantity = scanner.nextInt();
		System.out.println("Available number of Oil packets");
		int oilQuantity = scanner.nextInt();
		System.out.println("Available number of Panipuri packets");
		int panipuriQuantity = scanner.nextInt();
		System.out.println("Available number of Masala packets");
		int masalaQuantity = scanner.nextInt();
		shop.setQuantity(maggieQuantity,dosaQuantity, oilQuantity, panipuriQuantity, masalaQuantity );
		
		System.out.println("Number of Maggie packets ordered");
		int maggieOrder = scanner.nextInt();
		System.out.println("Number of dosa packets ordered");
		int dosaOrder = scanner.nextInt();
		System.out.println("Number of oil packets ordered");
		int oilOrder = scanner.nextInt();
		System.out.println("Number of panipuri packets ordered");
		int panipuriOrder = scanner.nextInt();
		System.out.println("Number of masala packets ordered");
		int masalaOrder = scanner.nextInt();
		shop.order(maggieOrder,dosaOrder,oilOrder,panipuriOrder,masalaOrder);
		System.out.println("");
		shop.outOfStock();
		shop.avaliableStock();
		}

	}


