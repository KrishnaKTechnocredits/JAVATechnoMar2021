package purva;

public class Shop {
	
	int maggie;
	int dosa;
	int oilPackets;
	int panipuri;
	int masala;
	
	void setInitialQuantity(int maggieQ,int dosaQ,int oilPacketsQ,int panipuriQ,int masalaQ) {
		maggie = maggieQ;
		dosa = dosaQ;
		oilPackets = oilPacketsQ;
		panipuri = panipuriQ;
		masala = masalaQ;
		
	}
	
	void outOfStock(int maggieQ,int dosaQ,int oilPacketsQ,int panipuriQ,int masalaQ) {
		
		/*maggie=maggieQ;
		dosa=dosaQ;
		oilPackets=oilPacketsQ;
		panipuri=panipuriQ;
		masala=masalaQ;*/
		
		if(maggieQ>=maggie) 
			System.out.println("maggie is out of stock");
		if(dosaQ >=dosa)
			System.out.println("Dosa is out of stock");
		if(oilPacketsQ >=oilPackets)
		    System.out.println("oil packets are out of stock");
		if(panipuriQ >=panipuri) 
			System.out.println("panipuri is out of stock");
		if(masalaQ >=masala)
			System.out.println("masala is out of stock");
		 
	}
	
	void requestedQuantity(int maggieQ,int dosaQ,int oilPacketsQ,int panipuriQ,int masalaQ) {
		
		if(maggieQ <=maggie) {
			maggie = maggie - maggieQ;
		    System.out.println("customer purchased "+maggieQ+" and  Quantity of maggie in stock now is "+maggie);
		}
		else {
			System.out.println("requested quantity pf maggie is "+maggieQ+" and we can provide is "+maggie+" packets");
		    maggie=0;
		}
		    
		if(dosaQ <=dosa) {
			dosa = dosa - dosaQ;
			System.out.println("customer purchased "+dosaQ+" and  Quantity in stock now is "+dosa);
		}
		else {
			System.out.println("requested quantity of dosa is "+dosaQ+" and we can provide is "+dosa+" packets");
			dosa = 0;
		}
		
		if(oilPacketsQ <= oilPackets) {
		    oilPackets = oilPackets - oilPacketsQ;
		    System.out.println("customer purchased "+oilPacketsQ+" and  Quantity in stock now is "+oilPackets);
		}
		else {
			System.out.println("requested quantity of is "+oilPacketsQ+" and we can provide is "+oilPackets+" packets");
			oilPackets = 0 ;
		}
		
		if(panipuriQ<=panipuri ) {
			panipuri = panipuri - panipuriQ;
			System.out.println("customer purchased "+panipuriQ+" and  Quantity in stock now is "+panipuri);
		}
		
		else {
			System.out.println("requested quantity of panipuri is "+panipuriQ+" and we can provide "+panipuri+" packets");
			panipuri = 0;
		}
		
		if(masalaQ <= masala) {
			masala = masala - masalaQ;
			System.out.println("customer purchased "+masalaQ+" and  Quantity in stock now is "+masala);
		}
		
		else {
			System.out.println("requested quantity of masala is "+masalaQ+"and we can provide "+masala+" packets");
			masala = 0;
		}
		
	}
	
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInitialQuantity(50,43,39,43,73);
		shop.requestedQuantity(55,5,6,8,9);
		shop.outOfStock(55,5,6,8,9);

	}

}
