	package pravin.Assignment_14;
	
	import java.util.Scanner;
	
	public class ShopUsingScanner {
		String maggie;
		int maggieQ;
		String dosa;
		int dosaQ;
		String pouches ;
		int pouchesQ;
		String panipuri;
		int panipuriQ;
		String masalas;
		int masalasQ;
	
		void initialstock(int maggie ,int dosa,int pouches,int panipuri,int masalas) {
			maggieQ = maggie;
			dosaQ = dosa;
			pouchesQ = pouches;
			panipuriQ = panipuri;
			masalasQ = masalas;
		}
		void reqQ(int reqmaggie ,int reqdosa,int reqpouches,int reqpanipuri,int reqmasalas) {
			maggieQ = maggieQ - reqmaggie;
			dosaQ = dosaQ -reqdosa;
			pouchesQ = pouchesQ - reqpouches;
			panipuriQ = panipuriQ -reqpanipuri;
			masalasQ = masalasQ -reqmasalas;
		}
		void display() {
			if (maggieQ>0) {
				System.out.println("Avaliable in stock maggie  "+maggieQ);
			}else
				System.out.println("Not Avaliable in stock maggie");
			if (dosaQ>0) {
				System.out.println("Avaliable in stock dosa  "+dosaQ);
			}else
				System.out.println("Not Avaliable in stock dosa");
			if (pouchesQ>0) {
				System.out.println("Avaliable in stock pouches "+pouchesQ);
			}else
				System.out.println("Not Avaliable in stock pouches");
			if (panipuriQ>0) {
				System.out.println("Avaliable in stock panipuri "+panipuriQ);
			}else
				System.out.println("Not Avaliable in stock panipuri");
			if (masalasQ>0) {
				System.out.println("Avaliable in stock masalas  "+masalasQ);
			}else
				System.out.println("Not Avaliable in stock masalas");
		}
	
		public static void main(String[]args) {
			ShopUsingScanner shopUsingScanner = new ShopUsingScanner();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter initial quantity of Items");
			int maggieQ = sc.nextInt();
			int dosaQ = sc.nextInt();
			int pouchesQ = sc.nextInt();
			int panipuriQ = sc.nextInt();
			int masalasQ = sc.nextInt();
			shopUsingScanner.initialstock(maggieQ, dosaQ, pouchesQ, panipuriQ, masalasQ);
			System.out.println("Enter required quantity of Items");
			int reqmaggie = sc.nextInt();
			int reqdosa = sc.nextInt();
			int reqpouches = sc.nextInt();
			int reqpanipuri = sc.nextInt();
			int reqmasalas = sc.nextInt();
			sc.close();
			shopUsingScanner.reqQ( reqmaggie , reqdosa, reqpouches, reqpanipuri, reqmasalas);
			shopUsingScanner.display();
		}
	
	}
	
