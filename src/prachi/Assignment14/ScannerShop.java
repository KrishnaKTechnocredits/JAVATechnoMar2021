package prachi.Assignment14;

import java.util.Scanner;

public class ScannerShop {


	/*shop of maggie and panipuri*/


	int maggieQ;
	int dosaQ;
	int pouchesQ;
	int panipuriQ;
	int masalasQ;

	void setInitialQualtity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of maggie available: ");
		maggieQ =scanner.nextInt();
		System.out.println("Enter no of dosa available: ");
		dosaQ =scanner.nextInt();
		System.out.println("Enter no of pouches available: ");
		dosaQ =scanner.nextInt();
		System.out.println("Enter no of panipuri available: ");
		dosaQ =scanner.nextInt();
		System.out.println("Enter no of masalas available: ");
		dosaQ =scanner.nextInt();
	}

	void custRequest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of maggie required: ");
		int maggie =scanner.nextInt();
		System.out.println("Enter no of dosa required: ");
		int dosa =scanner.nextInt();
		System.out.println("Enter no of pouches required: ");
		int pouches =scanner.nextInt();
		System.out.println("Enter no of panipuri required: ");
		int panipuri =scanner.nextInt();
		System.out.println("Enter no of masalas required: ");
		int masalas =scanner.nextInt();


		if(maggie ==0)
			System.out.println("Maggie is running out of stock");
		else if(maggie > maggieQ) 
			System.out.println("Partial selling of Maggie is allowed.");

		if(dosa ==0)
			System.out.println("Dosa is running out of stock.");
		else if(dosa > dosaQ)
			System.out.println("Partial selling of Dosa is allowed.");

		if(pouches ==0)
			System.out.println("Pouches are running out of stock.");
		else if(pouches > pouchesQ)
			System.out.println("Partial selling of Pouches is allowed.");

		if(panipuri ==0)
			System.out.println("Panipuri is running out of stock.");
		else if(panipuri > panipuriQ)
			System.out.println("Partial selling of Panipuri is allowed.");

		if(masalas ==0)
			System.out.println("Masala's is running out of stock.");
		else if(masalas > masalasQ)
			System.out.println("Partial selling of Masala's is allowed.");

	}
	
	void remainingStock() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Remaining stock is: ");
		int maggie =scanner.nextInt();
		System.out.println("Remaining stock is: ");
		int dosa =scanner.nextInt();
		System.out.println("Remaining stock is: ");
		int pouches =scanner.nextInt();
		System.out.println("Remaining stock is: ");
		int panipuri =scanner.nextInt();
		System.out.println("Remaining stock is: ");
		int masalas =scanner.nextInt();

		if ( maggie <= maggieQ){
			maggieQ = maggieQ - maggie;
			System.out.println(maggieQ);
		}

		if (dosa <= dosaQ){
			dosaQ = dosaQ - dosa;
			System.out.println(dosaQ);
		}

		if (pouches <= pouchesQ){
			pouchesQ = pouchesQ - pouches;
			System.out.println(pouchesQ);
		}

		if (panipuri <= panipuriQ){
			panipuriQ = panipuriQ - panipuri;
			System.out.println(panipuriQ);
		}

		if (masalas <= masalasQ){
			masalasQ = masalasQ - masalas;
			System.out.println(masalasQ);		
		}
	}	


	public static void main(String[] args) {
		ScannerShop scnshop = new ScannerShop();
		scnshop.setInitialQualtity();
		scnshop.custRequest();
		scnshop.remainingStock();
	}
}




