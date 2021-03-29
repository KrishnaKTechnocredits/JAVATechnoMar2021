package krati_Shukla;

class Mall{
	
	int itemAdded;
	String custName;
	String paymentMode;
	String section;
	boolean billRequired;
	boolean hasBag;	
	
	void itemAddedToCart(int item){
		itemAdded=item;
	}
	
	void customerName(String name){
		custName = name;
	}
	
	void paymentDoneUsing(String mode){
		paymentMode = mode;
	}
	
	void needBill(boolean billNeeded){
		billRequired = billNeeded;
	}
	
	void haveCarryBag(boolean havingBag){
		hasBag = havingBag;
	}
	
	void decideSection(){
		if (itemAdded <=0){
			System.out.println("Input is not Valid");
		}else if (itemAdded<=10 && paymentMode.equals("cash")){
			section = "1A";
		}else if (itemAdded>10 && paymentMode.equals("cash")){
			section = "1C";
		}else if (itemAdded>10 && paymentMode.equals("visa card")){
			section = "1B";
		}else if (itemAdded<=10 && paymentMode.equals("visa card")){
			section = "1D";
		}
	}
	
	void displayCustomerInfo(){
		if (itemAdded != 0){
			System.out.println(custName+" buys "+itemAdded+" items and payment done using "+paymentMode+" in section "+section);
			System.out.println("NeedBill "+billRequired);
			System.out.println("Required carry Bag "+hasBag);
		}
	}
	
	public static void main(String[] a){
		Mall mall = new Mall();
		mall.itemAddedToCart(10);
		mall.customerName("Tom");
		mall.paymentDoneUsing("visa card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
		
	}
	
}	