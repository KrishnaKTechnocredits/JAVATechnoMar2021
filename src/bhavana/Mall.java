package bhavana;
class Mall{
	
	String customerName;
	int itemAdded;
	String modeOfPayment,visa,cash;
	boolean bill;
	boolean carryBag;
    String section;	
	
	void customerName(String name){
		customerName=name;
	}
	void itemAddedToCart(int items){
		itemAdded=items;
	}
	
	void paymentDoneUsing(String paymentMode){
		modeOfPayment=paymentMode;
	}
	
	void needBill(boolean billRequirement){
		bill=billRequirement;
	}
	
	void haveCarryBag(boolean bag){
		carryBag=bag;
	}

	void decideSection(){
		
		if(itemAdded<=10 && modeOfPayment.equals("cash"))
			section= "1A";
		else if(itemAdded>10 && modeOfPayment.equals("visa"))
			section= "1B";
		else if(itemAdded>10 && modeOfPayment.equals("cash"))
			section= "1C";
		else if(itemAdded<=10 && modeOfPayment.equals("visa"))
			section= "1D";
	}
	void displayCustomerInfo(){
		System.out.println(customerName+ " buys "+ itemAdded + " items and payment done using "+ modeOfPayment+ " in section "+ section);
		System.out.println("Need bill:" +bill);
		System.out.println("Need carry bag:" +carryBag);
	}	
	
	public static void main(String[] a){
		Mall mall=new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(15);
		mall.paymentDoneUsing("visa");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}	
}