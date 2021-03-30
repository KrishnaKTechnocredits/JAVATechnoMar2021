package ashish_Vyas;

public class ShopSystem {
	int maggiePackets;
	int dosaPackets;
	int oilPouches; 
	int panipuriPackets;
	int masalaPackets;
	
	void setInitialvalues(int maggie, int dosa, int oil, int panipuri, int masala) {
		maggiePackets = maggie;
		dosaPackets = dosa;
		oilPouches = oil;
		panipuriPackets = panipuri;
		masalaPackets = masala;
	}
	
	void requestedQ(int reqMaggie, int reqDosa, int reqOil, int reqPanipuri, int reqMasala, String pAllowedStatus) {
		//Quantity Calculation for Maggie
		if(reqMaggie <= maggiePackets)
			maggiePackets= maggiePackets - reqMaggie;
		else if (maggiePackets == 0) {
			System.out.println("Sorry Maggie running out of stock");
		}else {
			System.out.println("Sorry, Not sufficient Quanity of Maggie. We can only give you"+ maggiePackets);
			System.out.println("Meggaie qctual Q is" +maggiePackets+"and requested Q is "+reqMaggie);
			if(pAllowedStatus.equals("PAllowed")) {
				maggiePackets=0;
			}
		}
		//Quantity Calculation for Dosa
		if(reqDosa <= dosaPackets)
			dosaPackets= dosaPackets - reqDosa;
		else if (dosaPackets == 0) {
			System.out.println("Sorry Dosa running out of stock");
		}else {
			System.out.println("Sorry, Not sufficient Q. We can only give you" + dosaPackets);
			System.out.println("Dosa qctual Q is" +dosaPackets+"and requested Q is "+reqDosa);
			if(pAllowedStatus.equals("PAllowed")) {
				dosaPackets=0;
			}
		}
		//Quantity Calculation for Oil
		if(reqOil <= oilPouches)
			oilPouches= oilPouches - reqOil;
		else if (oilPouches == 0) {
			System.out.println("Sorry Oil is running out of stock");
		}else {
			System.out.println("Sorry, Not sufficient quantity of Oil. We can only give you" + oilPouches);
			System.out.println("Oil qctual Q is" +oilPouches+"and requested Q is "+reqOil);
			if(pAllowedStatus.equals("PAllowed")) {
				oilPouches=0;
			}
		}
		//Quantity Calculation for Panipuri
		if(reqPanipuri <= panipuriPackets)
			panipuriPackets= panipuriPackets - reqPanipuri;
		else if (panipuriPackets == 0) {
			System.out.println("Sorry Oil is running out of stock");
		}else {
			System.out.println("Sorry, Not sufficient Q. We can only give you" + panipuriPackets);
			System.out.println("Panipuri qctual Q is" +panipuriPackets+"and requested Q is "+reqPanipuri);
			if(pAllowedStatus.equals("PAllowed")) {
				panipuriPackets=0;
			}
		}
		//Quantity Calculation for Masala
		if(reqMasala <= masalaPackets)
			masalaPackets= masalaPackets - reqMasala;
		else if (masalaPackets == 0) {
			System.out.println("Sorry Oil is running out of stock");
		}else {
			System.out.println("Sorry, Not sufficient Q. We can only give you" + masalaPackets);
			System.out.println("Masala qctual Q is" +masalaPackets+"and requested Q is "+reqMasala);
			if(pAllowedStatus.equals("PAllowed")) {
				masalaPackets=0;
			}
		}
			
	}
	//Out of stock
	void getOutOfStockItems(){
		if (maggiePackets >0 && dosaPackets >0 && oilPouches>0 && panipuriPackets>0 && masalaPackets>0){
			System.out.println("All Items are in Stock");}
		if (maggiePackets<=0) {
			System.out.println("Maggie is out of stock");
		}if (dosaPackets<=0) {
			System.out.println("DOsa is out of stock");
		}if (oilPouches<=0) {
			System.out.println("Oil is out of stock");
		}if (panipuriPackets<=0) {
			System.out.println("Panipuri is out of stock");
		}if (masalaPackets<=0) {
			System.out.println("Masal is out of stock");
		}
	}
	//"Available in stock"
	void getAvailableStockItems(){
		if (maggiePackets <0 && dosaPackets <0 && oilPouches<0 && panipuriPackets<0 && masalaPackets<0){
			System.out.println("All Items are: Out Of Stock");}
		if (maggiePackets>0) {
			System.out.println("Maggie is in stock");
		}if (dosaPackets>0) {
			System.out.println("DOsa is in stock");
		}if (oilPouches>0) {
			System.out.println("Oil is in sock");
		}if (panipuriPackets>0) {
			System.out.println("Panipuri is in stock");
		}if (masalaPackets>0) {
			System.out.println("Masal is in stock");
		}
	}
	//main method
	public static void main(String[] arg) {
		ShopSystem shopSystem =new ShopSystem();
		shopSystem.setInitialvalues(50, 50, 50, 50, 50);
		shopSystem.requestedQ(20, 30, 60, 50, 10, "PAllowed");
		shopSystem.getOutOfStockItems();
		shopSystem.getAvailableStockItems();
	}

}
