package paras.Assignment_7;

public class Shop {
	int maggieQuantity; 
	int dosaQuantity; 
	int pouchesQuantity; 
	int panipuriQuantity; 
	int masalaQuantity;
	
	void setInitialQ(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
		
		maggieQuantity = maggieQ;
		dosaQuantity = dosaQ;
		pouchesQuantity = pouchesQ;
		panipuriQuantity = panipuriQ;
		masalaQuantity = masalaQ;
	}
	
	void requestedQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ, boolean partialAllowed){
		
		if(maggieQuantity < 1){
			System.out.println("\n Maggie is Out of Stock");
		}else if(maggieQuantity >= maggieQ){
			System.out.println("\n As per your request, We will serve Maggie with " + maggieQ + " quantity");
			maggieQuantity = maggieQuantity - maggieQ;
		}else if(partialAllowed){
			System.out.println("\n We served partial Maggie Quantity and count is " + maggieQ);
			maggieQuantity = 0;
		}
		
		if(dosaQuantity < 1){
			System.out.println("\n Dosa is Out of Stock");
		}else if(dosaQuantity >= dosaQ){
			System.out.println("\n As per your request, We will serve Dosa with " + dosaQ + " quantity");
			dosaQuantity = dosaQuantity - dosaQ;
		}else if(partialAllowed){
			System.out.println("\n We served partial Dosa Quantity and count is " + dosaQ);
			dosaQuantity = 0; 
		}
		
		if(pouchesQuantity < 1){
			System.out.println("\n Pouches is Out of Stock");
		}else if(pouchesQuantity >= pouchesQ){
			System.out.println("\n As per your request, We will serve Pouches with " + pouchesQ + " quantity");
			pouchesQuantity = pouchesQuantity - pouchesQ;
		}else if(partialAllowed){
			System.out.println("\n We served partial Pouches Quantity and count is " + pouchesQ);
			pouchesQuantity = 0;
		}
		
		if(panipuriQuantity < 1){
			System.out.println("\n Panipuri is Out of Stock");
		}else if(panipuriQuantity >= panipuriQ){
			System.out.println("\n As per your request, We will serve Panipuri with " + panipuriQ + " quantity");
			panipuriQuantity = panipuriQuantity - panipuriQ;
		}else if(partialAllowed){
			System.out.println("\n We served partial Panipuri Quantity and count is " + panipuriQ);
			panipuriQuantity = 0;
		}
		
		if(masalaQuantity < 1){
			System.out.println("\n Masala is Out of Stock");
		}else if(masalaQuantity >= masalaQ){
			System.out.println("\n As per your request, We will serve Masala with " + masalaQ + " quantity");
			masalaQuantity = masalaQuantity - masalaQ;
		}else if(partialAllowed){
			System.out.println("\n We served partial Masala Quantity and count is " + masalaQ);
			masalaQuantity = 0;
		}
	}
	
	void outOfStock(){
		
		if(maggieQuantity < 1)
			System.out.println("\n Maggie is Out of Stock");
		if(dosaQuantity < 1)
			System.out.println("\n Dosa is Out of Stock");
		if(pouchesQuantity < 1)
			System.out.println("\n Pouches is Out of Stock");
		if(panipuriQuantity < 1)
			System.out.println("\n Panipuri is Out of Stock");
		if(masalaQuantity < 1)
			System.out.println("\n Masala is Out of Stock");
	}
	
	void availableStock(){
		
		if(maggieQuantity > 1)
			System.out.println("\n Available Quantity for Maggie is " + maggieQuantity);
		if(dosaQuantity > 1)
			System.out.println("\n Available Quantity for Dosa is " + dosaQuantity);
		if(pouchesQuantity > 1)
			System.out.println("\n Available Quantity for Pouches is " + pouchesQuantity);
		if(panipuriQuantity > 1)
			System.out.println("\n Available Quantity for Panipuri is " + panipuriQuantity);
		if(masalaQuantity > 1)
			System.out.println("\n Available Quantity for Masala is " + masalaQuantity);
	}
	
	public static void main(String[] args){
		Shop shop = new Shop();
		shop.setInitialQ(50,43,39,43,73);
		shop.requestedQuantity(40,43,40,30,50, true);
		System.out.println("\n ------------- List of Available Items ------------- : ");
		shop.availableStock();
		System.out.println("\n ------------- List of Out of Stock Items ------------- : ");
		shop.outOfStock();
	}
}
