package meenu;

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

public class Shop {
	
	int maggieQ = 50;
	int dosaQ = 43;
	int oilQ = 39;
	int panipuriQ = 43;
	int masalaQ =73;
	boolean partialAllowed;
	
	void requiredQuantity(int maggie, int dosa,int oil,int panipuri,int masala,boolean pAllowed) {
		if(maggieQ == 0)
			System.out.println("Maggie is out of stock");
		else if(maggie<=maggieQ) 
		    maggieQ = maggieQ - maggie;
		else {
			if(pAllowed) {
				System.out.println("Sorry,we don't have sufficent quantity of maggie. We can give you: "+maggieQ);
				maggieQ = 0;
			}else 
				System.out.println("we don't have exact quantity of maggie as per your requirement.");
		}			
		if(dosaQ==0)
			System.out.println("Dosa is out of stock");
		else if(dosa<=dosaQ) 
			dosaQ = dosaQ - dosa;
		else {
			if(pAllowed) {
			    System.out.println("Sorry,we don't have sufficent quantity of dosa. We can give you: "+dosaQ);
			    dosaQ = 0;
			}else 
				System.out.println("we don't have exact quantity of dosa as per your requirement.");
		}
		if(oilQ==0)
			System.out.println("Oil is out of stock");
		else if(oil<=oilQ) 
			oilQ = oilQ -oil;
		else {
			if(pAllowed) {
				System.out.println("Sorry,we don't have sufficent quantity of oil. We can give you: "+oilQ); 
				oilQ = 0;
			}else
				System.out.println("we don't have exact quantity of oil as per your requirement");
		}
		if(panipuriQ==0)
			System.out.println("Panipuri is out of stock");
		else if(panipuri<=panipuriQ) 
			panipuriQ = panipuriQ - panipuri;
		else {
			if(pAllowed) {
				System.out.println("Sorry,we don't have sufficent quantity of panipuri. We can give you: "+panipuriQ); 
				panipuriQ = 0;	
			}else 
				System.out.println("we don't have exact quantity of panipuri as per your requirement");
		}
		if(masalaQ==0)
			System.out.println("Masala is out of stock");
		else if(masala<=masalaQ)
			masalaQ = masalaQ -masala;	
		else {
			if(pAllowed) {
				System.out.println("Sorry,we don't have sufficent quantity of masala. We can give you: "+panipuriQ);
				masalaQ = 0;
		    }else	
		    	System.out.println("we don't have exact quantity of masala as per your requirement");
		}		
	}
	
	void outOfStock() {
		System.out.println("Items which are out of stock : ");
		if(maggieQ == 0)
			System.out.println("Maggie");
		if(dosaQ == 0) 
			System.out.println("Dosa");
		if(oilQ == 0) 
			System.out.println("Oil");
		if(panipuriQ == 0)
			System.out.println("Panipuri");
		if(masalaQ == 0)
			System.out.println("Masala");
	}
		
	void availableStock() {
		System.out.println("Available items in shop :");
		if(maggieQ > 0)
			System.out.println(maggieQ+" maggie");
		if(dosaQ>0)
			System.out.println(dosaQ+" dosa");
		if(oilQ>0)
			System.out.println(oilQ+" oil");
		if(panipuriQ>0)
			System.out.println(panipuriQ+" panipuri");
		if(masalaQ>0)
			System.out.println(masalaQ+" masala");			
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.requiredQuantity(60,20,39,13,13,true);
		//shop.requiredQuantity(45, 25, 2, 3, 4,false);
		shop.outOfStock();
		shop.availableStock();

	}

}
