package sandesh.Assignment_7;

public class Shop {

	static int maggieQuantity = 50;
	static int dosaQuantity = 43;
	static int pouchesQuantity = 39;
	static int panipuriQuantity = 43;
	static int masalaQuantity = 73;

	private void startShopping(int requiredMaggieQuantity, int requiredDosaQuantity, int requiredPouchesQuantity,
			int requiredPanipuriQuantity, int requiredMasalaQuantity) {
		if (requiredMaggieQuantity > maggieQuantity) {
			System.out.println("We gave you " + maggieQuantity + " quantity of maggie. Please check for remaining "
					+ (requiredMaggieQuantity - maggieQuantity) + " in next Shop.");
			maggieQuantity = 0;
		} else
			maggieQuantity = maggieQuantity - requiredMaggieQuantity;

		if (requiredDosaQuantity > dosaQuantity) {
			System.out.println("We gave you " + dosaQuantity + " quantity of dosa. Please check for remaining "
					+ (requiredDosaQuantity - dosaQuantity) + " in next Shop.");
			dosaQuantity = 0;
		} else
			dosaQuantity = dosaQuantity - requiredDosaQuantity;

		if (requiredPouchesQuantity > pouchesQuantity) {
			System.out.println("We gave you " + pouchesQuantity + " quantity of pouches. Please check for remaining "
					+ (requiredPouchesQuantity - pouchesQuantity) + " in next Shop.");
			pouchesQuantity = 0;
		} else
			pouchesQuantity = pouchesQuantity - requiredPouchesQuantity;

		if (requiredPanipuriQuantity > panipuriQuantity) {
			System.out.println(
					"We gave you " + requiredPanipuriQuantity + " quantity of panipuris. Please check for remaining "
							+ (requiredPanipuriQuantity - panipuriQuantity) + " in next Shop.");
			panipuriQuantity = 0;
		} else
			panipuriQuantity = panipuriQuantity - requiredPanipuriQuantity;

		if (requiredMasalaQuantity > masalaQuantity) {
			System.out.println(
					"We gave you " + requiredMasalaQuantity + " quantity of masalas. Please check for remaining "
							+ (requiredMasalaQuantity - masalaQuantity) + " in next Shop.");
			masalaQuantity = 0;
		} else
			masalaQuantity = masalaQuantity - requiredMasalaQuantity;
	}

	private void showOutOfStock() {
		if (maggieQuantity == 0)
			System.out.println("Maggie is now OUT OF STOCK.");
		if (dosaQuantity == 0)
			System.out.println("Dosa is now OUT OF STOCK.");
		if (pouchesQuantity == 0)
			System.out.println("Pouches are now OUT OF STOCK.");
		if (panipuriQuantity == 0)
			System.out.println("Panipuri is now OUT OF STOCK.");
		if (masalaQuantity == 0)
			System.out.println("Masala is now OUT OF STOCK.");
	}

	private void showAvailableInStock() {
		if (maggieQuantity > 0)
			System.out.println(maggieQuantity + " quantity of Maggie is available in stock.");
		if (dosaQuantity > 0)
			System.out.println(dosaQuantity + " quantity of Dosa is available in stock.");
		if (pouchesQuantity > 0)
			System.out.println(pouchesQuantity + " quantity of Pouches are available in stock.");
		if (panipuriQuantity > 0)
			System.out.println(panipuriQuantity + " quantity of Panipuri is available in stock.");
		if (masalaQuantity > 0)
			System.out.println(masalaQuantity + " quantity of Masala is available in stock.");
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.startShopping(100, 100, 106, 10, 30);
		shop.showOutOfStock();
		shop.showAvailableInStock();
	}
}
