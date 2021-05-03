package rikin.assignment5;

class Mall{
	String customerName;
	int items;          
	String modeOfPayment;
	boolean needBill; 
	boolean carryBag; 
	String section;
	
	void customerName(String name){ 
		customerName = name;
	}
	void itemAddedToCart(int noOfItem){
		items = noOfItem;
	}
	void paymentDoneUsing(String payment){
		modeOfPayment = payment;
	}
	void needBill(boolean bill){ 
		needBill = bill; 
	}
	void haveCarryBag(boolean bagRequired){
		carryBag = bagRequired;
	}
	void decideSection(){
		if(items <= 10 && modeOfPayment.equals("cash")){
			section = "Section 1A";
		}else if (items >= 10 && modeOfPayment.equals("visa card")){ 
			section = "Section 1B";
		}else if(items >= 10 && modeOfPayment.equals("cash")){
			section = "Section 1C";
		}else if(items < 10 && modeOfPayment.equals("visa card")){
			section = "Section 1D";
		}else{
			System.out.println(" ");	
		}
	}
	void displayCustomerInfo(){
		if(items ==0){
			System.out.println("Please add item to your cart ");
		}else if(!(modeOfPayment.equals("cash") || modeOfPayment.equals("visa card"))){
			System.out.println("Please use the correct mode of payment.");
		}else{
			System.out.println(customerName + " buys " + items + " items and payment done using " + modeOfPayment + " in " + section );
			System.out.println("Bill Required? :" + needBill);
			System.out.println("Carry Bag Required? : " + carryBag);
		}
	}
	
	public static void main(String[] args){
		Mall mall = new Mall(); 
		mall.customerName("Harsh");
		mall.itemAddedToCart(10); 
		mall.paymentDoneUsing("cash"); 
		mall.needBill(true); 
		mall.haveCarryBag(false); 
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
