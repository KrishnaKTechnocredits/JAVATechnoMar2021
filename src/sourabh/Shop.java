package sourabh;

public class Shop {
	int maggieQty;
	int dosaQty;
	int oilPacketsQty;
	int panipuriQty;
	int masalaQty;
	void setInitialStocks(int maggieQtyini, int dosaQtyini, int oilPacketsQtyini, int panipuriQtyini, int masalaQtyini) {
		maggieQty= maggieQtyini;
		dosaQty= dosaQtyini;
		oilPacketsQty= oilPacketsQtyini;
		panipuriQty= panipuriQtyini;
		masalaQty= masalaQtyini;
	}

	void customerPurchase(int maggieQtyCust , int dosaQtyCust, int oilPacketsQtyCust, int panipuriQtyCust, int masalaQtyCust) {
		System.out.println("*************************");
		if(maggieQtyCust<= maggieQty) {
			maggieQty= maggieQty- maggieQtyCust; 
			System.out.println("Maggie Purchased "+maggieQtyCust);
		}
		else{
			System.out.println("Maggie running out of stock");
			System.out.println("You can purchase maximum "+maggieQty+" quantity but You requested for "+maggieQtyCust+" quantity.");
			maggieQty=0;
		}
		if(dosaQtyCust<= dosaQty) {
			dosaQty= dosaQty- dosaQtyCust; 
			System.out.println("Dosa Purchased "+dosaQtyCust);
		}
		else{
			System.out.println("Dosa running out of stock");
			System.out.println("You can purchase maximum "+dosaQty+" quantity but You requested for "+dosaQtyCust+" quantity.");
			dosaQty=0;
		}
		if(oilPacketsQtyCust<= oilPacketsQty) {
			oilPacketsQty= oilPacketsQty- oilPacketsQtyCust; 
			System.out.println("Oil Packets Purchased "+oilPacketsQtyCust);
		}
		else{
			System.out.println("Oil packets running out of stock");
			System.out.println("You can purchase maximum "+oilPacketsQty+" quantity but You requested for "+oilPacketsQtyCust+" quantity.");
			oilPacketsQty=0;
		}
		if(panipuriQtyCust<= panipuriQty) {
			panipuriQty= panipuriQty- panipuriQtyCust; 
			System.out.println("Panipuri packets Purchased "+panipuriQtyCust);
		}
		else{
			System.out.println("Panipuri packets running out of stock");
			System.out.println("You can purchase maximum "+panipuriQty+" quantity but You requested for "+panipuriQtyCust+" quantity.");
			panipuriQty=0;
		}
		if(masalaQtyCust<= masalaQty) {
			masalaQty= masalaQty- masalaQtyCust; 
			System.out.println("Masala packets Purchased "+masalaQtyCust);
		}
		else{
			System.out.println("Masala packets running out of stock");
			System.out.println("You can purchase maximum "+masalaQty+" quantity but You requested for "+masalaQtyCust+" quantity.");
			masalaQty=0;
		}
	}
	void outOfStock() {
		System.out.println("*********Out of stock*********");
		if(maggieQty==0) 
			System.out.println("Maggie Out of stock");
		if(dosaQty==0)
			System.out.println("Dosha Out of stock");
		if(oilPacketsQty==0)
			System.out.println("Oil packets Out of stock");
		if(panipuriQty==0)
			System.out.println("Panipuri Packets Out of stock");
		if(masalaQty==0)
			System.out.println("Masala packets Out of stock");
	}
	void availableInStock() {
		System.out.println("*********Available in stock*********");
		if (maggieQty>0)
			System.out.println("Maggie available in stock "+maggieQty);
		if (dosaQty>0)
			System.out.println("Dosha available in stock "+dosaQty);
		if (oilPacketsQty>0)
			System.out.println("Oil packets available in stock "+oilPacketsQty);
		if (panipuriQty>0)
			System.out.println("Panipuri available in stock "+panipuriQty);
		if (masalaQty>0)
			System.out.println("Masala packets available in stock "+masalaQty);
	}
	
	public static void main(String[] args) {
		Shop shop= new Shop();
		shop.setInitialStocks(50, 43, 39, 43, 73);
		shop.customerPurchase(10, 48, 39, 10, 10);
		shop.outOfStock();
		shop.availableInStock();
		
	}	
}
