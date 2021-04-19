package pavan.Assignment14;

import java.util.Scanner;

import pavan.Shop;

public class ClassUsingScanner {
	int maggie;
	int dosa;
	int oil;
	int panipuri;
	int masala;

	void setItems(int item1, int item2,int item3,int item4, int item5) {
		maggie= item1;
		dosa= item2;
		oil= item3;
		panipuri=item4;
		masala= item5;		
	}
	void itemsInStock() {
		System.out.println("Items available in stock: "+"Maggie-"+maggie+" "+"dosa-"+dosa+" "+"oil-"+oil+" panipuri-"+panipuri+" "+"masala-"+masala);	
	}
	void outOfStock() {
		if (maggie==0) 
			System.out.println("maggie is out of stock");
		if (dosa==0) 
			System.out.println("Dosa is out of stock");
		if (oil==0)
			 System.out.println("Oil is out of stock");
		if (panipuri==0)
			 System.out.println("Panipuri out of stock");
		if (masala==0)
			System.out.println("masala is out of stock");	 
	}
	void custRequest(int ritem1, int ritem2, int ritem3, int ritem4, int ritem5) {
		//Maggie
		if (ritem1<=maggie) {
			System.out.println("Maggie sold :"+ ritem1);
			maggie = maggie- ritem1;
		}
		 else if (ritem1>maggie){
			 System.out.println("Partial Request - Maggie Sold :"+ maggie);
			 maggie=0;
		 }	
		else 
			System.out.println("maggie is sold out");
		//dosa
		if (ritem2<=dosa) {
			System.out.println("dosa sold :"+ ritem2);
			dosa = dosa- ritem2;
		}
		 else if (ritem2>dosa){
			 System.out.println("Partial Request - dosa Sold :"+ dosa);
			 dosa=0;
		 }	
		else 
			System.out.println("dosa is sold out");
		
		//oil
		if (ritem3<=oil) {
			System.out.println("oil sold :"+ ritem3);
			oil = oil- ritem3;
		}
		 else if (ritem3>oil){
			 System.out.println("Partial Request - oil Sold :"+ oil);
			 oil=0;
		 }	
		else 
			System.out.println("oil is sold out");
		//panipuri
		
		if (ritem4<=panipuri) {
			System.out.println("panipuri sold :"+ ritem4);
			panipuri = panipuri- ritem4;
		}
		 else if (panipuri>oil){
			 System.out.println("Partial Request - panipuri Sold :"+ panipuri);
			 panipuri=0;
		 }	
		else 
			System.out.println("panipuri is sold out");
		//masala
		if (ritem5<=masala) {
			System.out.println("masala sold :"+ ritem5);
			masala = masala- ritem5;
		}
		 else if (masala>oil){
			 System.out.println("Partial Request - masala Sold :"+ masala);
			 masala=0;
		 }	
		else 
			System.out.println("masala is sold out");
	}
	public static void main(String[]Args) {
		ClassUsingScanner shop= new ClassUsingScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Initial Qantity of maggie");
		int Maggieq=scanner.nextInt();
		System.out.println("Enter the Initial Qantity of dosa");
		int dosaq=scanner.nextInt();
		System.out.println("Enter the Initial Qantity of oil");
		int oilq=scanner.nextInt();
		System.out.println("Enter the Initial Qantity of Panipuri");
		int panipuriq=scanner.nextInt();
		System.out.println("Enter the Initial Qantity of Masala");
		int Masalaq=scanner.nextInt();
		
		
		shop.setItems(Maggieq,dosaq,oilq,panipuriq,Masalaq);
		shop.itemsInStock();
		shop.outOfStock();
		
		System.out.println("Enter the required Qantity of maggie");
		int Maggireq=scanner.nextInt();
		System.out.println("Enter the required Qantity of dosa");
		int dosareq=scanner.nextInt();
		System.out.println("Enter the required Qantity of oil");
		int oilreq=scanner.nextInt();
		System.out.println("Enter the required Qantity of panipuri");
		int panipurireq=scanner.nextInt();
		System.out.println("Enter the required Qantity of masala");
		int masalareq=scanner.nextInt();
		
		shop.custRequest(Maggireq,dosareq,oilreq,panipurireq,masalareq);
		shop.itemsInStock();
		shop.outOfStock();

	}

}
