/*Assignment  7  : 30th March 2021 

1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
	print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
	Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/


package anubhav;

public class Shop {
	
	String maggi;
	int maggiQuantity;
	String dosa;
	int dosaQuantity;
	String oilPouch;
	int oilPouchQuantity;
	String panipuri;
	int panipuriQuantity;
	String masala;
	int masalaQuantity;
	
	void setInitialQuantity (int maggiQ, int dosaQ, int oilPouchQ, int panipuriQ, int masalaQ){
		maggiQuantity= maggiQ;
		dosaQuantity= dosaQ;
		oilPouchQuantity= oilPouchQ;
		panipuriQuantity= panipuriQ;
		masalaQuantity= masalaQ;
	}
	
	void quantityPicked (int maggiPicked, int dosaPicked, int oilPouchPicked, int panipuriPicked, int masalaPicked) {
		if (maggiPicked>0){
			maggiQuantity= maggiQuantity-maggiPicked;
			if (maggiQuantity <0) {
				System.out.println("Insufficient maggi stock available");
			}
			if (maggiQuantity == 0) {
				System.out.println("Maggi running our of stock");
			}
		}
		
		if (dosaPicked>0) {
			if (dosaQuantity <0) {
				System.out.println("Insufficient dosa stock");
			}
			dosaQuantity= dosaQuantity-dosaPicked;
			if (dosaQuantity == 0) {
				System.out.println("Dosa running our of stock");
			}
		}
		
		if (oilPouchQuantity>0) {
			oilPouchQuantity= oilPouchQuantity-oilPouchPicked;
			if (oilPouchQuantity <0) {
				System.out.println("Insufficient oil pouch stock");
			}
			if (oilPouchQuantity == 0) {
				System.out.println("Oil pouch running our of stock");
			}
		}
		
		if (panipuriQuantity>0) {
			panipuriQuantity= panipuriQuantity-panipuriPicked;
			if (panipuriQuantity <0) {
				System.out.println("Insufficient panipuri stock");
			}
			if (panipuriQuantity == 0) {
				System.out.println("Panipuri running our of stock");
			}
		}
		
		if (masalaQuantity>0) {
			masalaQuantity= masalaQuantity-masalaPicked;
			if (masalaQuantity <0) {
				System.out.println("Insufficient masala stock");
			}
			if (masalaQuantity == 0) {
				System.out.println("Masala running our of stock");
			}
		}
	}
		
		void remainingQuantity() {
		System.out.println("----REMAINING ITEMS & QUANTITY AVAILABLE----");
		if (maggiQuantity>0) {
			System.out.println("Quantity of maggi available in stock is : " + maggiQuantity);
		}
		
		if (dosaQuantity>0) {
			System.out.println("Quantity of dosa available in stock is : " + dosaQuantity);
		}
		
		if (oilPouchQuantity>0) {
			System.out.println("Quantity of oil pouch available in stock is : " + oilPouchQuantity);
		}
		
		if (panipuriQuantity>0) {
			System.out.println("Quantity of panipuri available in stock is : " + panipuriQuantity);
		}
		
		if (masalaQuantity>0) {
			System.out.println("Quantity of masala's available in stock is : " + masalaQuantity);
		}
	}
	
	void outOfStock() {
		System.out.println("----ITEMS OUT OF STOCK----");
		if (maggiQuantity<=0) {
			System.out.println("Maggi");
		}
		
		if (dosaQuantity<=0) {
			System.out.println("Dosa");
		}
		
		if (oilPouchQuantity<=0) {
			System.out.println("Oil Pouch");
		}
		
		if (panipuriQuantity<=0) {
			System.out.println("Panipuri");
		}
		
		if (masalaQuantity<=0) {
			System.out.println("Masala");
		}
	}
	
	public static void main (String[] args) {
		Shop shop= new Shop();
		shop.setInitialQuantity(100,80,0,40,20);
		shop.quantityPicked(100,0,0,30,30);
		shop.remainingQuantity();
		shop.outOfStock();
	}
}


