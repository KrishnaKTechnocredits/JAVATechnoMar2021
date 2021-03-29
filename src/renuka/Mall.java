/*Assignment-5 :*/

package renuka;

class Mall{

     int items;
     String custName, paymentMode, section; 
	 boolean bill, carryBag;

     void itemAddedToCart(int noOfItems){
	     items = noOfItems;
	 }
	 void customerName(String name){
	     custName = name;
	 }
	 void paymentDoneUsing(String payment){
	     paymentMode = payment;
	 }
	 
	 void needBill(boolean billRequired){
	     bill = billRequired;
	 }
	 
	 void haveCarryBag(boolean carryBagRequired){
	     carryBag = carryBagRequired;
	 }
	 
	 void decideSection(){
	     if(items > 10 && paymentMode.equals("Cash")){
		     section = "Section1A";	
		 }
		 else if(items < 10 && paymentMode.equals("VISA Card")){
		     section = "Section1B";
		 }
	     else if(items < 10 && paymentMode.equals("Cash")){
		     section = "Section1C";
		 }
		 else{
			 section = "Section1D";
		 }
	 }
	 
	 void displayCustomerInfo(){
	     System.out.println(custName +" Buys " +items+" Items and Payment Done using " + paymentMode+" in "+section);
	 
	 }
	 
	 public static void main(String[] args){
	     Mall mall = new Mall();
		 mall.customerName("Harsh");
		 mall.itemAddedToCart(12);
		 mall.paymentDoneUsing("VISA Card");
		 mall.needBill(true);
		 mall.haveCarryBag(true);
		 mall.decideSection();
		 mall.displayCustomerInfo();
	 }
}