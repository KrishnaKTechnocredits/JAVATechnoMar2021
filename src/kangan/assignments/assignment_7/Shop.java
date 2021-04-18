package kangan.assignments.assignment_7;

public class Shop {

	int maggiePack = 50;
	int dosaPack = 43 ;
	int pouchesPack = 39;
	int panipuriPack = 43;
	int masalaPack = 73;
	
	void shopping(int maggie, int dosa, int pouches, int panipuri, int masala) {
		maggiePack = maggiePack-maggie;
		dosaPack = dosaPack-dosa;
		pouchesPack = pouchesPack-pouches;
		panipuriPack = panipuriPack-panipuri;
		masalaPack = masalaPack-masala;
	}
	void availableStock() {
		if(maggiePack>0)
			System.out.println(maggiePack + " Maggie available in stock");
		if(dosaPack>0)
			System.out.println(dosaPack + " dosa available in stock");
		if(pouchesPack>0)
			System.out.println(pouchesPack + " pouches available in stock");
		if(panipuriPack>0)
			System.out.println(panipuriPack + " panipuri available in stock");
		if(masalaPack>0)
			System.out.println(masalaPack + " masala available in stock");
	}
	void outOfStock() {
		if(maggiePack<=0)
			System.out.println("Maggie out of stock");
		if(dosaPack==0)
			System.out.println("dosa out of in stock");
		if(pouchesPack==0)
			System.out.println("pouches out of in stock");
		if(panipuriPack==0)
			System.out.println("panipuri out of in stock");
		if(masalaPack==0)
			System.out.println("masala out of in stock");
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shopping(10, 15, 16, 43, 30);
		shop.availableStock();
		shop.outOfStock();
		
	}
}
