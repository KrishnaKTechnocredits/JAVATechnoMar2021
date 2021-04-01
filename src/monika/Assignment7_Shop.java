package monika;
/*
 Assignment  7  : 30th March 2021 

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

public class Assignment7_Shop {
	int maggieanswer, dosaanswer, pouchesanswer, panipurianswer, masalaanswer;

	void setItemQuantity(int maggie, int dosa, int pouches, int panipuri, int masala) {
		maggieanswer = maggie;
		dosaanswer = dosa;
		pouchesanswer = pouches;
		panipurianswer = panipuri;
		masalaanswer = masala;
	}
	
	void inputFromBuyer(int m, int d, int p, int pp, int ml) {
		if(m>=1){
			if(m<= maggieanswer) {
				maggieanswer = maggieanswer-m;
				System.out.println("Thank you for purchasing "+m+" Qunatity");
			}else if(m> maggieanswer){
				System.out.println(+maggieanswer+ " Quantity selled, running out of stock and partial selling is allowed");
				maggieanswer = 0;
			}
		}else
			System.out.println("Please enter a valid value for maggie");
		if(d>=1) {	
			if(d<= dosaanswer) {
				dosaanswer = dosaanswer-d;
				System.out.println("Thank you for purchasing "+d+" Qunatity");
			}else if(d> dosaanswer){
				System.out.println(+dosaanswer+ " Quantity selled, running out of stock and partial selling is allowed");
				dosaanswer = 0;
			}
		}else
			System.out.println("Please enter a valid value dosa");
			
		if(p>=1) {	
			if(p<= pouchesanswer) {
				pouchesanswer = pouchesanswer-p;
				System.out.println("Thank you for purchasing "+p+" Qunatity");
			}else if(p> pouchesanswer){
				System.out.println(+pouchesanswer+ " Quantity selled, running out of stock and partial selling is allowed");
				pouchesanswer = 0;
			}
		}else
			System.out.println("Please enter a valid value pouches");
			
		if(pp>=1) {	
			if(pp<= panipurianswer) {
				panipurianswer = panipurianswer-pp;
				System.out.println("Thank you for purchasing "+pp+" Qunatity");
			}else if(pp> panipurianswer){
				System.out.println(+panipurianswer+ " Quantity selled, running out of stock and partial selling is allowed");
				panipurianswer = 0;
			}
		}else
			System.out.println("Please enter valid value panipuri");
			
		if(ml>=1) {	
			if(ml<= masalaanswer) {
				masalaanswer = masalaanswer-ml;
				System.out.println("Thank you for purchasing "+ml+" Qunatity");
			}else if(ml> masalaanswer){
				System.out.println(+masalaanswer+ " Quantity selled, running out of stock and partial selling is allowed");
				masalaanswer = 0;
			}
		}else 
			System.out.println("Please enter a valid value msalaa");
	}
	
	void outOfStockDisplay() {
		if(maggieanswer == 0 )
			System.out.println("Maggie Item is out of stock");
		else if(dosaanswer == 0)
			System.out.println("Dosa Item is out of stock");
		else if(pouchesanswer == 0)
			System.out.println("pouches Item is out of stock");
		else if(panipurianswer == 0)
			System.out.println("Panipuri Item is out of stock");
		else if(masalaanswer == 0)
			System.out.println("Masals Item is out of stock");
	}
	
	void availableInStockDisplay() {
		if(maggieanswer>0)
			System.out.println("Remaining quantity is: "+maggieanswer);
		if(dosaanswer>0)
			System.out.println("Remaining quantity is: "+dosaanswer);
		if(pouchesanswer>0)
			System.out.println("Remaining quantity is: "+pouchesanswer);
		if(panipurianswer>0)
			System.out.println("Remaining quantity is: "+panipurianswer);
		if(masalaanswer>0)
			System.out.println("Remaining quantity is: "+masalaanswer);
	}

	public static void main(String[] args) {
		Assignment7_Shop s = new Assignment7_Shop();
		s.setItemQuantity(20, 20, 20, 20, 20);
		s.inputFromBuyer(21,3,5,7,20);//please enter a valid value
		s.availableInStockDisplay();
		s.outOfStockDisplay();

	}
}
