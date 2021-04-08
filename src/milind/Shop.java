package milind;

/*
 * 1. Create a system (Shop) which maintains each item's quantity.

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

public class Shop  {
	int maggie ; 
	int dosa ; 
	int oil_pouches ;
	int panipuri ;
	int masala ; 
	
	void setQantity(int reqmaggi,int reqdos,int reqoil_pouche,int reqpaniPuri,int reqmasla) {
		maggie=maggie-reqmaggi;
		dosa=dosa-reqdos;
		oil_pouches=oil_pouches-reqoil_pouche;
		panipuri=panipuri-reqpaniPuri;
		masala=masala-reqmasla;
	}
	
	void outofStock() {
		if(maggie==0)
			System.out.println("Maggie is out of stock");
		if(dosa==0)
			System.out.println("Dosa is out of stock");
		if(oil_pouches==0)
			System.out.println("Oil Pouches is out of stock");
		if(panipuri==0)
			System.out.println("Panipuri is out of stock");
		if(masala==0)
			System.out.println("Masala is out of stock");
		}
	
	void availableStock() {
		System.out.println("Available Stock is");
		if(maggie!=0) {
			System.out.println("Maggie is available in stock and Quantity is- " +maggie);
		}
		if(dosa!=0) {
			System.out.println("Dosa is available in stock and Quantity is- " +dosa);
	    }
		if(oil_pouches!=0) {
			System.out.println("Oil Pouches is available in stock and Quantity is- " +oil_pouches);
		}
		if(panipuri!=0) {
			System.out.println("Panipuri is available in stock and Quantity is- " +panipuri);
		}
		if(masala!=0) {
			System.out.println("Masala is available in stock and Quantity is- " +masala);
		}
	}
	
	void reqItem(int reqmaggi,int reqdos,int reqoil_pouche,int reqpaniPuri,int reqmasla,boolean partialSellingAllow) {
		if(reqmaggi <=maggie) {
			maggie=maggie-reqmaggi;
			System.out.println("Your Request Maggie Packets "+reqmaggi);
			System.out.println("Remaining Maggie Packet are "+maggie);
		}
		if(reqmaggi > maggie && partialSellingAllow) {
			System.out.println("We can provide only "+ maggie + " maggie packet you have request "+reqmaggi);
		}
		
		if(reqdos <=dosa) {
			dosa=dosa-reqdos;
			System.out.println("Your Request Dosa Packets "+reqdos);
			System.out.println("Remaining Dosa Packet are "+dosa);
		}
		if(reqdos > dosa && partialSellingAllow) {
			System.out.println("We can provide only "+ dosa + " Dosa packet you have request "+reqdos);
		}
		if(reqoil_pouche <=oil_pouches) {
			oil_pouches=oil_pouches-reqoil_pouche;
			System.out.println("Your Request Oil_Pouches Packets "+reqoil_pouche);
			System.out.println("Remaining Oil Pouches Packet are "+oil_pouches);
		}
		if(reqoil_pouche > oil_pouches && partialSellingAllow) {
			System.out.println("We can provide only "+ oil_pouches + " Oil Pouches packet you have request "+reqoil_pouche);
		}
		if(reqpaniPuri <=panipuri) {
			panipuri=panipuri-reqpaniPuri;
			System.out.println("Your Request Panipuri Packets "+reqpaniPuri);
			System.out.println("Remaining Panipuri Packet are "+panipuri);
		}
		if(reqpaniPuri > panipuri && partialSellingAllow) {
			System.out.println("We can provide only "+ panipuri + " Panipuri packet you have request "+reqpaniPuri);
		}
		if(reqmasla <=masala) {
			masala=masala-reqmasla;
			System.out.println("Your Request Masala Packets "+reqmasla);
			System.out.println("Remaining Masala Packet are "+masala);
		}
		if(reqmasla > masala && partialSellingAllow) {
			System.out.println("We can provide only "+ masala + " masala packet you have request "+reqmasla);
		}
	}

		
		public static void main(String[] a) {
			Shop shop=new Shop();
			shop.setQantity(50,43,39,43,73);
			shop.reqItem(10,25,31,8,12,true);
			shop.availableStock();
			shop.outofStock();
		}

		
	}
	
	

	
		

