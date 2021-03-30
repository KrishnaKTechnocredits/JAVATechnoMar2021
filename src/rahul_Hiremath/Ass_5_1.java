package rahul_Hiremath;

class Ass_5_1
{
	int count;
	String payMode;
	String custName;
	int setSection;
	boolean wantbill;
	boolean wantBag;
	
	void itemAddedToCart(int itemCount)
	{
		count =	itemCount;
	}
	
	void customerName(String cName)
	{
		custName = cName;
	}
	
	void paymentDoneUsing(String mode)
	{
		if (mode.equals("visa card") || mode.equals("cash"))
			payMode = mode;
		else
			System.out.println("Please select correct mode");
	}
	
	void displayCutomerInfo()
	{
		System.out.println("Customer name is: " + custName);
	}

	void needBill(boolean bill)
	{
		wantbill = bill;
		System.out.println("Needbill: " + wantbill);
	}
	
	void haveCarryBag(boolean bag)
	{
		wantBag = bag;
		System.out.println("Required CarryBag: " + wantBag);
	}

	void decideSection()
	{
		if (count < 10)
			System.out.println("1A");
		else if (count >= 10 && payMode.equals("visa card"))
			System.out.println("1B");
		else if (count > 10 && payMode.equals("cash"))
			System.out.println("1C");
		else if (count <= 10 && payMode.equals("visa card"))
			System.out.println("1D");
		else if (count == 0)
			System.out.println("Please ask customer to shop, no shopping done");
	}
	
	void displayCustomerInfo()
	{
		System.out.print(custName + " buys " + count +  " items and payment done using " + payMode +  " in section ");
	}
	
	public static void main (String[] args)
	{
		Ass_5_1 mall = new Ass_5_1();
		mall.itemAddedToCart(51);
		mall.customerName("Rahul");
		mall.paymentDoneUsing("cash");
		mall.displayCustomerInfo();
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
	}
}