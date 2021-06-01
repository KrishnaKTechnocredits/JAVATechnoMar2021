package shashank.assignment_14;

import java.util.Scanner;

public class Shop_Scanner {

	int maggieQ = 50;
	int dosaQ = 43;
	int oilPouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;

	public void requestedQ(int maggieQ, int dosaQ, int oilPouchesQ, int panipuriQ, int masalaQ, boolean reqType) {
		if (maggieQ == 0)
			System.out.println("Sorry maggie running out of stock");
		else if (this.maggieQ > maggieQ) {
			System.out.println("We are serving your request for maggie");
			this.maggieQ -= maggieQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of maggie " + maggieQ);
			this.maggieQ = 0;
		}

		if (dosaQ == 0)
			System.out.println("Sorry dosa running out of stock");
		else if (this.dosaQ > dosaQ) {
			System.out.println("We are serving your request for dosa");
			this.dosaQ -= dosaQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of maggie " + dosaQ);
			this.dosaQ = 0;
		}

		if (oilPouchesQ == 0)
			System.out.println("Sorry oil pouches running out of stock");
		else if (this.oilPouchesQ > oilPouchesQ) {
			System.out.println("We are serving your request for oil pouches");
			this.oilPouchesQ -= oilPouchesQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of oil pouches " + oilPouchesQ);
			this.oilPouchesQ = 0;
		}

		if (panipuriQ == 0)
			System.out.println("Sorry panipuri running out of stock");
		else if (this.panipuriQ > panipuriQ) {
			System.out.println("We are serving your request for panipuri");
			this.panipuriQ -= panipuriQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of panipuri " + panipuriQ);
			this.panipuriQ = 0;
		}

		if (masalaQ == 0)
			System.out.println("Sorry masala running out of stock");
		else if (this.masalaQ > masalaQ) {
			System.out.println("We are serving your request for masala");
			this.masalaQ -= masalaQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of masala " + masalaQ);
			this.masalaQ = 0;
		}
		System.out.println("");
	}

	public void outOfStock() {
		if (maggieQ == 0)
			System.out.println("Maggie running out of stock");
		if (dosaQ == 0)
			System.out.println("Dosa running out of stock");
		if (oilPouchesQ == 0)
			System.out.println("Oil Pouches running out of stock");
		if (panipuriQ == 0)
			System.out.println("Panipuri running out of stock");
		if (masalaQ == 0)
			System.out.println("Masala running out of stock");
		System.out.println("");
	}

	public void availableQuantity() {
		if (maggieQ != 0)
			System.out.println(maggieQ + " Maggie is available in stock");
		if (dosaQ != 0)
			System.out.println(dosaQ + " Dosa is available in stock");
		if (oilPouchesQ != 0)
			System.out.println(oilPouchesQ + " Oil Pouches is available in stock");
		if (panipuriQ != 0)
			System.out.println(panipuriQ + " Panipuri is available in stock");
		if (masalaQ != 0)
			System.out.println(masalaQ + " Masala is available in stock");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop_Scanner shop = new Shop_Scanner();
		shop.availableQuantity();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Raise your request");
		System.out.println("Enter Maggie Quantity:-");
		int maggie = scanner.nextInt();
		System.out.println("Enter Dosa Quantity:-");
		int dosa = scanner.nextInt();
		System.out.println("Enter Oil Pouches Quantity:-");
		int oilPouches = scanner.nextInt();
		System.out.println("Enter Panipuri Quantity:-");
		int panipuri = scanner.nextInt();
		System.out.println("Enter Masala Quantity:-");
		int masala = scanner.nextInt();
		System.out.println("Can we serve partial request if full quantities not available? true/false");
		boolean type = scanner.nextBoolean();
		shop.requestedQ(maggie, dosa, oilPouches, panipuri, masala, type);
		shop.outOfStock();
		scanner.close();

	}

}
