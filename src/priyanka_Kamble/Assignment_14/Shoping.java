package priyanka_Kamble.Assignment_14;
/*Assignment 14_Program_03
1. Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
print "running out of stock" message if a particular item is sold out 

otherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

import java.util.Scanner;

public class Shoping {
	int maggiepackets = 50, dosaquantity = 43, oilPouches = 39, panipuripackets = 43, masalapackets = 73;

	void setInitialquantity() {
		System.out.println(" Initial Stock of Maggie - " + maggiepackets + "\n Initial Stock of Dosa - " + dosaquantity
				+ "\n Initial Stock of Oil Poches -  " + oilPouches);
		System.out.println(" Initial Stock of Panipuri - " + panipuripackets + "\n Initial Stock of Masala Packets - "
				+ masalapackets);
	}

	void outOfStockItems() {
		if (maggiepackets == 0) {
			System.out.println("Maggie is out of stock");
		}
		if (dosaquantity == 0) {
			System.out.println("Dosa is out of stock");
		}
		if (oilPouches == 0) {
			System.out.println("Oil Pouches are out of stock");
		}
		if (panipuripackets == 0) {
			System.out.println("Panipuri Packets are out of stock");
		}
		if (masalapackets == 0) {
			System.out.println("Masala Packets are out of stock");
		}
	}

	void customerorder(int maggieorder,int dosaorder, int oilpouchorder, int panipuriorder, int masalapackorder,boolean partialallow){
		System.out.println("---- Maggie Section-----");
		if(maggieorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(maggieorder<=maggiepackets && maggieorder!=0){
			maggiepackets = maggiepackets - maggieorder;
			System.out.println(maggieorder+ " Maggie Packets served ");
		}else if(maggieorder>maggiepackets && maggiepackets!=0){	
			System.out.println("Available Packets of Maggie are "+maggiepackets+ " and requested maggie packets are " +maggieorder);
				if(partialallow){
					System.out.println("Available Maggie Packets served");
					maggiepackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else{
			System.out.println("Quantity of Maggie is : "+maggiepackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
	
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Dosa Section-----");
		 if(dosaorder==0){
				System.out.println("Customer Dont want to buy this item.");
		}else if(dosaorder<=dosaquantity && dosaorder!=0){
			dosaquantity = dosaquantity - dosaorder;
			System.out.println(dosaorder+ " Ouantity of Dosa served ");
		}else if(dosaorder>dosaquantity && dosaquantity!=0){
			System.out.println("Available Dosa Quantity is "+dosaquantity+ " and requested dosa quantity is " +dosaorder);
				if(partialallow){
					System.out.println("Available Dosa served");
					dosaquantity=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Dosa is : "+dosaquantity+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Oil Section-----");
		 if(oilpouchorder==0){
				System.out.println("Customer Dont want to buy this item.");
		}else if(oilpouchorder<=oilPouches && oilpouchorder!=0){
			oilPouches = oilPouches - oilpouchorder;
			System.out.println(oilpouchorder+ " Oil Pouches served ");
		}else if(oilpouchorder>oilPouches && oilPouches!=0){
			System.out.println("Available Oil Pouches Quantity is "+oilPouches+ " and requested oil pouches are " +oilpouchorder);
				if(partialallow){
					System.out.println("Available Oil Pouches served");
					oilPouches=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Oil Pouches are : "+oilPouches+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Panipuri Section-----");
		if(panipuriorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(panipuriorder<=panipuripackets && panipuriorder!=0 && panipuripackets!=0){
			panipuripackets = panipuripackets - panipuriorder;
			System.out.println(panipuriorder+ " Panipuri Packets served ");
		}else if(panipuriorder>panipuripackets && panipuripackets!=0){
			System.out.println("Available Panipuri Packets are "+panipuripackets+ " and requested Panipuri packets are " +panipuriorder);
				if(partialallow){
					System.out.println("Available Panipuri Packets served");
					panipuripackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Panipuri is : "+panipuripackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
		System.out.println("--------------------------------------------\n");
		System.out.println("---- Masala Section-----");
		if(masalapackorder==0){
			System.out.println("Customer Dont want to buy this item.");
		}else if(masalapackorder<=masalapackets && masalapackorder!=0 && masalapackets!=0){
			masalapackets = masalapackets - masalapackorder;
			System.out.println(masalapackets+ " Masala Packets served ");
		}else if(masalapackorder>masalapackets && masalapackets!=0){
			System.out.println("Available Oil Pouches Quantity is "+masalapackets+ " and requested maggie packets are " +masalapackorder);
				if(partialallow){
					System.out.println("Available Masala Packets served");
					masalapackets=0;
				}else{
					System.out.println("If you want exact requested quantity of items then Sorry we don't have sufficient quantity, we couldn't serve you.");
				}
		}else {
			System.out.println("Quantity of Masala is : "+masalapackets+"\nItem is out of Stock, Sorry we could not serve you");
		}
		
	}
	
	void availablestock(){
		System.out.println("--------------------------------------------\n");
		System.out.println("---------------Available Items---------------");
		System.out.println(maggiepackets+ " Maggie Packets are available.");
		System.out.println(dosaquantity+ " Dosa Quantity available.");
		System.out.println(oilPouches+ " Oil Pouches are available");
		System.out.println(panipuripackets+ " Panipuri Packets are available");
		System.out.println(masalapackets+ " Masala Packets are available");
	}

	public static void main(String[] args) {
		Shoping shopping = new Shoping();
		Scanner scanner = new Scanner(System.in);
		shopping.setInitialquantity();
		System.out.println("Enter quantity for Maggie.");
		int maggieorder=scanner.nextInt();
		System.out.println("Enter quantity for Dosa.");
		int dosaorder=scanner.nextInt();
		System.out.println("Enter quantity for Oil Pouches.");
		int oilpouchorder=scanner.nextInt();
		System.out.println("Enter quantity for Panipuri .");
		int panipuriorder=scanner.nextInt();
		System.out.println("Enter quantity for Masala Pouches .");
		int masalapackorder=scanner.nextInt();
		System.out.println("Do you want to server order partially? (true/false) ");
		boolean partialallow=scanner.nextBoolean();
		shopping.customerorder(maggieorder, dosaorder, oilpouchorder, panipuriorder, masalapackorder,partialallow);
		
		shopping.outOfStockItems();
		shopping.availablestock();
		scanner.close();
	}
}
