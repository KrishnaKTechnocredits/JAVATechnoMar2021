
package amruta;

class Market{
	int maggiepackets;
	int dosaquantity;
	int oilPouches;
	int panipuripackets;
	int masalapackets;
	
	void setInitialquantity(int maggie, int dosa, int oilpouch, int panipuripack, int masalapack){
		maggiepackets = maggie;
		dosaquantity = dosa;
		oilPouches = oilpouch;
		panipuripackets = panipuripack;
		masalapackets = masalapack;
	}
	
	void outOfStockItems(){
		if(maggiepackets==0){
			System.out.println("Maggie is out of stock");
		}
		if(dosaquantity==0){
			System.out.println("Dosa is out of stock");
		}
		if(oilPouches==0){
			System.out.println("Oil Pouches are out of stock");
		}
		if(panipuripackets==0){
			System.out.println("Panipuri Packets are out of stock");
		}
		if(masalapackets==0){
			System.out.println("Masala Packets are out of stock");
		}
		System.out.println("--------------------------------------------");
	}
	
	void customerorder(int maggieorder,int dosaorder, int oilpouchorder, int panipuriorder, int masalapackorder,boolean partialallow){
		if(maggieorder<=maggiepackets && maggieorder!=0){
			maggiepackets = maggiepackets - maggieorder;
			System.out.println(maggieorder+ " Maggie Packets served ");
		}else if(maggieorder>maggiepackets){	
			System.out.println("Available Packets of Maggie are "+maggiepackets+ " and requested maggie packets are " +maggieorder);
				if(partialallow){
					System.out.println("Available Maggie Packets served");
					maggiepackets=0;
				}else{
					System.out.println("Customer Don't want to buy this item...");
				}
		}else{
			System.out.println("Sorry we could not serve");
		}	
	
		System.out.println("--------------------------------------------");
		
		if(dosaorder<=dosaquantity && dosaorder!=0){
			dosaquantity = dosaquantity - dosaorder;
			System.out.println(dosaorder+ " Ouantity of Dosa served ");
		}else if(dosaorder>dosaquantity){
			System.out.println("Available Dosa Quantity is "+dosaquantity+ " and requested dosa quantity is " +dosaorder);
				if(partialallow){
					System.out.println("Available Dosa served");
					dosaquantity=0;
				}else{
					System.out.println("Customer Don't want to buy this item...");
				}
		}else{
			System.out.println("Sorry we could not serve");
		}
		
		System.out.println("--------------------------------------------");
		
		if(oilpouchorder<=oilPouches && oilpouchorder!=0){
			oilPouches = oilPouches - oilpouchorder;
			System.out.println(oilpouchorder+ " Oil Pouches served ");
		}else if(oilpouchorder>oilPouches){
			System.out.println("Available Oil Pouches Quantity is "+oilPouches+ " and requested oil pouches are " +oilpouchorder);
				if(partialallow){
					System.out.println("Available Oil Pouches served");
					oilPouches=0;
				}else{
					System.out.println("Customer Don't want to buy this item...");
				}
		}else{
			System.out.println("Sorry we could not serve");
		}
		
		System.out.println("--------------------------------------------");
		
		if(panipuriorder<=panipuripackets && panipuriorder!=0){
			panipuripackets = panipuripackets - panipuriorder;
			System.out.println(panipuriorder+ " Panipuri Packets served ");
		}else if(panipuriorder>panipuripackets){
			System.out.println("Available Panipuri Packets are "+panipuripackets+ " and requested Panipuri packets are " +panipuriorder);
				if(partialallow){
					System.out.println("Available Panipuri Packets served");
					panipuripackets=0;
				}else{
					System.out.println("Customer Don't want to buy this item...");
				}
		}else{
			System.out.println("Sorry we could not serve");
		}
		
		System.out.println("--------------------------------------------");
		
		if(masalapackorder<=masalapackets && masalapackorder!=0){
			masalapackets = masalapackets - masalapackorder;
			System.out.println(masalapackets+ " Masala Packets served ");
		}else if(masalapackorder>masalapackets){
			System.out.println("Available Oil Pouches Quantity is "+masalapackets+ " and requested maggie packets are " +masalapackorder);
				if(partialallow){
					System.out.println("Available Masala Packets served");
					masalapackets=0;
				}else{
					System.out.println("Customer Don't want to buy this item...");
				}
		}else{
			System.out.println("Sorry we could not serve");
		}
		
		System.out.println("--------------------------------------------");
	}
	
	void availablestock(){
		System.out.println(maggiepackets+ " Maggie Packets are available.");
		System.out.println(dosaquantity+ " Dosa Quantity available.");
		System.out.println(oilPouches+ " Oil Pouches are available");
		System.out.println(panipuripackets+ " Panipuri Packets are available");
		System.out.println(masalapackets+ " Masala Packets are available");
	}
	
	public static void main(String[] args){
	Market market = new Market();
	System.out.println("==============================INITIAL QUANTITY==============================");
	market.setInitialquantity(50,40,30,43,73);
	market.outOfStockItems();
	market.availablestock();
	System.out.println("===================================FIRST ORDER===================================");
	market.customerorder(25,20,10,15,0,true);
	market.availablestock();
	System.out.println("===================================SECOND ORDER===================================");
	market.customerorder(200,43,80,43,70,false);
	market.availablestock();
	}
}
