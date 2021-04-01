/*Java Assignment 7: 30th March 2021

1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message
   if a particular item is sold outotherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.

*/

package vaibhav;

public class Shop {
	
	int iMaggie, iDosa, iPouches, iPanipuri,iMasala;
	
	void setInitialQualtiy (int qMaggie, int qDosa, int qPouches, int qPanipuri, int qMasala) {
		iMaggie = qMaggie;
		iDosa = qDosa;
		iPouches = qPouches;
		iPanipuri = qPanipuri;
		iMasala = qMasala;
	}
		
	void requestedItems( int reqMaggie , int reqDosa , int reqPouches, int reqPanipuri, int reqMasala , boolean pAllowed) {
		
		/// Maggie Check
		if (iMaggie == 0) {
			System.out.println("Maggie is running out of stock");		
		}else if (reqMaggie <= iMaggie) {
			iMaggie = iMaggie - reqMaggie;
		}else {
			System.out.println("Insufficient Maggie available in stock. We can serve you only " + iMaggie + " Maggie out of " + reqMaggie );
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iMaggie = 0;
		}
				
		// Dosa Check		
		if (iDosa == 0) {
			System.out.println("Dosa is running out of stock");
		}else if (reqDosa <= iDosa) {
			iDosa = iDosa - reqDosa;
		}else{
			System.out.println("Insufficient Dosa available in stock. We can serve you only " + iDosa + " Dosa out of " + reqDosa);
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iDosa = 0;
		}
		
		// Pouches Check
		if (iPouches == 0) {
			System.out.println("Pouches is running out of stock");
		}else if (reqPouches <= iPouches) {
			iPouches = iPouches - reqPouches;
		}else{
			System.out.println("Insufficient Pouches available in stock. We can serve you only " + iPouches + " Pouches out of " + reqPouches);
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iPouches = 0;
		}
		
		
		// Panipuri Check
		if (iPanipuri == 0) {
			System.out.println("Panipuri is running out of stock");
		}else if (reqPanipuri <= iPanipuri) {
			iPanipuri = iPanipuri - reqPanipuri;
		}else{
			System.out.println("Insufficient Panipuri available in stock. We can serve you only " + iPanipuri + " Panipuri out of " + reqPanipuri);
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iPanipuri = 0;
		}
		
		
		// Masala Check
		if (iMasala == 0) {
			System.out.println("Masala is running out of stock");
		}else if (reqMasala <= iMasala) {
			iMasala = iMasala - reqMasala;
		}else{
			System.out.println("Insufficient Masala available in stock. We can serve you only " + iMasala + " Masala out of " + reqMasala);
			if (pAllowed)		// pAllowed == true OR pAllowed == false
				iMasala = 0;
		}
	
		
	}
	
	
	void outOfStockItems() {
		System.out.println(" ");
		System.out.println("Out of stock items are : ");
		
		if (iDosa==0 || iMaggie==0 || iMasala==0 || iPanipuri == 0 || iPouches ==0) {
			if (iMaggie == 0)
				System.out.println("Maggie");
			if (iDosa == 0)
				System.out.println("Dosa");
			if (iPouches == 0)
				System.out.println("Pouches");
			if (iPanipuri == 0)
				System.out.println("Panipuri");
			if (iMasala == 0)
				System.out.println("Masala");
		}else {
			System.out.println("None");
		}
			
		
	}
	
	
	void avilableInStockItems() {
		System.out.println(" ");
		System.out.println("Avaiable in stock items are : ");
		
		if (iMaggie > 0)
			System.out.println("Maggie : " + iMaggie);
		if (iDosa > 0)
			System.out.println("Dosa : " + iDosa);
		if (iPouches > 0)
			System.out.println("Pouches : " + iPouches);
		if (iPanipuri > 0)
			System.out.println("Panipuri : " + iPanipuri);
		if (iMasala > 0)
			System.out.println("Masala : " + iMasala);
	}
	
	
	public static void main (String[] args) {
		Shop shop = new Shop();
		shop.setInitialQualtiy(50, 43, 39, 43, 73);
		shop.requestedItems(52, 44, 39, 42, 20, true);
		shop.outOfStockItems();
		shop.avilableInStockItems();
	}
	
}
