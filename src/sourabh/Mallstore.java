package sourabh;

class Mallstore{
		int item;
		String custname;
		String paymenttype;
		boolean needbill;
		boolean havecarrybag;
	void itemAddedToCart(int item1){
		item= item1;
	}	
	void customerName(String custname1){
		custname= custname1;
	}
	void paymentDoneUsing(String paymenttype1){
		paymenttype= paymenttype1;
	}
	void needBill(boolean flag){
		needbill= flag;
	}
	void haveCarryBag(boolean flag){
		havecarrybag= flag;
	}
	void displayCutomerInfo(){
		System.out.println(custname+" buys "+item+" items and payment done using "+paymenttype+" in section 1B.");
		System.out.println("Needbill - "+needbill);
		System.out.println("Required CarryBag - "+havecarrybag);
	}
	
//	void decideSection(){
		
	//}
	public static void main(String[] args){
		Mallstore mall= new Mallstore();
		mall.itemAddedToCart(12);
		mall.customerName("Sourabh");
		mall.paymentDoneUsing("Visa Card");
		mall.displayCutomerInfo();
		mall.needBill(true);
		mall.haveCarryBag(true);
	}
}