//Assignment 5 : 26th Mar 2021

package krati_Jain;

class Mall {
	String custName;
	int numberOfItems;
	String howPaymentDone;
	boolean billNeeded;
	boolean carryBagNeeded;
	String section;

	void itemAddedToCart(int itemNumbers) {
		numberOfItems = itemNumbers;
	}
	void customerName(String name) {
		custName = name;	
	}
	void paymentDoneUsing(String paymentMethod) {
		howPaymentDone = paymentMethod;
	}
	
	void needBill(boolean billReq) {
		billNeeded = billReq;
	}
	void haveCarryBag(boolean carryBagReq) {
		carryBagNeeded = carryBagReq;
	}
	void decideSection() {
		if (numberOfItems <= 10 && howPaymentDone.equals("Cash")) {
			section = "1A";
		} else if (numberOfItems > 10 && howPaymentDone.equals("Visa Card")) {
			section = "1B";
		} else if (numberOfItems > 10 && howPaymentDone.equals("Cash")) {
			section = "1C";
		}else if (numberOfItems < 10 && howPaymentDone.equals("Visa Card")) {
			section = "1D";
		}
	}
	
	void displayCutomerInfo() {
		if (numberOfItems <= 0) {
			System.out.println("Item quantity cannot be less than 0, Enter a valid item quantity");
		} else {
			System.out.println(custName + " buys " + numberOfItems + " items and payment done using " +  howPaymentDone + " in section " + section + ". ");	
			System.out.println("Is bill needed?: " + billNeeded);
			System.out.println("Is carrybag needed?: " + carryBagNeeded);
			}
	}
		
	public static void main(String[] a) {
		Mall mall = new Mall();
		mall.itemAddedToCart(2);
		mall.customerName("Krati");
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
	}

}