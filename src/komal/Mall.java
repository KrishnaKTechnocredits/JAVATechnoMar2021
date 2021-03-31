package komal;

class Mall{
	int itemCount;
	String Name,payVia,section;
	boolean nBill,haveBag;
	
	void customerName(String custName){
		Name = custName;
	}
	void itemAddedToCart(int items){
		itemCount = items;
	}
	void paymentDoneUsing(String cardOrCash){
		payVia = cardOrCash;
	}
	void needBill(boolean bill){
		nBill = bill;
	}
	void haveCarryBag(boolean bag){
		haveBag = bag;
	}
	void decideSection(){
		if(itemCount < 10 && payVia.equals("Cash")){
			section = " 1A";
		}else if(itemCount > 10 && payVia.equals("Visa Card")){
			section = " 1B";
		}else if(itemCount > 10 && payVia.equals("Cash")){
			section = " 1C";
		}else if(itemCount < 10 && payVia.equals("Visa Card")){
			section = " 1D";
		}else{
			section = "pay by online";
		}
	}
	void displayCustomerInfo(){
		System.out.println( Name + " purchased " +itemCount + " items and payment done using " +payVia + " in section" + section );
		System.out.println("Needbill - " +nBill);
		System.out.println("Required CaryBag - "+haveBag);		
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Komal");
		mall.itemAddedToCart(20);
		mall.paymentDoneUsing("Visa Card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}