/*
 *assignment 5 Mall customer details using if else ladder string concatenation and printing all details in one print statement
 */
package purva;

class Mall{
     int noOfItem;
	 String custName;
	 String paymentMode;
	 String section;
	 boolean needbill,haveCarryBag;
	 
     void itemAddedToCart(int item){
		 noOfItem=item;
	 }
	 
	 void customerName(String name){
		 custName=name;
		
	 }
	 
	 void paymentDoneUsing(String paymentType){
		 paymentMode=paymentType;
	 }
	 
	 void needBill(boolean bill){
		 needbill=bill;
	 }
	 
	 void haveCarryBag(boolean carryBag){
		 haveCarryBag=carryBag;
	 }
	 
	 void decideSection(){
		 if(noOfItem<10 && paymentMode.equals("cash"))
			 section = "Section 1A";
		 else if(noOfItem>10 && paymentMode.equals("VisaCard"))
			 section="Section 1B";
		 else if (noOfItem>10 && paymentMode.equals("cash"))
			 section="Section 1C";
		 else if(noOfItem<10 && paymentMode.equals("VisaCard"))
			 section="Section 1D";	 
	 }
	 
	 void displayCustomerInfo(){
		 System.out.println(custName +" buys "+noOfItem +" item and payment done using "+ paymentMode+" in "+section);
		 System.out.println("Need bill -"+needbill);
		 System.out.println("Required Carry bag -"+haveCarryBag);
	 }
	 
	 public static void main(String[] a){
		 Mall mall= new Mall();
		 mall.itemAddedToCart(10);
		 mall.customerName("Harsh");
		 mall.paymentDoneUsing("cash");
		 mall.needBill(true);
		 mall.haveCarryBag(false);
		 mall.displayCustomerInfo();
	 }
}