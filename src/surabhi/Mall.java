package surabhi;
/* 
 * Assignment Number 5
 * 
 * */
class Mall{
	int noOfitems;
	String custName, paymentMode, section;
	boolean isBillRequired, isCarryBagRequired; 
	
	void itemAddedToCart(int itemCount){
		noOfitems=itemCount;
	}
	void customerName(String name){
		custName=name;
	}
	void paymentDoneUsing(String mode){
		paymentMode=mode;
	}
	void needBill(boolean billRequired){
		isBillRequired=billRequired;
	}
	void haveCarryBag(boolean carryBagRequired){
		isCarryBagRequired=carryBagRequired;
	}
	void decideSection(){
		if(noOfitems<=10){
			if(paymentMode.equals("cash"))
				section="1A";
			else if(paymentMode.equals("visaCard"))
				section="1D";
		    else{ 
				section=" ";
				System.out.println("other payment mode entered");
			}
		}
		if(noOfitems>10){
			if(paymentMode.equals("cash"))
				section="1C";
			if(paymentMode.equals("visaCard"))
				section="1B";
			else{ 
				section=" ";
				System.out.println("other payment mode entered");
			}
		}
	}
	void displayCutomerInfo(){
		System.out.println(custName+" buys "+noOfitems+" items and payment done using "+paymentMode+" in section "+section);
		System.out.println("Need bill - "+isBillRequired);
		System.out.println("Required carryBag - "+isCarryBagRequired); 
	}
	
	public static void main(String[] arge){
		Mall mall=new Mall();
		mall.itemAddedToCart(10);
		mall.customerName("surabhi");
		mall.paymentDoneUsing("visaCard");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}