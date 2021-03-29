package gaurav;

//Assignment 5

class Mall{
	int itemAddedToCart;
	String customerName;
	String paymentDoneUsing;
	boolean needBill;
	boolean haveCarryBag;
	String section;
	
	void itemAddedToCart(int itemAdded){
		itemAddedToCart = itemAdded;
	}
	void customerName(String custName){
		customerName = custName;
	}
	void paymentDoneUsing(String payment){
		paymentDoneUsing = payment;
	}
	
	void needBill(boolean bill){
		needBill = bill;
	}
	void haveCarryBag(boolean bag){
		haveCarryBag = bag;
	}
	void decideSection(){
		if(itemAddedToCart < 10 && paymentDoneUsing.equals("cash")){
		section ="1A";
		}
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("visa card")){
		section ="1B";
		}
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("cash")){
		section ="1C";
		}
		else if(itemAddedToCart < 10 && paymentDoneUsing.equals("visa card")){
		section ="1D";
		}
	}
	void displayCustomerInfo(){
		System.out.println(customerName +" "+"buys "+itemAddedToCart+" item and payment done using "+paymentDoneUsing+" in section "+section);
		System.out.println("Need Bill -"  + needBill);
		System.out.println("required CarryBag -" + haveCarryBag);
	}
	public static void main(String[]args){
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
	
}