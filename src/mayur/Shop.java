/*. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.
2) Create a method which shows only those item which is "Out of stock".*/
package mayur;

public class Shop {
	int maggieQuant =50;
	int	dosaQuant =43;
	int oilQuant= 39;
	int panipuriQuant= 43;
	int masalaQuant = 73;

	void maggie(int reqMaggie) {
		System.out.println("\n Maggie Session : ");
		if(maggieQuant >0 && reqMaggie >0) {
			 if( maggieQuant>= reqMaggie) {
				maggieQuant = maggieQuant-reqMaggie;
				System.out.println( "reqMaggie" + "packets of Maggie has given");
				}
			 else if(maggieQuant <= reqMaggie) {
				 System.out.println("Only" + "maggieQuant" + "are available");
				 
			}
		}
		else
			System.out.println(" Maggie is Out of Stock");
	}

	void dosa(int reqDosa) {
		System.out.println("\n Dosa Session : ");
		if(dosaQuant >0 && reqDosa >0) {
			 if( dosaQuant>= reqDosa) {
				dosaQuant = dosaQuant-reqDosa;
				System.out.println("reqDosa" + " Dosa has been served");
				}
			 else if(dosaQuant <= reqDosa) {
				 System.out.println("Only " + "dosa_Quantity" + " dosa's available");
			}
		}
		else
			System.out.println(" Dosa is Out of Stock");
	}

	void oil(int reqOil) {
		System.out.println("\n Oil  Session : ");
		if(oilQuant >0 && reqOil >0) {
			 if( oilQuant>= reqOil) {
				oilQuant = oilQuant-reqOil;
				System.out.println("reqOil" +  "packets of Oil has given");
				}
			 else if(oilQuant <= reqOil) {
				 System.out.println("We have only " + "oilQuant" + " Oil Pouches's available");
				}
		}
		else
			System.out.println(" Oil Packets are Out of Stock");
	}

	void panipuri(int reqPanipuri) {
		System.out.println(" Panipuri Session : ");
		if(panipuriQuant >0 && reqPanipuri >0) {
			 if( panipuriQuant>= reqPanipuri) {
				panipuriQuant = panipuriQuant-reqPanipuri;
				System.out.println(" We have given "+reqPanipuri+ " of panipuri packets");
				}
			 else if(panipuriQuant <= reqPanipuri) {
				 System.out.println(" We have only " + "panipuri_Quant" + "panipuri's available");
				 
			}
		}
		else
			System.out.println("Panipuri is Out of Stock");
	}

	void masala(int reqMasala) {
		System.out.println(" Masala Session : ");
		if(masalaQuant >0 && reqMasala >0) {
			 if( masalaQuant>= reqMasala) {
				masalaQuant = masalaQuant-reqMasala;
				System.out.println(" We have given"  +"reqMasala" + "packets of masala's");
				}
			 else if(masalaQuant <= reqMasala) {
				 System.out.println(" We have only" + "masalaQuant" + "packets of  masala available");
				 
			}
		}
		else
			System.out.println("Masala is Out of Stock");
	}

	void outOfStock() {
		System.out.println("\n---------- Out of Stock Items are -------\n");
		if(maggieQuant ==0) 
			System.out.println(" Maggie");
		if(dosaQuant ==0) 
			System.out.println(" Dosa");
		if(oilQuant ==0) 
			System.out.println(" Oil Packets ");
		if(panipuriQuant ==0) 
			System.out.println(" Panipuri");
		if(masalaQuant ==0) 
			System.out.println("Masala");
	}

	void availableItems()
	{
		System.out.println("\n---------- Available Stock Quantity -------\n");
		System.out.println(" Maggie - " +maggieQuant);
		System.out.println(" Dosa - " +dosaQuant);
		System.out.println(" Oil Pouches - " +oilQuant);
		System.out.println(" Panipuri Packets - " +panipuriQuant);
		System.out.println(" Masala - " +masalaQuant);
	}
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.maggie(52);
		shop.dosa(40);
		shop.oil(30);
		shop.panipuri(63);
		shop.masala(100);
		shop.outOfStock();
		shop.availableItems();
		

}
}
