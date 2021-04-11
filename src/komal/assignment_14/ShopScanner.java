package komal.assignment_14;

import java.util.Scanner;

public class ShopScanner {
	int maggie;
	int dosa;
	int oilpouch;
	int panipuri;
	int masala;
	
	void setInitStock() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the initial stock quantity for maggie: ");
		maggie = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for dosa: ");
		dosa = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for oilpouch: ");
		oilpouch = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for panipuri: ");
		panipuri = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for masala: ");
		masala = scanner.nextInt();
	}
		
	void requestedQty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reuested quantity for maggie: ");
		int maggieQ =sc.nextInt();
		System.out.println("Enter the reuested quantity for dosa: ");
		int dosaQ =sc.nextInt();
		System.out.println("Enter the reuested quantity for oilpouch: ");
		int oilpouchQ =sc.nextInt();
		System.out.println("Enter the reuested quantity for panipuri: ");
		int panipuriQ =sc.nextInt();
		System.out.println("Enter the reuested quantity for masala: ");
		int masalaQ =sc.nextInt();
		
		if(maggieQ<=maggie) {
			maggie = maggie-maggieQ;
		}else {
			System.out.println("Sorry!! Quantity available for maggie is not sufficient.");
			System.out.println("Requested Maggie qty "+maggieQ+" is greater than qty available in stock.We have fulfilled only partial request with "+maggie+" Maggie packets.\n");
			
			maggie=0;
		}
		if(dosaQ<=dosa) {
			dosa = dosa-dosaQ;
		}else {
			System.out.println("Sorry!! Quantity available for dosa is not sufficient.");
			System.out.println("Requested dosa qty "+dosaQ+" is greater than qty available in stock.We have fulfilled only partial request with "+dosa+" dosa packets.\n");
			
			dosa=0;
		}
		if(oilpouchQ<=oilpouch) {
			oilpouch = oilpouch-oilpouchQ;
		}else {
			System.out.println("Sorry!! Quantity available for oilpouch is not sufficient.");
			System.out.println("Requested oilpouch qty "+oilpouchQ+" is greater than qty available in stock.We have fulfilled only partial request with "+oilpouch+" oilpouch packets.\n");
			
			oilpouch=0;
		}
		if(panipuriQ<=panipuri) {
			panipuri = panipuri-panipuriQ;
		}else {
			System.out.println("Sorry!! Quantity available for panipuri is not sufficient.");
			System.out.println("Requested panipuri qty "+panipuriQ+" is greater than qty available in stock.We have fulfilled only partial request with "+panipuri+" panipuri packets.\n");
			
			panipuri=0;
		}
		if(masalaQ<=masala) {
			masala = masala-masalaQ;
		}else {
			System.out.println("Sorry!! Quantity available for masala is not sufficient.");
			System.out.println("Requested masala qty "+masalaQ+" is greater than qty available in stock.We have fulfilled only partial request with "+masala+" masala packets.\n");
			
			masala=0;
		}
	}
	void availableInStock() {
		if(maggie>0) {
			System.out.println("Available quantity of Maggie is "+ maggie);
		}
		if(dosa>0) {
			System.out.println("Available quantity of dosa is "+ dosa);
		}
		if(panipuri>0) {
			System.out.println("Available quantity of panipuri is "+ panipuri);
		}
		if(oilpouch>0) {
			System.out.println("Available quantity of oilpouch is "+ oilpouch);
		}
		if(masala>0) {
			System.out.println("Available quantity of masala is "+ masala);
		}
	}
	
	void outofStock() {
		if(maggie==0) {
			System.out.println("Maggie is out of stock");
		}
		if(dosa==0) {
			System.out.println("dosa is out of stock");
		}
		if(oilpouch==0) {
			System.out.println("oilpouch is out of stock");
		}
		if(panipuri==0) {
			System.out.println("panipuri is out of stock");
		}
		if(masala==0) {
			System.out.println("masala is out of stock");
		}
	}
	
	public static void main(String[] args) {
		ShopScanner shop = new ShopScanner();
		shop.setInitStock();
		System.out.println("Items available in stock are:  ");
		shop.availableInStock();
		System.out.println();
		shop.requestedQty();
		System.out.println("Items remaining after purchase are:  ");
		shop.availableInStock();
		shop.outofStock();
		}
}