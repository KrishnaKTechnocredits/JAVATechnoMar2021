package amruta.Assignment_7;

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
	}
	
	void customerorder(int maggieorder,int dosaorder, int oilpouchorder, int panipuriorder, int masalapackorder,boolean partialallow){
		System.out.println("---- Maggie Section-----");
		if(maggieorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(maggieorder<=maggiepackets && maggieorder!=0){
			maggiepackets = maggiepackets - maggieorder;
			System.out.println(maggieorder+ " Maggie Packets served ");
		}else if(maggieorder>maggiepackets && maggiepackets!=0){	
			System.out.println("Available Packets of Maggie are "+maggiepackets+ " and requested maggie packets are " +maggieorder);
				if(partialallow){
					System.out.println("Available Maggie Packets served");
					maggiepackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else{
			System.out.println("Quantity of Maggie is : "+maggiepackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
	
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Dosa Section-----");
		 if(dosaorder==0){
				System.out.println("Customer Dont want to buy this item.");
		}else if(dosaorder<=dosaquantity && dosaorder!=0){
			dosaquantity = dosaquantity - dosaorder;
			System.out.println(dosaorder+ " Ouantity of Dosa served ");
		}else if(dosaorder>dosaquantity && dosaquantity!=0){
			System.out.println("Available Dosa Quantity is "+dosaquantity+ " and requested dosa quantity is " +dosaorder);
				if(partialallow){
					System.out.println("Available Dosa served");
					dosaquantity=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Dosa is : "+dosaquantity+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Oil Section-----");
		 if(oilpouchorder==0){
				System.out.println("Customer Dont want to buy this item.");
		}else if(oilpouchorder<=oilPouches && oilpouchorder!=0){
			oilPouches = oilPouches - oilpouchorder;
			System.out.println(oilpouchorder+ " Oil Pouches served ");
		}else if(oilpouchorder>oilPouches && oilPouches!=0){
			System.out.println("Available Oil Pouches Quantity is "+oilPouches+ " and requested oil pouches are " +oilpouchorder);
				if(partialallow){
					System.out.println("Available Oil Pouches served");
					oilPouches=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Oil Pouches are : "+oilPouches+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Panipuri Section-----");
		if(panipuriorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(panipuriorder<=panipuripackets && panipuriorder!=0 && panipuripackets!=0){
			panipuripackets = panipuripackets - panipuriorder;
			System.out.println(panipuriorder+ " Panipuri Packets served ");
		}else if(panipuriorder>panipuripackets && panipuripackets!=0){
			System.out.println("Available Panipuri Packets are "+panipuripackets+ " and requested Panipuri packets are " +panipuriorder);
				if(partialallow){
					System.out.println("Available Panipuri Packets served");
					panipuripackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Panipuri is : "+panipuripackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Masala Section-----");
		if(masalapackorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(masalapackorder<=masalapackets && masalapackorder!=0 && masalapackets!=0){
			masalapackets = masalapackets - masalapackorder;
			System.out.println(masalapackets+ " Masala Packets served ");
		}else if(masalapackorder>masalapackets && masalapackets!=0){
			System.out.println("Available Oil Pouches Quantity is "+masalapackets+ " and requested maggie packets are " +masalapackorder);
				if(partialallow){
					System.out.println("Available Masala Packets served");
					masalapackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Masala is : "+masalapackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
	}
	
	void availablestock(){
		System.out.println("--------------------------------------------\n");
		System.out.println("---------------Available Items---------------");
		System.out.println(maggiepackets+ " Maggie Packets are available.");
		System.out.println(dosaquantity+ " Dosa Quantity available.");
		System.out.println(oilPouches+ " Oil Pouches are available");
		System.out.println(panipuripackets+ " Panipuri Packets are available");
		System.out.println(masalapackets+ " Masala Packets are available");
	}
	
	public static void main(String[] args){
	Market market = new Market();
	System.out.println("==============================INITIAL QUANTITY==============================");
	market.setInitialquantity(25,0,30,43,73);
	market.outOfStockItems();
	market.availablestock();
	System.out.println("===================================FIRST ORDER===================================");
	market.customerorder(0,20,10,15,120,false);
	market.availablestock();
	System.out.println("--------------------------");
	market.customerorder(0,20,10,15,120,true);
	market.availablestock();
	}
}
