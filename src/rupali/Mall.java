//Assignment 5

package rupali;
class Mall{
		String custName;
		int numberOfItem;
		String modeOfPayment;
		String section;
		boolean carryBagNeeded, billNeeded;
		
		void itemAddedToCart(int itemcount){
			numberOfItem=itemcount;
		}
		
		void customerName(String cname){
			custName=cname;
		}
		
		void paymentDoneUsing(String typeOfPayment){
			modeOfPayment=typeOfPayment;
		}
		
		void needBill(boolean bill){
			billNeeded=bill;
		}
		
		void haveCarryBag(boolean carryBag){
			carryBagNeeded=carryBag;
		}
		
		void decideSection(){
			if(numberOfItem<=10){
				if(modeOfPayment.equals("cash"))
					section="1A";
				else if( modeOfPayment.equals("visa card"))
					section="1D";
			}
			else {
				if(numberOfItem>10)
					if(modeOfPayment.equals("cash"))
						section="1C";
			         else if(modeOfPayment.equals("visa card"))
							section="1B";
			}
		}
		
		void displayInformation(){
			System.out.println(custName+" buys "+ numberOfItem +" items "+ " & done payment using "+modeOfPayment+" in section "+section);
			System.out.println("Need bill: " +billNeeded);
			System.out.println("Required CarryBag: "+carryBagNeeded);
		}
		
		public static void main(String[] args){
			Mall mall=new Mall();
			mall.customerName("Harsh");
			mall.itemAddedToCart(12);
			mall.paymentDoneUsing("visa card");
			mall.decideSection();
			mall.displayInformation();
			mall.needBill(true);
			mall.haveCarryBag(false);
		}
}
			