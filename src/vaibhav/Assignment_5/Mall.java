/*Java Assignment 5: 26th March 2021

1. Create a class named as Mall, which contains below methods.
A.	itemAddedToCart()
B.	customerName()
C.	paymentDoneUsing()
i.	Visa Card
ii.	Cash
D.	displayCutomerInfo()
E.	needBill()
F.	haveCarryBag()
G.	decideSection() 
i.e. displayCustomerInfo() should print on console: Harsh buys 12 items and payment done using visa card in section 1B.
Needbill - true
Required CarryBag - false
Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter

 */

package vaibhav.Assignment_5;


class Mall{
	String nameOfCustomer, modeOfPayment, section;
	int itemInCart;
	boolean custBill, custBag;
		
	void customerName(String custName){
		nameOfCustomer = "'" + custName + "'";
	}
		
	void itemAddedToCart(int itemNum){
		itemInCart = itemNum;		
	}
	
	void paymentDoneUsing(String payment){
		modeOfPayment = payment;
	}
	
	void decideSection(){
		if ((itemInCart <=10) && modeOfPayment.equals("cash")){
			section = "section 1A";	
		}else if ((itemInCart > 10) && modeOfPayment.equals("visa card")){
			section = "section 1B";			
		}else if((itemInCart > 10) && modeOfPayment.equals("cash")){
			section = "section 1C";			
		}else if((itemInCart <= 10) && modeOfPayment.equals("visa card")){
			section = "section 1D";			
		}
	}
	
	void needBill(boolean billNeeed){
		custBill = billNeeed;
	}
	
	void haveCarryBag(boolean bagNeed){
		custBag = bagNeed;
	}
	
	void displayCutomerInfo(){
		System.out.println(" ");
		System.out.println(nameOfCustomer + " buys " + itemInCart + " items and payment done using " + modeOfPayment + " in " + section);
		System.out.println("Need bill           : " + custBill);
		System.out.println("Required carry bag  : " + custBag);
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	public static void main (String[] args){
		Mall mall = new Mall();
		
		// Case 1 -- If items are less than 10 and payment done using cash, then send customer to section 1A
		mall.customerName("TechnoCredits Team 1");
		mall.itemAddedToCart(5);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();

		// Case 2 -- If items are more than 10 and payment done using visa card, then send customer to section 1B
		
		mall.customerName("TechnoCredits Team 2");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
		
		// Case 3 -- If items are more than 10 and payment done using cash, then send customer to section 1C
		
		mall.customerName("TechnoCredits Team 3");
		mall.itemAddedToCart(15);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
		
		// Case 4 -- If items are less than 10 and payment done using visa card, then send customer to section 1D
		
		mall.customerName("TechnoCredits Team 4");
		mall.itemAddedToCart(8);
		mall.paymentDoneUsing("visa card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
	}
}


