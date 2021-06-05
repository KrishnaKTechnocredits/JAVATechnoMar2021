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
• If items are less than 10 and payment done using visa card, then send customer to section 1D*/
package prashant.Assignment_3_8;

public class Mall {

	int itemAdded;
	String custName;
	String paymentDone;
	String section;

	void itemAddedToCart(int item) {
		itemAdded = item;
	}

	void customerName(String customerName) {
		custName = customerName;
	}

	void paymentDoneUsing(String payDone) {
		paymentDone = payDone;
	}

	void needBill(boolean bill) {
		System.out.println("Needbill : " + bill);
	}

	void haveCarryBag(boolean carryBag) {
		System.out.println("Required CarryBag : " + carryBag);
	}

	void decideSection() {
		if (itemAdded <= 10 && paymentDone.equals("cash")) {
			section = "1A";
		} else if (itemAdded > 10 && paymentDone.equals("visa card")) {
			section = "1B";
		} else if (itemAdded > 10 && paymentDone.equals("cash")) {
			section = "1C";
		} else if (itemAdded <= 10 && paymentDone.equals("visa card")) {
			section = "1D";
		}
	}

	void displayCustomerInfo() {
		System.out.println(custName + " buys " + itemAdded + " items and payment done using " + paymentDone
				+ " in section " + section);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		int[] arr = { 0, 10, 20, 30 };
		for (int num : arr) {
			mall.itemAddedToCart(num);
			if (mall.itemAdded <= 0) {
				System.out.println("No items added");
			} else {
				mall.customerName("Harsh");
				mall.paymentDoneUsing("visa card");
				mall.decideSection();
				mall.displayCustomerInfo();
				mall.needBill(true);
				mall.haveCarryBag(false);
			}
		}
	}

}
