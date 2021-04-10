package priyanka_Panat.assignment14;

import java.util.Scanner;

public class ShopScanner {
	int totalMaggieQty = 50, totalDosaQty = 43, totalOilQty = 39, totalPanipuriQty = 43,
			totalMasalaQty = 73;


	void requestedQuantity() {
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

		if(maggieQ<=totalMaggieQty) {
			totalMaggieQty = totalMaggieQty-maggieQ;
		}else{
			System.out.println("Sorry !! Quantity available for maggie is not suffcient.");
			System.out.println("Requested Maggie quantity "+maggieQ+" is greater than quantity available in stock. We have fulfilled only partial request with "+totalMaggieQty+" Maggie packets. \n");
			totalMaggieQty=0;
		}
		if(dosaQ<=totalDosaQty) {
			totalDosaQty= totalDosaQty - dosaQ;
		}else{
			System.out.println("Sorry!! Quantity available for dosa is not suffcient.");
			System.out.println("Requested Dosa quantity "+dosaQ+" is greater than quantity available in stock. We have fulfilled only partial request with "+totalDosaQty+" Dosa packets.\n");
			totalDosaQty=0;
		}
		if(oilPouchQ<=totalOilQty) {
			totalOilQty= totalOilQty - oilPouchQ;
		}else{
			System.out.println("Sorry!! Quantity available for oil is not suffcient.");
			System.out.println("Requested Oil quantity"+oilPouchQ+" is greater than quantity available in stock. We have fulfilled only partial request with "+totalOilQty+" Oil packets.\n");
			totalOilQty=0;
		}
		if(panipuriQ<=totalPanipuriQty) {
			totalPanipuriQty = totalPanipuriQty - panipuriQ;
		}else{
			System.out.println("Sorry!! Quantity available for panipuri is not suffcient.");
			System.out.println("Requested panipuri quantity "+panipuriQ+" is greater than quantity available in stock. We have fulfilled only partial request with "+totalPanipuriQty+" panipuri packets.\n");
			totalPanipuriQty=0;
		}
		if(masalaQ<=totalMasalaQty) {
			totalMasalaQty = totalMasalaQty - masalaQ;
		}else{
			System.out.println("Sorry!! Quantity available for masala is not suffcient.");
			System.out.println("Requested masala quantity "+masalaQ+" is greater than quantity available in stock. We have fulfilled only partial request with "+totalMaggieQty+" masala packets.\n");
			totalMasalaQty=0;
		}
	}

	void availableInStock() {
		if(totalMaggieQty>0 ) {
			System.out.println("Available quantity of Maggie is "+ totalMaggieQty);
		}
		if(totalDosaQty>0) {
			System.out.println("Available quantity of dosa is "+ totalDosaQty);
		}
		if(totalOilQty>0) {
			System.out.println("Available quantity of Oil is "+ totalOilQty);
		}
		if(totalPanipuriQty>0) {
			System.out.println("Available quantity of PaniPuri is "+ totalPanipuriQty);
		}
		if(totalMasalaQty>0) {
			System.out.println("Available quantity of Masala is "+ totalMasalaQty);	
		}
	}

	void outOfStock() {
		if(totalMaggieQty==0 ) {
			System.out.println("Maggie is out of stock");
		}
		if(totalDosaQty==0) {
			System.out.println("Dosa is out of stock");
		}
		if(totalOilQty==0) {
			System.out.println("Oil is out of stock");
		}
		if(totalPanipuriQty==0) {
			System.out.println("Panipuri is out of stock");
		}
		if(totalMasalaQty==0) {
			System.out.println("Masala is out of stock");
		}
	}

	public static void main(String[] args) {
		ShopScanner shopscanner = new ShopScanner();
		System.out.println("---Items available in stock are:---");
		shopscanner.availableInStock();
		System.out.println();
		shopscanner.requestedQuantity();
		System.out.println("---Items remaining after purchase are : ---");
		shopscanner.availableInStock();
		shopscanner.outOfStock();
	}
}

