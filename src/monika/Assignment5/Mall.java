package monika.Assignment5;

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
i.e. displayCustomerInfo() should print on console : 
Harsh buys 12 items and payment done using visa card in section 1B.
Needbill - true
Required CarryBag - false
Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D
Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() 
have Boolean parameter & haveCarryBag have Boolean parameter*/

class Mall{
String custNameAnswer, paymentModeAnswer;
int itemsAnswer;
void itemAddedToCart(int items){
	itemsAnswer = items;
}
void customerName(String custName){
	custNameAnswer = custName;
}
void paymentDoneUsing(String paymentMode){
	paymentModeAnswer = paymentMode;
}
void needBill(boolean getBill){
	System.out.println(custNameAnswer+" needs bill "+getBill);
}
void haveCarryBag(boolean getCarryBag){
	System.out.println(custNameAnswer+" needs carry bag "+getCarryBag);
}
void decideSection(){
	if(itemsAnswer<10 && paymentModeAnswer.equals("Cash"))
		System.out.println(custNameAnswer+" buys "+ itemsAnswer + " items and payment done using "+ paymentModeAnswer + " in section 1A.");
	else if(itemsAnswer>10 && paymentModeAnswer.equals("Visa Card"))
		System.out.println(custNameAnswer+" buys "+ itemsAnswer + " items and payment done using "+ paymentModeAnswer + " in section 1B.");
	else if(itemsAnswer>10 && paymentModeAnswer.equals("Cash"))
		System.out.println(custNameAnswer+" buys "+ itemsAnswer + " items and payment done using "+ paymentModeAnswer + " in section 1C.");
	else if(itemsAnswer<10 && paymentModeAnswer.equals("Visa Card"))
		System.out.println(custNameAnswer+" buys "+ itemsAnswer + " items and payment done using "+ paymentModeAnswer + " in section 1D.");
	else
		System.out.println("Criteria doesn't match");
}
	//Harsh buys 12 items and payment done using visa card in section 1B.
public static void main(String[] args){
	Mall mall = new Mall();
	mall.itemAddedToCart(12);
	mall.customerName("Harsh");
	mall.paymentDoneUsing("Visa Card");
	mall.needBill(true);
	mall.haveCarryBag(true);
	mall.decideSection();
}
}