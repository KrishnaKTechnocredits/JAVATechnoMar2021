package ashwini;

class Mall{
	
	
	int numberOfItems;
	String customerName, paymentDoneUsing, section;
	boolean needBill, haveCarryBag;
	
	void itemAddedToCart(int numberOfItemsInCart){
		 numberOfItems = numberOfItemsInCart;
	 }
	 
	 void customerName(String custName){
		  customerName = custName;
	 }
	 
	 void paymentDoneUsing(String paymentMode){
		 paymentDoneUsing = paymentMode;
	 }
	 
	 void displayCutomerInfo(){
		 System.out.println(customerName + " buys "+numberOfItems+ " items and payment done using "+ paymentDoneUsing+ " in " +section);
		 System.out.println("Need Bill- "+needBill);
		 System.out.println("Requried Carry bag- "+haveCarryBag);
	 }
	 
	 void needBill(boolean billRequried){
		needBill = billRequried; 
	 }
	 
	 void haveCarryBag(boolean haveBag){
		 haveCarryBag = haveBag;
	 }
	 
	 void decideSection(){
		 if(paymentDoneUsing.equals("visa card") || paymentDoneUsing.equals("cash")){
			 
		 if(numberOfItems<10 && paymentDoneUsing.equals("cash")){
			 section = "Section 1A";
		 }
		 else if(numberOfItems>10 && paymentDoneUsing.equals("visa cash")){
			 section = "Section 1B";
		 }
		 else if(numberOfItems>10 && paymentDoneUsing.equals("cash")){
			 section = "Section 1C";
		 }
		 else section = "Section 1D";
		 }
		 else System.out.println("Invalid shopping");
	 }
	 
	 public static void main(String[] a){
		 Mall mall = new Mall();
		 mall.itemAddedToCart(11);
		 mall.customerName("Ashwini");
		 mall.paymentDoneUsing("cash");
		 mall.needBill(true);
		 mall.haveCarryBag(false);
		 mall.decideSection();
		 mall.displayCutomerInfo();
		
	 }
		 
}
	