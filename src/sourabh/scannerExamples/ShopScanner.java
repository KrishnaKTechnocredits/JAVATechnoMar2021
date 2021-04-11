/*1. Create a system (Shop) which maintains each item's quantity.

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
3) Create a method which shows only those item which is "Available in stock" & respective quantities.*/

package sourabh.scannerExamples;

import java.util.Scanner;

public class ShopScanner {
	int maggieQty=0;
	int dosaQty=0;
	int oilPacketsQty=0;
	int panipuriQty=0;
	int masalaQty=0;
	void setQuantities(int maggieQtyini, int dosaQtyini, int oilPacketsQtyini,int panipuriQtyini, int masalaQtyini) {
		maggieQty= maggieQtyini; 
		dosaQty= dosaQtyini;
		oilPacketsQty= oilPacketsQtyini;
		panipuriQty= panipuriQtyini;
		masalaQty= masalaQtyini;
	}
	void customerShopping(int maggieQtyReq, int dosaQtyReq, int oilPacketsQtyReq, int panipuriQtyReq, int masalaQtyReq) {
		//Maggie
		if(maggieQtyReq>maggieQty) {
			System.out.println("Maggie running out of stock, you can purchase only "+maggieQty+" Maggie packets.");
			int maggieQtyNew= maggieQtyReq- maggieQty;
			System.out.println("We can provide you only "+maggieQty+" Maggie packets remaining "+maggieQtyNew+" you can buy later.");
			maggieQty=0;
		}
		else if(maggieQtyReq< maggieQty) {
			System.out.println("You have purchased :"+maggieQtyReq);
			maggieQty= maggieQty-maggieQtyReq;
			System.out.println("Remaining Maggie packets :"+maggieQty);			
		}
		else if(maggieQtyReq==maggieQty) {
			System.out.println("You have purchased all Maggie Packets !!");
			maggieQty= 0;
		}
		
		//Dosa
		
		if(dosaQtyReq>dosaQty) {
			System.out.println("dosa running out of stock, you can purchase only "+dosaQty+" dosa packets.");
			int dosaQtyNew= dosaQtyReq- dosaQty;
			System.out.println("We can provide you only "+dosaQty+" dosa packets remaining "+dosaQtyNew+" you can buy later.");
			dosaQty=0;
		}
		else if(dosaQtyReq< dosaQty) {
			System.out.println("You have purchased dosa packets:"+dosaQtyReq);
			dosaQty= dosaQty-dosaQtyReq;
			System.out.println("Remaining dosa packets :"+dosaQty);			
		}
		else if(dosaQtyReq==dosaQty) {
			System.out.println("You have purchased all dosa Packets !!");
			dosaQty= 0;
		}
		
		//oil packets
		
		if(oilPacketsQtyReq>oilPacketsQty) {
			System.out.println("Oil packets running out of stock, you can purchase only "+oilPacketsQty+" oil packets.");
			int oilPacketsQtyNew= oilPacketsQtyReq- oilPacketsQty;
			System.out.println("We can provide you only "+oilPacketsQty+" oil packets remaining "+oilPacketsQtyNew+" you can buy later.");
			oilPacketsQty=0;
		}
		else if(oilPacketsQtyReq< oilPacketsQty) {
			System.out.println("You have purchased oil packets:"+oilPacketsQtyReq);
			oilPacketsQty= oilPacketsQty-oilPacketsQtyReq;
			System.out.println("Remaining oil packets :"+oilPacketsQty);			
		}
		else if(oilPacketsQtyReq==oilPacketsQty) {
			System.out.println("You have purchased all oil Packets !!");
			oilPacketsQty= 0;
		}
		//panipuri
		if(panipuriQtyReq>panipuriQty) {
			System.out.println("Panipuri running out of stock, you can purchase only "+panipuriQty+" Panipuri packets.");
			int panipuriQtyNew= panipuriQtyReq- panipuriQty;
			System.out.println("We can provide you only "+panipuriQty+" Panipuri packets remaining "+panipuriQtyNew+" you can buy later.");
			panipuriQty=0;
		}
		else if(panipuriQtyReq< panipuriQty) {
			System.out.println("You have purchased panipuri packets:"+panipuriQtyReq);
			panipuriQty= panipuriQty-panipuriQtyReq;
			System.out.println("Remaining panipuri packets :"+panipuriQty);			
		}
		else if(panipuriQtyReq==panipuriQty) {
			System.out.println("You have purchased all panipuri Packets !!");
			panipuriQty= 0;
		}
		//Masala
		if(masalaQtyReq>masalaQty) {
			System.out.println("Masala running out of stock, you can purchase only "+masalaQty+" masala packets.");
			int masalaQtyNew= masalaQtyReq- masalaQty;
			System.out.println("We can provide you only "+masalaQty+" masala packets remaining "+masalaQtyNew+" you can buy later.");
			masalaQty=0;
		}
		else if(masalaQtyReq< masalaQty) {
			System.out.println("You have purchased masala packets:"+masalaQtyReq);
			masalaQty= masalaQty-masalaQtyReq;
			System.out.println("Remaining Masala packets :"+masalaQty);			
		}
		else if(masalaQty==masalaQtyReq) {
			System.out.println("You have purchased all Masala Packets !!");
			masalaQty= 0;
		}		
	}
	void outOfStock() {
		if(maggieQty==0)
			System.out.println("Maggie out of Stock !!");
		if(dosaQty==0)
			System.out.println("Dosa out of Stock !!");
		if(oilPacketsQty==0)
			System.out.println("Oil packet out of Stock !!");
		if(panipuriQty==0)
			System.out.println("Panipuri out of Stock !!");
		if(masalaQty==0)
			System.out.println("Masala packet out of Stock !!");	
	}
	void availableInStock() {
		if(maggieQty>0)
			System.out.println("Maggie available: "+maggieQty);
		if(dosaQty>0)
			System.out.println("Dosa available: "+dosaQty);
		if(oilPacketsQty>0)
			System.out.println("Oil packet available: "+oilPacketsQty);
		if(panipuriQty>0)
			System.out.println("Panipuri available: "+panipuriQty);
		if(masalaQty>0)
			System.out.println("Masala available: "+masalaQty);
	}
	public static void main(String[] args) {
		ShopScanner shopScanner= new ShopScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Initial stocks for Maggie: ");
		int maggieQty= scanner.nextInt();		
		System.out.println("Enter Initial stocks for dosa: ");
		int dosaQty= scanner.nextInt();				
		System.out.println("Enter Initial stocks for Oil packets: ");
		int oilPacketsQty= scanner.nextInt();	
		System.out.println("Enter Initial stocks for panipuri packets: ");
		int panipuriQty= scanner.nextInt();
		System.out.println("Enter Initial stocks for masala packets: ");
		int masalaQty= scanner.nextInt();
		shopScanner.setQuantities(maggieQty,dosaQty,oilPacketsQty,panipuriQty,masalaQty);
		//-------------------------------------
		
		System.out.println("Enter requested quantity for Maggie: ");
		int maggieQtyReq= scanner.nextInt();
		System.out.println("Enter requested quantity for Dosa: ");
		int dosaQtyReq= scanner.nextInt();
		System.out.println("Enter requested quantity for Oil packets: ");
		int oilPacketsQtyReq= scanner.nextInt();
		System.out.println("Enter requested quantity for panipuri packets: ");
		int panipuriQtyReq= scanner.nextInt();
		System.out.println("Enter requested quantity for masala packets: ");
		int masalaQtyReq= scanner.nextInt();
		shopScanner.customerShopping(maggieQtyReq,dosaQtyReq,oilPacketsQtyReq,panipuriQtyReq,masalaQtyReq);
		//----------------------------------------
		
		shopScanner.outOfStock();
		shopScanner.availableInStock();
	}
}