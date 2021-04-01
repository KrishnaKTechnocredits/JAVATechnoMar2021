package bhavana;

public class Shop {
	int maggieQ;
	int dosaQ;
	int oilQ;
	int panipuriQ;
	int masalaQ;
	
	void setInitialQ(int maggi,int dosa,int oil,int panipuri,int masala) {
		maggieQ=maggi;
		dosaQ=dosa;
		oilQ=oil;
		panipuriQ=panipuri;
		masalaQ=masala;
	}
	
	void requestedQ(int maggi,int dosa,int oil,int panipuri,int masala) {
		if(maggi<=maggieQ){
			maggieQ=maggieQ-maggi;
			System.out.println("Available maggie is:" +maggieQ);
		}else if(maggieQ<=maggi)
			System.out.println("maggie running out of stock");
		if(dosa<=dosaQ) {
			dosaQ=dosaQ-dosa;
		System.out.println("Available dosa is:" +dosaQ);
		}else if(dosaQ<=dosa)
			System.out.println("dosa running out of stock");
		if(oil<=oilQ) {
			oilQ=oilQ-oil;
		System.out.println("Available oil is:" +oilQ);
		}else if(oilQ<=oil) 
			System.out.println("oil running out of stock");
		if(panipuri<=panipuriQ) {
			panipuriQ=panipuriQ-panipuri;
		System.out.println("Available panipuri is:" +panipuriQ);
		}else if(panipuriQ<=panipuri)
			System.out.println("panipuri running out of stock");	
		if(masala<=masalaQ) {
			masalaQ=masalaQ-masala;
		System.out.println("Available masala is:" +masalaQ);
		}else if(masalaQ<=masala)
			System.out.println("masala running out of stock");	
		
	}
	
	void outOfStock() {
		if(maggieQ==0)
			System.out.println("Maggie is out of stock");  
		else if(dosaQ==0)
			System.out.println("dosa is out of stock");
		else if(oilQ==0)
			System.out.println("oil is out of stock");
		else if(panipuriQ==0)
			System.out.println("panipuri is out of stock");
		else if(masalaQ==0)
			System.out.println("masala is out of stock");
	}
	
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.setInitialQ(50, 43, 39, 43, 73);
		shop.requestedQ(20, 43, 2, 5, 100);
		shop.outOfStock();
		
	}
}