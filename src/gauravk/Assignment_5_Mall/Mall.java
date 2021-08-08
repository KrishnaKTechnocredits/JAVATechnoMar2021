package gauravk.Assignment_5_Mall;

import java.util.Scanner;

/*
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
Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, 
needBill() have Boolean parameter & haveCarryBag have Boolean parameter
 */
public class Mall {
	int totalItem = 20;
	int itemAdded = 0;
	String custName;
	String [] modeOfPayment = {"Cash","Visa"};
	String selectedPaymentMode;
	String section;
	//String [] section = {"1A","1B","1C","1D"};
	Scanner sc = new Scanner(System.in);
	
	void itemAddedToCart(int itemAdd) {
		if(itemAdd<=totalItem) {
			itemAdded = itemAdd;
			System.out.println("How would you like to buy? (Cash or Visa)");
			String s = sc.next();
			paymentDoneUsing(s);
		}
		else System.out.println("Sorry the amount is higher than stock we have. We cannot fulfill your demand, unless you want to change your demand. Total stock is "+totalItem);
	}
	
	void customerName() {
		System.out.println("Please enter customer's name: ");
		custName = sc.next();
		System.out.println("How many items to purchase? ");
		itemAdded = sc.nextInt();
		itemAddedToCart(itemAdded);
	}
	
	void paymentDoneUsing(String paymentSelection) {
		if(paymentSelection.equals(modeOfPayment[0]))
			selectedPaymentMode = paymentSelection;
		else if(paymentSelection.equals(modeOfPayment[1]))
			selectedPaymentMode = paymentSelection;
		else System.out.println("Sorry. There is an error while entering payment mode selection. Purchase cannot proceed.");
		decideSection();
	}
	
	void displayCustomerInfo() {
		System.out.println(custName+" buys "+itemAdded+" items and payment done using "+selectedPaymentMode+" in section "+section);
	}
	
	void needBill(boolean billNeeded) {
		System.out.println("Need bill = "+billNeeded);
	}
	
	void haveCarryBag(boolean carryBag) {
		System.out.println("Require carry bag = "+carryBag);
	}
	
	void decideSection() {
		if(itemAdded <= 10 && selectedPaymentMode.equals(modeOfPayment[0]))
			section = "1A";
		else if(itemAdded <= 10 && selectedPaymentMode.equals(modeOfPayment[1]))
			section = "1D";
		else if(itemAdded > 10 && selectedPaymentMode.equals(modeOfPayment[0]))
			section = "1C";
		else section = "1B";
		System.out.println("Do you need Bill? Yes=true, No=false");
		boolean billQuery = sc.nextBoolean();
		System.out.println("Do you require carry bag? Yes=true, No=false");
		boolean carryBagQuery = sc.nextBoolean();
		displayCustomerInfo();
		needBill(billQuery);
		haveCarryBag(carryBagQuery);
	}
	
	public static void main(String[] a) {
		Mall mall = new Mall();
		mall.customerName();
	}

}
