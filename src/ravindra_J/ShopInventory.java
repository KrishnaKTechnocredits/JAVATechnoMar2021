/* Assignment No : 7 >>
1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message
 if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.

NOTE : Please create separate branches for assignment 6 and 7.
 */
package ravindra_J;

public class ShopInventory {
	static int initialStockMaggie ;
	static int initialStockDosa;  
	static int initialStockOilPouches; 
	static int initialStockPanipuriPackets;
	static int initialStockMasalaPackets ;

	void setStockQuantity(int stockMaggie, int stockDosa,int stockOilPouches,int stockPanipuriPackets,int stockMasalaPackets){
		initialStockMaggie = stockMaggie;
		initialStockDosa = stockDosa;
		initialStockOilPouches = stockOilPouches;
		initialStockPanipuriPackets = stockPanipuriPackets;
		initialStockMasalaPackets = stockMasalaPackets;
	}

	void outOfStock(){
		if(initialStockMaggie == 0)
			System.out.println("Sorry!! Maggie are running out of stock for Maggie " +initialStockMaggie);
		if(initialStockDosa == 0)
			System.out.println("Sorry!! Dosa are running out of stock for Dosa " +initialStockDosa);
		if(initialStockOilPouches == 0)
			System.out.println("Sorry!! Oil Pouches are running out of stock for Oil Pouches " +initialStockOilPouches);
		if(initialStockPanipuriPackets == 0)
			System.out.println("Sorry!! Panipuri Packet are running out of stock for Panipuri Packets " +initialStockPanipuriPackets);
		if(initialStockMasalaPackets == 0)
			System.out.println("Sorry!! Masala Packets are running out of stock for Masala Packets " +initialStockMasalaPackets);
		else
			System.out.println("Thanks..,hope you enjoy shopping with us" );
	}

	void availableStock(){
		if(initialStockMaggie != 0)
			System.out.println("Stock for Maggie " +initialStockMaggie);
		if(initialStockDosa != 0)
			System.out.println("Stock for Dosa " +initialStockDosa);
		if(initialStockOilPouches != 0)
			System.out.println("Stock for Oil Pouches " +initialStockOilPouches);
		if(initialStockPanipuriPackets != 0)
			System.out.println("Stock for Panipuri Packet " +initialStockPanipuriPackets);
		if(initialStockMasalaPackets != 0)
			System.out.println("Stock for Masala Packets " +initialStockMasalaPackets);
		else
			System.out.println("WELCOME,,Please Keep Social Distancing While Shopping in the COVID-19 PENDAMIC " );
	}




	void requestedQuantity(int reqMaggie, int reqDosa,int reqOilP,int reqPanipuriP,int reqMasalaP, boolean partialQtyAllow){
		if(reqMaggie <= initialStockMaggie) {
			initialStockMaggie = initialStockMaggie - reqMaggie;
			System.out.println("Maggie You are Requested : "+reqMaggie+" and Updated Maggie Available Stock Is: " +initialStockMaggie);
		}
		else if(reqMaggie >= initialStockMaggie && partialQtyAllow) {
			initialStockMaggie = initialStockMaggie - reqMaggie;
			System.out.println("Sorry ! Maggie Are Running: "+initialStockMaggie+" Less in Stock , Please Pick the Available Stock Now, We will Shortly Fill the Maggie Stock");
		}
		else
			System.out.println("Sorry! Partial Qty is Not Allowed, Maggie You Are Requesting "+reqMaggie+" and We are Having Maggie Stock Quantity is " +initialStockMaggie);



		if(reqDosa <= initialStockDosa) {
			initialStockDosa = initialStockDosa - reqDosa;
			System.out.println("Dosa You are Requested: "+reqMaggie+" and Updated Dosa Available Stock Is: " +initialStockDosa);
		}
		else if(reqDosa >= initialStockDosa && partialQtyAllow) {
			initialStockDosa = initialStockDosa - reqDosa;
			System.out.println("Sorry ! Dosa Are Running: "+initialStockDosa+" Less in Stock, Please Pick the Dosa Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("Sorry! Partial Qty is Not Allowed, You Are Requesting Dosa "+reqDosa+" and We are Having Dosa Stock Quantity is " +initialStockDosa);

		if(reqOilP <= initialStockOilPouches) {
			initialStockOilPouches = initialStockOilPouches - reqOilP;
			System.out.println("OilP You are Requested: "+reqOilP+" and Updated OilP Available Stock Is: " +initialStockOilPouches);
		}
		else if(reqOilP >= initialStockOilPouches && partialQtyAllow) {
			initialStockOilPouches = initialStockOilPouches - reqOilP;
			System.out.println("Sorry ! We Are Running OilP : "+initialStockOilPouches+" Less in Stock, Please Pick the OilP Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("Sorry! Partial Qty is Not Allowed, You Are Requesting OilP "+reqOilP+" and We are Having OilP Stock Quantity is " +initialStockOilPouches);

		if(reqPanipuriP <= initialStockPanipuriPackets) {
			initialStockPanipuriPackets = initialStockPanipuriPackets - reqPanipuriP;
			System.out.println("Panipuri Pack You are Requested: "+reqPanipuriP+" and Updated Panipuri Pack Available Stock Is: " +initialStockPanipuriPackets);
		}
		else if(reqPanipuriP >= initialStockPanipuriPackets && partialQtyAllow) {
			initialStockPanipuriPackets = initialStockPanipuriPackets - reqPanipuriP;
			System.out.println("Sorry ! We Are Running Panipuri Pack: "+initialStockPanipuriPackets+" Less in Stock , Please Pick the Panipuri Pack Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("Sorry! Partial Qty is Not Allowed, You Are Requesting Panipuri Pack "+reqPanipuriP+" and We are Having Panipuri Pack Stock Quantity is " +initialStockPanipuriPackets);


		if(reqMasalaP <= initialStockMasalaPackets) {
			initialStockMasalaPackets = initialStockMasalaPackets - reqMasalaP;
			System.out.println("Masala Pack You are Requested: "+reqMasalaP+" and Updated Masala Pack Available Stock Is: " +initialStockMasalaPackets);
		}
		else if(reqMasalaP >= initialStockMasalaPackets && partialQtyAllow) {
			initialStockMasalaPackets = initialStockMasalaPackets - reqMasalaP;
			System.out.println("Sorry ! We Are Running Masala Pack: "+initialStockMasalaPackets+" Less in Stock , Please Pick the Masala Pack Available Stock Now, We will Shortly Fill the Stock");
		}
		else
			System.out.println("Sorry! Partial Qty is Not Allowed, You Are Requesting Masala Pack "+reqMasalaP+" and We are Having Masala Pack Stock Quantity is " +initialStockMasalaPackets);


	}

	public static void main(String[] args) {
		ShopInventory shopinventory = new ShopInventory();
		shopinventory.setStockQuantity(5,4,3,4,7); // stock set 50,43,39,43,73
		shopinventory.requestedQuantity(6,4,0,6,2,true); // request stock
		shopinventory.outOfStock();
		shopinventory.availableStock();

	}

}
