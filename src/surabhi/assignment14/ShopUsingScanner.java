package surabhi.assignment14;

import java.util.Scanner;
/*
 * Assignment 14: Shop using user input (using scanner Class)
 * Added new logic as if user input only 3 quantities not all then we can pass single parameter to see expected output and
 *  avoided passing 0 in parameter
 *  
 * */

public class ShopUsingScanner {
	
	int maggieQuantity=50, dosaQuantity=43, pouchesQuantity=39, panipuriQuantity=43, masalaQuantity=73;
	
	void requestedQMaggie(int maggieQ) {
		if(maggieQ<=50 && maggieQ!=0 ) {
			maggieQuantity=maggieQuantity-maggieQ;
			System.out.println("We are serving you Maggie " +maggieQ);
		} else if(maggieQuantity==0){
			System.out.println("Out of Stock");
		} else if(maggieQ>50){
			System.out.println("We can give "+maggieQuantity+" Maggie packets");
			maggieQuantity=0;
		}

	}
	
	void requestedQDosa(int dosaQ) {
		if(dosaQ<=43 && dosaQ!=0) {
			dosaQuantity=dosaQuantity-dosaQ;
			System.out.println("We are serving you dosa " +dosaQ);
		} else if(dosaQuantity==0){
			System.out.println("Out of Stock");
		} else if(dosaQ>43){
			System.out.println("We can give "+dosaQuantity+" Dosa packets");
			dosaQuantity=0;
		}
	}
	
	void requestedQPouches(int pouchesQ) {
		if(pouchesQ<=39 && pouchesQ!=0) {
			pouchesQuantity=pouchesQuantity-pouchesQ;
			System.out.println("We are serving you oil pouches " +pouchesQ);
		} else if(pouchesQuantity==0){
			System.out.println("Out of Stock");
		} else if(pouchesQ>39){
			System.out.println("We can give "+pouchesQuantity+" Pouche packets");
			pouchesQuantity=0;
		}		
	}
	
	void requestedQPanipuri(int panipuriQ) {
		if(panipuriQ<=43 && panipuriQ!=0) {
			panipuriQuantity=panipuriQuantity-panipuriQ;
			System.out.println("We are serving you panipuri " +panipuriQ);
		} else if(panipuriQuantity==0){
			System.out.println("Out of Stock");
		} else if(panipuriQ>43){
			System.out.println("We can give "+panipuriQuantity+" Panipuri packets");
			panipuriQuantity=0;
		}
	}
	
	void requestedQMasala(int masalaQ) {
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
		ShopUsingScanner shopUsingScanner=new ShopUsingScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the quantity of maggie you want :");
		int maggieQ=scanner.nextInt();		
		
		System.out.println("Please enter the quantity of Dosa you want :");
		int dosaQ=scanner.nextInt();
		
		System.out.println("Please enter the quantity of Oil Pouches you want :");
		int oilPouchesQ=scanner.nextInt();
		
		System.out.println("Please enter the quantity of PaniPuri you want :");
		int panipuriQ=scanner.nextInt();
		
		System.out.println("Please enter the quantity of Masala you want :");
		int masalaQ=scanner.nextInt();
		
		if(maggieQ!=0||dosaQ!=0||oilPouchesQ!=0|panipuriQ!=0||masalaQ!=0) {
			shopUsingScanner.requestedQMaggie(maggieQ);
			shopUsingScanner.requestedQDosa(dosaQ);
			shopUsingScanner.requestedQPouches(oilPouchesQ);
			shopUsingScanner.requestedQPanipuri(panipuriQ);
			shopUsingScanner.requestedQMasala(masalaQ);
		}

		shopUsingScanner.outOfStock();
		shopUsingScanner.availableStock();
	}

}
