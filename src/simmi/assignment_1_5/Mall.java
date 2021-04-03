package simmi;

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