package prachi;

//Assignment5
//1. Create a class named as Mall, which contains below methods.
//a. itemAddedToCart()
//b. customerName()
//c. paymentDoneUsing()
//i. Visa Card ii. Cash
//d. displayCutomerInfo()
//e. needBill()
//f. haveCarryBag()
//g. decideSection()
//i.e. displayCustomerInfo() should print on console : Harsh buys 12 items and payment done using visa card in section 1B.
//Needbill - true
//Required CarryBag - false
//Expectations:
//• If items are less than 10 and payment done using cash, then send customer to section 1A
//• If items are more than 10 and payment done using visa card, then send customer to section 1B
//• If items are more than 10 and payment done using cash, then send customer to section 1C
//• If items are less than 10 and payment done using visa card, then send customer to section 1D
//Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() 
//have Boolean parameter & haveCarryBag have Boolean parameter

class Mall{
	String name, paymentMode, section;
	int noOfItems;
	boolean nBill,hCarryBag;
	
	    void itemAddedToCart(int item){
		  noOfItems = item;
	    }
	
	    void customerName(String custName){
		  name = custName;
	    }
	
	    void paymentDoneUsing(String paymode){
		  paymentMode = paymode;
	    }
	
	    void decideSection(){
		if (noOfItems<10 && paymentMode.equals("cash"))
		  section = "Section 1A";
		else if (noOfItems>10 && paymentMode.equals("visa card"))
		  section = "Section 1B";
		else if (noOfItems>10 && paymentMode.equals("cash"))
		  section = "Section 1C";
		else if (noOfItems<10 && paymentMode.equals("visa card"))
		  section = "Section 1D";
		}
	
	    void needBill(boolean nnbill){
		  nBill = nnbill;
	    }
	
	    void haveCarryBag(boolean hcBag){
		  hCarryBag = hcBag;
	    }
	
	    void displayCustomerInfo(){
		  System.out.println(name+" buys " +noOfItems+
		  " items and payment done using " +paymentMode+ " in " +section+ ".");
		  System.out.println("Is Bill Required? - "+nBill);
		  System.out.println("Is Carry Bag Required? - "+hCarryBag);
	    }
		
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(9);
		mall.customerName("Prachi");
		mall.paymentDoneUsing("visa card");
		mall.decideSection();
	    mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
	}
}