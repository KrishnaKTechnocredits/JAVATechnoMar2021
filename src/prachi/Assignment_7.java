package prachi;

/*Assignment  7  : 30th March 2021 

1. Create a system (Shop) which maintains each item's quantity.

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

public class Assignment_7 {

	int maggieQ = 0;
	int dosaQ = 45;
	int pouchesQ= 39;
	int panipuriQ= 43;
	int masalasQ= 73;

	void setInitialQualtity(int maggie, int dosa, int pouches, int panipuri, int masalas) {
		maggieQ = maggie;
		dosaQ=dosa;
		pouchesQ=pouches;
		panipuriQ=panipuri;
		masalasQ=masalas;
	}

	void custRequest(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasalas) {

		if(maggieQ ==0)
			System.out.println("Maggie is running out of stock");
		else if(reqMaggie > maggieQ) 
			System.out.println("Partial selling of Maggie is allowed.");

		if(dosaQ ==0)
			System.out.println("Dosa is running out of stock.");
		else if(reqDosa > dosaQ)
			System.out.println("Partial selling of Dosa is allowed.");

		if(pouchesQ ==0)
			System.out.println("Pouches are running out of stock.");
		else if(reqPouches > pouchesQ)
			System.out.println("Partial selling of Pouches is allowed.");

		if(reqPanipuri ==0)
			System.out.println("Panipuri is running out of stock.");
		else if(reqPanipuri > panipuriQ)
			System.out.println("Partial selling of Panipuri is allowed.");

		if(reqMasalas ==0)
			System.out.println("Masala's is running out of stock.");
		else if(reqMasalas > masalasQ)
			System.out.println("Partial selling of Masala's is allowed.");


		else {
			if (reqMaggie <= maggieQ){
				maggieQ = maggieQ - reqMaggie;
				System.out.println("Remiaining stock of Maggie is: "+maggieQ);
			}

			if (reqDosa <= dosaQ){
				dosaQ = dosaQ - reqDosa;
				System.out.println("Remiaining stock of Dosa is: "+dosaQ);
			}

			if (reqPouches <= pouchesQ){
				pouchesQ = pouchesQ - reqPouches;
				System.out.println("Remiaining stock of Pouches is: "+pouchesQ);
			}

			if (reqPanipuri <= panipuriQ){
				panipuriQ = panipuriQ - reqPanipuri;
				System.out.println("Remiaining stock of Panipuri is: "+panipuriQ);
			}

			if (reqMasalas <= masalasQ){
				masalasQ = masalasQ - reqMasalas;
				System.out.println("Remiaining stock of Masala's is: "+masalasQ);		
			}
		}	
	}

	public static void main(String[] args) {
		Assignment_7 ass7 = new Assignment_7();
		ass7.custRequest(10,100,10,10,10);
	}
}

