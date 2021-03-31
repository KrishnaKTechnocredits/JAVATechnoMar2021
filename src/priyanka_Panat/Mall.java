package priyanka_Panat;

/*
 Assignment 5
 */

class Mall{
	int numOfItem;
	String custname;
	String section;
	String modeOfPayment;
	boolean bill,carrybag;
	
	void customerName(String name){
		custname=name;
	}
	
	void itemAddedToCart(int item){
		numOfItem=item;
	}
	
	void paymentDoneUsing(String payment){
		modeOfPayment=payment;
	}
	
	void needBill(boolean flag1){
		bill=flag1;
	}
	
	void haveCarrybag(boolean flag2){
		carrybag=flag2;
	}
	
	void decideSection(){
		if(numOfItem<10){
			if(modeOfPayment.equals("cash"))
					section="1A";
			else if(modeOfPayment.equals("visacard"))
				section="1D";
		}
		else{
			if(numOfItem>10){
				if(modeOfPayment.equals("cash"))
					section="1C";
				else if(modeOfPayment.equals("visacard"))
					section="1B";
			}
		}
			
	}
	
	void displayCustomerInfo(){
		System.out.println(custname + " buys "+ numOfItem + " items and payment done using " + modeOfPayment + " in section " + section);
		System.out.println("Need Bill : " +bill);
		System.out.println("Required CarryBag : " +carrybag);
	}
	
	public static void main(String[] args){
			Mall m1=new Mall();
			m1.customerName("Priyanka");
			m1.itemAddedToCart(12);
			m1.paymentDoneUsing("visacard");
			m1.decideSection();
			m1.needBill(true);
			m1.haveCarrybag(false);
			m1.displayCustomerInfo();
		
	}
}
			
			
	
			