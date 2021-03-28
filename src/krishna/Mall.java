package krishna;
class Mall{
	int itemNum;
	String customerName, pamentMode, billingSection;
	boolean billNeed, carryBagNeed;
	
	void itemAddedToCart(int item){
		itemNum= item;
	}
	void customerName(String name){
		customerName=name;
	}
	void paymentDoneUsing(String payMode){
		pamentMode=payMode;

	}
	void needBill(boolean bill){
		billNeed=bill;
	}
	void haveCarryBag(boolean carryBag){
		carryBagNeed=carryBag;
	}
	void decideSection(){
		if (itemNum<10 && pamentMode.equals("cash")){
			billingSection = "Section 1A";
		}else if(itemNum>10 && pamentMode.equals("Visa Card")){
			billingSection = "Section 1B";
		}else if(itemNum>10 && pamentMode.equals("cash")){
			billingSection = "Section 1C";
		}else if(itemNum<10 && pamentMode.equals("Visa Card")){
			billingSection = "Section 1D";
		}
	}
	void displayCustomerInfo(){
		System.out.println(customerName+ " buys "+itemNum+" items"+" payment done using "+pamentMode+" in "+billingSection+".");
		System.out.println("Need bill - "+billNeed);
		System.out.println("Required carry bag - "+carryBagNeed);
	}
	public static void main(String [] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(5);
		mall.customerName("Sachin");
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
	}
}