package bhushan;
class Mall{
	int itemAddedInCart;
	String custName,paymentMode;
	boolean wantBill;
	boolean wantCarryBag;
	String section;
	
	void itemAddedToCart(int noOfItems) {
	itemAddedInCart = noOfItems;
	}

	void customerName(String cName){
	custName = cName;	
	}

	void paymentDoneUsing(String payMode){
	paymentMode = payMode;
	}
	
	void needBill(boolean reqbill){
	wantBill = reqbill;
	}

	void haveCarryBag(boolean reqbag){
	wantCarryBag = reqbag;
	}
	
	void decideSection(){
	if(itemAddedInCart<10 && paymentMode=="cash"){
	section = "1A";
	}
	else if(itemAddedInCart>10 && paymentMode=="visa card"){
	section = "1B";
	}
	else if(itemAddedInCart>10 && paymentMode=="cash"){
	section = "1C";
	}
	else 
	section = "1D";
	
}
	void displayCutomerInfo(){
	System.out.println(""+custName +" buys " +""+itemAddedInCart +" items and payment done using" +" "+paymentMode + " in section "+""+section);
	}
	
	public static void main(String[] args){
	Mall Mall1 = new Mall();
	Mall1.customerName("Bhushan");
	Mall1.itemAddedToCart(2);
	Mall1.paymentDoneUsing("visa card");
	Mall1.needBill(true);
	Mall1.haveCarryBag(false);
	Mall1.decideSection();
	Mall1.displayCutomerInfo();
	}
}