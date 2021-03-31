package radha;

public class Shop {
	int maggie = 50;
	int dosa = 43;
	int oilPouch = 39;
	int panipuri = 43;
	int masala = 73;
	
	void requestedQty(int maggieQ, int dosaQ, int oilPouchQ, int panipuriQ, int masalaQ) {
		if(maggieQ<=maggie) {
			maggie = maggie-maggieQ;
		}else{
			System.out.println("Sorry!! Quantity available is not suffcient.");
			System.out.println("Requested Maggie qty "+maggieQ+" is greater than qty available in stock. We have fulfilled only partial request with "+maggie+" Maggie packets.");
			maggie=0;
		}
		if(dosaQ<=dosa) {
			dosa = dosa - dosaQ;
		}else{
			System.out.println("Sorry!! Quantity available is not suffcient.");
			System.out.println("Requested Dosa qty "+dosaQ+" is greater than qty available in stock. We have fulfilled only partial request with "+dosa+" Dosa packets.");
			dosa=0;
		}
		if(oilPouchQ<=oilPouch) {
			oilPouch = oilPouch - oilPouchQ;
		}else{
			System.out.println("Sorry!! Quantity available is not suffcient.");
			System.out.println("Requested Oil qty "+oilPouchQ+" is greater than qty available in stock. We have fulfilled only partial request with "+oilPouch+" Oil packets.");
			oilPouch=0;
		}
		if(panipuriQ<=panipuri) {
			panipuri = panipuri - panipuriQ;
		}else{
			System.out.println("Sorry!! Quantity available is not suffcient.");
			System.out.println("Requested panipuri qty "+panipuriQ+" is greater than qty available in stock. We have fulfilled only partial request with "+panipuri+" panipuri packets.");
			panipuri=0;
		}
		if(masalaQ<=masala) {
			masala = masala - masalaQ;
		}else{
			System.out.println("Sorry!! Quantity available is not suffcient.");
			System.out.println("Requested masala qty "+masalaQ+" is greater than qty available in stock. We have fulfilled only partial request with "+masala+" masala packets.");
			masala=0;
		}
	}
	
	void availableInStock() {
		if(maggie>0 ) {
			System.out.println("Available quantity of Maggie is "+ maggie);
		}
		if(dosa>0) {
			System.out.println("Availalbe quantity of dosa is "+ dosa);
		}
		if(oilPouch>0) {
			System.out.println("Availalbe quantity of Oil is "+ oilPouch);
		}
		if(panipuri>0) {
			System.out.println("Availalbe quantity of PaniPuri is "+ panipuri);
		}
		if(masala>0) {
			System.out.println("Availalbe quantity of Masala is "+ masala);	
		}
	}
	
	void outOfStock() {
		if(maggie==0 ) {
			System.out.println("Maggie is out of stock");
		}
		if(dosa==0) {
			System.out.println("Dosa is out of stock");
		}
		if(oilPouch==0) {
			System.out.println("Oil is out of stock");
		}
		if(panipuri==0) {
			System.out.println("Panipuri is out of stock");
		}
		if(masala==0) {
			System.out.println("Masala is out of stock");
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("Items available in stock are: ");
		shop.availableInStock();
		System.out.println(" ");
		shop.requestedQty(45, 42, 39, 45, 73);
		System.out.println("Items remaining after purchase are :");
		shop.availableInStock();
		shop.outOfStock();
	}
}

