package prachi.Assignment14;

import java.util.Scanner;

public class ScannerShop {


	int maggieQ, dosaQ, pouchesQ, panipuriQ, masalaQ;

	void quantity(int maggie, int dosa, int pouches, int panipuri, int masala){
		maggieQ = maggie;
		dosaQ = dosa;
		pouchesQ = pouches;
		panipuriQ = panipuri;
		masalaQ = masala;
	}

	void quantityReq(int maggie, int dosa, int pouches, int panipuri, int masala){
		if(maggieQ>=maggie){
			maggieQ  = maggieQ - maggie;
			System.out.println("Purchased Maggie quantity is " + maggie);
		}
		else if(maggieQ<maggie){
			System.out.println("We can provide only " + maggieQ + " items for maggie");
		}

		if(dosaQ>=dosa){
			dosaQ  = dosaQ - dosa;
			System.out.println("Purchased Dosa quantity is " + dosa);
		}
		else if(dosaQ<dosa){
			System.out.println("We can provide only " + dosaQ + " items for dosa");
		}

		if(pouchesQ>=pouches){
			pouchesQ  = pouchesQ - pouches;
			System.out.println("Purchased pouches quantity is " + pouches);
		}
		else if(pouchesQ<pouches){
			System.out.println("We can provide only " + pouchesQ + " items for pouches");
		}

		if(panipuriQ>=panipuri){
			panipuriQ  = panipuriQ - panipuri;
			System.out.println("Purchased panipuri quantity is " + panipuri);
		}
		else if(panipuriQ<panipuri){
			System.out.println("We can provide only " + panipuriQ + " items for panipuri");
		}

		if(masalaQ>=masala){
			masalaQ  = masalaQ - masala;
			System.out.println("Purchased masala quantity is " + masala);
		}
		else if(masalaQ<masala){
			System.out.println("We can provide only " + masalaQ + " items for masala");
		}
	}

	void outOfStock(){

		if(maggieQ==0){
			System.out.println("Maggie is out of stock");
		}
		if(dosaQ==0){
			System.out.println("Dosa is out of stock");
		}
		if(pouchesQ==0){
			System.out.println("Pouches is out of stock");
		}
		if(panipuriQ==0){
			System.out.println("Panipuri is out of stock");
		}
		if(masalaQ==0){
			System.out.println("Masala is out of stock");
		}

	}

	void availableStock(){
		System.out.println("Available maggie stock is " + maggieQ);
		System.out.println("Available dosa stock is " + dosaQ);
		System.out.println("Available pouches stock is " + pouchesQ);
		System.out.println("Available panipuri stock is " + panipuriQ);
		System.out.println("Available masala stock is " + masalaQ);
		System.out.println("============================================");
	}


	public static void main(String[] args){
		ScannerShop shopScanner = new ScannerShop();
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Available count of item on shop is");
		System.out.print("Enter available Maggie count: ");
		int maggieQuant = scanner.nextInt();
		System.out.print("Enter available Dosa count: ");
		int dosaQuant = scanner.nextInt();
		System.out.print("Enter available Pouches count: ");
		int pouchesQuant = scanner.nextInt();
		System.out.print("Enter available Panipuri count: ");
		int paniPuriQuant = scanner.nextInt();
		System.out.print("Enter availbale Masala count: ");
		int masalaQuant = scanner.nextInt();
		shopScanner.quantity(maggieQuant,dosaQuant,pouchesQuant,paniPuriQuant,masalaQuant);

		System.out.println("=========================================================");
		System.out.println("Enter Ordered quantity");
		System.out.print("Maggie order: ");
		int maggieOrd = scanner.nextInt();
		System.out.print("Dosa order: ");
		int dosaOrd = scanner.nextInt();
		System.out.print("Pouches order: ");
		int pouchesOrd = scanner.nextInt();
		System.out.print("Panipuri order: ");
		int paniPuriOrd = scanner.nextInt();
		System.out.print("Masala order: ");
		int masalaOrd = scanner.nextInt();
		shopScanner.quantityReq(maggieOrd,dosaOrd,pouchesOrd,paniPuriOrd,masalaOrd);
		System.out.println("=========================================================");
		shopScanner.outOfStock();
		System.out.println("=========================================================");
		shopScanner.availableStock();
	}
}

