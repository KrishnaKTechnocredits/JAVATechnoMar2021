package nikita;

public class Mall {
 int items;
 String name,visacard,cash, paymentdone;
 boolean status, carrybag;
 
 void itemAddedToCart(int i)
 {
	 items=i;
 }
 
 void customerName(String nme)
 
 {
	 name=nme;
	 
 }
 void paymentDoneUsing(String cash, String visacard)
 {

     
 }
 
 
 void displayCustomerInfo()
 {
	 if(items<10 && paymentdone==cash)
		 System.out.println("Send to section 1A");
	 else if(items>10 && paymentdone==visacard)
		 System.out.println("Send" +name+ "to section 1B");
	 else if(items>10 && paymentdone==cash)
		 System.out.println("Send" +name+ "to section 1C");
	 else if(items<10 && paymentdone==visacard)
		 System.out.println("Send" +name+ "to section 1D");
	 else
		 System.out.println("please take cash or visa");
 }
 
void needBill(boolean st)
{
status=st;	
if(status==true)
System.out.println("Need Bill");
else
	System.out.println("Do not need bill");
}

void haveCarryBag(boolean carry)
{
carrybag=carry;
if(carrybag==true)
	System.out.println("Need carry4bag");
else
	System.out.println("Dont need CarryBag");
}

public static void main(String args[])
{
	Mall m= new Mall();
	m.itemAddedToCart(12);
	m.customerName("Harsh");
	//m.paymentDoneUsingVisa("visacard");
	m.needBill(true);
	m.haveCarryBag(false);
	m.displayCustomerInfo();
	
}

  
}
