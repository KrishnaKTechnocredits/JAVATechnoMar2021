package radha.Assignment14;

import java.util.Scanner;

public class ShopScanner {
	int maggie;
	int dosa;
	int oilPouch;
	int panipuri;
	int masala;
	
	void setInitStock() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the initial stock quantity for maggie: ");
		maggie =scanner.nextInt();
		System.out.println("Enter the initial stock quantity for dosa: ");
		dosa =scanner.nextInt();
		System.out.println("Enter the initial stock quantity for oil pouch: ");
		oilPouch =scanner.nextInt();
		System.out.println("Enter the initial stock quantity for panipuri: ");
		panipuri =scanner.nextInt();
		System.out.println("Enter the initial stock quantity for masala: ");
		masala =scanner.nextInt();
	}
	
	void requestedQty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the requested quantity for maggie: ");
		int maggieQ =sc.nextInt();
		System.out.println("Enter the requested quantity for dosa: ");
		int dosaQ =sc.nextInt();
		System.out.println("Enter the requested quantity for oil pouch: ");
		int oilPouchQ =sc.nextInt();
		System.out.println("Enter the requested quantity for panipuri: ");
		int panipuriQ =sc.nextInt();
		System.out.println("Enter the requested quantity for masala: ");
		int masalaQ =sc.nextInt();
		
		if(maggieQ<=maggie) {
			maggie = maggie-maggieQ;
		}else{
			System.out.println("Sorry!! Quantity available for maggie is not suffcient.");
			System.out.println("Requested Maggie qty "+maggieQ+" is greater than qty available in stock. We have fulfilled only partial request with "+maggie+" Maggie packets. \n");
			maggie=0;
		}
		if(dosaQ<=dosa) {
			dosa = dosa - dosaQ;
		}else{
			System.out.println("Sorry!! Quantity available for dosa is not suffcient.");
			System.out.println("Requested Dosa qty "+dosaQ+" is greater than qty available in stock. We have fulfilled only partial request with "+dosa+" Dosa packets.\n");
			dosa=0;
		}
		if(oilPouchQ<=oilPouch) {
			oilPouch = oilPouch - oilPouchQ;
		}else{
			System.out.println("Sorry!! Quantity available for oil is not suffcient.");
			System.out.println("Requested Oil qty "+oilPouchQ+" is greater than qty available in stock. We have fulfilled only partial request with "+oilPouch+" Oil packets.\n");
			oilPouch=0;
		}
		if(panipuriQ<=panipuri) {
			panipuri = panipuri - panipuriQ;
		}else{
			System.out.println("Sorry!! Quantity available for panipuri is not suffcient.");
			System.out.println("Requested panipuri qty "+panipuriQ+" is greater than qty available in stock. We have fulfilled only partial request with "+panipuri+" panipuri packets.\n");
			panipuri=0;
		}
		if(masalaQ<=masala) {
			masala = masala - masalaQ;
		}else{
			System.out.println("Sorry!! Quantity available for masala is not suffcient.");
			System.out.println("Requested masala qty "+masalaQ+" is greater than qty available in stock. We have fulfilled only partial request with "+masala+" masala packets.\n");
			masala=0;
		}
	}
	
	void availableInStock() {
		if(maggie>0 ) {
			System.out.println("Available quantity of Maggie is "+ maggie);
		}
		if(dosa>0) {
			System.out.println("Availalbe quantity of dosa is "+ dosa);
		}
		if(oilPouch>0) {
			System.out.println("Availalbe quantity of Oil is "+ oilPouch);
		}
		if(panipuri>0) {
			System.out.println("Availalbe quantity of PaniPuri is "+ panipuri);
		}
		if(masala>0) {
			System.out.println("Availalbe quantity of Masala is "+ masala);	
		}
	}
	
	void outOfStock() {
		if(maggie==0 ) {
			System.out.println("Maggie is out of stock");
		}
		if(dosa==0) {
			System.out.println("Dosa is out of stock");
		}
		if(oilPouch==0) {
			System.out.println("Oil is out of stock");
		}
		if(panipuri==0) {
			System.out.println("Panipuri is out of stock");
		}
		if(masala==0) {
			System.out.println("Masala is out of stock");
		}
	}
	
	public static void main(String[] args) {
		ShopScanner shop = new ShopScanner();
		shop.setInitStock();
		System.out.println("*****Items available in stock are: *****");
		shop.availableInStock();
		System.out.println();
		shop.requestedQty();
		System.out.println("*****Items remaining after purchase are : *****");
		shop.availableInStock();
		shop.outOfStock();
	}
}
