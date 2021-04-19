/*1. Create a system (Shop) which maintains each item's quantity.
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

package ravindra_J.Assignment_No_14_Scanner_Class;

import java.util.Scanner;

public class StockUsingIfElseLadder {


	int initialMaggieStock;
	int initialDosaStock;
	int initialOilPacketsStock;
	int initialPanipuriStock;
	int initialMasalaStock;

	public void setInitialStock(int maggieeQty,int dosaQty,int oilPQty,int panipuriPQty,int masalaPQty) {

		initialMaggieStock = maggieeQty;
		initialDosaStock = dosaQty;
		initialOilPacketsStock = oilPQty;
		initialPanipuriStock = panipuriPQty; 
		initialMasalaStock = masalaPQty;
	} 

	public void inStock() {

		if(initialMaggieStock > 0) 
			System.out.println("\nAvailable Maggiee Stock :" +initialMaggieStock);
		if(initialDosaStock>0)
			System.out.println("Available Dosa Stock :" +initialDosaStock);
		if(initialOilPacketsStock>0)
			System.out.println("Available Oil Packets Stock :" +initialOilPacketsStock);
		if(initialPanipuriStock>0)
			System.out.println("Available Panipuri Packets Stock :" +initialPanipuriStock);
		if(initialMasalaStock>0)
			System.out.println("Available Masala Packets Stock : " +initialMasalaStock);
	}


	public void outOfStock() {

		if(initialMaggieStock == 0) 
			System.out.println("\nMaggiee Stock Currently not Available : " +initialMaggieStock);
		if(initialDosaStock==0)
			System.out.println("Dosa Stock Currently not Available : " +initialDosaStock);
		if(initialOilPacketsStock==0)
			System.out.println("Oil Packets Stock Currently not Available : " +initialOilPacketsStock);
		if(initialPanipuriStock==0)
			System.out.println("Panipuri Packets Stock Currently not Available : " +initialPanipuriStock);
		if(initialMasalaStock==0)
			System.out.println("Masala Packets Stock Currently not Available : " +initialMasalaStock);
	}

	public void pickDifferentItems(int reqMQ, int reqDQ, int reqOQ, int reqPQ, int reqMpQ,boolean partialQtyAllow) {

		if(reqMQ <= initialMaggieStock ) {
			initialMaggieStock = initialMaggieStock - reqMQ;
			System.out.println("\n Maggie You are Requested : "+reqMQ+" and Updated Maggie Available Stock Is: " +initialMaggieStock);
		}
		else if(reqMQ >= initialMaggieStock && partialQtyAllow) {
			initialMaggieStock = initialMaggieStock - reqMQ;
			System.out.println("\n Sorry ! We Are Running maggie: "+initialMaggieStock+" Less in Stock , Please Pick the maggie Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("\n Sorry! Partial Qty is Not Allowed, You Are Requesting maggie "+reqMQ+" and We are Having maggie Stock Quantity is- " +initialMaggieStock);



		if(reqDQ <= initialDosaStock) {
			initialDosaStock = initialDosaStock - reqDQ;
			System.out.println("\n Dosa You are Requested : "+reqDQ+" and Updated Dosa Available Stock Is: " +initialDosaStock);
		}
		else if(reqMpQ >= initialDosaStock && partialQtyAllow) {
			initialDosaStock = initialDosaStock - reqDQ;
			System.out.println("\n Sorry ! We Are Running Dosa : "+initialDosaStock+" Less in Stock , Please Pick the Dosa Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("\n Sorry! Partial Qty is Not Allowed, You Are Requesting Dosa- "+reqDQ+" and We are Having Dosa Stock Quantity is -" +initialDosaStock);




		if(reqOQ <= initialOilPacketsStock) {
			initialOilPacketsStock = initialOilPacketsStock - reqOQ;
			System.out.println("\n Oil You are Requested : "+reqOQ+" and Updated oil Available Stock Is: " +initialOilPacketsStock);
		}
		else if(reqOQ >= initialOilPacketsStock && partialQtyAllow) {
			initialOilPacketsStock = initialOilPacketsStock - reqOQ;
			System.out.println("\n Sorry ! We Are Running Oil Pack: "+initialOilPacketsStock+" Less in Stock , Please Pick the Oil Pack Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("\n Sorry! Partial Qty is Not Allowed, You Are Requesting oil Pack "+reqOQ+" and We are Having oil Pack Stock Quantity is " +initialOilPacketsStock);



		if(reqPQ <= initialPanipuriStock) {
			initialPanipuriStock = initialPanipuriStock - reqPQ;
			System.out.println("\n Panipuri You are Requested : "+reqPQ+" and Updated Panipuri pack Available Stock Is: " +initialPanipuriStock);
		}
		else if(reqPQ >= initialPanipuriStock && partialQtyAllow) {
			initialPanipuriStock = initialPanipuriStock - reqPQ;
			System.out.println("\n Sorry ! We Are Running Panipuri Pack: "+initialPanipuriStock+" Less in Stock , Please Pick the panipuri Pack Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("\n Sorry! Partial Qty is Not Allowed, You Are Requesting Panipuri Pack "+reqPQ+" and We are Having Panipuri Pack Stock Quantity is " +initialPanipuriStock);



		if(reqMpQ <= initialMasalaStock) {
			initialMasalaStock = initialMasalaStock - reqMpQ;
			System.out.println("\n Masala Packs You are Requested : "+reqMpQ+" and Updated Maggie Available Stock Is: " +initialMasalaStock);
		}
		else if(reqMpQ >= initialMasalaStock && partialQtyAllow) {
			initialMasalaStock = initialMasalaStock - reqMpQ;
			System.out.println("\n Sorry ! We Are Running Masala Pack: "+initialMasalaStock+" Less in Stock , Please Pick the Masala Pack Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("\n Sorry! Partial Qty is Not Allowed, You Are Requesting Masala Pack "+reqMQ+" and We are Having Masala Pack Stock Quantity is " +initialMasalaStock);


	}


	public static void main(String[] args) {
		
		StockUsingIfElseLadder stock = new StockUsingIfElseLadder();

		Scanner scanner = new Scanner(System.in);

			System.out.println("Set the stock first for Maggiee");
			int MaggieeQty = scanner.nextInt();
			System.out.println("Set the stock first for Dosa");
			int DosaQty = scanner.nextInt();
			System.out.println("Set the stock first for Oil Pack");
			int OilPackQty = scanner.nextInt();
			System.out.println("Set the stock first for Panipuri Pack");
			int PanipuriPacQty = scanner.nextInt();
			System.out.println("Set the stock first for Masala Pack");
			int MasalaPackQty = scanner.nextInt();

			stock.setInitialStock(MaggieeQty,DosaQty,OilPackQty,PanipuriPacQty,MasalaPackQty);
			stock.inStock();
			stock.outOfStock();
			
			System.out.println("\nEnter the picked maggiee qty ");
			int reqMQ = scanner.nextInt();
			System.out.println("Enter the picked Dosa qty ");
			int reqDQ = scanner.nextInt();
			System.out.println("Enter the picked Oil pack qty ");
			int reqOQ = scanner.nextInt();
			System.out.println("Enter the picked panipuri pack qty ");
			int reqPQ = scanner.nextInt();
			System.out.println("Eenter the picked masala pack qty ");
			int reqMpQ = scanner.nextInt();
			System.out.println("Allowing Partial picking ? ");
			boolean partialQtyAllow = scanner.nextBoolean();
			
			
			stock.pickDifferentItems(reqMQ, reqDQ, reqOQ, reqPQ, reqMpQ, partialQtyAllow);
			
			
	}
}