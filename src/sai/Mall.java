package sai;

class Mall{

	int numItems;
	String custName, payment, section;
	boolean billNeeded, bag;

	void itemAddedToCart(int items){
		numItems = items;
	}
	
	void customerName(String name){
		custName = name;
	}
	
	void paymentDoneUsing(String payType){
		payment = payType;
	}
	
	void displayCutomerInfo(){
		System.out.println(custName +  " buys "  +  numItems + " items and payment done using " + payment + " then send customer to " + section);
		System.out.println("Need Bill : "  + billNeeded);
		System.out.println("Required Carry bag : " + bag);
	}
	
	void needBill(boolean bill){
		billNeeded  = bill;
	}
	
	void haveCarryBag(boolean carryBag){
		bag = carryBag;
	}
	
	void decideSection(){
		if(numItems<10 && payment.equals("cash")){
			section = "Section 1A";
		}
		else if(numItems>10 && payment.equals("visa card" )){
			section = "Section 1B";
		}
		else if(numItems>10 && payment.equals("cash" )){
			section = "Section 1C";
		}
		else if(numItems<10 && payment.equals("visa card" )){
			section = "Section 1D";
		}
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Sai Krishna");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
	}
}