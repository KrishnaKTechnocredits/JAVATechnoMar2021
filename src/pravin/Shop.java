package pravin;

public class Shop {
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
		Shop shop = new Shop();
		shop.initialstock(10,20,30,40,50);
		shop.reqQ(5,25,3,4,50);
		shop.display();
	}
	
}