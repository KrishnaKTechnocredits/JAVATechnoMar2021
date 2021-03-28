//Assignment5

package ravindra_V;

class Mall{
	int itemCount;
	String name;
	String paymentMode;
	String section;
	boolean haveCarrybag, needBill;
	
	void itemAddedToCart(int totalItem){
		itemCount = totalItem;
	}
	
	void customerName(String custName){
		name = custName;
	}
	
	void paymentDoneUsing(String modeOfPayment){
		paymentMode = modeOfPayment;
	}
	
	void displayCustomerInfo(){
		System.out.println(name+ " buys " + itemCount + " items and payment done using " + paymentMode+ "in section" + section);
		System.out.println("Needbill - "+ needBill);
		System.out.println("Required Carrybag - " + haveCarrybag);
	}
	
	void needBill(boolean billNeeded){
		needBill = billNeeded;
	}
	void haveCarrybag(boolean carrybag){
		haveCarrybag = carrybag;
	}
	
	void decideSection (){
		if(itemCount < 10 && paymentMode.equals("cash")){
			section = "1A";
		}else if(itemCount > 10 && paymentMode.equals("Visa Card")){
			section = "1B";
		}else if(itemCount < 10 && paymentMode.equals("Visa Card")){
			section = "1A";
		}else if(itemCount > 10 && paymentMode.equals("Cash")){
			section = "1D";
		}
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarrybag(false);
		mall.displayCustomerInfo();
	}
}
	