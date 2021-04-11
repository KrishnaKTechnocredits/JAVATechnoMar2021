/*Assignment  7  : 30th March 2021 

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

package simmi.assignment_7;

class Shop{
	int maggieQty, dosaQty, pouchesQty, panipuriQty, masalaQty;
	
	void setQuantity(int reqMaggie,int reqDosa,int reqPouches, int reqPaniuri, int reqMasala) {
		maggieQty = reqMaggie;
		dosaQty = reqDosa;
		pouchesQty = reqPouches;
		panipuriQty = reqPaniuri;
		masalaQty = reqMasala;
	} 
	
	void order(int reqMaggie, int reqDosa, int reqPouches, int reqPaniuri, int reqMasala, boolean partialAllowedstatus) {
		System.out.println("ITEMS SOLD DETAILS");
		if (reqMaggie > maggieQty) {
			System.out.println("");
			System.out.println("We have only "+maggieQty+ " Maggie available");
			maggieQty = maggieQty - reqMaggie;
			System.out.println("Requested Quantity of Maggie :" +reqMaggie);
			System.out.println("Sold Quantity of Maggie :" +maggieQty);
			if(partialAllowedstatus) {
			maggieQty = 0;
				}
			}
		else if(reqMaggie <= maggieQty) {
			System.out.println("Quantity of maggi packets sold are" +reqMaggie);	
			maggieQty = maggieQty - reqMaggie;
			System.out.println("Number of quantity left are :" +maggieQty);
			}
				
	if (reqDosa > dosaQty) {
		System.out.println("");
		System.out.println("We have only "+dosaQty+ " available");
		dosaQty = dosaQty - reqDosa;
		System.out.println("Requested Quantity of Dosa batter :" +reqDosa);
		System.out.println("Sold Quantity of Dosa batter are :" +dosaQty);
		if(partialAllowedstatus) {
		dosaQty = 0;
			}
		}
	else if(reqDosa <= dosaQty) {
		System.out.println("Quantity of dosa batter sold are -" +reqDosa);	
		dosaQty = dosaQty - reqDosa;
		System.out.println("Number of quantity left are -" +dosaQty);
			}
	
			
	if (reqPouches > pouchesQty) {
		System.out.println("");
		System.out.println("We have only "+pouchesQty+ " items available");
		pouchesQty = pouchesQty - reqPouches;
		System.out.println("Requested Quantity of Oil Packets are :" +reqPouches);
		System.out.println("Sold Quantity of oil packets are :" +pouchesQty);
		if(partialAllowedstatus) {
		pouchesQty = 0;
				}
		}
	else if(reqPouches <= pouchesQty) {
		System.out.println("Quantity of oil pouches sold are :" +reqPouches);	
		pouchesQty = pouchesQty - reqPouches;
		System.out.println("Number of Quantity left are :" +pouchesQty);
			}
        
	if (reqPaniuri > panipuriQty) {
		System.out.println("");
		System.out.println("We only have "+panipuriQty+ " packets available");
		panipuriQty = panipuriQty - reqPaniuri;
		System.out.println("Requested Quantity of PaniPuri Packets are :" +reqPaniuri);
		System.out.println("Sold Quantity of PaniPuri packets are :" +panipuriQty);
		if(partialAllowedstatus) {
		panipuriQty = 0;
			}
		}
	else if(reqPaniuri <= panipuriQty) {
		System.out.println("Qualtity of panipuri sold are :" +reqPaniuri);
		panipuriQty = panipuriQty - reqPaniuri;
		System.out.println("Number of quantity left are :" +panipuriQty);
			}
	        
	if (reqMasala > masalaQty) {
		System.out.println("");
		System.out.println("We only have "+masalaQty+ " packets available");
		masalaQty = masalaQty - reqMasala;
		System.out.println("Requested Quantity of masala Packets are :" +reqMasala);
		System.out.println("Sold Quantity of Masala packets are :" +masalaQty);
		if(partialAllowedstatus) {
		masalaQty = 0;
			}
		}
	else if(reqMasala <= masalaQty) {
		System.out.println("Quantity of Masala sold are :" +reqMasala);	
		masalaQty = masalaQty - reqMasala;
		System.out.println("Number of quantity left are :" +masalaQty);
			}		
		}
	
	void outOfStock() {
		System.out.println("");
		System.out.println("Items OUT OF STOCK are :");
		if (maggieQty==0) {
			System.out.println("Maggie packets are OUT OF STOCK");
		}	
		if (dosaQty==0) {
			System.out.println("Dosa Batter are OUT OF STOCK");
		}	
		if (pouchesQty==0) {
			System.out.println("Oil packets are OUT OF STOCK");
		}	
		if (panipuriQty==0) {
			System.out.println("Panipuri are OUT OF STOCK");
		}	
		if (masalaQty==0) {
			System.out.println("Masala Packets are OUT OF STOCK");
		}	
		
	}
	
	void avaliableStock() {
		
		System.out.println("Available number of Maggie packets - "+maggieQty);
		System.out.println("Available number of Dosa Batter - "+dosaQty);
		System.out.println("Available number of Oil Packets - "+pouchesQty);
		System.out.println("Available number of Panipuri packets - "+panipuriQty);
		System.out.println("Available number of Masala packets - "+masalaQty);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("Total items available");
		shop.setQuantity(50, 43, 39, 43, 73);
		shop.avaliableStock();
		shop.order(55,51,46,67,41,true);
		shop.outOfStock();
		System.out.println("Items available in stock");
		shop.avaliableStock();
	}

}