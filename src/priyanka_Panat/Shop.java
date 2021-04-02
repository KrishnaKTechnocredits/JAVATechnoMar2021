package priyanka_Panat;

/*
 Assignment 7
 */
public class Shop{
	int maggieQuantity;
	int dosaQuantity;
	int oilQuantity;
	int panipuriQuantity;
	int masalaQuantity;
	
	void setQuantity(int maggie,int dosa,int oil,int panipuri,int masala){
		maggieQuantity=maggie;
		dosaQuantity=dosa;
		oilQuantity=oil;
		panipuriQuantity=panipuri;
		masalaQuantity=masala;
	}
	
	void customerShopping(int maggieQty,int dosaQty,int oilQty,int panipuriQty,int masalaQty){
			if(maggieQty>0){
				if(maggieQty<=maggieQuantity){
					int leftmaggie=maggieQuantity-maggieQty;
					System.out.println("Sorry we have only" + maggieQuantity + " packets of maggie available ,please purchase " + leftmaggie + "packets later.");
				}
				else{
					System.out.println("Maggie packets sold are"+maggieQuantity);
					maggieQuantity=0;
				}
			}
			else
				System.out.println("Maggie packets cannot be less than 0");
			
			if(dosaQty>0){
				if(dosaQty<=dosaQuantity){
					int leftdosa=dosaQuantity-dosaQty;
					System.out.println("Sorry we have only" + dosaQuantity + " packets of dosa available ,please purchase " + leftdosa + "packets later.");
				}
				else{
					System.out.println("Dosa packets sold are"+dosaQuantity);
					dosaQuantity=0;
				}
			}
			else
				System.out.println("Dosa packets cannot be less than 0");
			
			if(oilQty>0){
				if(oilQty<=oilQuantity){
					int leftoil=oilQuantity-oilQty;
					System.out.println("Sorry we have only" + oilQuantity + " packets of oil available ,please purchase " + leftoil + "packets later.");
				}
				else{
					System.out.println("Oil packets sold are"+oilQuantity);
					oilQuantity=0;
				}
			}
			else
				System.out.println("Oil packets cannot be less than 0");
			
			if(panipuriQty>0){
				if(panipuriQty<=panipuriQuantity){
					int leftpanipuri=panipuriQuantity-panipuriQty;
					System.out.println("Sorry we have only" + panipuriQuantity + " packets of panipuri available ,please purchase " + leftpanipuri + "packets later.");
				}
				else{
					System.out.println("PaniPuri packets sold are"+oilQuantity);
					panipuriQuantity=0;
				}
			}
			else
				System.out.println("PaniPuri packets cannot be less than 0");
			
			if(masalaQty>0){
				if(maggieQty<=maggieQuantity){
					int leftmasala=maggieQuantity-maggieQty;
					System.out.println("Sorry we have only" + maggieQuantity + " packets of masala available ,please purchase " + leftmasala + "packets later.");
				}
				else{
					System.out.println("Masala packets sold are"+masalaQuantity);
					maggieQuantity=0;
				}
			}
			else
				System.out.println("Masala packets cannot be less than 0");
	}
	
	void inStock(){
		System.out.println("Items that are in stock are:");
		if(maggieQuantity>0)
			System.out.println("Maggie available in stock"+maggieQuantity);
		if(dosaQuantity>0)
			System.out.println("Dosa available in stock"+dosaQuantity);
		if(oilQuantity>0)
			System.out.println("Oil available in stock"+oilQuantity);
		if(panipuriQuantity>0)
			System.out.println("Panipuri available in stock"+panipuriQuantity);
		if(masalaQuantity>0)
			System.out.println("Panipuri available in stock"+masalaQuantity);
	}
	
	void outOfStock(){
		if(maggieQuantity==0)
			System.out.println("Maggie is out of stock");
		if(dosaQuantity==0)
			System.out.println("Dosa is out of stock");
		if(oilQuantity==0)
			System.out.println("Oil is out of stock");
		if(panipuriQuantity==0)
			System.out.println("PaniPuri is out of stock");
		if(masalaQuantity==0)
			System.out.println("Masala Quantity is out of stock");
	}
	
	public static void main(String[] args){
		Shop s1=new Shop();
		s1.setQuantity(50,43,39,43,73);
		s1.customerShopping(0,20,30,40,-50);
		s1.inStock();
		s1.outOfStock();
	}
}
					