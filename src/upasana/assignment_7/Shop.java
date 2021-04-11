package upasana.assignment_7;

public class Shop {
	int maggieTQty;
	int dosaTQty;
	int pouchestQty;
	int panipuriTQty;
	int masalaTQty;
	
	
	public void setQty(int maggieReqQty,int dosaReqQty,int pouchesReqQty,int panipuriReqQty,int masalaReqQty) {
		maggieTQty = maggieReqQty;
		dosaTQty = dosaReqQty;
		pouchestQty = pouchesReqQty;
		panipuriTQty =  panipuriReqQty;
		masalaTQty= masalaReqQty;
		
	}
	
	public void purchaseItems(int maggieReqQty,int dosaReqQty,int pouchesReqQty,int panipuriReqQty,int masalaReqQty,boolean pSAllowed) {
		
		if(maggieReqQty<=maggieTQty) {
			maggieTQty = maggieTQty - maggieReqQty;
			System.out.println("Available qty of maggie is "+maggieTQty + "  and sold qty of maggie is "+maggieReqQty);
		}	
		else {
				if(pSAllowed) {
					maggieTQty=0;
					System.out.println("All the packets of maggie are sold ");
					System.out.println("Available qty of maggie is "+maggieTQty + "  and sold qty of maggie is "+maggieReqQty);		
				}
				else
					System.out.println("Available qty of maggie is "+maggieTQty + "  and requested qty of maggie which is not sold as it exceeds the available qty is "+maggieReqQty);		
						
		}
		
		if(dosaReqQty<=dosaTQty) {
			dosaTQty = dosaTQty - dosaReqQty;
			System.out.println("Available qty of dosa is "+dosaTQty + "  and sold qty of dosa is "+dosaReqQty);
		}	
		else {
				if(pSAllowed) {
					dosaTQty=0;
					System.out.println("All the packets of dosa are sold ");
					System.out.println("Available qty of dosa is "+dosaTQty + "  and sold qty of dosa is "+dosaReqQty);		
				}
				else
					System.out.println("Available qty of dosa is "+dosaTQty + "  and requested qty of dosa which is not sold as it exceeds the available qty is "+dosaReqQty);		
						
		}
		
		if(pouchesReqQty<=pouchestQty) {
			pouchestQty = pouchestQty - pouchesReqQty;
			System.out.println("Available qty of pouches is "+pouchestQty + "  and sold qty of pouches is "+pouchesReqQty);
		}	
		else {
				if(pSAllowed) {
					pouchestQty=0;
					System.out.println("All the packets of pouches are sold ");
					System.out.println("Available qty of pouches is "+pouchestQty + "  and sold qty of pouches is "+pouchesReqQty);		
				}
				else
					System.out.println("Available qty of pouches is "+pouchestQty + "  and requested qty of pouches which is not sold as it exceeds the available qty is "+pouchesReqQty);		
						
		}
		
		
		if(panipuriReqQty<=panipuriTQty) {
			panipuriTQty = panipuriTQty - panipuriReqQty;
			System.out.println("Available qty of panipuri is "+panipuriTQty + "  and sold qty of panipuri is "+panipuriReqQty);
		}	
		else {
				if(pSAllowed) {
					panipuriTQty=0;
					System.out.println("All the packets of panipuri are sold ");
					System.out.println("Available qty of panipuri is "+panipuriTQty + "  and sold qty of panipuri is "+panipuriReqQty);		
				}
				else
					System.out.println("Available qty of panipuri is "+panipuriTQty + "  and requested qty of panipuri which is not sold as it exceeds the available qty is "+panipuriReqQty);		
						
		}
		
		if(masalaReqQty<=masalaTQty) {
			masalaTQty = masalaTQty - masalaReqQty;
			System.out.println("Available qty of masala is "+masalaTQty + "  and sold qty of masala is "+masalaReqQty);
		}	
		else {
				if(pSAllowed) {
					masalaTQty=0;
					System.out.println("All the packets of masala are sold ");
					System.out.println("Available qty of masala is "+masalaTQty + "  and sold qty of masala is "+masalaReqQty);		
				}
				else
					System.out.println("Available qty of masala is "+masalaTQty + "  and requested qty of masala which is not sold as it exceeds the available qty is "+masalaReqQty);		
						
		}
		
		
	}
		public void outOfStock() {
		if(maggieTQty==0)
			System.out.println("Maggie is out of stock");
		 if(dosaTQty==0)
			 System.out.println("dosa is out of stock");
		 if(pouchestQty==0)
			 System.out.println("pouche is out of stock");
		if(panipuriTQty==0)
			 System.out.println("panipuri is out of stock");
		 if(masalaTQty==0)
			 System.out.println("panipuri is out of stock");
					
	}
	

	public void availableInStock() {
		System.out.println("Available qty of maggie is "+ maggieTQty);
		System.out.println("Available qty of dosa is "+ dosaTQty);
		System.out.println("Available qty of pouches is "+ pouchestQty);	
		System.out.println("Available qty of panipuri is "+ panipuriTQty);
		System.out.println("Available qty of masala is "+ masalaTQty);
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setQty(50,43,39,43,73);
		shop.purchaseItems(90, 5, 60, 7, 8,true);
		shop.availableInStock();
		shop.outOfStock( );
		
		

	}

}
