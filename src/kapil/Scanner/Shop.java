package kapil.Scanner;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
	Shop shop = new Shop();
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Quantity of Maggie :");
	int MaggieQ = scanner.nextInt();
	System.out.println(+MaggieQ);
	System.out.println("Require MaggieQ :");
	int reqMaggie = scanner.nextInt();
	{if (reqMaggie <= MaggieQ) {
		MaggieQ = MaggieQ - reqMaggie;
		System.out.println("Remaining Maggie : "+MaggieQ);
	}else 
		
		System.out.println("Not sufficent Q"  + " but give you partial " +MaggieQ);
		MaggieQ = 0;
	
	}
	System.out.println("Quantity of Panipuri :");
	int PanipuriQ = scanner.nextInt();
	System.out.println(+PanipuriQ);
	System.out.println("Require PanipuriQ :");
	int reqPanipuri = scanner.nextInt();
	{if (reqPanipuri <= PanipuriQ) {
		PanipuriQ = PanipuriQ - reqPanipuri;
		System.out.println("Remaining Panipuri: "+PanipuriQ);}
	}
  }
}