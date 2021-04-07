package pallavi.Assignment_5;

class Mall{
	int itemAddedToCart;
	String customerName;
	String paymentMethod;
	boolean needBill;
	boolean haveCarryBag;
	String section;
	
	void itemAddedToCart(int itemAdded){
		itemAddedToCart=itemAdded;
	}
	
	void customerName(String custName){
		customerName=custName;
	}
	
	void paymentDoneUsing(String paymentMode){
		paymentMethod=paymentMode;
	}

	void displayCutomerInfo(){
		System.out.println(customerName + " buys " + itemAddedToCart + " items and payment done using "+paymentMethod + " in "+ section);
		System.out.println("needbill - " + needBill);
		System.out.println("Required carrybag - "+ haveCarryBag);
	}

	void needBill(boolean bill){
		needBill=bill;
	}
	
	void haveCarryBag(boolean carrayBag){
		haveCarryBag=carrayBag;
	}
	
	void decideSection(){
		if(itemAddedToCart<10 && paymentMethod.equals("cash")){
			section= "section 1A";}
		else if(itemAddedToCart>10 && paymentMethod.equals("visa card")){
		section= "section 1B";}
		else if(itemAddedToCart>10 && paymentMethod.equals("cash")){
		section= "section 1C";}
		else if(itemAddedToCart<10 && paymentMethod.equals("visa card")){
		section= "section 1D";}
	}
	
	public static void main(String agrgs[]){
		Mall mall = new Mall();
		mall.itemAddedToCart(8);
		mall.customerName("Pallavi");
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
	
	}
}