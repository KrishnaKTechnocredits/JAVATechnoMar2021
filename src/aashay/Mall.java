package aashay;
/*
 * Create a class named as Mall, which contains below methods.

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
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter
 */

class Mall{
	int itemsInCart;
	String custName, pmtMethod,section;
	boolean needCarryBag, needBill;
	
	
	void itemAddedToCart(int itemCount){
		if( itemCount > 0)
			itemsInCart = itemCount;
		else
			System.out.println("Items in cart cannot be 0 or less than 0");
	}
	void customerName(String name){
		custName = name;		
	}
	void paymentDoneUsing(String pMethod){
		pmtMethod = pMethod;
	}
	void needBill(boolean bill){
		needBill = bill;
	}
	void haveCarryBag(boolean carryBag){
		needCarryBag = carryBag;
	}
	void decideSection(){
		if(itemsInCart < 10 && pmtMethod.equals("cash"))
			section = "1A";
		else if(itemsInCart < 10 && pmtMethod.equals("cash"))
			section = "1D";
		else if(itemsInCart > 10 && pmtMethod.equals("visaCard"))
			section = "1C";
		else if(itemsInCart > 10 && pmtMethod.equals("visaCard"))
			section = "1B";
		else
			System.out.println("Invalid inputs");
	}
	void displayCutomerInfo(){
		System.out.println(custName+" buys "+itemsInCart+" items and payment done using "+pmtMethod+" in section "+section+"\nNeed Bill: "+needBill+"\nRequired Carrybag : "+needCarryBag);
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		// item < 10 payment method = cash
		mall.itemAddedToCart(7);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("cash");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
		//  item > 10 payment method = visa
		mall.itemAddedToCart(15);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visaCard");
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
		//  item > 10 payment method = cash
		mall.itemAddedToCart(25);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("cash");
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
		//  item < 10 payment method = visa
		mall.itemAddedToCart(1);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visaCard");
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
				
	}
}