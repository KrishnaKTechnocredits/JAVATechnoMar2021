package krati_Shukla;

public class Shop {
	
	int totalMaggi;
	int totalDosa;
	int totalPanipuri;
	int totalPouches;
	int totalMasala;
	
	void setValues(int setMaggi, int setDosa, int setPanipuri, int setPouches, int setMasala) {
		totalMaggi = setMaggi;
		totalDosa = setDosa;
		totalPanipuri = setPanipuri;
		totalPouches = setPouches;
		totalMasala = setMasala;
	}
	
	void itemOutOfStock() {
		//if ((totalMaggi||totalDosa||totalPanipuri||totalPouches||totalMasala) == 0) {
			if (totalMaggi == 0)
				System.out.println("------Maggi is Out of Stock--------");
			if (totalDosa == 0)
				System.out.println("-----Dosa is Out of Stock-----");
			if (totalPanipuri == 0)
				System.out.println("------Panipuri is Out of Stock------");
			if (totalPouches == 0)
				System.out.println("------Oil Pouches is Out of Stock-------");
			if (totalMasala == 0)
				System.out.println("------Masala is Out of Stock------");
		//}
	}
	
	void availableItems() {
		if (totalMaggi>0) {
			System.out.println(totalMaggi+" Maggi are available in stock");
		}
		if (totalDosa>0) {
			System.out.println(totalDosa+" Dosa are available in stock");
		}
		if (totalPanipuri>0) {
			System.out.println(totalPanipuri+" Panipuri are available in stock");
		}
		if (totalPouches>0) {
			System.out.println(totalPouches+" Oil Pouches are available in stock");
		}
		if (totalMasala>0) {
			System.out.println(totalMasala+" Masala are available in stock");
		}
	}
	
	void soldItems(int pickMaggi, int pickDosa, int pickPanipuri, int pickPouch, int pickMasala) {
		if (pickMaggi > 0 && totalMaggi >= pickMaggi) {
			totalMaggi = totalMaggi - pickMaggi;
			if (totalMaggi == 0) {
				System.out.println("**Maggi is running out of stock now**");
			}
		}else if (pickMaggi > 0 && totalMaggi < pickMaggi) {
			totalMaggi =0;
			System.out.println(totalMaggi+" Maggi are available in stock");
		}
		
		if (pickDosa > 0 && totalDosa >= pickDosa) {
			totalDosa = totalDosa - pickDosa;
			if (totalDosa == 0) {
				System.out.println("**Dosa is running out of stock now**");
			}
		}else if (pickDosa > 0 && totalDosa < pickDosa) {
			totalDosa =0;
			System.out.println(totalDosa+" Dosa are available in stock");
		}
		
		if (pickPanipuri > 0 && totalPanipuri >= pickPanipuri) {
			totalPanipuri = totalPanipuri - pickPanipuri;
			if (totalPanipuri == 0) {
				System.out.println("**Panipuri is running out of stock now**");
			}
		}else if (pickPanipuri > 0 && totalPanipuri < pickPanipuri) {
			totalPanipuri =0;
			System.out.println(totalPanipuri+" Panipuri are available in stock");
		}
		
		if (pickPouch > 0 && totalPouches >= pickPouch) {
			totalPouches = totalPouches - pickPouch;
			if (totalPouches == 0) {
				System.out.println("**Oil Pouch is running out of stock now**");
			}
		}else if (pickPouch > 0 && totalPouches < pickPouch) {
			totalPouches =0;
			System.out.println(totalPouches+" Oil Pouch are available in stock");
		}
		
		if (pickMasala > 0 && totalMasala >= pickMasala) {
			totalMasala = totalMasala - pickMasala;
			if (totalMasala == 0) {
				System.out.println("**Masala is running out of stock now**");
			}
		}else if (pickMasala > 0 && totalMasala < pickMasala) {
			totalMasala =0;
			System.out.println(totalMasala+" Masala are available in stock");
		}
	}
	
	
	public static void main (String[] a) {
		Shop shop = new Shop();
		shop.setValues(10, 50, 50, 0, 50);
		shop.itemOutOfStock();
		shop.soldItems(10, 10, 30, 10, 60);
		shop.availableItems();
	}
	
	

}
