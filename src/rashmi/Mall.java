package rashmi;
public class Mall{

	int item;
	String name;
	String payment;
	Boolean bill;
	Boolean carrybag;
	String section;
	
	void itemAddedToCart(int noOfItems){
		item = noOfItems;
	}
	
	void customerName(String cName){
		name = cName;
	}	
		
	void paymenyDoneUsing(String modeOfPayment){
		payment = modeOfPayment;
	}
		
	void bill( boolean cBill){
		bill = cBill;
		
	}
	
	void carrybag(boolean custBag){
		carrybag = custBag;
		}
	
	void decideSection(){
	
		if(item < 10 && payment.equals("cash"))
			section = "1A";
		else if(item > 10 && payment.equals("visa card"))
			section = "1B";
		else if(item > 10 && payment.equals("cash"))
			 section = "1C";
		else if(item < 10 && payment.equals("visa card"))
			section = "1D";
			
		}
		
	void displayCustomerInfo(){
		
		System.out.println(name + " buys " + item + " items and payment done using " + payment + " in section " + section);
		System.out.println("Needbill - " +bill);
		System.out.println("Required CarryBag - " +carrybag);
		}
		
	public static void main(String[] args){
		
		Mall mall = new Mall();
		mall.itemAddedToCart(16);
		mall.customerName("Ravi");
		mall.paymenyDoneUsing("cash");
		mall.bill(true);
		mall.carrybag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
			