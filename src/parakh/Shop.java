class Shop {

	int stockofMaggie=50;
	int stockofDosa=43;
	int stockofOilPouches=39;
	int stockofPanipuri=43;
	int stockofmasala=73;

	void requestedQ(boolean reqType,int maggieq, int dosaQ, int oilQ, int panipuriQ, int masalaQ ){ 
		if(maggieq==0) 
			System.out.println("Sorry maggie running out of stock");
		else 
			  if(stockofMaggie>=maggieq) {
				System.out.println("We served your request for maggie");
				stockofMaggie=stockofMaggie-maggieq;
			  }
				else if(reqType==true) {	
					System.out.println("We are providing partial request of maggie "+maggieq);
					maggieq=0;
				}	

		if(dosaQ==0) 
			System.out.println("Sorry dosa running out of stock");
		else if(stockofDosa>=dosaQ) {
				System.out.println("We served your request for dosa packet");
				stockofDosa=stockofDosa-dosaQ;
		}
				else if(reqType==true) {	
					System.out.println("We are providing partial request of dosa "+dosaQ);
					dosaQ=0;
				}
		if(oilQ==0) 
			System.out.println("Sorry oil pouches running out of stock");
		else if(stockofOilPouches>=oilQ) {
				System.out.println("We served your request for oil pouches");
				stockofOilPouches=stockofOilPouches-oilQ;
		}
				else if(reqType==true) {	
					System.out.println("We are providing partial request of oil pouches"+oilQ);
					oilQ=0;
				}
		if(masalaQ==0) 
			System.out.println("Sorry masala packets running out of stock");
		else if(stockofmasala==masalaQ) {
				System.out.println("We served your request for masala packets");
				stockofmasala=stockofmasala-masalaQ;
		}
				else if(reqType==true) {	
					System.out.println("We are providing partial request of masala packets "+masalaQ);
					masalaQ=0;
				}

		if(panipuriQ==0) 
			System.out.println("Sorry panipuri packets running out of stock");
		else if(stockofPanipuri>=panipuriQ) {
				System.out.println("We served your request for panipuri");
				stockofPanipuri=stockofPanipuri-panipuriQ;
		}
				else if(reqType==true) {	
					System.out.println("We are providing partial request of panipuri "+panipuriQ);
					panipuriQ=0;
				}



	}

	void outofStock() {
		if(stockofMaggie==0)
			System.out.println("Maggie packet is out of stock!!!");
		if(stockofDosa==0)
			System.out.println("Dosa packet is out of stock!!!");
		if(stockofOilPouches==0)
			System.out.println("Oil pouche is out of stock!!!");
		if(stockofPanipuri==0)
			System.out.println("Panipuri packet is out of stock!!!");
		if(stockofmasala==0)
			System.out.println("Masala packet is out of stock!!!");
	}

	void avialableinStock() {
		if(stockofMaggie!=0)
			System.out.println("Maggie packets is available in stock!!!");
		if(stockofDosa!=0)
			System.out.println("Dosa packets is available in stock!!!");
		if(stockofOilPouches!=0)
			System.out.println("Oil pouches is available in stock!!!");
		if(stockofPanipuri!=0)
			System.out.println("Panipuri packets is available in stock!!!");
		if(stockofmasala!=0)
			System.out.println("Masala packet is available in stock!!!");
	}

	public static void main(String[] args) {
		Shop shop= new Shop();
		shop.avialableinStock();
		System.out.println("Raise your request");
		shop.requestedQ(true, 50, 24, 30, 45, 55);
		System.out.println("show the out of stock items");
		shop.outofStock();
	}
}