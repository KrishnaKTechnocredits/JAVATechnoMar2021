package bhavana_assignment_14;

import java.util.Scanner;

import neha_Patil.shop;

/*Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities,
 print "running out of stock" message if a particular item is sold out otherwise deduct requested 
quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/
public class ShopScanner {

	int maggiQ=50, dosaQ=43,oilQ=39,panipuriQ=43,masalaQ=73;
	
	void getRequest() {
		int maggi=0,dosa,oil,panipuri,masala;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maggi quantity:");
		maggi=sc.nextInt();
		if(maggiQ<maggi) {
			System.out.println("Maggi is running out of stock");
		}else if(maggiQ>=maggi) {
			maggiQ=maggiQ-maggi;
			System.out.println("Available maggi quantity is:"+maggiQ);
		}
		
		System.out.println("Enter the dosa quantity:");
		dosa=sc.nextInt();
		if(dosaQ<dosa) {
			System.out.println("Dosa is running out of stock");
		}else if(dosaQ>=dosa) {
			dosaQ=dosaQ-dosa;
			System.out.println("Available dosa quantity is:"+dosaQ);
		}
		
		System.out.println("Enter the oil quantity:");
		oil=sc.nextInt();
		if(oilQ<oil) {
			System.out.println("oil packets are running out of stock");
		}else if(dosaQ>=dosa) {
			dosaQ=dosaQ-dosa;
			System.out.println("Available dosa quantity is:"+dosaQ);
		}
		
		System.out.println("Enter the panipuri quantity:");
		panipuri=sc.nextInt();
		if(panipuriQ<panipuri) {
			System.out.println("Panipuri is running out of stock");
		}else if(panipuriQ>=panipuri) {
			panipuriQ=panipuriQ-panipuri;
			System.out.println("Available panipuri quantity is:"+panipuriQ);
		}
		
		System.out.println("Enter the masala quantity:");
		masala=sc.nextInt();
		if(masalaQ<masala) {
			System.out.println("Masala is running out of stock");
		}else if(masalaQ>=masala) {
			masalaQ=masalaQ-masala;
			System.out.println("Available maggi quantity is:"+masalaQ);
		}
}
	void outOfStock() {
		if(maggiQ==0)	
			System.out.println("Maggi is out of stock");
		if(dosaQ==0)	
			System.out.println("Maggi is out of stock");
		if(oilQ==0)	
			System.out.println("Maggi is out of stock");
		if(panipuriQ==0)	
			System.out.println("Maggi is out of stock");
		if(masalaQ==0)	
			System.out.println("Maggi is out of stock");
	}

	public static void main(String args[]) {
		ShopScanner shopscanner=new ShopScanner();
		shopscanner.getRequest();
	}
	
	
}
