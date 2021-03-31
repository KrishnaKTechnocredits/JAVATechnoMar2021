package madhavi_Khasbage;

class Mall
{
	String name;
	String paymentMode;
	String section;
	String bill="Yes";
	String bag="Yes";
	boolean doYouNeedBill;
	boolean doYouhaveCarryBag;	
	int item;
	
	void itemAddedToCart(int custItem){			
		item=custItem;			
	}
	
	void customerName(String custName){
		name=custName;
	}
	
	void paymentDoneUsing(String paymentMode1){		
		paymentMode=paymentMode1;
	}
	
	void needBill(boolean doYouNeedBill1){
		doYouNeedBill=doYouNeedBill1;
		if(!doYouNeedBill){
			bill ="No"; }	
	}
	
	void haveCarryBag(boolean doYouhaveCarryBag1){
		doYouhaveCarryBag=doYouhaveCarryBag1;
		if(!doYouhaveCarryBag){
			bag ="No"; }	
	}
	
	void decideSection(){		
		if(item < 10 && paymentMode.equals("Cash")){
			section = "1A";			
		}else if(item > 10 && paymentMode.equals("Visa Card")){
			section = "1B";			
		}else if(item > 10 && paymentMode.equals("Cash")){
			section = "1C";			
		}else if(item < 10 && paymentMode.equals("Visa Card")){
			section = "1D";			
		}		
	}
	
	void displayCutomerInfo(){		
		System.out.println(name + " buys " + item + " items and payment done using " + paymentMode + " in section " + section + ".");
		System.out.println("Need bill      = "+ bill );
		System.out.println("Have carry bag = "+ bag );		
	}
	
	public static void main(String[] agrs){
		Mall mall1 =new Mall();
		mall1.itemAddedToCart(25);		
		mall1.customerName("Madhavi");
		mall1.paymentDoneUsing("Visa Card");		
		mall1.needBill(true);
		mall1.haveCarryBag(true);
		
		if(mall1.item>0){
			if(!mall1.paymentMode.equals("")){
				mall1.decideSection();
				mall1.displayCutomerInfo();		
			}else{
				System.out.println("Please enter payment mode Cash or Visa Card.");
			}	
		}else{
			System.out.println("Item quantity should be greater than 0.");
		}	
	}	
}