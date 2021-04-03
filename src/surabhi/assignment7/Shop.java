package surabhi.assignment7;

public class Shop {
	
	int maggieQuantity=50, dosaQuantity=43, pouchesQuantity=39, panipuriQuantity=43, masalaQuantity=73;
	
	void requestedQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {

		if(maggieQ<=50 && maggieQ!=0 ) {
			maggieQuantity=maggieQuantity-maggieQ;
			System.out.println("We are serving you Maggie " +maggieQ);
		} else if(maggieQuantity==0){
			System.out.println("Out of Stock");
		} else if(maggieQ>50){
			System.out.println("We can give "+maggieQuantity+" Maggie packets");
			maggieQuantity=0;
		}

		if(dosaQ<=43 && dosaQ!=0) {
			dosaQuantity=dosaQuantity-dosaQ;
			System.out.println("We are serving you dosa " +dosaQ);
		} else if(dosaQuantity==0){
			System.out.println("Out of Stock");
		} else if(dosaQ>43){
			System.out.println("We can give "+dosaQuantity+" Dosa packets");
			dosaQuantity=0;
		}

		if(pouchesQ<=39 && pouchesQ!=0) {
			pouchesQuantity=pouchesQuantity-pouchesQ;
			System.out.println("We are serving you oil pouches " +pouchesQ);
		} else if(pouchesQuantity==0){
			System.out.println("Out of Stock");
		} else if(pouchesQ>39){
			System.out.println("We can give "+pouchesQuantity+" Pouche packets");
			pouchesQuantity=0;
		}

		if(panipuriQ<=43 && panipuriQ!=0) {
			panipuriQuantity=panipuriQuantity-panipuriQ;
			System.out.println("We are serving you panipuri " +panipuriQ);
		} else if(panipuriQuantity==0){
			System.out.println("Out of Stock");
		} else if(panipuriQ>43){
			System.out.println("We can give "+panipuriQuantity+" Panipuri packets");
			panipuriQuantity=0;
		}

		if(masalaQ<=73 && masalaQ!=0) {
			masalaQuantity=masalaQuantity-masalaQ;
			System.out.println("We are serving you masala " +masalaQ);
		} else if(masalaQuantity==0){
			System.out.println("Out of Stock");
		} else if(masalaQ>73) {
			System.out.println("We can give "+masalaQuantity+" Masala packets");
			masalaQuantity=0;
		}
		
	}
	
	void outOfStock() {
		if(maggieQuantity==0) {
			System.out.println("Maggie packets are out of stock");
		}
		
		if(dosaQuantity==0) {
			System.out.println("Dosa packets are out of stock");
		}
		
		if(pouchesQuantity==0) {
			System.out.println("Pouches are out of stock");
		}
		
		if(panipuriQuantity==0) {
			System.out.println("Panipuri packets are out of stock");
		}
		
		if(masalaQuantity==0) {
			System.out.println("Masala packets are out of stock");
		}
		
	}
	
	void availableStock() {
		if(maggieQuantity>0) {
			System.out.println("Available Maggie packets :" +maggieQuantity);
		}
		
		if(dosaQuantity>0) {
			System.out.println("Available dosa packets :"+dosaQuantity);
		}
		
		if(pouchesQuantity>0) {
			System.out.println("Available Pouches are :" +pouchesQuantity);
		}
		
		if(panipuriQuantity>0) {
			System.out.println("Available Panipuri packets are :" +panipuriQuantity);
		}
		
		if(masalaQuantity>0) {
			System.out.println("Available Masala packets are :" +masalaQuantity);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop=new Shop();
		shop.requestedQuantity(10, 0, 30, 50, 0);
		shop.outOfStock();
		shop.availableStock();
	}

}
