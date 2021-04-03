package shivani.shivani_Assignment_5;

class Mall {
	String custName;
	int items;
	String payment;
	String section;
	boolean needBill;
	boolean haveCarryBag;

	void itemAddedToCart(int item) {
		items = item;
	}

	void customerName(String name) {
		custName = name;
	}

	void paymentDoneUsing(String payment1) {
		payment = payment1;
	}

	void needBill(boolean flag1) {
		needBill = flag1;
	}

	void haveCarryBag(boolean flag) {
		haveCarryBag = flag;

	}

	void deciedSection() {

		if (items <= 10 && payment.equals("CASH")) {
			section = "1A";
		} else if (items > 10 && payment.equals("VISA CARD")) {
			section = "1B";
		} else if (items > 10 && payment.equals("CASH")) {
			section = "1c";
		} else if (items < 10 && payment.equals("VISA CARD")) {
			section = "1D";
		}
		// else{
		// section="1C";
		// }
	}

	void displayCustomerInfo() {
		System.out.println(
				custName + " buy " + items + " item and payment done using " + payment + " in section " + section);
		System.out.println(" Need Bill :" + needBill);
		System.out.println("Required Carry Bag :" + haveCarryBag);
	}

	public static void main(String[] args) {
		Mall mall1 = new Mall();
		mall1.paymentDoneUsing("VISA CARD");
		mall1.itemAddedToCart(12);
		mall1.customerName("Harsh");
		mall1.deciedSection();
		mall1.haveCarryBag(false);
		mall1.needBill(true);
		mall1.displayCustomerInfo();

	}
}
