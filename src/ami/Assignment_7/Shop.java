/*
1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/

package ami.Assignment_7;

public class Shop {
	int maggie;
	int Dosa ;
	int pouches ;
	int panipuri ;
	int masala; 

	void setInital(int maggie1 ,int Dosa1 ,int pouches1, int panipuri1, int masala1) {
		maggie = maggie1;
		Dosa = Dosa1;
		pouches = pouches1;
		panipuri = panipuri1;
		masala = masala1;
			
	}
	
	void reqQty(int maggieR ,int DosaR ,int pouchesR, int panipuriR, int masalaR) {
		
		
		if(maggieR <= maggie) {
			maggie = maggie - maggieR;
		} else {
				System.out.println("maggie Actual QTY: "+ maggie + "Requested Qty : "+ maggieR + "Cound not fulfill your Damand");		
		}
		
		if(DosaR <= Dosa) {
			Dosa = Dosa - DosaR;
		} else {
				System.out.println("Dosa Actual QTY: "+ Dosa + "Requested Qty : "+ DosaR + "Cound not fulfill your Damand");		
		}
		
		if(pouchesR <= pouches) {
			pouches = pouches - pouchesR;
		} else {
				System.out.println("pouches Actual QTY: "+ pouches + "Requested Qty : "+ pouchesR + "Cound not fulfill your Damand");		
		}
		
		if(panipuri <= panipuri) {
			panipuri = panipuri - panipuriR;
		} else {
				System.out.println("panipuri Actual QTY: "+ panipuri + "Requested Qty : "+ panipuriR + "Cound not fulfill your Damand");		
		}
		
		if(masalaR <= masala) {
			masala = masala - masalaR;
		} else {
				System.out.println("masala Actual QTY: "+ masala + "Requested Qty : "+ masalaR + "Cound not fulfill your Damand");		
		}
	}
	
	void display() {
		System.out.println("Maggie Remaining QTY: " + maggie);
		System.out.println("dosa Remaining QTY: " + Dosa);
		System.out.println("pouches Remaining QTY: " + pouches);
		System.out.println("panipuri Remaining QTY: " + panipuri);
		System.out.println("masala Remaining QTY: " + masala);
	}
	
	void outOfStock() {
		if (maggie <= 0)
			System.out.println("maggie Out of stock");
		if (Dosa <= 0)
			System.out.println("Dosa Out of stock");
		if (pouches <= 0)
			System.out.println("pouches Out of stock");
		if (panipuri <= 0)
			System.out.println("panipuri Out of stock");
		if (masala <= 0)
			System.out.println("masala Out of stock");
	}
	
	
	void inStock() {
		if (maggie > 0)
			System.out.println("maggie in stock");
		if (Dosa > 0)
			System.out.println("Dosa in stock");
		if (pouches > 0)
			System.out.println("pouches in stock");
		if (panipuri > 0)
			System.out.println("panipuri in stock");
		if (masala > 0)
			System.out.println("masala in stock");
	}
	
	
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.setInital(50, 43, 39, 43, 73);
		shop.reqQty(24, 40, 30, 15, 26);
		shop.display();
		shop.inStock();
		shop.outOfStock();
	}
	
}

