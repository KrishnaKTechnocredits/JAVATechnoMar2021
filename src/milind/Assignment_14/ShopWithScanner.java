package milind.Assignment_14;

import java.util.Scanner;

public class ShopWithScanner {
	int maggie;
	int dosa;
	int oilpouch;
	int panipuri;
	int masala;
	
	void setInStock() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the initial stock quantity for maggie:  ");
		maggie=scanner.nextInt();
		System.out.println("Enter the initial stock quantity for dosa:  ");
		dosa=scanner.nextInt();
		System.out.println("Enter the initial stock quantity for oilpouch:  ");
		oilpouch=scanner.nextInt();
		System.out.println("Enter the initial stock quantity for panipuri:  ");
		panipuri=scanner.nextInt();
		System.out.println("Enter the initial stock quantity for masala:  ");
		masala=scanner.nextInt();
	}
	
	void requestQuantity() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the requested stock quantity for maggie:");
		int maggieQ=scanner.nextInt();
		System.out.println("Enter the requested stock quantity for dosa:");
		int dosaQ=scanner.nextInt();
		System.out.println("Enter the requested stock quantity for oilpouch:");
		int oilpouchQ=scanner.nextInt();
		System.out.println("Enter the requested stock quantity for panipuri:");
		int panipuriQ=scanner.nextInt();
		System.out.println("Enter the requested stock quantity for masala:");
		int masalaQ=scanner.nextInt();
		
		if(maggieQ<=maggie) {
			maggie=maggie-maggieQ;
		}else {
			System.out.println("Quantity avaible for maggie is not sufficient ");
			System.out.println("Requested maggie Quantity "+maggieQ+" is greater than Quantity in stock.fulfill only partial request with "+maggie+" maggie packet.\n");
			maggie=0;
		}
		if(dosaQ<=dosa) {
			dosa=dosa-dosaQ;
		}else {
			System.out.println("Quantity avaible for dosa is not sufficient ");
			System.out.println("Requested dosa Quantity "+dosaQ+" is greater than Quantity in stock.fulfill only partial request with "+dosa+" dosa packet.\n");
			dosa=0;
		}
		if(oilpouchQ<=oilpouch) {
			oilpouch=oilpouch-oilpouchQ;
		}else {
			System.out.println("Quantity avaible for oilpouch is not sufficient ");
			System.out.println("Requested oilpouch Quantity "+oilpouchQ+" is greater than Quantity in stock.fulfill only partial request with "+oilpouch+" oilpouch packet.\n");
			oilpouch=0;
		}
		if(panipuriQ<=panipuri) {
			panipuri=panipuri-panipuriQ;
		}else {
			System.out.println("Quantity avaible for panipuri is not sufficient ");
			System.out.println("Requested panipuri Quantity "+panipuriQ+" is greater than Quantity in stock.fulfill only partial request with "+panipuri+" panipuri packet.\n");
			panipuri=0;
		}
		if(masalaQ<=masala) {
			masala=masala-masalaQ;
		}else {
			System.out.println("Quantity avaible for masala is not sufficient ");
			System.out.println("Requested masala Quantity "+masalaQ+" is greater than Quantity in stock.fulfill only partial request with "+masala+" masala packet.\n");
			masala=0;
		}
	}
	
	void availbleInStock() {
		if(maggie>0) {
			System.out.println("Avaible Quantity of Maggie is: "+maggie);
		}
		if(dosa>0) {
			System.out.println("Avaible Quantity of Dosa is: "+dosa);
		}
		if(oilpouch>0) {
			System.out.println("Avaible Quantity of Oilpouch is: "+oilpouch);
		}
		if(panipuri>0) {
			System.out.println("Avaible Quantity of panipuri is: "+panipuri);
		}
		if(masala>0) {
			System.out.println("Avaible Quantity of Masala is: "+masala);
		}
	}
	void outOfStock() {
		if (maggie==0);{
			System.out.println("Maggie is out of Stock");
		}
		if (dosa==0);{
			System.out.println("Dosa is out of Stock");
		}
		if (oilpouch==0);{
			System.out.println("Oil Pouch is out of Stock");
		}
		if (panipuri==0);{
			System.out.println("Panipuri is out of Stock");
		}
		if (masala==0);{
			System.out.println("Masala is out of Stock");
		}
	}
	public static void main(String[] args) {
		ShopWithScanner shop=new ShopWithScanner();
		shop.setInStock();
		System.out.println("Item avaible in stock");
		shop.availbleInStock();
		System.out.println();
		shop.requestQuantity();
		System.out.println("Item remaining after purches are: ");
		shop.availbleInStock();
		shop.outOfStock();
	}
}
