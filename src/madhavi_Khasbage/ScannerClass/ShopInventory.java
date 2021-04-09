package madhavi_Khasbage.ScannerClass;

import java.util.Scanner;

public class ShopInventory {
	int maggie = 1; 
	int dosa= 2;
	int pouches =3;
	int panipuri =4;
	int masala=5;	
	
	void totalQuantiry()
	{
		System.out.println("Total quantity:");	
		System.out.println("Maggie   :"+ maggie);	
		System.out.println("Dosa     :" + dosa);	
		System.out.println("Pouches  :" + pouches);	
		System.out.println("Panipuri :" +panipuri);	
		System.out.println("Masala   :" +masala + "\n");			
	}
	
	void shopping(int numOfCustomer, int reqMaggieQty,int reqDosaQty,int reqPouchesQty, int reqPanipuriQty, int reqMasalaQty) {
		if(numOfCustomer==1) {	
			System.out.println("\nPlacing customer order:");
			if(reqMaggieQty<=maggie) {
				maggie = maggie - reqMaggieQty;
				System.out.println( reqMaggieQty + " maggies added in cart.");				
			}else{				
				System.out.println("Maggie is out of stock.");
			}
			if(reqDosaQty<=dosa) {
				dosa = dosa - reqDosaQty;
				System.out.println(reqDosaQty + " dosa added in cart.");				
			}else {				
				System.out.println("dosa is out of stock.");
			}
			if(reqPouchesQty<=pouches) {
				pouches = pouches - reqPouchesQty;
				System.out.println(reqPouchesQty + " Pouches added in cart.");				
			}else {				
				System.out.println("Pouches is out of stock.");
			}
			if(reqPanipuriQty<=panipuri) {
				panipuri = panipuri - reqPanipuriQty;
				System.out.println(reqPanipuriQty + " Panipuri added in cart.");				
			}else {
				System.out.println("Panipuri is out of stock.");
			}
			if(reqMasalaQty<=masala) {
				masala = masala - reqMasalaQty;
				System.out.println(reqMasalaQty + " Masala added in cart.");				
			}else {
				System.out.println("Masala is out of stock.");
			}
			
		}else {
			System.out.println("Only one customer is allowed to purchase at a time.");
		}		
	}
	
	void outOfStockItem() {		
		System.out.println("\nOut of stock items :");		
		if(maggie ==0)System.out.println("Maggie");		
		if(dosa ==0) System.out.println("Dosa");
		if(pouches ==0) System.out.println("Pouches");
		if(panipuri ==0) System.out.println("Panipuri");
		if(masala ==0) System.out.println("Masala");		
	}
	
	void availableStock() {
		System.out.println("\nAvailable items :");
		if(maggie > 0)System.out.println("Maggie :" + maggie);		
		if(dosa > 0) System.out.println("Dosa :" + dosa );
		if(pouches >0) System.out.println("Pouches :" + pouches );
		if(panipuri >0) System.out.println("Panipuri :" + panipuri );
		if(masala >0) System.out.println("Masala :" + masala);	
	}
	
	public static void main(String[] args) {
		ShopInventory shop1=new ShopInventory();
		shop1.totalQuantiry();
		System.out.println("========================================");	
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Please enter below products quantity:\n");
		System.out.print("Maggie: ");
		int qMaggie = scanner.nextInt();
		System.out.print("Dosa: ");
		int qDosa = scanner.nextInt();
		System.out.print("Pouches: ");
		int qPouches = scanner.nextInt();
		System.out.print("Panipuri: ");
		int qPanipuri = scanner.nextInt();
		System.out.print("Masala: ");
		int qMasala = scanner.nextInt();
		
		
		shop1.shopping(1,qMaggie,qDosa,qPouches,qPanipuri,qMasala);
		shop1.outOfStockItem();
		shop1.availableStock();
		
	}
}
