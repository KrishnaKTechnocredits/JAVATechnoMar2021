/*Assignment 05
 Program 01
 Create a class named as Mall, which contains below methods.

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
package madhavi_Raut.Assignment_05;

class Mall {

	int itemsQuantity;
	String customerName, paymentMethod, sectionAllocated;
	boolean needBill, haveCarryBag;

	public void itemAddedToCart(int itemsAdded) {
		if (itemsAdded > 0)
			itemsQuantity = itemsAdded;
		else
			System.out.println("Items quantity should be atleast 1.");
	}

	public void setCustomerName(String custName) {
		customerName = custName;
	}

	public void paymentDoneUsing(String payMethod) {
		if (payMethod.equals("Cash") || payMethod.equals("Visa Card"))
			paymentMethod = payMethod;
		else {
			paymentMethod = "None";
			System.out.println("Please enter correct Payment Method! Cash OR Visa Card");
		}
	}

	public void needBill(boolean requiredBill) {
		needBill = requiredBill;
	}

	public void haveCarryBag(boolean requiredBag) {
		haveCarryBag = requiredBag;
	}

	public void decideSection() {
		if (paymentMethod.equals("Cash") || paymentMethod.equals("Visa Card")) {
			if (paymentMethod.equals("Cash")) {
				if (itemsQuantity <= 10)
					sectionAllocated = "1A";
				else if (itemsQuantity > 10)
					sectionAllocated = "1C";
			} else if (paymentMethod.equals("Visa Card")) {
				if (itemsQuantity > 10)
					sectionAllocated = "1B";
				else if (itemsQuantity <= 10)
					sectionAllocated = "1D";
			}
		}
	}

	public void displayCutomerInfo() {
		if ((itemsQuantity > 0) && ((paymentMethod.equals("Cash") || paymentMethod.equals("Visa Card")))) {
			System.out.println(customerName + " buys " + itemsQuantity + " items and payment done using "
					+ paymentMethod + " in section " + sectionAllocated + "." + "\n" + "Need Bill: " + needBill + "\n"
					+ "Required Carrybag: " + haveCarryBag);
		}
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.setCustomerName("Daniel");
		mall.paymentDoneUsing("Visa Card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}
