package neha_Patil;

public class Mall  {

	int item;
	String name, section, paymentmode;
	boolean bill;
	boolean carrybag;

	void iteamAddedtoCart(int itemaddcart){
		item= itemaddcart;
	}

	void customerName(String custname){
		name= custname;
	}

	void parymtnDoneusing(String paymentdone ){
		paymentmode= paymentdone;
	}

	void displayCustomerInfo(){	
		System.out.println(name + " buys " +item + " items and payment done using " + paymentmode + " in section " + section);
		System.out.println("Need bill -" + bill);
		System.out.println("Required carry bag -" + carrybag);
	}

	void needBill(boolean needbill){
		bill= needbill;
	}

	void haveCarryBag(boolean havecarrybag){
		carrybag= havecarrybag;
	}

	void decideSection(){
		if(item < 10 && paymentmode.equals("cash"))
		section = "1A" ;

		else if(item > 10 && paymentmode.equals("visa card"))
		section = "1B" ;

		else if (item > 10 && paymentmode.equals("cash"))
		section = "1C" ;

		else if(item < 10 && paymentmode.equals("visa card"))
		section = "1D" ;
	}

	public static void main(String [] args){

	Mall m= new Mall();
	m.iteamAddedtoCart(12);
	m.customerName("neha");
	m.parymtnDoneusing("visa card");
	m.decideSection();
	m.needBill(true);
	m.haveCarryBag(false);
	m.displayCustomerInfo();

	}

}
