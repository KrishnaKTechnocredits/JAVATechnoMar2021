package pallavi.Assignment_14;

import java.util.Scanner;

public class ShopUserInput {
	/*
	 * 1. Create a system (Shop) which maintains each item's quantity. a. Initial
	 * stocks of Maggie: 50 Maggie packets b. Initial stocks of Dosa : 43 packets c.
	 * Initial stocks of pouches : 39 oil packets d. Initial stocks of panipuri : 43
	 * packets e. Initial stocks of masala’s : 73 packets. Expectation: 1) Only one
	 * Customer came for shopping, he picked different items with different
	 * quantities, print "running out of stock" message if a particular item is sold
	 * out otherwise deduct requested quantity from total quantity. Partial selling
	 * is allowed. 2) Create a method which shows only those item which is
	 * "Out of stock". 3) Create a method which shows only those item which is
	 * "Available in stock" & respective quantities.
	 */

	int maggieQ;
	int dosaQ;
	int pouches;
	int panipuri;
	int masala;

	void setQuantity(int initialMaggieQ, int initialDosaQ, int initialPouchesQ, int initialPanipuriQ,
			int initialMasalaQ) {
		maggieQ = initialMaggieQ;
		dosaQ = initialDosaQ;
		pouches = initialPouchesQ;
		panipuri = initialPanipuriQ;
		masala = initialMasalaQ;
	}

	void outOfStock() {
		if (maggieQ == 0)
			System.out.println("Maggie is Out of stock");
		if (dosaQ == 0)
			System.out.println("Dosa is Out of stock");
		if (pouches == 0)
			System.out.println("Pouches is Out of stock");
		if (panipuri == 0)
			System.out.println("Panipuri is Out of stock");
		if (masala == 0)
			System.out.println("Masala is Out of stock");

	}

	void availabeItems() {
		System.out.println("--------------------------------Availabilty of stocks-----------------");
		if (maggieQ != 0) {
			System.out.println("Maggie is available in stock and Quantity is " + maggieQ);
		}
		if (dosaQ != 0) {
			System.out.println("Dosa is available in stock and Quantity is " + dosaQ);
		}
		if (pouches != 0) {
			System.out.println("Pouches is available in stock and Quantity is " + pouches);
		}
		if (panipuri != 0) {
			System.out.println("Panipuri is available in stock and Quantity is " + panipuri);
		}
		if (masala != 0) {
			System.out.println("Masala is available in stock and Quantity is " + masala);
		}

	}

	void reqItem(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala,
			boolean partialSellingAllowed) {
		if (reqMaggie <= maggieQ) {
			maggieQ = maggieQ - reqMaggie;
			System.out.println("Here is your Requested maggie packets" + reqMaggie);
			System.out.println("Remaining maggie packets are " + maggieQ);
		}

		else if (reqMaggie > maggieQ && partialSellingAllowed) {
			System.out.println("We can provide only " + maggieQ + " maggie packets you have requested for " + reqMaggie);
		}

		if (reqDosa <= dosaQ) {
			dosaQ = dosaQ - reqDosa;
			System.out.println("Here is your Requested Dosa packets" + reqDosa);
			System.out.println("Remaining Dosa packets are " + dosaQ);
		}

		else if (reqDosa > dosaQ && partialSellingAllowed) {
			System.out.println("We can provide only " + dosaQ + " dosa packets you have requested for" + reqDosa);
		}

		if (reqPouches <= pouches) {
			pouches = pouches - reqPouches;
			System.out.println("Here is your Requested Pouches packets" + reqPouches);
			System.out.println("Remaining maggie packets are " + pouches);
		}

		else if (reqPouches > pouches && partialSellingAllowed) {
			System.out
					.println("We can provide only " + pouches + " pouches packets you have requested for" + reqPouches);
		}

		if (reqPanipuri <= panipuri) {
			panipuri = panipuri - reqPanipuri;
			System.out.println("Here is your Requested Panipuri packets" + reqPanipuri);
			System.out.println("Remaining maggie packets are " + panipuri);
		}

		else if (reqPanipuri > panipuri && partialSellingAllowed) {
			System.out.println(
					"We can provide only " + panipuri + "panipuri packets you have requested for" + reqPanipuri);
		}

		if (reqMasala <= masala) {
			masala = masala - reqMasala;
			System.out.println("Here is your Requested masala packets" + reqMasala);
			System.out.println("Remaining maggie packets are " + masala);
		}

		else if (reqMasala > masala && partialSellingAllowed) {
			System.out.println("We can provide only " + masala + " masala packets you have requested for" + reqMasala);
		}

	}

	public static void main(String[] args) {
		ShopUserInput shopUserInput = new ShopUserInput();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Initial Maggie Packets");
		int maggieQ = sc.nextInt();
		System.out.println("Enter Initial Dosa Packets");
		int dosaQ = sc.nextInt();
		System.out.println("Enter Initial Pouches Packets");
		int pouches = sc.nextInt();
		System.out.println("Enter Initial Panipuri Packets");
		int panipuri = sc.nextInt();
		System.out.println("Enter Initial Masala Packets");
		int masala = sc.nextInt();
		shopUserInput.setQuantity(maggieQ, dosaQ, pouches, panipuri, masala);

		System.out.println("Enter required Maggie Packets");
		int reqMaggie = sc.nextInt();
		System.out.println("Enter required Dosa Packets");
		int reqDosa = sc.nextInt();
		System.out.println("Enter required Pouches Packets");
		int reqPouches = sc.nextInt();
		System.out.println("Enter required Panipuri Packets");
		int reqPanipuri = sc.nextInt();
		System.out.println("Enter required Masala Packets");
		int reqMasala = sc.nextInt();
		shopUserInput.reqItem(reqMaggie, reqDosa, reqPouches, reqPanipuri, reqMasala, true);
		shopUserInput.availabeItems();
		shopUserInput.outOfStock();

	}

}
