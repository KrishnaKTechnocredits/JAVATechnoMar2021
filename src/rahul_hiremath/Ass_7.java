package rahul_hiremath;

public class Ass_7 {
	int maggieStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStock = 43;
	int masalasStock = 73;

	void items(int maggie, int dosa, int pouches, int panipuri, int masalas) {
		if (maggie >= 0 && dosa >= 0 && pouches >= 0 && panipuri >= 0 && masalas >= 0) {
			if (maggie <= maggieStock) {
				System.out.println("Please collect " + maggie + " maggie packets");
				maggieStock = maggieStock - maggie;
			}

			else if (maggieStock < maggie)
			{
				int pendingMaggie = maggie - maggieStock;
				System.out
						.println("We can deliver you " + maggieStock + " only and can't deliver you " + pendingMaggie);
				maggieStock = 0;
			}

			if (dosa <= dosaStock) {
				System.out.println("Please collect " + dosa + " dosa packets");
				dosaStock = dosaStock - dosa;
			}

			else if (dosaStock < dosa) 
			{
				int pendingdosa = dosa - dosaStock;
				System.out.println("We can deliver you " + dosaStock + " only and can't deliver you " + pendingdosa);
				dosaStock = 0;
			}
			
			if (pouches <= pouchesStock) {
				System.out.println("Please collect " + pouches + " pouche packets");
				pouchesStock = pouchesStock - pouches;
			}

			else if (pouchesStock < pouches) 
			{
				int pendingPouches = pouches - pouchesStock;
				System.out.println("We can deliver you " + pouches + " only and can't deliver you " + pendingPouches);
				pouchesStock = 0;
			}
			
			if (panipuri <= panipuriStock) {
				System.out.println("Please collect " + panipuri + " panipuri packets");
				panipuriStock = panipuriStock - panipuri;
			}

			else if (panipuriStock < panipuri) 
			{
				int pendingPanipuri = panipuri - panipuriStock;
				System.out.println("We can deliver you " + panipuri + " only and can't deliver you " + pendingPanipuri);
				panipuriStock = 0;
			}
			
			if (masalas <= masalasStock) {
				System.out.println("Please collect " + masalas + " masala packets");
				masalasStock = masalasStock - masalas;
			}

			else if (masalasStock < masalas) // 50 < 50
			{
				int pendingMasalas = masalas - masalasStock;
				System.out.println("We can deliver you " + masalas + " only and can't deliver you " + pendingMasalas);
				masalasStock = 0;
			}
		} else
			System.out.println("Please provide +ve number");

	}

	void outOfStock() {
		if (maggieStock == 0)
			System.out.println("Maggie out of stock");
		if (dosaStock == 0)
			System.out.println("Dosa out of stock");
		if (pouchesStock == 0)
			System.out.println("Pouches out of stock");
		if (panipuriStock == 0)
			System.out.println("Panipuri out of stock");
		if (masalasStock == 0)
			System.out.println("Masalas out of stock");
	}

	void availableInStock() {
		System.out.println("Available Maggie stock is: " + maggieStock);
		System.out.println("Available Dosa stock is: " + dosaStock);
		System.out.println("Available Pouches stock is: " + pouchesStock);
		System.out.println("Available Panipuri stock is: " + panipuriStock);
		System.out.println("Available Masala stock is: " + masalasStock);
	}

	public static void main(String[] args) {
		Ass_7 ass_7 = new Ass_7();
		ass_7.items(0, 0, 0, 43, 0);
		ass_7.outOfStock();
		ass_7.availableInStock();
	}
}
