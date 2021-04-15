package shivani.Assignment_14;

import java.util.Scanner;

public class Shop_Scanner {
	int stockOfMaggie = 50;
	int stockOfDosa = 43;
	int stockOfPouches = 39;
	int stockOfPanipuri = 43;
	int stockOfMasala = 73;
	int item1Q, item2Q, item3Q, item4Q, item5Q;
	String customer;

	void displayOOS() {
		if (stockOfMaggie == 0 || stockOfMaggie < item1Q)

			System.out.println(" maggi is Out of Stock");
		else
			System.out.println("Maggi is availabe in stock Item: " + stockOfMaggie);
		if (stockOfDosa == 0 || stockOfDosa < item2Q)
			System.out.println("Dosa is Out of Stock");
		else
			System.out.println("Dosa is available is stock Item:" + stockOfDosa);
		if (stockOfPouches == 0 || stockOfPouches < item3Q)
			System.out.println("Pouches is Out of Stock");
		else
			System.out.println("Pouches is available in stock, Item: " + stockOfPouches);
		if (stockOfPanipuri == 0 || stockOfPanipuri < item4Q)
			System.out.println("Panipuri is Out of Stock");
		else
			System.out.println("PaniPuri is avialable in stock,Item: " + stockOfPanipuri);
		if (stockOfMasala == 0 || stockOfMasala < item5Q)
			System.out.println("Masala is Out of Stock");
		else
			System.out.println("Masala is available in Stock , item :" + stockOfMasala);

	}

	public void shopping(int item1Q, int item2Q, int item3Q, int item4Q, int item5Q) {
		if (stockOfMaggie == 0)
			System.out.println("running out of stock maggie ");

		else

			stockOfMaggie = stockOfMaggie - item1Q;
		if (stockOfDosa == 0)
			System.out.println("running out of stock  dosa");
		else
			stockOfDosa = stockOfDosa - item2Q;
		if (stockOfPouches == 0)
			System.out.println("running out of stock  pouches ");
		else
			stockOfPouches = stockOfPouches - item3Q;

		if (stockOfPanipuri == 0)
			System.out.println("running out of stock  panipuri");
		else
			stockOfPanipuri = stockOfPanipuri - item4Q;

		if (stockOfMasala == 0)
			System.out.println("running out of stock  masala");

		else
			stockOfMasala = stockOfMasala - item5Q;
	}

	public static void main(String[] args) {
		Shop_Scanner shop = new Shop_Scanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of item you want to buy");
		System.out.println("How many maggie packet you want to buy...");
		int item1 = sc.nextInt();
		System.out.println("How many dosa you want to order");
		int item2 = sc.nextInt();
		System.out.println("How many oil pouches you want to buy");
		int item3 = sc.nextInt();
		System.out.println("how many panuri you want to buy");
		int item4 = sc.nextInt();
		System.out.println("how many masala packet you want to buy");
		int item5 = sc.nextInt();

		shop.shopping(item1, item2, item3, item4, item5);
		shop.displayOOS();

	}

}
