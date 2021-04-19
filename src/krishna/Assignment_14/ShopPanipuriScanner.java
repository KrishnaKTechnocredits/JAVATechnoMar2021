package krishna.Assignment_14;
import java.util.Scanner;

public class ShopPanipuriScanner {
	String maggie = "Maggie", dosa = "Dosa", pouches = "Pouches", panipuri = "Panipuri", masala = "Masala";
	int maggieQuan = 50, dosaQuan = 43, pouchesQuan = 39, panipuriQuan = 43, masalaQuan = 73;

	void setInitial(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		
		System.out.println("Available quantity for maggie :" + maggieQuan);
		System.out.println("Available quantity for dosa :" + dosaQuan);
		System.out.println("Available quantity for pouches :" + pouchesQuan);
		System.out.println("Available quantity for panipuri :" + panipuriQuan);
		System.out.println("Available quantity for masala :" + masalaQuan);
		System.out.println();
		if (maggieQ <= maggieQuan) {
			maggieQuan = maggieQuan - maggieQ;
			System.out.println("Requested " + maggie + ": " + maggieQ);
		} else {
			System.out.println("Sorry! We have only "+maggieQuan +" quantity of Maggie, so we are allowing partial purchase.");
			maggieQuan = 0;
		}
		if (dosaQ <= dosaQuan) {
			dosaQuan = dosaQuan - dosaQ;
			System.out.println("Requested " + dosa + ": " + dosaQ);
		} else {
			System.out.println("Sorry! We have only "+dosaQuan +" quantity of Dosa, so we are allowing partial purchase.");
			dosaQuan = 0;
		}
		if (pouchesQ <= pouchesQuan) {
			pouchesQuan = pouchesQuan - pouchesQ;
			System.out.println("Requested " + pouches + ": " + pouchesQ);
		} else {
			System.out.println("Sorry! We have only "+pouchesQuan +" quantity of pouches, so we are allowing partial purchase.");
			pouchesQuan = 0;
		}
		if (panipuriQ <= panipuriQuan) {
			panipuriQuan = panipuriQuan - panipuriQ;
			System.out.println("Requested " + panipuri + ": " + panipuriQ);
		} else {
			System.out.println("Sorry! We have only "+panipuriQuan +" quantity of panipuri, so we are allowing partial purchase.");
			panipuriQuan = 0;
		}
		if (masalaQ <= masalaQuan) {
			masalaQuan = masalaQuan - masalaQ;
			System.out.println("Requested " + masala + ": " + masalaQ);
		} else {
			System.out.println("Sorry! We have only "+masalaQuan +" quantity of masala, so we are allowing partial purchase.");
			masalaQuan = 0;
		}

	}

	void outOfStock() {
		System.out.println();
		System.out.println("* Checking out of stock items *");
		if (maggieQuan == 0) {
			System.out.println(maggie + " is running out of stock");
		}
		if (dosaQuan == 0) {
			System.out.println(dosa + " is running out of stock");
		}
		if (pouchesQuan == 0) {
			System.out.println(pouches + " is running out of stock");
		}
		if (panipuriQuan == 0) {
			System.out.println(panipuri + " is running out of stock");
		}
		if (masalaQuan == 0) {
			System.out.println(masala + " is running out of stock");
		}
	}

	void availableStock() {
		System.out.println();
		System.out.println(" * Checking available items in stock *");
		if (maggieQuan > 0) {
			System.out.println(maggie + " Available in stock & respective quantities is :" + maggieQuan);
		}
		if (dosaQuan > 0) {
			System.out.println(dosa + " Available in stock & respective quantities is :" + dosaQuan);
		}
		if (pouchesQuan > 0) {
			System.out.println(pouches + " Available in stock & respective quantities is :" + pouchesQuan);
		}
		if (panipuriQuan > 0) {
			System.out.println(panipuri + " Available in stock & respective quantities is :" + panipuriQuan);
		}
		if (masalaQuan > 0) {
			System.out.println(masala + " Available in stock & respective quantities is :" + masalaQuan);
		}
	}

	public static void main(String[] args) {
		
		ShopPanipuriScanner shopPanipuriScanner = new ShopPanipuriScanner();
		Scanner scanner = new Scanner(System.in);
		int maggieQ, dosaQ, pouchesQ,  panipuriQ,  masalaQ;
		
		System.out.print("Please enter Maggie requested quantity:");
		maggieQ = scanner.nextInt();
		
		System.out.print("Please enter dosa requested quantity:");
		dosaQ = scanner.nextInt();
		
		System.out.print("Please enter pouches requested quantity:");
		pouchesQ = scanner.nextInt();
		
		System.out.print("Please enter panipuri requested quantity:");
		panipuriQ = scanner.nextInt();
		
		System.out.print("Please enter masala requested quantity:");
		masalaQ = scanner.nextInt();
		System.out.println();
		shopPanipuriScanner.setInitial(maggieQ, dosaQ, pouchesQ, panipuriQ, masalaQ);
		System.out.println();
		shopPanipuriScanner.outOfStock();
		System.out.println();
		shopPanipuriScanner.availableStock();
		scanner.close();
	}
}
