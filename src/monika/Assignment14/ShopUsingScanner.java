package monika.Assignment14;
/*
 Assignment  14 using scanner class 

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
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */

import java.util.Scanner;

public class ShopUsingScanner {
	int maggieCount, dosaCount, pouchesCount, panipuriCount, masalaCount;

/*	void setItemQuantity(int maggie, int dosa, int pouches, int panipuri, int masala) {
		maggieCount = maggie;
		dosaCount = dosa;
		pouchesCount = pouches;
		panipuriCount = panipuri;
		masalaCount = masala;
	}*/
	
	void inputFromBuyer(int m, int d, int p, int pp, int ml) {
		if(m>=1){
			if(m<= maggieCount) {
				maggieCount = maggieCount-m;
				System.out.println("Thank you for purchasing "+m+" Qunatity of maggie");
			}else if(m> maggieCount){
				System.out.println(maggieCount+" Quantity of maggie is sold and "+(m - maggieCount)+" is running out of stock.");
				maggieCount = 0;
			}
		}else
			System.out.println("Please enter a valid value for maggie");
		if(d>=1) {	
			if(d<= dosaCount) {
				dosaCount = dosaCount - d;
				System.out.println("Thank you for purchasing "+d+" Qunatity");
			}else if(d> dosaCount){
				System.out.println(dosaCount+" Quantity of dosa is sold and "+(d-dosaCount)+" is running out of stock.");
				dosaCount = 0;
			}
		}else
			System.out.println("Please enter a valid value dosa");
			
		if(p>=1) {	
			if(p<= pouchesCount) {
				pouchesCount = pouchesCount-p;
				System.out.println("Thank you for purchasing "+p+" Qunatity");
			}else if(p> pouchesCount){
				System.out.println(pouchesCount +" Quantity of pouches are sold and "+(p-pouchesCount)+" is running out of stock.");
				pouchesCount = 0;
			}
		}else
			System.out.println("Please enter a valid value pouches");
			
		if(pp>=1) {	
			if(pp<= panipuriCount) {
				panipuriCount = panipuriCount - pp;
				System.out.println("Thank you for purchasing "+pp+" Qunatity");
			}else if(pp> panipuriCount){
				System.out.println(panipuriCount+" Quantity of panipuri is sold and "+(pp-panipuriCount)+" is running out of stock.");
				panipuriCount = 0;
			}
		}else
			System.out.println("Please enter valid value panipuri");
			
		if(ml>=1) {	
			if(ml<= masalaCount) {
				masalaCount = masalaCount - ml;
				System.out.println("Thank you for purchasing "+ml+" Qunatity");
			}else if(ml> masalaCount){
				System.out.println(masalaCount+" Quantity of masala is sold and "+(ml-masalaCount)+" is running out of stock.");
				masalaCount = 0;
			}
		}else 
			System.out.println("Please enter a valid value msalaa");
	}
	
	void outOfStockDisplay() {
		if(maggieCount == 0 )
			System.out.println("Maggie Item is out of stock");
		if(dosaCount == 0)
			System.out.println("Dosa Item is out of stock");
		if(pouchesCount == 0)
			System.out.println("pouches Item is out of stock");
		if(panipuriCount == 0)
			System.out.println("Panipuri Item is out of stock");
		if(masalaCount == 0)
			System.out.println("Masala Item is out of stock");
	}
	
	void availableInStockDisplay() {
		if(maggieCount>0)
			System.out.println("Maggies remaining quantity is: "+maggieCount);
		if(dosaCount>0)
			System.out.println("Dosas remaining quantity is: "+dosaCount);
		if(pouchesCount>0)
			System.out.println("POuches remaining quantity is: "+pouchesCount);
		if(panipuriCount>0)
			System.out.println("Panipuris remaining quantity is: "+panipuriCount);
		if(masalaCount>0)
			System.out.println("Masalas remaining quantity is: "+masalaCount);
	}

	public static void main(String[] args) {
		ShopUsingScanner obj = new ShopUsingScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Initilizae the quantity of maggie, dosa, pouches, panipuri, masala");
		obj.maggieCount = sc.nextInt();
		obj.dosaCount = sc.nextInt();
		obj.pouchesCount = sc.nextInt();
		obj.panipuriCount = sc.nextInt();
		obj.masalaCount = sc.nextInt();
		System.out.println("How much you want to puchase maggie, dosa, pouches, panipuri, masala?");
		obj.inputFromBuyer(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()); //please enter a valid value
		obj.availableInStockDisplay();
		obj.outOfStockDisplay();
		System.out.println("How much you want to puchase maggie, dosa, pouches, panipuri, masala?");
		obj.inputFromBuyer(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()); //please enter a valid value
		obj.availableInStockDisplay();
		obj.outOfStockDisplay();
		System.out.println("Initilizae the quantity of maggie, dosa, pouches, panipuri, masala");
		obj.maggieCount = sc.nextInt();
		obj.dosaCount = sc.nextInt();
		obj.pouchesCount = sc.nextInt();
		obj.panipuriCount = sc.nextInt();
		obj.masalaCount = sc.nextInt();
		System.out.println("How much you want to puchase maggie, dosa, pouches, panipuri, masala?");
		obj.inputFromBuyer(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()); //please enter a valid value
		obj.availableInStockDisplay();
		obj.outOfStockDisplay();
	}
}
