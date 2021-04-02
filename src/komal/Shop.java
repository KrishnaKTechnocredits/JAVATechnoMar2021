package komal;

public class Shop {
	int maggieQ = 50;
	int dosaQ = 43;
	int pouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;

	void outOfstock(int reqdosa, int reqpanipuri) {

		dosaQ = reqdosa;
		panipuriQ = reqpanipuri;

		if(reqdosa == 0)
			System.out.println("Sorry, dosa is out of stock");
		if(reqpanipuri == 0)
			System.out.println("Sorry, panipuri is out of stock");

		}
	void availableInStock(int maggiereqQ, int pouchesreqQ, int masalareqQ) {

		if(maggieQ >= maggiereqQ) {

			System.out.println("Maggie is available in stock " + " packets: " + maggieQ);
			maggieQ = maggieQ - maggiereqQ;
		}
			else if(maggiereqQ > maggieQ){
			System.out.println("Requested maggie is not available in stock " + "you can buy partial : " + maggieQ);
		}
		if(pouchesQ >= pouchesreqQ) 
			System.out.println("Oil pouches is available in stock " + " packets: " + pouchesQ);

		if(masalaQ >= masalareqQ) {
			masalaQ = masalaQ - masalareqQ;
			System.out.println("Masala is available in stock " + " packets: " + masalaQ);
			masalaQ = masalaQ - masalareqQ;
		}
		else if(masalareqQ > masalaQ){
			System.out.println("Requested masala is not available in stock " + "you can buy partial : " + masalaQ);
		}	
	 }

	public static void main(String [] args) {
		Shop shop = new Shop();
		shop.outOfstock(0,0);
		shop.availableInStock(70,39,83);
	}
}