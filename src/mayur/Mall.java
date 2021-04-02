//1. Create a class named as Mall, which contains below methods.
//a. itemAddedToCart()
//b. customerName()
//c. paymentDoneUsing()
//i. Visa Card ii. Cash
//d. displayCutomerInfo()
//e. needBill()
//f. haveCarryBag()
//g. decideSection()
//i.e. displayCustomerInfo() should print on console : Harsh buys 12 items and payment done using visa card in section 1B.
//Needbill - true
//Required CarryBag - false
//Expectations:
//• If items are less than 10 and payment done using cash, then send customer to section 1A
//• If items are more than 10 and payment done using visa card, then send customer to section 1B
//• If items are more than 10 and payment done using cash, then send customer to section 1C
//• If items are less than 10 and payment done using visa card, then send customer to section 1D
//Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter

class Mall
{
	String customerName,decideSection,paymentDoneUsing;
	int itemAddedToCart;
	boolean needBill,haveCarryBag;
	
	void customerName(String name)
	{
		customerName = name; 
	}
	
	void itemAddedToCart(int itemAdded)
	{
		itemAddedToCart = itemAdded;
	}
	
	void paymentDoneUsing(String paymentBy)
	{
		paymentDoneUsing = paymentBy;
	}
	
	void needBill(boolean flag)
	{
		needBill = flag;
	}
	void haveCarryBag(boolean flag)
	{
		haveCarryBag = flag;
	}
	
	void decideSection()
	{
		if(itemAddedToCart<10 && itemAddedToCart>0 && paymentDoneUsing.equals("Cash"))
			decideSection = "Section 1A";
		else if (itemAddedToCart<10 && itemAddedToCart>0 && paymentDoneUsing.equals("Visa Card"))
			decideSection = "Section 1D";
		else if (itemAddedToCart>=10 && paymentDoneUsing.equals("Visa Card"))
			decideSection = "Section 1B";
		else if (itemAddedToCart>=10 &&  paymentDoneUsing.equals("Cash"))
			decideSection = "Section 1C";
		else
			decideSection = "Online Payment Section";
	}
	
	void displayCustomerInfo()
	{
		System.out.println(customerName  +  " buys " + itemAddedToCart + " items and payment done using " + paymentDoneUsing + " from " + decideSection);
		System.out.println("Do you need bill " +needBill);
		System.out.println("Do you need carry bag " +haveCarryBag);		
	}
	
	public static void main(String[] args)
	{
		Mall mall = new Mall();
		mall.customerName("Mayur");
		mall.itemAddedToCart(10);
		mall.paymentDoneUsing("Gpay");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
	
}