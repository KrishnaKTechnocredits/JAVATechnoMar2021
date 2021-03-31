package dipali;

public class Mall {
	
		String custName;
		int itemCnt;
		String paymentWay;
		boolean checkBill;
		boolean checkCarryBag;
		String section;
		void itemAddedCart(int itemOfItem){
			itemCnt=itemOfItem;		
		}
		
		void customerName(String cust){
			custName=cust;
		}
		
		void paymentDoneUsing(String pay){
			if(pay.equals("Visa Card"))
				paymentWay="Visa Card";
			else if(pay.equals("Cash"))
				paymentWay="Cash";
			else
				System.out.println("Please use either Visa card or cash payment gate way");
		}
		
		void displayCutomerInfo(){
			System.out.println(custName+" has buys "+itemCnt+" items and payment done using "+paymentWay+" in section "+section+".");
		}
		
		void needBill(boolean billCheck){
			checkBill=billCheck;
		}
		
		void haveCarryBag(boolean carryBagCheck){
			checkCarryBag=carryBagCheck;
		}
		
		void decideSection(){
			if(itemCnt<10 && paymentWay.equals("Cash"))
				section="1A";
			else if(itemCnt>10 && paymentWay.equals("Visa Card"))
				section="1B";
			else if(itemCnt>10 && paymentWay.equals("Cash"))
				section="1C";
			else if(itemCnt>10 && paymentWay.equals("Visa Card"))
				section="1D";
		}
		
		public static void main(String args[]){
			Mall mall=new Mall();
			mall.itemAddedCart(12);
			mall.customerName("Dipali");
			mall.paymentDoneUsing("Cash");
			mall.decideSection();
			mall.displayCutomerInfo();
			mall.needBill(true);
			mall.haveCarryBag(false);	
		}
	}


