package priyanka_Kamble;

/** Assignment 5 : 26th Mar 2021
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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter **/

class Mall{
	String name,session,paymentDoneUsing;
	int itemAddedToCart;

	void customerName(String custName){
		name=custName;
		}
	void paymentDoneUsing(String paymethod){
		paymentDoneUsing= paymethod;
		}
	void itemAddedToCart(int items){
		itemAddedToCart=items;
		}
	void decideSection(){
		
		if(itemAddedToCart<=10 && paymentDoneUsing.equals("cash"))
			session = "1A";
		else if(itemAddedToCart>10  && paymentDoneUsing.equals("visa card"))
			session = "1B";
		else if(itemAddedToCart<=10  && paymentDoneUsing.equals("visa card"))
			session = "1D";
		else if(itemAddedToCart>10  && paymentDoneUsing.equals("cash")){
			session = "1C";
			}
		}
	void displayCutomerInfo(){
		if (itemAddedToCart<=0)
		System.out.println(" \t No Item in the Cart \n ");
		else 
		System.out.println( "\t"+ name+  " buys " +itemAddedToCart+ " items and payment done using " +paymentDoneUsing+ " in section " +session + "\n");
		}
		
	void needBill(boolean bill){
		if(bill == false)
		System.out.println("\t You said No to Bill - Thank you for saving paper \n");
		else
		System.out.println(" \t Need Bill - " +bill+ "\n");
		}
		
	void haveCarryBag(boolean bag){
		System.out.println("\t Required CarryBag - " +bag + "\n");
		}
		
	public static void main(String Args[]){
		Mall m = new Mall();
		m.displayCutomerInfo();
		m.customerName("Harsh");
		m.paymentDoneUsing("visa");
		m.itemAddedToCart(0);
		m.decideSection();
		m.needBill(false);
		m.haveCarryBag(false);
		
		m.customerName("Harsh");
		m.paymentDoneUsing("visa card");
		m.itemAddedToCart(15);
		m.decideSection();
		m.needBill(true);
		m.haveCarryBag(false);
		m.displayCutomerInfo();
			
		}
}

		
		
