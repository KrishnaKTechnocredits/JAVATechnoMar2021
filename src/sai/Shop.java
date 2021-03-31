package sai;

/*
 * 1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.

 */

class Shop{
	
	int maggieQ;
	int dosaQ;
	int pouchesQ;
	int panipuriQ;
	int masalaQ;
	
	void quantity(int maggie, int dosa, int pouches, int panipuri, int masala){
		maggieQ = maggie;
		dosaQ = dosa;
		pouchesQ = pouches;
		panipuriQ = panipuri;
		masalaQ = masala;
	}

	void quantityReq(int maggie, int dosa, int pouches, int panipuri, int masala){
		
		
		if(maggieQ>=maggie){
			maggieQ  = maggieQ - maggie;
			System.out.println("Purchased Maggie quantity is " + maggie);
		}
		else if(maggieQ<maggie){
			System.out.println("We can provide only " + maggieQ + " items for maggie");
		}
		
		if(dosaQ>=dosa){
			dosaQ  = dosaQ - dosa;
			System.out.println("Purchased Dosa quantity is " + dosa);
		}
		
		else if(dosaQ<dosa){
			System.out.println("We can provide only " + dosaQ + " items for dosa");
		}
		
		if(pouchesQ>=pouches){
			pouchesQ  = pouchesQ - pouches;
			System.out.println("Purchased pouches quantity is " + pouches);
		}
		
		else if(pouchesQ<pouches){
			System.out.println("We can provide only " + pouchesQ + " items for pouches");
		}
		
		if(panipuriQ>=panipuri){
			panipuriQ  = panipuriQ - panipuri;
			System.out.println("Purchased panipuri quantity is " + panipuri);
		}
		
		else if(panipuriQ<panipuri){
			System.out.println("We can provide only " + panipuriQ + " items for panipuri");
		}
		
		if(masalaQ>=masala){
			masalaQ  = masalaQ - masala;
			System.out.println("Purchased masala quantity is " + masala);
		}
		
		else if(masalaQ<masala){
			System.out.println("We can provide only " + masalaQ + " items for masala");
		}
	}
		
	void outOfStock(){
		
		if(maggieQ==0){
			System.out.println("Maggie is out of stock");
		}
		if(dosaQ==0){
			System.out.println("Dosa is out of stock");
		}
		if(pouchesQ==0){
			System.out.println("Pouches is out of stock");
		}
		if(panipuriQ==0){
			System.out.println("Panipuri is out of stock");
		}
		if(masalaQ==0){
			System.out.println("Masala is out of stock");
		}
		
	}
	
	void availableStock(){
		System.out.println("Available maggie stock is " + maggieQ);
		System.out.println("Available dosa stock is " + dosaQ);
		System.out.println("Available pouches stock is " + pouchesQ);
		System.out.println("Available panipuri stock is " + panipuriQ);
		System.out.println("Available masala stock is " + masalaQ);
	}
		
	
	public static void main(String[] args){
		Shop shop = new Shop();
		shop.quantity(10,43,39,43,73);
		shop.quantityReq(10,41,40,34,50);
		shop.outOfStock();
		shop.availableStock();
	}
}