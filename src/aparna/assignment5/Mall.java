/*
Assignment 5 : 26th Mar 2021

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
package aparna.assignment5;

class Mall {
	boolean needBill, haveCarryBag;
	String cutomerName, sectionName, paymentMode;
	int numberOfItems;

	void customerName(String name) {
		cutomerName = name;
	}

	void itemAddedToCart(int items) {

		numberOfItems = items;

	}

	void paymentDoneUsing(String modeOfPayment) {

		paymentMode = modeOfPayment;

	}

	void needBill(boolean bill) {
		needBill = bill;
	}

	void haveCarryBag(boolean carryBag) {
		haveCarryBag = carryBag;

	}

	void decideSection() {

		if (numberOfItems < 10) {
			if (paymentMode.equals("Cash"))
				sectionName = "Section 1A";
			else if (paymentMode.equals("Visa Card"))
				sectionName = "Section 1D";
		} else {

			if (numberOfItems > 10) {
				if (paymentMode.equals("Cash"))
					sectionName = "Section 1C";
				else if (paymentMode.equals("Visa Card"))
					sectionName = "Section 1B";
			}
		}
	}

	void displayCutomerInfo() {
		System.out.println(cutomerName + " buys " + numberOfItems + " items and payment done using " + paymentMode
				+ " in " + sectionName);

		System.out.println("Required Carry Bag : " + haveCarryBag);
		System.out.println("Need Bill : " + needBill);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Jyoti Singh");
		mall.itemAddedToCart(25);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.haveCarryBag(false);
		mall.needBill(true);
		mall.displayCutomerInfo();

	}
}