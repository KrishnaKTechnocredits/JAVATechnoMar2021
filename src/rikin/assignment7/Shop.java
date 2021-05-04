package rikin.assignment7;
/*Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.
Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/

class Shop{
	int maggieQty, dosaQty, oilPoucheQty, panipuriQty, masalaPacketQty;
	 
	void initialStocks(int maggie, int dosa, int oilPouche, int panipuri, int masalaPacket){
		maggieQty = maggie;
		dosaQty = dosa;
		oilPoucheQty = oilPouche;
		panipuriQty = panipuri;
		masalaPacketQty = masalaPacket;
			System.out.println("\n");
			System.out.println("Items available at shop:");
			System.out.println("Maggie stock quantity is " + maggieQty);
			System.out.println("Dosa stock quantity is " + dosaQty);
			System.out.println("Oil pouche stock quantity is " + oilPoucheQty);
			System.out.println("panipuri stock quantity is " + panipuriQty);
			System.out.println("Masala packet stock quantity is " + masalaPacketQty);			
	}
		
	void requestedQty(int reqMaggie, boolean PMaggieSell, int reqDosa, boolean PDosaSell, int reqOilPouche, boolean POilPoucheSell, int reqPanipuri, boolean PPanipuriSell, int reqMasalaPacket, boolean PMasalaSell){
		System.out.println("\n");
		if(maggieQty ==0){
			System.out.println("Sorry, Maggie is not available in stock.");
		}else if(reqMaggie <= maggieQty){
			maggieQty = maggieQty - reqMaggie;
			System.out.println("Maggie purchased qty is: "+ reqMaggie);
		}else{
			System.out.println("Maggie actual qty is " + maggieQty + " and requested qty is " + reqMaggie + ", We can serve only: " + maggieQty );
			if(PMaggieSell){
				maggieQty = 0;
			}
		}
		if(dosaQty ==0){
			System.out.println("Sorry, Dosa is not available in stock.");
		}else if(reqDosa <= dosaQty){
			dosaQty = dosaQty - reqDosa;
			System.out.println("Dosa purchased qty is: "+ reqDosa);
		}else{
			System.out.println("Dosa actual qty is " + dosaQty + " and requested qty is " + reqDosa + ", We can serve only: " + dosaQty );
			if(PDosaSell){
				dosaQty = 0;
			}
		}
		if(oilPoucheQty ==0){
			System.out.println("Sorry, Oil Pouche is not available in stock.");
		}else if(reqOilPouche <= oilPoucheQty){
			oilPoucheQty = oilPoucheQty - reqOilPouche;
			System.out.println("Oil Pouche purchased qty is: "+ reqOilPouche);
		}else{
			System.out.println("Oil Pouchee actual qty is " + oilPoucheQty + " and requested qty is " + reqOilPouche + ", We can serve only: " + oilPoucheQty );
			if(POilPoucheSell){
				oilPoucheQty = 0;
			}
		}
		if(panipuriQty ==0){
			System.out.println("Sorry, Panipuri is not available in stock.");
		}else if(reqPanipuri <= panipuriQty){
			panipuriQty = panipuriQty - reqPanipuri;
			System.out.println("Panipuri purchased qty is: "+ reqPanipuri);
		}else{
			System.out.println("Panipuri actual qty is " + panipuriQty + " and requested qty is " + reqPanipuri + ", We can serve only: " + panipuriQty );
			if(PPanipuriSell){
				panipuriQty = 0;
			}
		}
		if(masalaPacketQty ==0){
			System.out.println("Sorry, Masala packet is not available in stock.");
		}else if(reqMasalaPacket <= masalaPacketQty){
			masalaPacketQty = masalaPacketQty - reqMasalaPacket;
			System.out.println("Masala packet purchased qty is: "+ reqMasalaPacket);
		}else{
			System.out.println("Masala Packet actual qty is " + masalaPacketQty + " and requested qty is " + reqMasalaPacket + ", We can serve only: " + masalaPacketQty );
			if(PMasalaSell){
				masalaPacketQty = 0;
			}
		}
	}
	 
	void dispalyAvailableStock() {
		System.out.println("\nAvailable stock is:");
		if (maggieQty != 0 )
			System.out.println("Maggie: "+maggieQty);
		if (dosaQty != 0 )
			System.out.println("Dosa: "+ dosaQty);
		if (oilPoucheQty != 0 )
			System.out.println("Oil Pouches: "+oilPoucheQty);
		if (panipuriQty != 0 )
			System.out.println("Panipuri: "+panipuriQty);
		if (masalaPacketQty != 0 )
			System.out.println("Masala Packet: "+masalaPacketQty);
	}	
		
	void displayOutOfStock(){
		System.out.println("\nOut of stock Items:");
		if (maggieQty == 0 )
			System.out.println("Maggie");
		if (dosaQty == 0 )
			System.out.println("Dosa");
		if (oilPoucheQty == 0 )
			System.out.println("OilPouche");
		if (panipuriQty == 0 )
			System.out.println("Panipuri");
		if (masalaPacketQty == 0 )
			System.out.println("Masala Packet");

	}	
	public static void main(String [] args){
		Shop shop = new Shop();
		shop.initialStocks(50,43,39,43,73);
		shop.requestedQty(30,true,43,true,30,true,20,true,10,true);
		shop.dispalyAvailableStock();
		shop.displayOutOfStock();
		
		shop.initialStocks(0,50,0,55,30);
		shop.requestedQty(30,true,5,true,20,true,20,true,35,true);
		shop.dispalyAvailableStock();
		shop.displayOutOfStock();
	}
 }