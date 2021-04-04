/*
 Assignment 5 : 26th Mar 2021

1. Create a class named as Mall, which contains below methods.

a. itemAddedToCart()
b. customerName()
c. paymentDoneUsing()
i. Visa Card ii. Cash
d. displayCutomerInfo()
e. needBill()
f. haveCarryBag()
g. decideSection()

i.e. displayCustomerInfo() should print on console : Harsh buys 12 items and payment done using visa card in section 1B.
Needbill - true
Required CarryBag - false
Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter

 */

package amruta.Assignment_5;

class Mall{

	String custName;
	int items;
	boolean bill;
	boolean bag;
	String modeofpayment;
	String section;
	
		void customername(String name){
			custName = name;
		}
		void itemAddedToCart(int itemcount){
			items = itemcount;
		}
		void paymentDoneUsing(String payment){
			modeofpayment = payment;
		}
		void decideSection(){
			if(items<10 && modeofpayment.equals("Cash")){
				section = "1A";
			}else if(items>10 && modeofpayment.equals("Visa Card.")){
				section = "1B";
			}else if(items>10 && modeofpayment.equals("Cash")){
				section = "1C";
			}else if(items<10 && modeofpayment.equals("Visa Card")){
				section = "1D";
			}else{
				System.out.println("Please pay bills by using cash or visa card");
			}
		}
		void needBill(boolean needbill){
			bill = needbill;
		}
		void haveCarrybag(boolean carrybag){
			bag = carrybag;
		}
		void displayCustomerInfo(){
			System.out.println(custName+" buys " + items +" items and payment done using "+modeofpayment+" in section "+ section);
			System.out.println("Customer wants Bill receipt :"+bill);
			System.out.println("Customer have Carry Bag :"+bag);			
			System.out.println("-------------------------------");
		}
				
		public static void main(String[] args){
		Mall mall = new Mall();
		mall.customername("Amruta");
		mall.itemAddedToCart(8);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarrybag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.customername("Priyanka");
		mall.itemAddedToCart(20);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarrybag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
		}
}