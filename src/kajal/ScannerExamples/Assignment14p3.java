/*
	  Assignment 14: Shop using user input (using scanner Class)
	  Added new logic as if user input only 3 quantities not all then we can pass single parameter to see expected output and
	   avoided passing 0 in parameter

 */
package kajal.ScannerExamples;

import java.util.Scanner;

public class Assignment14p3 {

		int maggieQuantity=50, dosaQuantity=43, pouchesQuantity=39, panipuriQuantity=43, masalaQuantity=73;

		void requestedQMaggie(int maggieQ) {
			if(maggieQ<=50 && maggieQ!=0 ) {
				maggieQuantity=maggieQuantity-maggieQ;
				System.out.println("We can give you " +maggieQ + "maggie");
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
				System.out.println("We can give you " +dosaQ + "dosa");
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
				System.out.println("We can give you " +pouchesQ + "oil pouches");
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
				System.out.println("We can give you " +panipuriQ + "panipuri");
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
				System.out.println("We can give you " +masalaQ + "masala");
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
			
			Assignment14p3 a =new Assignment14p3();
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

				a.requestedQMaggie(maggieQ);
				a.requestedQDosa(dosaQ);
				a.requestedQPouches(oilPouchesQ);
				a.requestedQPanipuri(panipuriQ);
				a.requestedQMasala(masalaQ);
			
				a.outOfStock();
				a.availableStock();
		}
}


