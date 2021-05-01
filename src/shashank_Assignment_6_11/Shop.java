package shashank_Assignment_6_11;

public class Shop {
	int maggieQ = 50;
	int dosaQ = 43;
	int oilPouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;

	public void requestedQ(int maggieQ, int dosaQ, int oilPouchesQ, int panipuriQ, int masalaQ, boolean reqType) {
		if (maggieQ == 0)
			System.out.println("Sorry maggie running out of stock");
		else if (this.maggieQ > maggieQ) {
			System.out.println("We are serving your request for maggie");
			this.maggieQ -= maggieQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of maggie " + maggieQ);
			this.maggieQ = 0;
		}

		if (dosaQ == 0)
			System.out.println("Sorry dosa running out of stock");
		else if (this.dosaQ > dosaQ) {
			System.out.println("We are serving your request for dosa");
			this.dosaQ -= dosaQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of maggie " + dosaQ);
			this.dosaQ = 0;
		}

		if (oilPouchesQ == 0)
			System.out.println("Sorry oil pouches running out of stock");
		else if (this.oilPouchesQ > oilPouchesQ) {
			System.out.println("We are serving your request for oil pouches");
			this.oilPouchesQ -= oilPouchesQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of oil pouches " + oilPouchesQ);
			this.oilPouchesQ = 0;
		}

		if (panipuriQ == 0)
			System.out.println("Sorry panipuri running out of stock");
		else if (this.panipuriQ > panipuriQ) {
			System.out.println("We are serving your request for panipuri");
			this.panipuriQ -= panipuriQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of panipuri " + panipuriQ);
			this.panipuriQ = 0;
		}

		if (masalaQ == 0)
			System.out.println("Sorry masala running out of stock");
		else if (this.masalaQ > masalaQ) {
			System.out.println("We are serving your request for masala");
			this.masalaQ -= masalaQ;
		} else if (reqType == true) {
			System.out.println("We are providing partial request of masala " + masalaQ);
			this.masalaQ = 0;
		}
		System.out.println("");
	}

	public void outOfStock() {
		if (maggieQ == 0)
			System.out.println("Maggie running out of stock");
		if (dosaQ == 0)
			System.out.println("Dosa running out of stock");
		if (oilPouchesQ == 0)
			System.out.println("Oil Pouches running out of stock");
		if (panipuriQ == 0)
			System.out.println("Panipuri running out of stock");
		if (masalaQ == 0)
			System.out.println("Masala running out of stock");
		System.out.println("");
	}

	public void availableQuantity() {
		if (maggieQ != 0)
			System.out.println(maggieQ + " Maggie is available in stock");
		if (dosaQ != 0)
			System.out.println(dosaQ + " Dosa is available in stock");
		if (oilPouchesQ != 0)
			System.out.println(oilPouchesQ + " Oil Pouches is available in stock");
		if (panipuriQ != 0)
			System.out.println(panipuriQ + " Panipuri is available in stock");
		if (masalaQ != 0)
			System.out.println(masalaQ + " Masala is available in stock");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.availableQuantity();
		System.out.println("Raise your request");
		shop.requestedQ(25, 43, 30, 47, 45, true);
		shop.outOfStock();

	}

}
