package meenu;

/* Assignment_5 -> Program:Create a class named as Mall, which contains below methods.

     	a. itemAddedToCart()
		b. customerName()
		c. paymentDoneUsing()
			i. Visa Card ii. Cash
		d. displayCutomerInfo()
		e. needBill()
		f. haveCarryBag()
		g. decideSection()
*/

class Mall{
	int numberOfItem;
	String name;
	String paymentMode;
	boolean billRequired;
	boolean bagRequired;
	String section;
	
	void itemAddedToCart(int itemPurchased){
		numberOfItem = itemPurchased;
	}
	
	void customerName(String nameOfPerson){
		name = nameOfPerson;		
	}
	
	void paymentDoneUsing(String paymentVia){
		paymentMode = paymentVia;
	}
	
	void needBill(boolean bill){
		billRequired = bill;
	}
	
	void haveCarryBag(boolean needBag){
		bagRequired = needBag;
	}
	
	void decideSection(){		
		if(numberOfItem <10){			
			if(paymentMode.equals("cash"))
				section = "section 1A";
			else if(paymentMode.equals("visa card"))
				section = "section 1D";				
		}else{
			if(paymentMode.equals("cash"))
				section = "section 1C";
			else if(paymentMode.equals("visa card"))
				section = "section 1B";
		}
	}	
		
	void displayCutomerInfo(){
	    System.out.println(name+" buys "+numberOfItem+" items and payment done using "+paymentMode+" in "+section+".");
		System.out.println("Needbill - "+billRequired);
		System.out.println("Required CarryBag - "+bagRequired);
	}
		
	public static void main(String[] args){
		Mall mall =  new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
	}	
}
	
	

	
	
	
	
	
	
	
	
	
	
