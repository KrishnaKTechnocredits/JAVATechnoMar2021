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
• If items are less than 10 and payment done using visa card, then send customer to section 1D


Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter*/
package anubhav;

class Mall{
	int itemAdded; //Not to print
	String nameOfCustomer; // Print
	String modeOfPayment; //Cash, Visa Card (print)
	boolean carryBagAvailable; // True, False (print)
	boolean billRequired; // True, False (print)
	String sectionDecision; //print
	
	void itemAddedToCart(int itemAddedToCart){
		itemAdded= itemAddedToCart;
	}
	
	void customerName(String customerName){
		nameOfCustomer= customerName;
	}
	
	void paymentDoneUsing(String paymentDoneUsing ){
		modeOfPayment= paymentDoneUsing;
	}
	
	void needBill(boolean needBill){
		billRequired= needBill;
	}
	
	void haveCarryBag(boolean haveCarryBag){
		carryBagAvailable= haveCarryBag;
	}
	
	void decideSection(){
		if(itemAdded<=10 && modeOfPayment.equals ("cash")){
			sectionDecision= "1A";
		}else if(itemAdded>10 && modeOfPayment.equals ("visa card")){
			sectionDecision= "1B";
		}else if(itemAdded>10 && modeOfPayment.equals ("cash")){
			sectionDecision= "1C";
		}else if(itemAdded<=10 && modeOfPayment.equals ("visa card")){
			sectionDecision= "1D";
		}
	}
	
	void displayCustomerInfo(){
		System.out.println(nameOfCustomer + " buys " + itemAdded + " items and payment done using " + modeOfPayment + " in section " + sectionDecision + "." );
		System.out.println("Needbill - " + billRequired);
		System.out.println("Required Carrybag - " + carryBagAvailable);
	}
	
	public static void main (String[] args){
		Mall mall= new Mall ();
		//If items are less than 10 and payment done using cash, then send customer to section 1A
		mall.customerName ("Customer1");
		mall.itemAddedToCart(8);
		mall.paymentDoneUsing ("cash");
		mall.needBill (true);
		mall.haveCarryBag (false);
		mall.decideSection();
		mall.displayCustomerInfo();
		//If items are more than 10 and payment done using visa card, then send customer to section 1B
		mall.customerName ("Customer2");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing ("visa card");
		mall.needBill (true);
		mall.haveCarryBag (true);
		mall.decideSection();
		mall.displayCustomerInfo();
		//If items are more than 10 and payment done using cash, then send customer to section 1C
		mall.customerName ("Customer3");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing ("cash");
		mall.needBill (false);
		mall.haveCarryBag (false);
		mall.decideSection();
		mall.displayCustomerInfo();
		//If items are less than 10 and payment done using visa card, then send customer to section 1D
		mall.customerName ("Customer4");
		mall.itemAddedToCart(8);
		mall.paymentDoneUsing ("visa card");
		mall.needBill (true);
		mall.haveCarryBag (false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
