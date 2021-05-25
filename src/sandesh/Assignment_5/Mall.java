package sandesh.Assignment_5;

public class Mall {

	String custName;
	int items;
	boolean bill;
	boolean bag;
	String modeofpayment;
	String section;

	void customername(String name) {
		custName = name;
	}

	void itemAddedToCart(int itemcount) {
		items = itemcount;
	}

	void paymentDoneUsing(String payment) {
		modeofpayment = payment;
	}

	void decideSection() {
		if (items < 10 && modeofpayment.equals("Cash")) {
			section = "1A";
		} else if (items > 10 && modeofpayment.equals("Visa Card.")) {
			section = "1B";
		} else if (items > 10 && modeofpayment.equals("Cash")) {
			section = "1C";
		} else if (items < 10 && modeofpayment.equals("Visa Card")) {
			section = "1D";
		} else {
			System.out.println("Please pay bills by using cash or visa card");
		}
	}

	void needBill(boolean needbill) {
		bill = needbill;
	}

	void haveCarrybag(boolean carrybag) {
		bag = carrybag;
	}

	void displayCustomerInfo() {
		System.out.println(custName + " buys " + items + " items and payment done using " + modeofpayment
				+ " in section " + section);
		System.out.println("Customer wants Bill receipt :" + bill);
		System.out.println("Customer have Carry Bag :" + bag);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customername("Sandesh");
		mall.itemAddedToCart(20);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarrybag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.customername("Anupam");
		mall.itemAddedToCart(40);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarrybag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
