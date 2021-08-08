package gauravk.Assignment_6_30March2021;

import java.util.Scanner;

/*
 * *Assignment 7* : *30th March 2021*
1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.
Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */
public class Shop {
	static String [] items = {"Maggie","Dosa","Oil","Panipuri","Masala"};
	static int [] stockQty = {50,43,39,43,73};
	Scanner sc = new Scanner(System.in);
	
	void displayStock(String items[], int stockQty[]) {
		System.out.println("Stock: ");
		for(int i=0; i<items.length; i++) {
			if(stockQty[i]!=0)
				System.out.println(items[i]+ " = "+stockQty[i]);
			else System.out.println(items[i]+ " = out of stock");
		}
	}
	
	void customerShopping() {
		System.out.println("Pick quantities for shopping each items: ");
		for(int i=0; i<items.length; i++) {
			System.out.print(items[i]+ " = ");
			int orderQty = sc.nextInt();
			if(orderQty<=stockQty[i]) {
				stockQty[i] = stockQty[i] - orderQty;
				System.out.println(orderQty+" of "+items[i]+" added to your trolley");
			}	
			else
				System.out.println(orderQty+" of "+items[i]+" exceeded the shop stock capacity. this item not added to your trolley.");
		}
	}
	
	void outOfStockDisplay() {
		for(int i=0; i<items.length; i++) {
			if(stockQty[i]==0)
				System.out.println(items[i]+" out of stock.");
			else
				continue;
		}
		availableStockDisplay();
	}
	
	void availableStockDisplay() {
		for(int i=0; i<items.length; i++) {
			if(stockQty[i]!=0)
				System.out.println(items[i]+" = "+stockQty[i]);
			else
				continue;
		}
	}

	
	public static void main(String[] a) {
		Shop shop1 = new Shop();
		shop1.displayStock(items, stockQty);
		shop1.customerShopping();
		shop1.outOfStockDisplay();
	}

}