package vaibhav.SelfStudy;

public class Assignment_7_Shop {

	int iMaggie;
	int iDosa;
	int iPouches;
	int iPanipuri;
	int iMasala;

	void setData(int m, int D, int O, int P, int M) {
		iMaggie = m;
		iDosa = D;
		iPouches = O;
		iPanipuri = P;
		iMasala = M;
	}

	void requestedQuantity(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala) {
		if (reqMaggie <= iMaggie) {
			iMaggie = iMaggie - reqMaggie;
		} else if (reqMaggie > iMaggie) {
			System.out.println("We can only serve you only " + iMaggie
					+ " qauantities of Maggie as these are the maximum available number in stock");
			iMaggie = 0;
		}

		if (reqDosa <= iDosa) {
			iDosa = iDosa - reqDosa;
		} else if (reqMaggie > iMaggie) {
			System.out.println("We can only serve you only " + iDosa
					+ " qauantities of Dosa as these are the maximum available number in stock");
			iDosa = 0;
		}

		if (reqPouches <= iPouches) {
			iPouches = iPouches - reqPouches;
		} else if (reqPouches > iPouches) {
			System.out.println("We can only serve you only " + iPouches
					+ " qauantities of Pouches as these are the maximum available number in stock");
			iPouches = 0;
		}

		if (reqPanipuri <= iPanipuri) {
			iPanipuri = iPanipuri - reqPouches;
		} else if (reqPouches > iPanipuri) {
			System.out.println("We can only serve you only " + iPanipuri
					+ " qauantities of Panipuri as these are the maximum available number in stock");
			iPanipuri = 0;
		}

		if (reqMasala <= iMasala) {
			iMasala = iMasala - reqMasala;
		} else if (reqMasala > iMasala) {
			System.out.println("We can only serve you only " + iMasala
					+ " qauantities of Masala as these are the maximum available number in stock");
			iMasala = 0;
		}
	}

	void itemsOutOfStock() {
		System.out.println("");
		if ((iMaggie == 0) || (iDosa == 0) || (iPouches == 0) || (iPanipuri == 0) || (iMasala == 0)) {
			System.out.println("Out of stock items are as below : ");
			if (iMaggie == 0)
				System.out.println("Maggie ");
			if (iDosa == 0)
				System.out.print("Dosa ");
			if (iPouches == 0)
				System.out.print("Pouches ");
			if (iPanipuri == 0)
				System.out.print("Panipuri ");
			if (iMasala == 0)
				System.out.print("Masala");
		} else {
			System.out.println("No item is running out of stock");
		}
	}

	void itemsAvailable() {
		System.out.println("");
		System.out.println("");
		if ((iMaggie != 0) || (iDosa != 0) || (iPouches != 0) || (iPanipuri != 0) || (iMasala != 0)) {
			System.out.println("Avaiable items in stock are as below : ");
			if (iMaggie != 0)
				System.out.println("Maggie ");
			if (iDosa != 0)
				System.out.print("Dosa ");
			if (iPouches != 0)
				System.out.print("Pouches ");
			if (iPanipuri != 0)
				System.out.print("Panipuri ");
			if (iMasala != 0)
				System.out.print("Masala");
		}

	}

	public static void main(String[] args) {
		Assignment_7_Shop assignment_7_Shop = new Assignment_7_Shop();
		assignment_7_Shop.setData(50, 40, 30, 20, 10);
		assignment_7_Shop.requestedQuantity(10, 20, 30, 40, 50);
		assignment_7_Shop.itemsOutOfStock();
		assignment_7_Shop.itemsAvailable();
	}
}
