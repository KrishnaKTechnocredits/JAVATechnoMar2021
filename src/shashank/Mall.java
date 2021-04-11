package shashank;
class Mall
{
	int itemAddedToCart;
	String customerName;
	String paymentDoneUsing;
	boolean needBill,haveCarryBag;
	String section;
	public void itemAddedToCart(int itemToCart){
		itemAddedToCart=itemToCart;
	}
	public void customerName(String custName){
		customerName=custName;
	}
	public void paymentDoneUsing(String payment){
		paymentDoneUsing=payment;
	}
	public void displayCustomerInfo(){
		
		System.out.println(customerName+" buys "+itemAddedToCart+" items and payment done using "+paymentDoneUsing+" in "+section);
		System.out.println("Do you required bill:- "+needBill);
		System.out.println("Have a Carry Bag:- "+haveCarryBag);
	}
	public void needbill(boolean needBill){
		this.needBill=needBill;
	}
	public void haveCarryBag(boolean haveCarryBag){
		this.haveCarryBag=haveCarryBag;
	}
	public void decideSection(){
		if (itemAddedToCart<10 && paymentDoneUsing.equals("Cash")){
			section="Section 1A";
		}
		else if (itemAddedToCart>10 && paymentDoneUsing.equals("VISA Card")){
			section="Section 1B";
		}
		else if (itemAddedToCart>10  && paymentDoneUsing.equals("Cash"))
		{
			section="Section 1C";
		}
		else 
			section="Section 1D";
	}
	public static void main (String args[])
	{
		Mall mall = new Mall ();
		mall.itemAddedToCart(8);
		mall.customerName("Shashank");
		mall.paymentDoneUsing("Cash");
		mall.needbill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}