/*Assignment no 5
 * 1. Create a class named as Mall, which contains below methods.

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



package pravin;
class Mall{
	int noofitem;
	String customerName;
	String paymentDoneUsing;
	String section;
	boolean needbill,haveCarryBag;
	void itemAddedToCart(int item){
		noofitem = item;
	}
	void customerName(String Name)	{
		customerName = Name;
	}
	void paymentDoneUsing (String paymentType){
		paymentDoneUsing = paymentType;
	}
	void needbill (boolean bill){
		needbill = bill;
	}
	void  haveCarryBag (boolean CarryBag) {
		haveCarryBag = CarryBag;
	}
	void decideSection (){
		if (noofitem<10 && paymentDoneUsing.equals("Cash"))
			section = "Section1A";
		else if (noofitem>=10 && paymentDoneUsing.equals("VisaCard"))	 
			section = "Section1B";
		else if (noofitem>10 && paymentDoneUsing.equals("Cash"))	 
			section = "Section1C";	 
		else if (noofitem<10 && paymentDoneUsing.equals("VisaCard"))	 
			section = "Section1D"; 
	}
	void displayCustomerInfo(){
		System.out.println(customerName+" buys "+noofitem+" item and payment done using  "+paymentDoneUsing+" in "+ section);
		System.out.println("Needbill "+needbill);
		System.out.println("Required carry bag "+haveCarryBag);
	}
	public static void main(String[]args){
		Mall mall= new Mall();
		mall.itemAddedToCart(25);
		mall.customerName("Harsh");
		//mall.decideSection();
		mall.paymentDoneUsing("Cash");
		mall.decideSection();
		mall.needbill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
	}
}
