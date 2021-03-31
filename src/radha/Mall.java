//Assignment 5

package radha;

class Mall{

	int itemAddedToCart;
	String custName;
	String modeOfPayment;
	boolean needBill;
	boolean haveCarryBag;
	String section;
	
	void itemAddedToCart(int items){
		if(items>0)
			itemAddedToCart = items;
		else 
			System.out.println("Item count cannot be 0!!"); 
	}
	
	void customerName(String name){
		custName = name;
	}
	
	void paymentDoneUsing(String paymentMethod){
		modeOfPayment = paymentMethod;
	}
	
	void needBill(boolean wantBill){
		needBill = wantBill;
	}
	
	void haveCarryBag(boolean wantCarryBag){
		haveCarryBag = wantCarryBag;
	}
	
	void decideSection(){
	if(itemAddedToCart < 10 && modeOfPayment.equals("Cash"))
			section = "1A";
	else if(itemAddedToCart > 10 && modeOfPayment.equals("Visa Card"))
			section = "1B";
	else if (itemAddedToCart > 10 && modeOfPayment.equals("Cash"))
			section = "1C";
	else if (itemAddedToCart < 10 && modeOfPayment.equals("Visa Card"))
			section = "1D";
	}
	
	void displayCutomerInfo(){
		System.out.println(custName+" buys "+itemAddedToCart+" items and payment done using "+modeOfPayment+" in section "+ section);
		System.out.println("NeedBill- "+needBill);
		System.out.println("Required CarryBag - "+haveCarryBag);
	}
	
	public static void main(String[] a){
		Mall mall = new Mall();
		mall.itemAddedToCart(10);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa Card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
	
		/*Mall newmall = new Mall();
		newmall.itemAddedToCart(10);
		newmall.customerName("Harsh");
		newmall.paymentDoneUsing("Debit Card");
		newmall.needBill(true);
		newmall.haveCarryBag(false);
		newmall.decideSection();
		newmall.displayCutomerInfo();
		*/
	}
}