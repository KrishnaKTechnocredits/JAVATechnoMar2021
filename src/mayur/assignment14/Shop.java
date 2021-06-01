package mayur.assignment14;

import java.util.Scanner;

public class Shop{
	int maggieQuant; 
	int dosaQuant;
	int oilQuant; 
	int panipuriQuant;
	int masalaQuant;

	void Items(int maggieQty,int dosaQty,int oilQty, int panipuriQty, int masalaQty) {
		maggieQuant = maggieQty;
		dosaQuant = dosaQty;
		oilQuant = oilQty;
		panipuriQuant = panipuriQty;
		masalaQuant = masalaQty;
	} 

	void customerOrder(int maggieReq, int dosaReq, int oilReq, int panipuriReq, int masalaReq) {
		System.out.println("    DETAILS OF SOLD ITEMS     ");
		if (maggieReq > maggieQuant) {
			System.out.println("Sorry! we have only "+maggieQuant+ " Maggie available");
			int Maggie = maggieReq - maggieQuant;
			System.out.println("Requested Qualtity of Maggie :" +maggieReq);
			System.out.println("Sold Qualtity of Maggie :" +maggieQuant);
			System.out.println("Please purchase " +Maggie+ " packets of Maggie Tomorrow");
			maggieQuant = 0;
			System.out.println("******************************");
		}
		else if(maggieReq <= maggieQuant) {
			System.out.println("Sold Qualtity of Maggie :" +maggieReq);	
			maggieQuant = maggieQuant -maggieReq;
			System.out.println("******************************");
		}
		if (dosaReq > dosaQuant) {
			System.out.println("Sorry! we have only "+dosaQuant+ " available");
			int Dosa = dosaReq - dosaQuant;
			System.out.println("Requested Qualtity of Dosa batter :" +dosaReq);
			System.out.println("Sold Qualtity of Dosa batter :" +dosaQuant);
			System.out.println("Please purchase " +Dosa+ " packets of Dosa Batter Tomorrow");
			dosaQuant = 0;
			System.out.println("*************************************");
		}
		else if(dosaReq <= dosaQuant) {
			System.out.println("Sold Qualtity of Dosa :" +dosaReq);	
			dosaQuant = dosaQuant - dosaReq;
			System.out.println("************************************");
		}
	

		
		if (oilReq > oilQuant) {
			System.out.println("Sorry! we have only "+oilQuant+ " available");
			int Oil = oilReq - oilQuant;
			System.out.println("Requested Qualtity of Oil Packets :" +oilReq);
			System.out.println("Sold Qualtity of Oil packets :" +oilQuant);
			System.out.println("Please purchase " +Oil+ " packets of Oil Packets Tomorrow");
			oilQuant = 0;
			System.out.println("****************************************");
		}
		else if(oilReq <= oilQuant) {
			System.out.println("Sold Qualtity of Oil Packets :" +oilReq);	
			oilQuant = oilQuant - oilReq;
			System.out.println("******************************************");
		}
		

		 
		if (panipuriReq > panipuriQuant) {
			System.out.println("Sorry! we have only "+panipuriQuant+ " available");
			int PaniPuri = panipuriReq - panipuriQuant;
			System.out.println("Requested Qualtity of pani Puri Packets :" +panipuriReq);
			System.out.println("Sold Qualtity of pani Puri :" +panipuriQuant);
			System.out.println("Please purchase " +PaniPuri+ " packets of Pani Puri Tomorrow");
			panipuriQuant = 0;
			System.out.println("********************************************");
		}
		else if(panipuriReq <= panipuriQuant) {
			System.out.println("Sold Qualtity of Panipuri :" +panipuriReq);
			panipuriQuant = panipuriQuant - panipuriReq;
			System.out.println("********************************************");
		}
		

		 
		if (masalaReq > masalaQuant) {
			System.out.println("Sorry! we have only "+masalaQuant+ " available");
			int Masala = masalaReq - masalaQuant;
			System.out.println("Requested Qualtity of masala Packets :" +masalaReq);
			System.out.println("Sold Qualtity of Masala packets :" +masalaQuant);
			System.out.println("Please purchase " +Masala+ " packets of Masala Tomorrow");
			masalaQuant = 0;
			System.out.println("************************************************");
		}
		else if(masalaReq <= masalaQuant) {
			System.out.println("Sold Qualtity of Masala :" +masalaReq);	
			masalaQuant = masalaQuant - masalaReq;
			System.out.println("************************************************");
		}		
		
	}

	void avaliableStock() {
		System.out.println("Available Ouantiy of Maggie : "+maggieQuant);
		System.out.println("Available Ouantiy of Dosa Batter : "+dosaQuant);
		System.out.println("Available Ouantiy of Oil Packets : "+oilQuant);
		System.out.println("Available Ouantiy of Panipuri : "+panipuriQuant);
		System.out.println("Available Ouantiy of Masala packets : "+masalaQuant);
		System.out.println("******************************************************");
	}

	void outOfStock() {
		System.out.println("   OUT OF STOCK ITEMS DETAILS    ");
		if (maggieQuant==0) {
			System.out.println("Maggie : Out of Stock");
		}	
		if (dosaQuant==0) {
			System.out.println("Dosa  : Out of Stock");
		}	
		if (oilQuant==0) {
			System.out.println("Oil : Out of Stock");
		}	
		if (panipuriQuant==0) {
			System.out.println("Panipuri : Out of Stock");
		}	
		if (masalaQuant==0) {
			System.out.println("Masala Packets : Out of Stock");
		}	

	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Stock for Maggie :");
		int mgQuant = scanner.nextInt();
		System.out.println("Enter Stock for Dosa :");
		int dQuant = scanner.nextInt();
		System.out.println("Enter Stock for Oil Packets :");
		int oQuant = scanner.nextInt();
		System.out.println("Enter Stock for panipuri :");
		int pPQuant = scanner.nextInt();
		System.out.println("Enter Stock for Masala :");
		int mQuant = scanner.nextInt();
		System.out.println("   ITEMS DETAILS  ");
		shop.Items(mgQuant, dQuant, oQuant, pPQuant, mQuant);
		shop.avaliableStock();

		System.out.println("Enter required Qty of Maggie :");
		int mgReqQuant = scanner.nextInt();
		System.out.println("Enter required Qty of Dosa :");
		int dReqQuant = scanner.nextInt();
		System.out.println("Enter required Qty of Oil Packets :");
		int oReqQuant = scanner.nextInt();
		System.out.println("Enter required Qty of panipuri :");
		int pPReqQuant = scanner.nextInt();
		System.out.println("Enter required Qty of Masala :");
		int mReqQuant = scanner.nextInt();
		System.out.println("   AVAILABLE STOCK DETAILS    ");

		shop.avaliableStock();
		shop.outOfStock();
	}
} 