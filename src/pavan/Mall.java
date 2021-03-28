package pavan;
class Mall{
	String custName;
	int items;
	boolean bill; 
	boolean bag;
	String paymentvia;
	String section;
	
	void customerName(String name){
		custName=name;
	}	
	void itemAddedToCart(int nitem){
		items=	nitem;
	}	
	void paymentDoneUsing(String pay){
		paymentvia= pay;		
	}	
	void needBill(boolean receipt){
		bill= receipt;
	}
	void haveCaryBag(boolean cary){
		bag= cary;	
	}
	void displayCustomerInfo(){
		System.out.println(custName+" buys "+ items+" items "+"and payment done using "+ paymentvia+" in section "+ section);
		System.out.println("Needbill= "+ bill);
		System.out.println("Required Carybag = "+ bag);
	}
	void decideSection(){
		if (items>10){
			if (paymentvia.equals("cash")){
				section= "1C";
				}else section= "1B" ;
			}
		else 
			if (items<10){
				if ( paymentvia.equals("cash")){
					section="1A";
				}else section="1D";			
			}
	}		
	public static void main(String[]args){
		Mall mall=new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(20);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.needBill(true);
		mall.haveCaryBag(false);
	}
}	