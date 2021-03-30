package ankit;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Shop{
	int maggieQty, dosaQty, oilPQty, panipuriQty, masalaQty;
	
	void SetInventory(int maggieQ,int dosaQ,int oilQ, int panipuriQ, int masalaQ) {
		maggieQty = maggieQ;
		dosaQty = dosaQ;
		oilPQty = oilQ;
		panipuriQty = panipuriQ;
		masalaQty = masalaQ;
	} 
	
	void customerOrder(int maggieReqQ, int dosaReqQ, int oilReqQ, int panipuriReqQ, int masalaReqQ) {
		System.out.println("*****ITEMS SOLD DETAILS*****");
		if (maggieReqQ > maggieQty) {
			System.out.println("Sorry! we have only "+maggieQty+ " Maggie available");
			int pendMaggie = maggieReqQ - maggieQty;
			System.out.println("Requested Qualtity of Maggie :" +maggieReqQ);
			System.out.println("Sold Qualtity of Maggie :" +maggieQty);
			System.out.println("Please purchase " +pendMaggie+ " packets of Maggie Tomorrow");
			maggieQty = 0;
			System.out.println("----------------------------------------------");
			}
		else if(maggieReqQ <= maggieQty) {
			System.out.println("Sold Qualtity of Maggie :" +maggieReqQ);	
			maggieQty = maggieQty -maggieReqQ;
			System.out.println("----------------------------------------------");
				}
				// Code for Dosa Start
	if (dosaReqQ > dosaQty) {
		System.out.println("Sorry! we have only "+dosaQty+ " available");
		int pendDosa = dosaReqQ - dosaQty;
		System.out.println("Requested Qualtity of Dosa batter :" +dosaReqQ);
		System.out.println("Sold Qualtity of Dosa batter :" +dosaQty);
		System.out.println("Please purchase " +pendDosa+ " packets of Dosa Batter Tomorrow");
		dosaQty = 0;
		System.out.println("----------------------------------------------");
		}
	else if(dosaReqQ <= dosaQty) {
		System.out.println("Sold Qualtity of Dosa :" +dosaReqQ);	
		dosaQty = dosaQty - dosaReqQ;
		System.out.println("----------------------------------------------");
			}
			// Code for Dosa End
	
			// Code for Oil packet Start
	if (oilReqQ > oilPQty) {
		System.out.println("Sorry! we have only "+oilPQty+ " available");
		int pendOil = oilReqQ - oilPQty;
		System.out.println("Requested Qualtity of Oil Packets :" +oilReqQ);
		System.out.println("Sold Qualtity of Oil packets :" +oilPQty);
		System.out.println("Please purchase " +pendOil+ " packets of Oil Packets Tomorrow");
		oilPQty = 0;
		System.out.println("----------------------------------------------");
			}
	else if(oilReqQ <= oilPQty) {
		System.out.println("Sold Qualtity of Oil Packets :" +oilReqQ);	
		oilPQty = oilPQty - oilReqQ;
		System.out.println("----------------------------------------------");
			}
          	// Code for Oil packet End 
	
	        // Code for panipuri Start 
	if (panipuriReqQ > panipuriQty) {
		System.out.println("Sorry! we have only "+panipuriQty+ " available");
		int pendPaniPuri = panipuriReqQ - panipuriQty;
		System.out.println("Requested Qualtity of pani Puri Packets :" +panipuriReqQ);
		System.out.println("Sold Qualtity of pani Puri :" +panipuriQty);
		System.out.println("Please purchase " +pendPaniPuri+ " packets of Pani Puri Tomorrow");
		panipuriQty = 0;
		System.out.println("----------------------------------------------");
		}
	else if(panipuriReqQ <= panipuriQty) {
		System.out.println("Sold Qualtity of Panipuri :" +panipuriReqQ);
		panipuriQty = panipuriQty - panipuriReqQ;
		System.out.println("----------------------------------------------");
			}
	        // Code for panipuri End 
	
	        // Code for masala Start 
	if (masalaReqQ > masalaQty) {
		System.out.println("Sorry! we have only "+masalaQty+ " available");
		int pendMasala = masalaReqQ - masalaQty;
		System.out.println("Requested Qualtity of masala Packets :" +masalaReqQ);
		System.out.println("Sold Qualtity of Masala packets :" +masalaQty);
		System.out.println("Please purchase " +pendMasala+ " packets of Masala Tomorrow");
		masalaQty = 0;
		System.out.println("----------------------------------------------");
		}
	else if(masalaReqQ <= masalaQty) {
		System.out.println("Sold Qualtity of Masala :" +masalaReqQ);	
		masalaQty = masalaQty - masalaReqQ;
		System.out.println("----------------------------------------------");
			}		
	       // Code for Masala End 
		}

	void avaliableStock() {
		System.out.println("Available Ouantiy of Maggie : "+maggieQty);
		System.out.println("Available Ouantiy of Dosa Batter : "+dosaQty);
		System.out.println("Available Ouantiy of Oil Packets : "+oilPQty);
		System.out.println("Available Ouantiy of Panipuri : "+panipuriQty);
		System.out.println("Available Ouantiy of Masala packets : "+masalaQty);
		System.out.println("----------------------------------------------");
	}
	
	void outOfStock() {
		System.out.println("*****OUT OF STOCK ITEMS DETAILS*****");
		if (maggieQty==0) {
			System.out.println("Maggie : Out of Stock");
		}	
		if (dosaQty==0) {
			System.out.println("Dosa Batter : Out of Stock");
		}	
		if (oilPQty==0) {
			System.out.println("Oil packets : Out of Stock");
		}	
		if (panipuriQty==0) {
			System.out.println("Panipuri : Out of Stock");
		}	
		if (masalaQty==0) {
			System.out.println("Masala Packets : Out of Stock");
		}	
		
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("*****INVENTORY DETAILS*****");
		shop.SetInventory(50, 45, 40, 35, 30);
		shop.avaliableStock();
		shop.customerOrder(50,48,39,37,32);
		System.out.println("*****AVAILABLE STOCK DETAILS*****");
		shop.avaliableStock();
		shop.outOfStock();
	}

}

/*
Assignment  7  : 30th March 2021 
1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.


NOTE : Please create separate branches for assignment 6 and 7. 

*/