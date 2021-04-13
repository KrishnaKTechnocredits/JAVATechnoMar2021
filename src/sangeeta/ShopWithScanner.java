package sangeeta;

import java.util.Scanner;

public class ShopWithScanner {

	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		int MaggieQ = 50;
		int PanipuriQ = 60;
		System.out.println("Available Quantity of Maggie: " + MaggieQ);
		System.out.println("Available Quantity of Panipuri: " + PanipuriQ);
		System.out.println("Enter quantity of Maggie & Panipuri you want: ");
		int MaggieR = scanner.nextInt();
		int PanipuriR = scanner.nextInt();
		if (MaggieQ >= MaggieR) {
			MaggieQ = MaggieQ - MaggieR;
			System.out.println("Available quantity of Maggie: " + MaggieQ);
		}else 
				System.out.println("Maggie is Out of stock");
		
		if (PanipuriQ >= PanipuriR) {
			PanipuriQ = PanipuriQ - PanipuriR;
			System.out.println("Available quantity of Panipuri: " + PanipuriQ);
		}else
				System.out.println("Panipuri is Out of stock");
		}
	}

