package pallavi;

public class Shop {
	int maggieQ;
	int dosaQ;
	int pouches;
	int panipuri;
	int masala;

	void setQuantity(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala) {
		maggieQ = reqMaggie;
		dosaQ = reqDosa;
		pouches = reqPouches;
		panipuri = reqPanipuri;
		masala = reqMasala;
	}

	void outOfStock() {
		if(maggieQ==0)
			System.out.println("Maggie is Out of stock");
		if(dosaQ==0)
			System.out.println("Dosa is Out of stock");
		if(pouches==0)
			System.out.println("Pouches is Out of stock");
		if(panipuri==0)
			System.out.println("Panipuri is Out of stock");
		if(masala==0)
			System.out.println("Masala is Out of stock");

	}

	void availabeItems() {
		System.out.println("--------------------------------Availabilty of stocks-----------------");
		if(maggieQ!=0) {
			System.out.println("Maggie is available in stock and Quantity is " + maggieQ);
		}
		if(dosaQ!=0) {
			System.out.println("Dosa is available in stock and Quantity is " + dosaQ);
		}
		if(pouches!=0) {
			System.out.println("Pouches is available in stock and Quantity is " + pouches);
		}
		if(panipuri!=0) {
			System.out.println("Panipuri is available in stock and Quantity is " + panipuri);
		}
		if(masala!=0) {
			System.out.println("Masala is available in stock and Quantity is " + masala);
		}

	}

	void reqItem(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala,
			boolean partialSellingAllowed) {
		if (reqMaggie <= maggieQ) {
			maggieQ = maggieQ - reqMaggie;
			System.out.println("Here is your Requested maggie packets" + reqMaggie);
			System.out.println("Remaining maggie packets are " + maggieQ);
		}

		if (reqMaggie > maggieQ && partialSellingAllowed) {
			System.out.println("We can provide only " + maggieQ + " maggie packets you have requested for " + reqMaggie );
		}

		if (reqDosa <= dosaQ) {
			dosaQ = dosaQ - reqDosa;
			System.out.println("Here is your Requested Dosa packets" + reqDosa);
			System.out.println("Remaining Dosa packets are " + dosaQ);
		}

		if (reqDosa > dosaQ && partialSellingAllowed) {
			System.out.println("We can provide only " + dosaQ + " dosa packets you have requested for" + reqDosa);
		}

		if (reqPouches <= pouches) {
			pouches = pouches - reqPouches;
			System.out.println("Here is your Requested Pouches packets" + reqPouches);
			System.out.println("Remaining maggie packets are " + pouches);
		}

		if (reqPouches > pouches && partialSellingAllowed) {
			System.out.println("We can provide only " + pouches + " pouches packets you have requested for" + reqPouches);
		}
		
		if (reqPanipuri <= panipuri) {
			panipuri = panipuri - reqPanipuri;
			System.out.println("Here is your Requested Panipuri packets" + reqPanipuri);
			System.out.println("Remaining maggie packets are " + panipuri);
		}

		if (reqPanipuri > panipuri && partialSellingAllowed) {
			System.out.println("We can provide only " + panipuri + "panipuri packets you have requested for" + reqPanipuri);
		}

		if (reqMasala <= masala) {
			masala = masala - reqMasala;
			System.out.println("Here is your Requested masala packets" + reqMasala);
			System.out.println("Remaining maggie packets are " + masala);
		}

		if (reqMasala > masala && partialSellingAllowed) {
			System.out.println("We can provide only " + masala + " masala packets you have requested for" + reqMasala);
		}

	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setQuantity(50, 30, 10, 60, 55);
		shop.reqItem(10, 25, 30, 5, 7, true);
		shop.availabeItems();
		shop.outOfStock();
	}

}
