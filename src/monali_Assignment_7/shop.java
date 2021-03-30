package monali_Assignment_7;

public class shop {
	
	String maggiepacket;
	int maggiepacketQ;
	
	String dosa;
	int dosaQ;
	
	String pouches;
	int pouchesQ;
	
	String panipuri;
	int panipuriQ;
	
	String masala;
	int masalaQ;
	
	void initialQuantity() {
		maggiepacketQ = 50;
		dosaQ = 75;
		pouchesQ = 64;
		panipuriQ = 85;
		masalaQ = 35;
	}
	
	void reqQuantity(int maggie1 , int dosa2 , int pouches3 , int panipuri4 ,int masala5){
		maggiepacketQ = maggiepacketQ - maggie1;
		dosaQ = dosaQ - dosa2;
		pouchesQ = pouchesQ - pouches3;
		panipuriQ = panipuriQ - panipuri4;
		masalaQ = masalaQ - masala5;
		System.out.println("Quantity running out of stock");
		boolean  Pselling;
		Pselling = true;
	}
	
	void showOutOfStockItem() {
		System.out.println("out of stockQ" +maggiepacketQ);
		System.out.println("out of stockQ" +dosaQ);
		System.out.println("out of stockQ" +pouchesQ);
		System.out.println("out of stockQ" +panipuriQ);
		System.out.println("out of stockQ" +masalaQ);
	}
	
	void displayAvailableStock() {
		System.out.println("available stock" +maggiepacketQ);
		System.out.println("available stock" +dosaQ);
		System.out.println("available stock" +pouches);
		System.out.println("available stock" +panipuri);
		System.out.println("available stock" +masala);
	}
	
	
	public static void main(String[] a) {
		shop Shop = new shop();
		Shop.maggiepacketQ = 65;
		Shop.dosaQ = 45;
		Shop.pouchesQ = 74;
		Shop.panipuriQ = 45;
		Shop.masalaQ = 85;
		Shop.initialQuantity();
		Shop.showOutOfStockItem();
		Shop.displayAvailableStock();
	}
	{


	

		
		
		
		
		
		
		
		

		
		
		
		
	
		
	
	
		
		
		
		
		
		
	}
	
	

}
