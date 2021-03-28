package sourabh;

class Mall{
		int item;
		String custname;
		String paymenttype;
		boolean needbill;
		boolean havecarrybag;
		String section;
	void itemAddedToCart(int noofitem){
		item= noofitem;
	}	
	void customerName(String getcustname){
		custname= getcustname;
	}
	void paymentDoneUsing(String modeofpayment){
		paymenttype= modeofpayment;
	}
	void needBill(boolean flag){
		needbill= flag;
	}
	void haveCarryBag(boolean flag){
		havecarrybag= flag;
	}
	void displayCutomerInfo(){
		System.out.println(custname+" buys "+item+" items and payment done using "+paymenttype+" in section "+section);
		System.out.println("Needbill - "+needbill);
		System.out.println("Required CarryBag - "+havecarrybag);
	}	
	void decideSection(){
	if(paymenttype.equals("Cash")|| paymenttype.equals("Visa Card"))
		{
		if(item<10 && paymenttype.equals("Cash"))
			section= "1A";
		else if(item>10 && paymenttype.equals("Visa Card"))
			section= "1B";
		else if(item>10 && paymenttype.equals("Cash"))
			section= "1C";
		else if(item<10 && paymenttype.equals("Visa Card"))
			section= "1D";
		}
	else
		section= "Invalid";
	}
	public static void main(String[] args){
		Mall mall= new Mall();
		mall.itemAddedToCart(9);
		mall.customerName("Sourabh");
		mall.paymentDoneUsing("Master Card");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}