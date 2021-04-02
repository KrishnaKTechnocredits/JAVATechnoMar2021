package priyanka_Kamble;


/*
 * Assignment  7  : 30th March 2021 

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
 */

public class Shop {
	int maggie_Quantity =50, dosa_Quantity =43, pouches_Quantity= 39, panipuri_Quantity= 43, masala_Quantity = 73;
	
	void Maggie(int reqMaggie) {
		System.out.println("\n Maggie Session : ");
		if(maggie_Quantity >0 && reqMaggie >0) {
			 if( maggie_Quantity>= reqMaggie) {
				maggie_Quantity = maggie_Quantity-reqMaggie;
				System.out.println("\t We have served "+reqMaggie+ " Maggie Packets");
				}
			 else if(maggie_Quantity <= reqMaggie) {
				 System.out.println("\t We have only " +maggie_Quantity+ " Maggie Packets available");
				 System.out.println("\t Selling " +maggie_Quantity+ " Maggie Packets to you");
				 maggie_Quantity =0;
				 System.out.println("\t Maggie is now Out of Stock");
			}
		}
		else
			System.out.println("\t Maggie is Out of Stock");
	}
	
	void dosa(int reqDosa) {
		System.out.println("\n Dosa Session : ");
		if(dosa_Quantity >0 && reqDosa >0) {
			 if( dosa_Quantity>= reqDosa) {
				dosa_Quantity = dosa_Quantity-reqDosa;
				System.out.println("\t We have served "+reqDosa+ " dosa's");
				}
			 else if(dosa_Quantity <= reqDosa) {
				 System.out.println("\t We have only " +dosa_Quantity+ " dosa's available");
				 System.out.println("\t Selling " +dosa_Quantity+ " dosa's to you");
				 dosa_Quantity =0;
				 System.out.println("\t dosa is now Out of Stock");
			}
		}
		else
			System.out.println("\t dosa is Out of Stock");
	}
	
	void Pouches(int reqPouches) {
		System.out.println("\n Oil Pouches Session : ");
		if(pouches_Quantity >0 && reqPouches >0) {
			 if( pouches_Quantity>= reqPouches) {
				pouches_Quantity = pouches_Quantity-reqPouches;
				System.out.println("\t We have served "+reqPouches+ " Oil Pouches's");
				}
			 else if(pouches_Quantity <= reqPouches) {
				 System.out.println("\t We have only " +pouches_Quantity+ " Oil Pouches's available");
				 System.out.println("\t Selling " +pouches_Quantity+ " Oil Pouches's to you");
				 pouches_Quantity =0;
				 System.out.println("\t Oil Pouches are now Out of Stock");
			}
		}
		else
			System.out.println("\t Oil Pouches are Out of Stock");
	}
	
	void panipuri(int reqPanipuri) {
		System.out.println("\n panipuri Session : ");
		if(panipuri_Quantity >0 && reqPanipuri >0) {
			 if( panipuri_Quantity>= reqPanipuri) {
				panipuri_Quantity = panipuri_Quantity-reqPanipuri;
				System.out.println("\t We have served "+reqPanipuri+ " panipuri's");
				}
			 else if(panipuri_Quantity <= reqPanipuri) {
				 System.out.println("\t We have only " +panipuri_Quantity+ " panipuri's available");
				 System.out.println("\t Selling " +panipuri_Quantity+ " panipuri's to you");
				 panipuri_Quantity =0;
				 System.out.println("\t panipuri is now Out of Stock");
			}
		}
		else
			System.out.println("\t panipuri is Out of Stock");
	}
	
	void masala(int reqMasala) {
		System.out.println("\n masala Session : ");
		if(masala_Quantity >0 && reqMasala >0) {
			 if( masala_Quantity>= reqMasala) {
				masala_Quantity = masala_Quantity-reqMasala;
				System.out.println("\t We have served "+reqMasala+ " masala's");
				}
			 else if(masala_Quantity <= reqMasala) {
				 System.out.println("\t We have only " +masala_Quantity+ " masala's available");
				 System.out.println("\t Selling " +masala_Quantity+ " masala's to you");
				 masala_Quantity =0;
				 System.out.println("\t masala is now Out of Stock");
			}
		}
		else
			System.out.println("\t masala is Out of Stock");
	}
	
	void outOfStock() {
		System.out.println("\n---------- Out of Stock Items are -------\n");
		if(maggie_Quantity ==0) 
			System.out.println("\t Maggie");
		if(dosa_Quantity ==0) 
			System.out.println("\t Dosa");
		if(pouches_Quantity ==0) 
			System.out.println("\t Oil Pouches");
		if(panipuri_Quantity ==0) 
			System.out.println("\t Panipuri");
		if(masala_Quantity ==0) 
			System.out.println("\t Masala");
	}
	
	void availableItems()
	{
		System.out.println("\n---------- Available Stock Quantity -------\n");
		System.out.println("\t Maggie - " +maggie_Quantity);
		System.out.println("\t Dosa - " +dosa_Quantity);
		System.out.println("\t Oil Pouches - " +pouches_Quantity);
		System.out.println("\t Panipuri Packets - " +panipuri_Quantity);
		System.out.println("\t Masala - " +masala_Quantity);
	}
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.Maggie(52);
		shop.dosa(40);
		shop.Pouches(30);
		shop.panipuri(63);
		shop.masala(100);
		shop.outOfStock();
		shop.availableItems();
		}
}
