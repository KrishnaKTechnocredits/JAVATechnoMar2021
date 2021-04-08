package monali;

public class Shop {
	
int maggiepacketQ;
int maggie;
int num;

int dosa;
int dosaQ;
int num1;

int pouches;
int pouchesQ;
int num2;

int panipuri;
int panipuriQ;
int num3;

int masala;
int masalaQ;
int num4;

void initialQuantity() {
	maggiepacketQ = 50;
	dosaQ = 75;
	pouchesQ = 64;
	panipuriQ = 85;
	masalaQ = 35;
}

void reqQuantity(int maggie) {
	if(maggie <= maggiepacketQ) {
	num = maggiepacketQ - maggie;
	System.out.println("maggiepacket running out of stock is" +num);
	}
}

 void reqQuantity0(int dosa) {
	 if(dosa <= dosaQ) {
	 num1 = dosaQ - dosa;
	 System.out.println(" dosa running out of stock" +num1);
	 }
 }
 
 void reqQuantity1(int pouches) {
	 if(pouches <= pouchesQ) {
	 num2 = pouchesQ - pouches;
	 System.out.println("pouches out of stock" +num2);
	 }
 }
 
 void reqQuantity2(int panipuri) {
	 if(panipuri <= panipuriQ) {
	 num3 = panipuriQ - panipuri;
	 System.out.println("panipuri out of stock" +num3);
	 }
 }
 
 void reqQuantity3(int masala) {
	 if(masala <= masalaQ) {
	 num4 = masalaQ - masala;
	 System.out.println("masala out of stock" +num4);
}
 }
 
 void showOutOfStockItem() {
	 if(num <= maggiepacketQ) {
		 System.out.println("maggie out of stock");
	 }
		 else if(num1 <= dosaQ) {
			 System.out.println("dosa out of stock");
		 }
		 else if (num2 <= pouchesQ) {
			 System.out.println("pouches out of stock");
		 }
		 else if (num3 <= panipuriQ) {
			 System.out.println("panipuri out of stock");
		 }
		 else if (num4 <= masalaQ) {
			 System.out.println("masala out of stock");
		 }
 }
 
 void availableStock() {
	 
	 if(num >= maggiepacketQ) {
		 System.out.println("maggie available in  stock" +num);
	 }
		 else if(num1 >= dosaQ) {
			 System.out.println("dosa available in stock" +num1);
		 }
		 else if (num2 >= pouchesQ) {
			 System.out.println("pouches available in stock" +num2);
		 }
		 else if (num3 >= panipuriQ) {
			 System.out.println("panipuri available in stock" +num3);
		 }
		 else if (num4 >= masalaQ) {
			 System.out.println("masala available in stock" +num4);
		 }
 }
	 
 
 public static void main(String[] a) {
		Shop shop = new Shop();
		shop.initialQuantity();
		shop.reqQuantity(52);
		shop.reqQuantity0(56);
		shop.reqQuantity1(47);
		shop.reqQuantity2(60);
		shop.reqQuantity3(45);
	    shop.showOutOfStockItem();
	    shop.availableStock();
		
	}
}
	 
 
	
	
	
	
	

  






	
	












	
	
	
	
	
	
	
	

