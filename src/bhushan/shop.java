package bhushan;
class shop{
	String Maggie,Dosa,oilpouches,panipuri,masala;
	static int MaggieQ,DosaQ,oilpouchesQ,panipuriQ,masalaQ;
	
	void setinitialQ(int Maggie,int Dosa,int oilpouches,int panipuri,int masala){
		MaggieQ = Maggie;
		DosaQ = Dosa;
		oilpouchesQ = oilpouches;
		panipuriQ = panipuri;
		masalaQ = masala;
		
	}
	void requestedQ(int reqMaggie,int reqDosa,int reqoilpouches,int reqpanipuri,int reqmasala,boolean pAllowedStatus){
		if(MaggieQ == 0)
			System.out.println("Maggie is out of stock");
		else if(reqMaggie <= MaggieQ){
			System.out.println(reqMaggie + " Maggie packets has been delivered as per customer demand");
			MaggieQ = MaggieQ-reqMaggie;
			System.out.println("Now, Total " + MaggieQ + " Maggie packets are remaining in stock");
		} else {
				System.out.println("Sorry, Maggie Total Packets in stock are " + MaggieQ + " and requested quantity is " + reqMaggie + " ,Couldn't serve full demand, We can give you maximum " +MaggieQ+ " Packets");
				if(pAllowedStatus){
				System.out.println("Customer is ready to buy with available "+MaggieQ+" Maggie Packets in stock");
				System.out.println(MaggieQ + " Maggie packets has been delivered");
				MaggieQ = 0;
				System.out.println("Now, Maggie is out of stock"); 
				}
		}
		if(DosaQ == 0)
			System.out.println("\nDosa is out of stock");	
		else if(reqDosa <= DosaQ){
			System.out.println("\n"+reqDosa + " Dosa packets has been delivered as per customer demand");
			DosaQ = DosaQ-reqDosa;
			System.out.println("Now, Total " + DosaQ + " Dosa packets are remaining in stock");
		} else {
				System.out.println("\nSorry, Dosa Total Packets in stock are " + DosaQ + " and requested quantity is " + reqDosa + " ,Couldn't serve full demand, We can give you maximum " +DosaQ+ " Packets");
				if(pAllowedStatus){
				System.out.println("Customer is ready to buy with available "+DosaQ+" Dosa Packets in stock");
				System.out.println(+DosaQ + " Dosa packets has been delivered");
				DosaQ = 0;
				System.out.println("Now, Dosa is out of stock"); 
				}
		}
		
		if(oilpouchesQ == 0)
			System.out.println("\nOil Pouch is out of stock");
		else if(reqoilpouches <= oilpouchesQ){
			System.out.println("\n"+reqoilpouches + " Oil Pouches has been delivered as per customer demand");
			oilpouchesQ = oilpouchesQ-reqoilpouches;
			System.out.println("Now, Total " + oilpouchesQ + " Oil Pouches are remaining in stock");
		} else {
			System.out.println("\nSorry, Oil Pouches in stock are " + oilpouchesQ + " and requested quantity is " + reqoilpouches + " ,Couldn't serve full demand, We can give you maximum " +oilpouchesQ+ " Oil Pouches");
			if(pAllowedStatus){
			System.out.println("Customer is ready to buy with available "+oilpouchesQ+" Oil Pouches in stock");
			System.out.println(oilpouchesQ + " Oil Pouches has been delivered");
			oilpouchesQ = 0;
			System.out.println("Now, Oil Pouches are out of stock"); 
			}
		}
		if(panipuriQ == 0)
			System.out.println("\nPaniPuri packet is out of stock");
		else if(reqpanipuri <= panipuriQ){
			System.out.println("\n"+reqpanipuri + " PaniPuri packets has been delivered as per customer demand");
			panipuriQ = panipuriQ-reqpanipuri;
			System.out.println("Now, Total " + panipuriQ + " Panipuri packets are remaining in stock");
		} else {
			System.out.println("\nSorry, Panipuri packets in stock are " + panipuriQ + " and requested quantity is " + reqpanipuri + " ,Couldn't serve full demand, We can give you maximum " +panipuriQ+ " Panipuri packets");
			if(pAllowedStatus){
			System.out.println("Customer is ready to buy with available "+panipuriQ+" Panipuri packets in stock");
			System.out.println(panipuriQ + " Panipuri Packets has been delivered");
			panipuriQ = 0;
			System.out.println("Now, Panipuri packets are out of stock");
			}
		}
		
		if(masalaQ == 0)
			System.out.println("\nMasala packet is out of stock");
		else if(reqmasala <= masalaQ){
			System.out.println("\n"+reqmasala + " Masala packets has been delivered as per customer demand");
			masalaQ = masalaQ-reqmasala;
			System.out.println("Now, Total " + masalaQ + " Masala packets are remaining in stock");
		} else {
			System.out.println("\nSorry, Masala packets in stock are " + masalaQ + " and requested quantity is " + reqmasala + " ,Couldn't serve full demand, We can give you maximum " +masalaQ+ " Masala packets");
			if(pAllowedStatus){
			System.out.println("Customer is ready to buy with available "+masalaQ+" Masala packets in stock");
			System.out.println(masalaQ + " Masala Packets has been delivered");
			masalaQ = 0;
			System.out.println("Now, Masala packets are out of stock");
			}
		}
		}
		
		void outOfStockItem(){
			
			System.out.println("\nBelow items are running of stock");
			if(panipuriQ == 0)
			System.out.println("Panipuri packet is out of stock");
			if(MaggieQ == 0)
			System.out.println("Maggie packet is out of stock");
			if(DosaQ == 0)
			System.out.println("Dosa packet is out of stock");
			if(oilpouchesQ == 0)
			System.out.println("Oil Pouch is out of stock");
			if(masalaQ == 0)
			System.out.println("Masala packet is out of stock");
		
	}
	
	void availableItem(){
			
			System.out.println("\nBelow items are available");
			if(panipuriQ > 0)
			System.out.println(panipuriQ + " Panipuri packets available in stock");
			if(MaggieQ > 0)
			System.out.println(MaggieQ + " Maggie packets available in stock");
			if(DosaQ > 0)
			System.out.println(DosaQ + " Dasa packets available in stock");
			if(oilpouchesQ > 0)
			System.out.println(oilpouchesQ + " Oil pouches available in stock");
			if(masalaQ > 0)
			System.out.println(masalaQ + " masala packets available in stock");
		
	}
	
	public static void main(String [] args){
	
		shop shop1 = new shop();
		shop1.setinitialQ(50,35,39,0,0);
		shop1.requestedQ(40,40,35,41,75,true);
		shop1.outOfStockItem();
		shop1.availableItem();
		
	}
}