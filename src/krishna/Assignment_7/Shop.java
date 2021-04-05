package krishna.Assignment_7;

public class Shop {
	String maggie="Maggie",dosa= "Dosa",pouches = "Pouches",panipuri = "Panipuri",masala= "Masala";
	int maggieQuan=50,dosaQuan=43,pouchesQuan=39,panipuriQuan=43,masalaQuan=73;
	
	void setInitial(int maggieQ,int dosaQ,int pouchesQ,int panipuriQ,int masalaQ) {
		if(maggieQ<=50) {
			maggieQuan = maggieQuan-maggieQ;
			System.out.println("Available stock "+maggie+": " +maggieQuan);
		}else{
			maggieQuan=0;
			System.out.println("Maggie running out of stock");
		}
		if(dosaQ<=43) {
			dosaQuan = dosaQuan-dosaQ;
			System.out.println("Available stock "+dosa+": " +dosaQuan);
		}else{
			dosaQuan=0;
			System.out.println("Dosa running out of stock");
		}
		if(pouchesQ<=39) {
			pouchesQuan = pouchesQuan-pouchesQ;
			System.out.println("Available stock "+pouches+": " +pouchesQuan);
		}else{
			pouchesQuan=0;
			System.out.println("Pouches is running out of stock");
		}
		if(panipuriQ<=43) {
			panipuriQuan = panipuriQuan -panipuriQ;
			System.out.println("Available stock "+panipuri+": " +panipuriQuan);
		}else{
			panipuriQuan=0;
			System.out.println("Panipuri is running out of stock");
		}
		if(masalaQ<=73) {
			masalaQuan = masalaQuan - masalaQ;
			System.out.println("Available stock "+masala+": " +masalaQuan);
		}else{
			masalaQuan=0;
			System.out.println("Masala is running out of stock");
		}
		
	}
	void outOfStock(){
		System.out.println();
		System.out.println("* Checking out of stock items *");
		if(maggieQuan==0) {
			System.out.println(maggie+ " is running out of stock");
		}
		if(dosaQuan==0) {
			System.out.println(dosa+ " is running out of stock");
		}
		if(pouchesQuan==0) {
			System.out.println(pouches+ " is running out of stock");
		}
		if(panipuriQuan==0) {
			System.out.println(panipuri+ " is running out of stock");
		}
		if(masalaQuan==0) {
			System.out.println(masala+ " is running out of stock");
		}
	}
	void availableStock() {
		System.out.println();
		System.out.println(" * Checking available items in stock *");
		if(maggieQuan>0) {
			System.out.println(maggie+ " Available in stock & respective quantities is :"+maggieQuan);
		}
		if(dosaQuan>0) {
			System.out.println(dosa+ " Available in stock & respective quantities is :"+dosaQuan);
		}
		if(pouchesQuan>0) {
			System.out.println(pouches+ " Available in stock & respective quantities is :"+pouchesQuan);
		}
		if(panipuriQuan>0) {
			System.out.println(panipuri+ " Available in stock & respective quantities is :"+panipuriQuan);
		}
		if(masalaQuan>0) {
			System.out.println(masala+ " Available in stock & respective quantities is :"+masalaQuan);
		}
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInitial(45,50,39,42,73);
		shop.outOfStock();
		shop.availableStock();
	}
}
