package aashay;

/*
 * 1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala�s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */

public class Shop {
	
	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int panipur = 43;
	int masala = 73;
	
	void shoppingCart(int magi, int dsa, int poch, int ppuri, int msla) {
		System.out.println("Today morning stock is:");
		System.out.println("Maggie: "+maggie);
		System.out.println("Dosa: "+dosa);
		System.out.println("Pouches: "+pouches);
		System.out.println("Panipuri: "+panipur);
		System.out.println("Masala: "+masala);
				
		System.out.println("\nCustomer purchased following Items with respective quantity:");
		if (maggie <=magi && magi != 0 ) {
			
			System.out.println("Available stock of Maggie is:"+maggie +" Delivered packets: "+maggie);
			maggie =0 ;
		}else {
			maggie = maggie - magi;
			System.out.println("Available stock of Maggie is:"+maggie +" Delivered packets: "+magi);
		}
			
		if (dosa <=dsa && dsa != 0 ) {
			
			System.out.println("Available stock of Dosa is:"+dosa +" Delivered packets: "+dosa);
			dosa = 0 ;
		}else {
			dosa = dosa - dsa;
			System.out.println("Available stock of Dosa is:"+dosa +" Delivered packets: "+dsa);
		}
		if (pouches<=poch && poch != 0 ) {
			
			System.out.println("Available stock of Pouches is:"+pouches +" Delivered packets: "+pouches);
			pouches = 0 ;
		}else {
			pouches = pouches - poch;
			System.out.println("Available stock of Pouches is:"+pouches +" Delivered packets: "+poch);
		}
		if (panipur<=ppuri && ppuri != 0 ) {
			System.out.println("Available stock of Panipuri is:"+panipur +" Delivered packets: "+panipur);
			panipur = 0 ;
			
		}else {
			panipur = panipur - ppuri;
			System.out.println("Available stock of Panipuri is:"+panipur +" Delivered packets: "+ppuri);
		}
		if (masala<=msla && msla != 0 ) {
			
			System.out.println("Available stock of Masala is:"+masala +" Delivered packets: "+masala);
			masala =0;
		}else {
			masala = masala - msla ;
			System.out.println("Available stock of Masala is:"+masala +" Delivered packets: "+msla);
		}

	}
	void outOfStock() {
		System.out.println("\nFollowing items are running out of stock:");
		if (maggie == 0 )
			System.out.println("Maggie");
		if (dosa == 0 )
			System.out.println("Dosa");
		if (pouches == 0 )
			System.out.println("Pouches");
		if (panipur == 0 )
			System.out.println("Panipuri");
		if (masala == 0 )
			System.out.println("Masala");
			
	}
	void availableStock() {
		
		System.out.println("\nAvailable stock is:");
		if (maggie != 0 )
			System.out.println("Maggie: "+maggie);
		if (dosa != 0 )
			System.out.println("Dosa: "+dosa);
		if (pouches != 0 )
			System.out.println("Pouches: "+pouches);
		if (panipur != 0 )
			System.out.println("Panipuri: "+panipur);
		if (masala != 0 )
			System.out.println("Masala: "+masala);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.shoppingCart(50,43,9,0,0);
		shop.availableStock();
		shop.outOfStock();
		
		shop.shoppingCart(0,0,39,53,0);
		shop.availableStock();
		shop.outOfStock();
	}

}
