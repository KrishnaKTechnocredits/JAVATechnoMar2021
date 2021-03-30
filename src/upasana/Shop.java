package upasana;

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
		
		System.out.println(maggieTQty + " "+dosaTQty+" " + pouchestQty+" " + panipuriTQty +" "+ masalaTQty);
	}
	
	public void purchaseItems(int maggieReqQty,int dosaReqQty,int pouchesReqQty,int panipuriReqQty,int masalaReqQty) {
		System.out.println("Items sold");
		if(maggieReqQty <= maggieTQty) {
			maggieTQty = maggieTQty - maggieReqQty;
			System.out.println("Left qty is "+ maggieTQty);
		}
		else
			System.out.println("Requested qty is exceeding than the available");
		if(dosaReqQty <= dosaTQty) {
			dosaTQty = dosaTQty - dosaReqQty;
			System.out.println("Left qty is "+ dosaTQty);
		}
		else
			System.out.println("Requested qty is exceeding than the available");
		if(pouchesReqQty <= pouchestQty) {
			pouchestQty = pouchestQty - pouchesReqQty;
			System.out.println("Left qty is "+ pouchestQty);
		}
		else
			System.out.println("Requested qty is exceeding than the available");
		if(panipuriReqQty <= panipuriTQty) {
			panipuriTQty = panipuriTQty - panipuriReqQty;
			System.out.println("Left qty is "+ panipuriTQty);
		}
		else
			System.out.println("Requested qty is exceeding than the available");
		if(masalaReqQty <= masalaTQty) {
			masalaTQty = masalaTQty - masalaReqQty;
			System.out.println("Left qty is "+ masalaTQty);
		}
		else
			System.out.println("Requested qty is exceeding than the available");
		
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
		System.out.println("Available qty is "+ maggieTQty);
		System.out.println("Available qty is "+ dosaTQty);
		System.out.println("Available qty is "+ pouchestQty);	
		System.out.println("Available qty is "+ panipuriTQty);
		System.out.println("Available qty is "+ masalaTQty);
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setQty(50,43,39,43,73);
		shop.purchaseItems(4, 5, 60, 7, 8);
		shop.availableInStock();
		shop.outOfStock( );
		
		

	}

}
