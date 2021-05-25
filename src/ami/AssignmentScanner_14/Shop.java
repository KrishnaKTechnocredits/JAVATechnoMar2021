/*
 program using Scanner class
 
 */
package ami.AssignmentScanner_14;

import java.util.Scanner;

public class Shop {
	int maggie;
	int Dosa ;
	int pouches ;
	int panipuri ;
	int masala; 

	void setInital(int maggie1 ,int Dosa1 ,int pouches1, int panipuri1, int masala1) {
		maggie = maggie1;
		Dosa = Dosa1;
		pouches = pouches1;
		panipuri = panipuri1;
		masala = masala1;
			
	}
	
	void reqQty(int maggieR ,int DosaR ,int pouchesR, int panipuriR, int masalaR) {
		
		
		if(maggieR <= maggie) {
			maggie = maggie - maggieR;
		} else {
				System.out.println("maggie Actual QTY: "+ maggie + "  Requested Qty : "+ maggieR + "  Cound not fulfill your Damand.");		
		}
		
		if(DosaR <= Dosa) {
			Dosa = Dosa - DosaR;
		} else {
				System.out.println("Dosa Actual QTY: "+ Dosa + "  Requested Qty : "+ DosaR + " Cound not fulfill your Damand.");		
		}
		
		if(pouchesR <= pouches) {
			pouches = pouches - pouchesR;
		} else {
				System.out.println("pouches Actual QTY: "+ pouches + "  Requested Qty : "+ pouchesR + " Cound not fulfill your Damand.");		
		}
		
		if(panipuri <= panipuri) {
			panipuri = panipuri - panipuriR;
		} else {
				System.out.println("panipuri Actual QTY: "+ panipuri + "  Requested Qty : "+ panipuriR + " Cound not fulfill your Damand.");		
		}
		
		if(masalaR <= masala) {
			masala = masala - masalaR;
		} else {
				System.out.println("masala Actual QTY: "+ masala + "Requested Qty : "+ masalaR + "Cound not fulfill your Damand");		
		}
	}
	
	void display() {
		System.out.println("Maggie Remaining QTY: " + maggie);
		System.out.println("dosa Remaining QTY: " + Dosa);
		System.out.println("pouches Remaining QTY: " + pouches);
		System.out.println("panipuri Remaining QTY: " + panipuri);
		System.out.println("masala Remaining QTY: " + masala);
	}
	
	void outOfStock() {
		if (maggie == 0)
			System.out.println("maggie Out of stock");
		if (Dosa == 0)
			System.out.println("Dosa Out of stock");
		if (pouches == 0)
			System.out.println("pouches Out of stock");
		if (panipuri == 0)
			System.out.println("panipuri Out of stock");
		if (masala == 0)
			System.out.println("masala Out of stock");
	}
	
	
	void inStock() {
		if (maggie > 0)
			System.out.println("maggie in stock");
		if (Dosa > 0)
			System.out.println("Dosa in stock");
		if (pouches > 0)
			System.out.println("pouches in stock");
		if (panipuri > 0)
			System.out.println("panipuri in stock");
		if (masala > 0)
			System.out.println("masala in stock");
	}
	
	
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.setInital(50, 43, 39, 43, 73);
		Scanner sc =new Scanner(System.in);
		System.out.println("Requested QTY maggieS: ");
		int maggieS = sc.nextInt();
		System.out.println("Requested QTY DosaS: ");
		int DosaS = sc.nextInt();
		System.out.println("Requested QTY pouchesS: ");
		int pouchesS = sc.nextInt();
		System.out.println("Requested QTY panipuriS: ");
		int panipuriS = sc.nextInt();
		System.out.println("Requested QTY masalaS: ");
		int masalaS = sc.nextInt();
		shop.reqQty(maggieS, DosaS, pouchesS, panipuriS, masalaS);
		shop.display();
		shop.inStock();
		shop.outOfStock();
	}

}
