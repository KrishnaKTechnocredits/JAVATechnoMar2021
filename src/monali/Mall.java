//Kartik buys 12 items and payment done using visa card in section 1B.
package monali;

class Mall{
	int item;
	String custName;
	String payment;
	boolean bill;
	boolean carryBag;
	String section;
	
	void itemAddedToCart(int itemadded){
		item = itemadded;
	}
	void customerName(String name){
		custName = name;
	}
	void paymentDoneUsing(String paymentdone){
		payment = paymentdone;
	}
	void needBill(boolean cashmemo){
		bill = cashmemo;
	}
	void haveCarryBag(boolean basket){
		carryBag = basket;
	}
	void decideSection(){
		if (item < 10 && payment.equals("cash")){
			section = "sectoin 1A";
		}else if(item > 10 && payment.equals("visa card")){
			section = "sectoin 1B";
		}else if(item > 10 && payment.equals("cash")){
			section = "section 1C";
		}else if(item < 10 && payment.equals("visa card")){
			section = "section 1D";
		}
	}
	void displayCustomerInfo(){
		System.out.println(custName + " buys " + item + " items and payment done using " + payment + " in " + section);
	}
	public static void main(String[] a){
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("kartik");
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}

	
		
	
	
