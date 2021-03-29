//Sample Output: Harsh buys 12 items and payment done using visa card in section 1B.
package sangeeta;
class Mall{
	int itemAddedToCart;
	String customerName;
	String paymentDoneUsing;
	String section;
	boolean needBill;
	boolean haveCarryBag;
	
	void itemAddedToCart(int item){
		itemAddedToCart = item;
	}
	
	void customerName(String name){
		customerName = name;
	}
	
	void paymentDoneUsing(String paymentMode){
		if(paymentMode.equals("Visa Card"))
			paymentDoneUsing = "Visa Card";
		else
			paymentDoneUsing = "Cash"; 
	}
	
	void displayCustomerInfo(){
		System.out.println(" "+customerName+ " buys " +itemAddedToCart +" items and payment done using "+ paymentDoneUsing +" in section " +section);
		System.out.println(" Need a Bill? "+ needBill);
		System.out.println(" Required a Carry bag? "+ haveCarryBag);
	}
	
	void needBill( boolean flag){
		needBill = flag;
	}
	
	void haveCarryBag( boolean flag){
		haveCarryBag = flag;	
	}
	
	void decideSection(){
		if(itemAddedToCart <10 && paymentDoneUsing.equals("Cash"))
			section = "1A";
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("Visa Card"))
			section = "1B";
		else if(itemAddedToCart > 10 && paymentDoneUsing.equals("Cash"))
			section = "1C";
		else if(itemAddedToCart < 10 && paymentDoneUsing.equals("Visa Card"))
			section = "1D";
	}
	
	public static void main(String[] a){  
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
		
	}

}