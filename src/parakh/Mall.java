package parakh;

public class Mall{
   
     int itemCount;
	 String name;
     String paymentMode;
     String section;
	 boolean haveCarryBag, needBill;
	 
	 void itemAddedToCart(int totalItem){
	        itemCount = totalItem;
	 } 
	 
	 void customerName(String custName){
	        name = custName;
	 }
	 
	 void paymentDoneUsing(String modeOfPayment){
	        paymentMode = modeOfPayment;
	 }
	
	 void displayCustomerInfo(){
		  System.out.println(name+ " buys "+ itemCount + " items and payment done using "+ paymentMode+ " in section " +section);
		  System.out.println("Needbill - " + needBill);
		  System.out.println("Required carrybag - " +haveCarryBag);
	 }
     
	 void needBill(boolean billNeeded){
	       needBill = billNeeded;
	}
	
	 void haveCarryBag(boolean carryBag){
	       haveCarryBag = carryBag;
	}
	
	 void decideSection(){
	      if(itemCount < 10 && paymentMode.equals("Cash")){
		      section = "1A";
	      }else if(itemCount > 10 && paymentMode.equals("Visa Card")){
		      section = "1B";
	      }else if(itemCount < 10 && paymentMode.equals("Visa Card")){
		      section = "1A";
	      }else if(itemCount > 10 && paymentMode.equals("Cash")){
		      section = "1B";
	      }
	}
	
	
	public static void main(String args[]){
	     Mall mall = new Mall();
		 mall.customerName("Harsh");
		 mall.itemAddedToCart(12);
		 mall.paymentDoneUsing("Visa Card");
   		 mall.decideSection();
		 mall.needBill(true);
		 mall.haveCarryBag(false);
		 mall.displayCustomerInfo();
		 }
}