package siddhant;

class Mall{
	String customername;
	String paymentdoingusing;
	String Decidesection;
	int itemAddtocart;
	boolean needBill,havecarryBag;
	
	void Customername(String name){
		customername=name;
	}
	void ItemAddtocart(int item){
		itemAddtocart=item;
	}
	void Paymentdoingusing(String payment){
		paymentdoingusing=payment;
	}
	void NeedBill(boolean bill){
		needBill=bill;
	}
	void HavecarryBag(boolean bag){
		havecarryBag=bag;
	}
	
	void decidesection(){
		if(itemAddtocart<10){ 
			if(paymentdoingusing.equals("cash"))
				Decidesection = "1A";
			else if(paymentdoingusing.equals("visacard"))
				Decidesection = "1D";
			else{
			Decidesection=" ";
			System.out.println("other payment mode entered");
			}
		}
		if(itemAddtocart>10){
			if(paymentdoingusing.equals("cash"))
				Decidesection = "1C";
		    if(paymentdoingusing.equals("visacard"))
				Decidesection = "1B";
			else{
				Decidesection=" ";
				System.out.println("Other payment mode Entered");
			}
		}	
	}
	void displaycustomerinfo(){
		System.out.println(customername+ " buys " +itemAddtocart+ "item and payment done using "
			+paymentdoingusing+ " in section "+ Decidesection);
		System.out.println("Need Bill-" +needBill);
		System.out.println("Required Carry Bag-" +havecarryBag);
	}
	public static void main(String[]a){
		Mall mall = new Mall();
		mall.Customername("Siddhant");
		mall.ItemAddtocart(12);
		mall.Paymentdoingusing("Visa card");
		mall.NeedBill(true);
		mall.HavecarryBag(false);
		mall.decidesection();
		mall.displaycustomerinfo();
	}
}	
		
		