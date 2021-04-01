/*Create a system (Shop) which maintains each item's quantity.

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

package milind;

public class Shop {
	int maggie;
	int dosa;
	int oil_pouches;
	int panipuri;
	int masala;
	
	void setinitial(int maggie1,int dosa1,int oil_pouches1,int panipuri1,int masala1) {
		 maggie=maggie1;
		 dosa=dosa1;
		 oil_pouches=oil_pouches1;
		 panipuri=panipuri1;
		 masala=masala1;
	}
	void reqQuantity(int reqmaggie,int reqdosa,int reqoil_pouches,int reqpanipuri,int reqmasala) {
		if(reqmaggie<=maggie) {
			maggie=maggie-reqmaggie;
		}else {
			System.out.println("Sorry not sufficient quantity,we can only give you: " +maggie);
			System.out.println("Maggie " +maggie+ "running out of stock");
			
		}
		if(reqdosa<=dosa) {
			dosa=dosa-reqdosa;
		}else {
			System.out.println("Sorry not sufficient quantity,we can only give you: " +dosa);
			System.out.println("Dosa " +dosa+ "running out of stock");
			
		}
		if(reqoil_pouches<=oil_pouches) {
			oil_pouches=oil_pouches-reqoil_pouches;
		}else {
			System.out.println("Sorry not sufficient quantity,we can only give you: " +oil_pouches);
			System.out.println("Oil pouches " +oil_pouches+ "running out of stock");
			
		}
		if(reqpanipuri<=panipuri) {
			panipuri=panipuri-reqpanipuri;
		}else {
			System.out.println("Sorry not sufficient quantity,we can only give you: " +panipuri);
			System.out.println("Panipuri " +panipuri+ "running out of stock");
			
		}
		if(reqmasala<=masala) {
			masala=masala-reqmasala;
		}else {
			System.out.println("Sorry not sufficient quantity,we can only give you: " +masala);
			System.out.println("Masala " +masala+ "running out of stock");
			
		}
		
	}
	void display() {
		System.out.println("Maggie available in Stock is " +maggie);
		System.out.println("Dosa available in Stock is " +dosa);
		System.out.println("Oil Pouches available in Stock is " +oil_pouches);
		System.out.println("Panipuri available in Stock is " +panipuri);
		System.out.println("Masala available in Stock is " +masala);
	}
	public static void main(String[] a) {
		Shop shop=new Shop();
		shop.setinitial(50, 43, 73, 43,39);
		shop.display();
		shop.reqQuantity(44, 40, 50, 30, 33);
		shop.display();
	}
}
