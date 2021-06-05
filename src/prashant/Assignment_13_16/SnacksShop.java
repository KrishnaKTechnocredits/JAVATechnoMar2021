//Program -3 Maggi and Panipuri Program using scanner class
package prashant.Assignment_13_16;

import java.util.Scanner;

public class SnacksShop {
	int maggieStock = 10;
	int dosaStock = 25;
	int oilStockPouch = 12;
	int panipuriStock = 100;
	int masalaStock = 15;

	void requestedOrder(int reqQtymaggie, int reqQtydosa, int reqQtyoil, int reqQtypanipuri, int reqQtymasala) {
		System.out.println("*****ITEMS SOLD DETAILS*****");
		if (reqQtymaggie > maggieStock) {
			System.out.println("Sorry..we have only " + maggieStock + " Maggie available");
			int outstandingmaggie = reqQtymaggie - maggieStock;
			System.out.println("Requested Qty of Maggie :" + reqQtymaggie);
			System.out.println("Sold Qty of Maggie :" + maggieStock);
			System.out.println("Please purchase " + outstandingmaggie + " packets of Maggie Later");
			maggieStock = 0;
		} else if (reqQtymaggie <= maggieStock) {
			System.out.println("Sold Qty of Maggie :" + reqQtymaggie);
			maggieStock = maggieStock - reqQtymaggie;
		}
		if (reqQtydosa > dosaStock) {
			System.out.println("Sorry.. we have only " + dosaStock + " Dosa available");
			int outstandingdosa = reqQtydosa - dosaStock;
			System.out.println("Requested Qty of Dosa  :" + reqQtydosa);
			System.out.println("Sold Qty of Dosa batter :" + dosaStock);
			System.out.println("Please purchase " + outstandingdosa + " packets of Dosa later");
			dosaStock = 0;
		} else if (reqQtydosa <= dosaStock) {
			System.out.println("Sold Qty of Dosa :" + reqQtydosa);
			dosaStock = dosaStock - reqQtydosa;
		}
		if (reqQtyoil > oilStockPouch) {
			System.out.println("Sorry.. we have only " + oilStockPouch + " oil pouch available");
			int outstandingoil = reqQtyoil - oilStockPouch;
			System.out.println("Requested Qty of Oil Packets :" + reqQtyoil);
			System.out.println("Sold Qty of Oil packets :" + oilStockPouch);
			System.out.println("Please purchase " + outstandingoil + " packets of Oil Packets Later");
			oilStockPouch = 0;
		} else if (reqQtyoil <= oilStockPouch) {
			System.out.println("Sold Qty of Oil Packets :" + reqQtyoil);
			oilStockPouch = oilStockPouch - reqQtyoil;
		}
		if (reqQtypanipuri > panipuriStock) {
			System.out.println("Sorry.. we have only " + panipuriStock + " Pani puri available");
			int outstandingpanipuri = reqQtypanipuri - panipuriStock;
			System.out.println("Requested Qty of pani Puri Packets :" + reqQtypanipuri);
			System.out.println("Sold Qty of pani Puri :" + panipuriStock);
			System.out.println("Please purchase " + outstandingpanipuri + " packets of Pani Puri Later");
			panipuriStock = 0;
		} else if (reqQtypanipuri <= panipuriStock) {
			System.out.println("Sold Qualtity of Panipuri :" + reqQtypanipuri);
			panipuriStock = panipuriStock - reqQtypanipuri;
		}
		if (reqQtymasala > masalaStock) {
			System.out.println("Sorry.. we have only " + masalaStock + " available");
			int outstandingmasala = reqQtymasala - masalaStock;
			System.out.println("Requested Qty of masala Packets :" + reqQtymasala);
			System.out.println("Sold Qty of Masala packets :" + masalaStock);
			System.out.println("Please purchase " + outstandingmasala + " packets of Masala Later");
			masalaStock = 0;
		} else if (reqQtymasala <= masalaStock) {
			System.out.println("Sold Qty of Masala :" + reqQtymasala);
			masalaStock = masalaStock - reqQtymasala;
		}
	}

	void outOfStock() {
		System.out.println("*****OUT OF STOCK DETAILS*****");
		if (maggieStock == 0) {
			System.out.println("Maggie is Out of Stock");
		}
		if (dosaStock == 0) {
			System.out.println("Dosa is Out of Stock");
		}
		if (oilStockPouch == 0) {
			System.out.println("Oil Pouch is Out of Stock");
		}
		if (panipuriStock == 0) {
			System.out.println("Panipuri is Out of Stock");
		}
		if (masalaStock == 0) {
			System.out.println("Masala Packets are Out of Stock");
		}
	}

	void avaliableStock() {
		System.out.println("Qty Available of Maggie : " + maggieStock);
		System.out.println("Qty Available of Dosa  : " + dosaStock);
		System.out.println("Qty Available of Oil Pouch : " + oilStockPouch);
		System.out.println("Qty Available of Panipuri : " + panipuriStock);
		System.out.println("Qty Available of Masala packets : " + masalaStock);
	}

	public static void main(String[] args) {
		SnacksShop snacks = new SnacksShop();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Snacks shop Stock Data *****");
		snacks.avaliableStock();
		System.out.println("Please enter required Qty of Maggie :");
		int maggiqty = sc.nextInt();
		System.out.println("Please enter required Qty of Dosa :");
		int dosaqty = sc.nextInt();
		System.out.println("Please enter required Qty of Oil Packets :");
		int oilpackqty = sc.nextInt();
		System.out.println("Please enter required Qty of panipuri :");
		int panipuriqty = sc.nextInt();
		System.out.println("Please enter required Qty of Masala :");
		int masalaqty = sc.nextInt();
		snacks.requestedOrder(maggiqty, dosaqty, oilpackqty, panipuriqty, masalaqty);
		System.out.println("*****Available Stock for Snacks shop*****");
		snacks.avaliableStock();
		snacks.outOfStock();
		sc.close();
	}
}
