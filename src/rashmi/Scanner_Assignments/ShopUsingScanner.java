package rashmi.Scanner_Assignments;

import java.util.Scanner;

public class ShopUsingScanner {

	int maggieq = 50;
	int dosaq = 43;
	int pouchesq = 39;
	int panipuriq = 43;
	int masalaq = 73;

	void purchase(int reqmaggie, int reqdosa, int reqpouch, int reqpanipuri, int reqmasala, boolean partial) {

		if (reqmaggie > maggieq) {
			if (true) {

				System.out.println("Requested maggie is " + reqmaggie + " but available stock is " + maggieq
						+ " you can buy partial " + maggieq);
				maggieq = 0;
			}
		}

		else {
			maggieq = maggieq - reqmaggie;
			System.out.println("requested maggi delivered: " + maggieq);

		}

		if (reqdosa > dosaq) {

			if (true) {
				System.out.println("Requested dosa is " + reqdosa + " but available stock is " + dosaq
						+ " you can buy partial " + dosaq);
				dosaq = 0;
			}
		}

		else {
			dosaq = dosaq - reqdosa;
			System.out.println("requested dosa delivered: " + dosaq);

		}

		if (reqpouch > pouchesq) {

			if (true) {
				System.out.println("Requested pouch is " + reqpouch + " but available stock is " + pouchesq
						+ " you can buy partial " + pouchesq);
				pouchesq = 0;

			}
		}

		else {
			pouchesq = pouchesq - reqpouch;
			System.out.println("requested pouch delivered: " + pouchesq);

		}

		if (reqpanipuri > panipuriq) {
			if (true) {
				System.out.println("Requested panipuri is " + reqpanipuri + " but available stock is " + panipuriq
						+ " you can buy partial " + panipuriq);
				panipuriq = 0;
			}
		}

		else {
			panipuriq = panipuriq - reqpanipuri;
			System.out.println("requested panipuri delivered: " + panipuriq);

		}

		if (reqmasala > masalaq) {
			if (true) {

				System.out.println("Requested masala is " + reqmasala + " but available stock is " + masalaq
						+ " you can buy partial " + masalaq);
				masalaq = 0;
			}
		}

		else {
			masalaq = masalaq - reqmasala;
			System.out.println("requested masala delivered: " + masalaq);

		}
	}

	void outOfStock() {

		if (maggieq == 0)
			System.out.println("maggie");

		if (dosaq == 0)
			System.out.println("dosa");

		if (pouchesq == 0)
			System.out.println("pouches");

		if (panipuriq == 0)
			System.out.println("panipuri");

		if (masalaq == 0)
			System.out.println("masala");

	}

	void availableInStock() {

		if (maggieq != 0)
			System.out.println("Maggie: " + maggieq);

		if (dosaq != 0)
			System.out.println("Dosa: " + dosaq);

		if (pouchesq != 0)
			System.out.println("Pouches: " + pouchesq);

		if (panipuriq != 0)
			System.out.println("Panipuri: " + panipuriq);

		if (masalaq != 0)
			System.out.println("Masala: " + masalaq);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ShopUsingScanner shopUsingScanner = new ShopUsingScanner();
		System.out.println("Enter the quantity of maggie : ");
		int magiqant = scanner.nextInt();
		System.out.println("Enter the quantity of dosa : ");
		int dosaqant = scanner.nextInt();
		System.out.println("Enter the quantity of pouches : ");
		int pouchesqant = scanner.nextInt();
		System.out.println("Enter the quantity of panipuri : ");
		int panipuriqant = scanner.nextInt();
		System.out.println("Enter the quantity of masala : ");
		int masalaqant = scanner.nextInt();
		System.out.println("partial status : ");
		boolean partialStatus = scanner.nextBoolean();
		shopUsingScanner.purchase(magiqant, dosaqant, pouchesqant, panipuriqant, masalaqant, partialStatus);
		shopUsingScanner.outOfStock();
		shopUsingScanner.availableInStock();
		scanner.close();

	}
}
