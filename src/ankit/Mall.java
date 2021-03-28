/*Assignment 5 : 26th Mar 2021

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
package ankit;
class Mall{
	String cName, payVia, section;
	int itemCount;
	boolean needBill, haveBag;
	
	void customerName(String  name){
		cName = name;
	}
	void itemAddedToCart(int iCount){
		itemCount = iCount;
	}
	void paymentDoneUsing(String pVia){
		payVia = pVia;
	}
	void needBill(boolean nBill){
		needBill = nBill;
	}
	void haveCarryBag(boolean hBag){
		haveBag = hBag;
	}
	void decideSection(){
		if(itemCount<10 && payVia.equals("Cash")){
			section = "1A";			
			}
		else if (itemCount>10 && payVia.equals("visa card")){
			section = "1B";			
			}
		else if (itemCount>10 && payVia.equals("Cash")){
			section = "1C";			
			}
		else if (itemCount<10 && payVia.equals("visa card")){
			section = "1D";			
			}
		else{
			section = "paid online";	
			}
	}
	void displayCutomerInfo(){
		System.out.println(cName + " buys " +itemCount+ " items and payment done using " +payVia+ " in Section "+ section);
		System.out.println("Needbill - "+needBill);
		System.out.println("Required CarryBag - " +haveBag);
	}
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Ankit");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsing("visa card");
		mall.needBill(false);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}
