package dhanshri.Assignment_5;

public class Mall{
	int numOfCartItem;
	String custName, payMode, section;
	boolean bill;
	boolean bag;
	
	void itemAddedToCart(int cartItems){
		numOfCartItem = cartItems;
	}
	
	void customerName(String name){
		custName = name;
	}
	
	void paymanetDoneUsing(String pMode){
		payMode = pMode;
	}
	
	void needBill(boolean custBill){
		bill = custBill;
	}
	
	void haveCarryBag(boolean carryBag){
		bag = carryBag;
	}
	
    void decideSection(){
		if (numOfCartItem<10 && payMode.equals("cash")){
			section = "1A";
		}
	    else if (numOfCartItem>10 && payMode.equals("visa card")){
			section = "1B";
		}
		else if(numOfCartItem>10 && payMode.equals("cash")){
			section = "1C";
		}
		else if(numOfCartItem<10 && payMode.equals("visa card")){
			section = "1D";
		}
	
	}	

	void displayCustomerInfo(){
		System.out.println(custName + " buys "+ numOfCartItem +" items and payment done using "+ payMode +" in section "+section);
		System.out.println("Need Bill - "+bill);
		System.out.println("Required Carry bag - "+bag);
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Dhanshri");
		mall.itemAddedToCart(9);
		mall.paymanetDoneUsing("visa card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
	    mall.displayCustomerInfo();
		
	}

}

