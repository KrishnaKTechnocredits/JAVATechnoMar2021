package kangan.assignments.assignment_5;

public class Mall {

	int itemNumber;
	String paymentMethod;
	boolean billFlag;
	boolean bagFlag;
	String sectionNumber;
	String custName;
	
	void itemAddedToCart(int item) {
		itemNumber = item;
	}
	void customerName(String name) {
		custName = name;
	}
	void paymentDoneUsing(String payment){
		paymentMethod = payment;
	}
	
	void needBill(boolean flag1) {
		billFlag = flag1;
	}
	void haveCarryBag(boolean flag2) {
		bagFlag = flag2;
	}
	void decideSection(String section) {
		sectionNumber = section;
		if(itemNumber<10 && paymentMethod.equals("cash"))
			sectionNumber = "1A";
		else if (itemNumber>10 && paymentMethod.equals("visa"))
			sectionNumber = "1B";
		else if (itemNumber>10 && paymentMethod.equals("cash"))
			sectionNumber = "1C";
		else if (itemNumber<10 && paymentMethod.equals("visa"))
			sectionNumber = "1D";
	}
    void displayCutomerInfo() {
		
		System.out.println(custName + " buys " +  itemNumber + " items and payment done using " + paymentMethod + " in section " + sectionNumber);
		System.out.println("Need bill : " + billFlag);
		System.out.println("Bag required : " + bagFlag);
	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(5);
		mall.customerName("Kangan");
		mall.paymentDoneUsing("visa");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection("1A");
		mall.displayCutomerInfo();
	}
}
