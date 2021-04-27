package ami.Assignment_5;

public class Mall {
	String cstName;
	int item;
	String card;
	String section ;
	
	void customerName(String cutName1) {
		 cstName = cutName1;
	 }
	
	void itemAddedToCart(int item1) {
		item = item1;
	}
	
	 void paymentDoneUsing(String card1) {
		 card = card1; 
	}

	 void decideSection() {
		 if (item < 10 && card.equals("cash")){
			 section = "1A";
		 }else if (item < 10 && card.equals("visa")) {
			  section = "1D";
		 }else if (item > 10 && card.equals("visa")) {
			  section = "1B";
		 }else if (item > 10 && card.equals("cash")) {
			  section = "1C";
		 }else
	 		System.out.println("pay by any card");
	 }
	 
	 void displayCutomerInfo() {
			System.out.println(cstName + " buys " + item + " items and payment done using "  + card + " in section " + section);	
	}

	void needBill(Boolean bill1) {
		Boolean	bill = bill1;
		System.out.println("need carry bag : " + bill);	
	}
	
	void haveCarryBag(Boolean bag1) {
		Boolean bag = bag1;
		System.out.println("Required CarryBag :" + bag);
	}
	
	public static void main(String[] a) {
		Mall mall = new Mall();
			mall.customerName("keta");
			mall.itemAddedToCart(5);
			mall.paymentDoneUsing("case");
			mall.decideSection();
			mall.displayCutomerInfo();
			mall.needBill(true);
			mall.haveCarryBag(false);					
		}	
}
	

