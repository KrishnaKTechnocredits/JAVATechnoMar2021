package ashwini.assignment14;

import java.util.Scanner;
import java.lang.String;

/* 1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.NOTE : Please create separate branches for assignment 6 and 7.ś
*/

public class Shop {
	int maggieQ;
	int dosaQ;
	int oil_packetsQ;
	int panipuriQ;
	int masalaQ;
	String allowed;
	
	void setInitialQuantity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the initial stock quantity for maggie: ");
		maggieQ = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for dosa: ");
		dosaQ = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for oil packets: ");
		oil_packetsQ = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for panipuri: ");
		panipuriQ = scanner.nextInt();
		System.out.println("Enter the initial stock quantity for masala: ");
		masalaQ = scanner.nextInt();
	}
		
	void requestedQuantity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reuested quantity for maggie: ");
		int requestedMaggie =sc.nextInt();
		System.out.println("Enter the reuested quantity for dosa: ");
		int requestedDosa =sc.nextInt();
		System.out.println("Enter the reuested quantity for oilpouch: ");
		int requestedOilPackets =sc.nextInt();
		System.out.println("Enter the reuested quantity for panipuri: ");
		int requestedPanipuri =sc.nextInt();
		System.out.println("Enter the reuested quantity for masala: ");
		int requestedMasalas =sc.nextInt();
		
		
		if(maggieQ<=10){
			System.out.println("maggie packets runnig out of stock");
		}
		else if(requestedMaggie<=maggieQ){
				maggieQ = maggieQ - requestedMaggie;
				}
			else{
				
				System.out.println("Shopkeeper says: We are very sorry requested maggie packets stock is not avaible , we can give you only " +maggieQ + " pakects of maggie");
				if(allowed.equals("allowed")) {
					maggieQ =maggieQ;
					System.out.println("Okey no issue please give me available "+maggieQ + " packets maggie");
				}
			}
				
		if(dosaQ<=10){
			System.out.println("dosa packets runnig out of stock");
		}
		else if(requestedDosa<=dosaQ){
				dosaQ = dosaQ - requestedDosa;
				}
			else{
				
				System.out.println("We are very sorry requested dosa packets are not avaible , we can give you only " +dosaQ+ "packets of dosa");
				if(allowed.equals("allowed")) {
					dosaQ=dosaQ;
					System.out.println("Okey no issue please give me available "+dosaQ + " packets dosa");
					dosaQ=0;
				}
				}

		
		if(panipuriQ<=10){
			System.out.println("Panipuri packets runnig out of stock");
		}
		else if(requestedPanipuri<=panipuriQ){
				panipuriQ = panipuriQ - requestedPanipuri;
				}
			else{
				
				System.out.println("We are very sorry requested panipuri packets are not avaible , we can give you only " +panipuriQ+ " panipuri packets");
				if(allowed.equals("allowed")) {
					panipuriQ =panipuriQ;
					System.out.println("Okey no issue please give me available "+panipuriQ+ " packets panipuri");
				}
				}	

		if(oil_packetsQ<=10){
			System.out.println("dosa packets runnig out of stock");
		}
		else if(requestedOilPackets<=oil_packetsQ){
			oil_packetsQ = oil_packetsQ - requestedOilPackets;
				}
			else{
				
				System.out.println("We are very sorry requested oil packes are not avaible , we can give you only " +oil_packetsQ+ " packets of oil");
				if(allowed.equals("allowed")) {
					oil_packetsQ = oil_packetsQ;
					System.out.println("Okey no issue please give me available "+oil_packetsQ + " packets oil");
					
				}
				
				}	
		if(masalaQ<=10){
			System.out.println("dosa packets runnig out of stock");
		}
		else if(requestedMasalas<=masalaQ){
				masalaQ = masalaQ - requestedMasalas;
				}
			else{
				
				System.out.println("We are very sorry requested masala packets  are not avaible , we can give you only " +masalaQ+ " masala packets");
				if(allowed.equals("allowed")){
					masalaQ = masalaQ;
					System.out.println("Okey no issue please give me available "+masalaQ + "packets masala");
					
				}
				}					
	}
	
	void availableInStock() {
		if(maggieQ>0) {
			System.out.println("Available quantity of Maggie is "+ maggieQ);
		}
		if(dosaQ>0) {
			System.out.println("Available quantity of dosa is "+ dosaQ);
		}
		if(panipuriQ>0) {
			System.out.println("Available quantity of panipuri is "+ panipuriQ);
		}
		if(oil_packetsQ>0) {
			System.out.println("Available quantity of oilpouch is "+ oil_packetsQ);
		}
		if(masalaQ>0) {
			System.out.println("Available quantity of masala is "+ masalaQ);
		}
	}
	
	void outofStock() {
		if(maggieQ==0) {
			System.out.println("Maggie is out of stock");
		}
		if(dosaQ==0) {
			System.out.println("dosa is out of stock");
		}
		if(oil_packetsQ==0) {
			System.out.println("oilpouch is out of stock");
		}
		if(panipuriQ==0) {
			System.out.println("masala is out of stock");
		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInitialQuantity();
		System.out.println("Items available in stock are:  ");
		shop.availableInStock();
		System.out.println();
		shop.requestedQuantity();
		System.out.println("Items remaining after purchase are:  ");
		shop.availableInStock();
		shop.outofStock();

	}

}
