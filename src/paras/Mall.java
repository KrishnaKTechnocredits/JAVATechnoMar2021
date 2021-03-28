//Assignment 5 : 26th Mar 2021

//1. Create a class named as Mall, which contains below methods.

//a. itemAddedToCart()
//b. customerName()
//c. paymentDoneUsing()
//i. Visa Card ii. Cash
//d. displayCutomerInfo()
//e. needBill()
//f. haveCarryBag()
//g. decideSection()

//i.e. displayCustomerInfo() should print on console : Harsh buys 12 items and payment done using visa card in section 1B.
//Needbill - true
//Required CarryBag - false
//Expectations:
//• If items are less than 10 and payment done using cash, then send customer to section 1A
//• If items are more than 10 and payment done using visa card, then send customer to section 1B
//• If items are more than 10 and payment done using cash, then send customer to section 1C
//• If items are less than 10 and payment done using visa card, then send customer to section 1D

//Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean //parameter

/*
Assignment 5 - Program 1 - Program Statement : Create a class named as Mall, which contains below methods.
*/

package paras;

class Mall{
	
	int itemCount;
	String name;
	String paymentMode;
	String section;
	boolean haveCarryBag, needBill;
	
	void itemAddedToCart(int totalItem){
		itemCount = totalItem;
	}
	
	void customerName(String custName){
		name = custName;
	}
	
	void paymentDoneUsing(String modeOfPayment){
		paymentMode = modeOfPayment;
	}
	
	void displayCustomerInfo(){
		System.out.println(name+ " buys "+ itemCount + " items and payment done using " + paymentMode+ " in section" +section);
		System.out.println("Needbill - " + needBill);
		System.out.println("Required CarryBag - " + haveCarryBag);
	}
	
	void needBill(boolean billNeeded){
		needBill = billNeeded;
	}
	
	void haveCarryBag(boolean carryBag){
		haveCarryBag = carryBag;
	}
	
	void decideSection(){
		if(itemCount < 10 && paymentMode.equals("cash")){
			section = "1A";
		}else if(itemCount > 10 && paymentMode.equals("Visa Card")){
			section = "1B";	
		}else if(itemCount < 10 && paymentMode.equals("Visa Card")){
			section = "1A";
		}else if(itemCount > 10 && paymentMode.equals("Cash")){
			section = "1D";
		}
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
	}
}