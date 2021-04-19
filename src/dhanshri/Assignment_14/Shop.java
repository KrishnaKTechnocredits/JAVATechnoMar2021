package dhanshri.Assignment_14;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Shop {
	int maggieQ, dosaQ, pouchesQ, masalaQ, panipuriQ;

	void setinitialQ(int maggie, int dosa, int pouches, int panipuri, int masala) {
		maggieQ = maggie;
		dosaQ = dosa;
		pouchesQ = pouches;
		panipuriQ = panipuri;
		masalaQ = masala;

	}

	void requestedQ(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala,
			boolean pAllowedstatus) {

		if (reqMaggie <= maggieQ) {
			maggieQ = maggieQ - reqMaggie;
		} else {
			System.out.println("sorry ,requires maggie quantity is not available we can give you " + maggieQ);
			if (pAllowedstatus) {
				maggieQ = 0;
			}

		}

		if (reqDosa <= dosaQ) {
			dosaQ = dosaQ - reqDosa;
		} else {
			System.out.println("sorry ,requires dosa quantity is not available we can give you " + dosaQ);

			if (pAllowedstatus) {
				dosaQ = 0;
			}

		}

		if (reqPouches <= pouchesQ) {
			pouchesQ = pouchesQ - reqPouches;
		} else {
			System.out.println("sorry ,requires pouches quantity is not available we can give you " + pouchesQ);

			if (pAllowedstatus) {
				pouchesQ = 0;
			}

		}

		if (reqPanipuri <= panipuriQ) {
			panipuriQ = panipuriQ - reqPanipuri;
		} else {
			System.out.println("sorry ,requires panipuri quantity is not available we can give you " + panipuriQ);

			if (pAllowedstatus) {
				panipuriQ = 0;
			}

		}

		if (reqMasala <= masalaQ) {
			masalaQ = masalaQ - reqMasala;
		} else {
			System.out.println("sorry ,requires masala quantity is not available we can give you " + masalaQ);

			if (pAllowedstatus) {
				masalaQ = 0;
			}
		}

	}

	void outOfStockItems() {

		if (maggieQ == 0)
			System.out.println("Maggie is out of stock");
		if (dosaQ == 0)
			System.out.println("dosa is out of stock");
		if (pouchesQ == 0)
			System.out.println("pouch is out of stock");
		if (panipuriQ == 0)
			System.out.println("panipuri is out of stock");
		if (masalaQ == 0)
			System.out.println("masala is out of stock");

	}

	void availableStockItems() {
		if (maggieQ > 0)
			System.out.println(maggieQ + " maggie quantity items are available in stock");
		if (dosaQ > 0)
			System.out.println(dosaQ + " dosa  quantity items are available in stock");
		if (pouchesQ > 0)
			System.out.println(pouchesQ + " pouches quantity items are available in stock");
		if (panipuriQ > 0)
			System.out.println(panipuriQ + " panipuri packets are available in stock");
		if (masalaQ > 0)
			System.out.println(masalaQ + " masala quantity items are available in stock");

	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set Initial item quantity: ");
		int input = scanner.nextInt();
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();
		int input4 = scanner.nextInt();
		shop.setinitialQ(input, input1, input2, input3, input4);
		System.out.println("Enter required item quqntity: ");
		int input5 = scanner.nextInt();
		int input6 = scanner.nextInt();
		int input7 = scanner.nextInt();
		int input8 = scanner.nextInt();
		int input9 = scanner.nextInt();
		shop.requestedQ(input5, input6, input7, input7, input8, true);
		shop.outOfStockItems();
		shop.availableStockItems();
	}
}
