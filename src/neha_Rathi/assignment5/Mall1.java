/*
 * Assignment 5
 * Create a class named as Mall, which contains below methods.
 */
package neha_Rathi.assignment5;

class Mall1 {
	int totalItem;
	String customerName, paymentMode, section;
	boolean bill, carryBag;

	void customerInfo(String name, int item, String payMode, boolean customerBill, boolean carryBag1) {
		customerName = name;
		totalItem = item;
		bill = customerBill;
		paymentMode = payMode;
		carryBag = carryBag1;
	}

	void decideSection() {
		if (totalItem < 10 && paymentMode.equals("Cash"))
			section = "1A";
		else if (totalItem >= 10 && paymentMode.equals("Visa Card"))
			section = "1B";
		else if (totalItem >= 10 && paymentMode.equals("Cash"))
			section = "1C";
		else if (totalItem < 10 && paymentMode.equals("Visa Card"))
			section = "1D";
	}

	void displayCutomerInfo() {
		if (totalItem <= 0 || (!paymentMode.equals("Visa Card") && !paymentMode.equals("Card"))) {
			System.out.println("Invalid Input");
		} else {
			System.out.println(customerName + " buys " + totalItem + " items and payment done using " + paymentMode
					+ " in section " + section);
			System.out.println("Is " + customerName + " need bill: " + bill);
			System.out.println("Is " + customerName + " need carrybag: " + carryBag);
		}
	}

	public static void main(String[] a) {
		Mall1 mall1 = new Mall1();
		System.out.println("----------------1st Customer Info---------------------");
		mall1.customerInfo("Harsh", 11, "Visa Card", true, true);
		mall1.decideSection();
		mall1.displayCutomerInfo();
		System.out.println("----------------2nd Customer Info---------------------");
		mall1.customerInfo("Harsh", 0, "Visa Card", true, true);
		mall1.decideSection();
		mall1.displayCutomerInfo();
		System.out.println("----------------3rd Customer Info---------------------");
		mall1.customerInfo("Harsh", 1, "VisaCard", true, true);
		mall1.decideSection();
		mall1.displayCutomerInfo();
	}
}