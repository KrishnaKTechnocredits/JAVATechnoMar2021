package neha_Patil;

public class shop {


	int stockofMaggie=00;
	int stockofDosa=34;
	int stockofOilPouches=43;
	int stockofPanipuri=32;
	int stockofmasala=71;

	void requestedQ(int maggieq, int dosaQ, int oilQ, int panipuriQ, int masalaQ ){ 
		if(maggieq==0) 
			System.out.println("Sorry maggie packets running out of stock");
		else 
			  if(stockofMaggie>=maggieq) {
				System.out.println("We served your request for maggie");
				stockofMaggie=stockofMaggie-maggieq;
			  }
				else if(stockofMaggie<maggieq) {	
					System.out.println("We have this amount of quantity available for maggie "+maggieq);
					maggieq=0;
				}	

		if(dosaQ==0) 
			System.out.println("Sorry dosa running out of stock");
		else if(stockofDosa>=dosaQ) {
				System.out.println("We served your request for dosa packet");
				stockofDosa=stockofDosa-dosaQ;
		}
				else if(stockofDosa<dosaQ) {	
					System.out.println("We have this amount of quantity available for dosa "+dosaQ);
					dosaQ=0;
				}
		if(oilQ==0) 
			System.out.println("Sorry oil pouches running out of stock");
		else if(stockofOilPouches>=oilQ) {
				System.out.println("We served your request for oil pouches");
				stockofOilPouches=stockofOilPouches-oilQ;
		}
				else if(stockofOilPouches<oilQ) {	
					System.out.println("We have this amount of quantity available for pouches"+oilQ);
					oilQ=0;
				}
		if(masalaQ==0) 
			System.out.println("Sorry masala packets running out of stock");
		else if(stockofmasala>=masalaQ) {
				System.out.println("We served your request for masala packets");
				stockofmasala=stockofmasala-masalaQ;
		}
				else if(stockofmasala<masalaQ) {	
					System.out.println("We have this amount of quantity available for masala packets "+masalaQ);
					masalaQ=0;
				}

		if(panipuriQ==0) 
			System.out.println("Sorry panipuri packets running out of stock");
		else if(stockofPanipuri>=panipuriQ) {
				System.out.println("We served your request for panipuri");
				stockofPanipuri=stockofPanipuri-panipuriQ;
		}
				else if(stockofPanipuri<panipuriQ) {	
					System.out.println("We have amount of quantity available for panipuri "+panipuriQ);
					panipuriQ=0;
				}



	}

	void outofStock() {
		if(stockofMaggie==0)
			System.out.println("Maggie packet is out of stock");
		if(stockofDosa==0)
			System.out.println("Dosa packet is out of stock");
		if(stockofOilPouches==0)
			System.out.println("Oil pouche is out of stock");
		if(stockofPanipuri==0)
			System.out.println("Panipuri packet is out of stock");
		if(stockofmasala==0)
			System.out.println("Masala packet is out of stock");
	}

	void avialableinStock() {
		if(stockofMaggie!=0)
			System.out.println("Maggie packets is available in stock");
		if(stockofDosa!=0)
			System.out.println("Dosa packets is available in stock");
		if(stockofOilPouches!=0)
			System.out.println("Oil pouches is available in stock");
		if(stockofPanipuri!=0)
			System.out.println("Panipuri packets is available in stock");
		if(stockofmasala!=0)
			System.out.println("Masala packet is available in stock");
	}

	public static void main(String[] args) {
		shop s= new shop();
		s.avialableinStock();
		System.out.println("Raise your request");
		s.requestedQ( 62, 34, 45, 32, 55);
		System.out.println("show the out of stock items");
		s.outofStock();
	}

}
