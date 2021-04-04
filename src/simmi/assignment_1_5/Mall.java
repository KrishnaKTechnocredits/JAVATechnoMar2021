/*Create a class named as Mall, which contains below methods.

a. itemAddedToCart()
b. customerName()
c. paymentDoneUsing()
i. Visa Card ii. Cash
d. displayCutomerInfo()
e. needBill()
f. haveCarryBag()
g. decideSection()

i.e. displayCustomerInfo() should print on console : Harsh buys 12 items and payment done using visa card in section 1B.
Needbill - true
Required CarryBag - false
Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D*/


package simmi.assignment_1_5;

class Mall{

	int itemAddedToCart;
	String customerName;
	String paymentDoneUsing;
	boolean needBill;
	boolean requiredCarryBag;
	String decideSection;

	void itemAddedToCart(int itemAdded){
		itemAddedToCart = itemAdded;
	}
	
	void customerName(String custname){
		customerName = custname;
	}
	
	void paymentDoneUsing(String paymentmethod){
		paymentDoneUsing = paymentmethod;
	}
	
	void displayCutomerInfo(){
		System.out.println( customerName + " buys " + itemAddedToCart + " items and payment done using " + paymentDoneUsing + " in " + decideSection );
		System.out.println("Bill needed- " + needBill );
		System.out.println("Carry bag required- " + requiredCarryBag);
	}
	
	void needBill(boolean flag){
		needBill = flag;
	}
	
	void haveCarryBag(boolean flag1){
		requiredCarryBag = flag1;
	}
	
	void decideSection(String section){
		decideSection = section;
		if(itemAddedToCart < 10 && paymentDoneUsing.equals("Cash")){
			decideSection = " Section 1A ";
		}
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("Visa Card")){
			decideSection = " Section 1B ";
		}
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("Cash")){
			decideSection = " Section 1C ";
		}
		else
			decideSection = " Section 1D ";
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa Card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection("Section 1B");
		mall.displayCutomerInfo();
	}
}