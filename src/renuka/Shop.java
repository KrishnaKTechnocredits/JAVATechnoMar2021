package renuka;

public class Shop {
		
	 int maggieQ;
	 int dosaQ;
	 int pouchesQ;
	 int panipuriQ;
	 int masalaQ;
	
	
	void setQ(int reqMaggieQ, int reqDosaQ, int reqPouchesQ, int reqPanipuriQ, int reqMasalaQ) {
		maggieQ = reqMaggieQ;
		dosaQ = reqDosaQ;
		pouchesQ = reqPouchesQ;
		panipuriQ = reqPanipuriQ;
		masalaQ = reqMasalaQ;
	}	
	
	void requestedQ(int reqMaggieQ, int reqDosaQ, int reqPouchesQ, int reqPanipuriQ, int reqMasalaQ) {
		if(reqMaggieQ <= maggieQ) {
		maggieQ = maggieQ - reqMaggieQ;
		System.out.println("Remaining Qty is: " +maggieQ);
		}
		else {
			System.out.println("Insufficient Quantity");
			maggieQ = 0;
		}
		if(reqDosaQ <= dosaQ) {
			maggieQ = maggieQ - reqDosaQ;
			System.out.println("Remaining Qty is: " +dosaQ);
			}
			else {
				System.out.println("Insufficient Quantity");
				
			}
		if(reqPouchesQ <= pouchesQ) {
			pouchesQ = pouchesQ - reqPouchesQ;
			System.out.println("Remaining Qty is: " +pouchesQ);
			}
			else {
				System.out.println("Insufficient Quantity");
				
			}
		if(reqPanipuriQ <= panipuriQ) {
			panipuriQ = panipuriQ - reqPanipuriQ;
			System.out.println("Remaining Qty is: " +panipuriQ);
			}
			else {
				System.out.println("Insufficient Quantity");
				
			}
		if(reqMasalaQ <= masalaQ) {
			masalaQ = masalaQ - reqMasalaQ;
			System.out.println("Remaining Qty is: " +masalaQ);
			}
			else {
				System.out.println("Insufficient Quantity");
				
			}
	}
	
	void outOfStockQ() {
		if(maggieQ == 0) {
		    System.out.println("Maggie is out of stock");
		}
		if(dosaQ == 0) {
			System.out.println("Dosa is out of stock");
		}
		if(pouchesQ == 0) {
			System.out.println("Pouches is out of stock");
		}
		if(panipuriQ == 0) {
			System.out.println("Panipuri is out of stock");
		}
		if(masalaQ == 0) {
			System.out.println("Masala is out of stock");
		}
	}
	
	void availableInStockQ() {
		System.out.println("Available Qty is: "+maggieQ);
		System.out.println("Available Qty is: "+dosaQ);
		System.out.println("Available Qty is: "+pouchesQ);
		System.out.println("Available Qty is: "+panipuriQ);
		System.out.println("Available Qty is: "+masalaQ);
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setQ(50,43,39,43,73);
		shop.requestedQ(15,50,30,45,80);
		shop.outOfStockQ();
		shop.availableInStockQ();

	}

}
