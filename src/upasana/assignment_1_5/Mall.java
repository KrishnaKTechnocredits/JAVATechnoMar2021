package upasana.assignment_1_5;

class Mall{
	String  section;
	int items;
	String cname;
	String modeOfPayment;
	boolean needBill;
	boolean requiredCarryBag;
	
	void itemAddedToCart(int item){
		items = item;
	}
	
	void customerName(String name ){
		cname = name;
	}
	
	void paymentDoneUsing(String modePayment){
		modeOfPayment = modePayment;
	}
	
	void displayCutomerInfo(){
		System.out.println(cname+ " "+ "buys"+ " "+items+" "+ "items and payment done using"+" "+ modeOfPayment+" in section"+ " "+section);
	}
	
	void needBill(boolean nBill){
		needBill = nBill;
		System.out.println("Needbill - "+needBill);
	}
	
	void haveCarryBag(boolean rCarryBag){
		requiredCarryBag = rCarryBag;
		System.out.println("Required CarryBag - "+requiredCarryBag);
	}
	
	void decideSection(){
		if(items < 10 && modeOfPayment.equals("Cash"))
			section = "1A";
		else if(items > 10 && modeOfPayment.equals("Visa Card"))
			section = "1B";
		else if(items > 10 && modeOfPayment.equals("Cash"))
			section = "1C";
		else if(items < 10 && modeOfPayment.equals("Visa Card"))
			section = "1D";
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.displayCutomerInfo();
		mall.needBill(true);
		mall.haveCarryBag(false);
		
		
		
	}
}
