/*Assignment 5 : 26th Mar 2021
1. Create a class named as Mall, which contains below methods.
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

package ravindra_J;
class Mall{
	String custName;
	String payment;
	String section;
	boolean needInvoice;
	boolean carryBag;
	int qty;
	
	void itemAddedToCart(int itemQty){
		qty=itemQty;
	}
	
	void customerName(String name){
		custName = name;
	}
	
	void paymentDoneUsing(String card){	
		 payment= card;
	}
	
	void decideSection(){
		
		if(qty < 10 && payment.equals("Cash")) 
			section = "1A";
		else if(qty > 10 && payment.equals("Visa Card"))
			section = "1B";
		else if(payment.equals("Cash"))
			section = "1C";
		else
			section = "1D";
	}
	
	void displayCustomerInfo(){
		//this is negative condition 
		if(qty <= 0  && (!(payment.equals("Cash")|| payment.equals("Visa Card"))))
			System.out.println("Welcome !!! Please buys atleast 1 quantity and your card service not available");
		else
			System.out.println("Thanks for shopping "+ custName+ " buys " +qty+ " items,payment done using " +payment+ " in section "+section+ ", have own carry bags "+", wants bill receipt "+needInvoice );
	}
	
	void needBill(boolean needBill){
		needInvoice = needBill;
	}
	
	void haveCarryBag(boolean bag){
		carryBag = bag;
	}
	
	public static void main(String []args){
		Mall mall = new Mall();
		mall.customerName("Amrish");
		mall.paymentDoneUsing("Visa Card");
		mall.itemAddedToCart(-5);
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
	}
}