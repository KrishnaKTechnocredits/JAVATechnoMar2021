package dipali;

public class Shop {
	int MaggieQ =50;
	int DosaQ=43;
	int pouchesQ=39;
	int panipuriQ=43;
	int masalaQ=73;
	String itemName;
	public void placeOrder(String item, int noOfItem, boolean pAllowed) {
		if(item.equalsIgnoreCase("Maggie")) {
			if(noOfItem>0) {
				System.out.println("Customer has ordered maggie packs with quantity = "+noOfItem);
				availableInStock(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Dosa")) {
			if(noOfItem>0) {
				System.out.println("Customer has ordered Dosa packets with quantity = "+noOfItem);
				availableInStock(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Pouches")) {
			if(noOfItem>0) {
				System.out.println("Customer has ordered Oil pouches with quantity = "+noOfItem);
				availableInStock(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Panipuri")) {
			if(noOfItem>0) {
				System.out.println("Customer has ordered panipuri packets with quantity = "+noOfItem);
				availableInStock(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Masala")) {
			if(noOfItem>0) {
				System.out.println("Customer has ordered masala packets with quantity = "+noOfItem);
				availableInStock(item,noOfItem,pAllowed);
			}
		}
		
		
	}
	
	public void availableInStock(String item,int noOfItem, boolean pAllowed) {
		if (item.equalsIgnoreCase("Maggie")) {
			if(noOfItem<=MaggieQ) {
			MaggieQ=MaggieQ-noOfItem;
			System.out.println("Maggie is in stock "+MaggieQ);
			}else {
				outOfStockItem(item,noOfItem,pAllowed);
			}
			
		}
	
		if( item.equalsIgnoreCase("Dosa")) {
			if(noOfItem<=DosaQ) {			
				DosaQ=DosaQ-noOfItem;
				System.out.println("Dosa is in stock "+DosaQ);
			}else {
				outOfStockItem(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Pouches")) {
			if(noOfItem<=pouchesQ ) {			
				pouchesQ=pouchesQ-noOfItem;
				System.out.println("Pouches is in stock "+pouchesQ);
			}else {
				outOfStockItem(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Panipuri")) {
			if(noOfItem<=pouchesQ) {		
				panipuriQ=panipuriQ-noOfItem;
				System.out.println("Panipuri is in stock "+panipuriQ);
			}else {
				outOfStockItem(item,noOfItem,pAllowed);
			}
		}
		
		if(item.equalsIgnoreCase("Masala")) {
			if(noOfItem<=pouchesQ ) {	
			masalaQ=masalaQ-noOfItem;
			System.out.println("Masala is in stock "+masalaQ);
			}else {
				outOfStockItem(item,noOfItem,pAllowed);
			}
		}
		
		
	}
	
	public void outOfStockItem(String item,int noOfItem, boolean pAllowed) {
		if(item.equalsIgnoreCase("Maggie")) {
			if(noOfItem>MaggieQ)

			System.out.println("Sorry we are running out of stock , the available stock for maggie is  "+MaggieQ +" ... do you want to still buy this item then say Yes");

			System.out.println("Sorry we are running out of stock , the available stock for maggie is  "+MaggieQ +" ...do you want to still buy this item then say Yes");

			if(pAllowed) {	
				System.out.println("Customer still wants to buy available stock for dosa packets with quantity "+MaggieQ + " though he/she was requested quantity "+noOfItem );
				MaggieQ=0;
			}
		}
		
		if(item.equalsIgnoreCase("Dosa")) {
			if(noOfItem>DosaQ)
			System.out.println("Sorry we are running out of stock , the available stock for dosa is  "+DosaQ +" .... do you want to still buy this item then say Yes");
			if(pAllowed) {		
				System.out.println("Customer still wants to buy available stock for dosa packets with quantity "+DosaQ+ " though he/she was requested quantity "+noOfItem );
				DosaQ=0;
			}
		}
		
		if(item.equalsIgnoreCase("Pouches")) {
			if(noOfItem>pouchesQ)
			System.out.println("Sorry we are running out of stock , the available stock for oil pouch is  "+pouchesQ +" ... do you want to still buy this item then say Yes");
			if(pAllowed) {		
				System.out.println("Customer still wants to buy available stock for oil puches with quantity "+pouchesQ+ " though he/she was requested quantity "+noOfItem );
				pouchesQ=0;
			}
		}
		
		if(item.equalsIgnoreCase("Panipuri")) {
			if(noOfItem>panipuriQ)
			System.out.println("Sorry we are running out of stock , the available stock for panipuri is  "+panipuriQ +" ... do you want to still buy this item then say Yes");
			if(pAllowed) {		
				System.out.println("Customer still wants to buy available stock for panipuri with quantity "+panipuriQ+ " though he/she was requested quantity "+noOfItem );
				panipuriQ=0;
			}
		}
		
		if(item.equalsIgnoreCase("Masala")) {
			if(noOfItem>masalaQ)
			System.out.println("Sorry we are running out of stock , the available stock for masala is  "+masalaQ +" ... do you want to still buy this item then say Yes");
			if(pAllowed) {			
				System.out.println("Customer still wants to buy available stock for masala with quantity "+masalaQ+ " though he/she was requested quantity "+noOfItem );
				masalaQ=0;
			}
		}
	}
	

	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.placeOrder("Maggie", 10, true);
		shop.placeOrder("Dosa", 13, true);
		shop.placeOrder("Pouches", 16, true);
		shop.placeOrder("Panipuri", 16, true);
		shop.placeOrder("Masala", 83, true);
	}

}
