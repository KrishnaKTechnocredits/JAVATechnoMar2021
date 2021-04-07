//Assignment  7  : 30th March 2021 

//Create a system (Shop) which maintains each item's quantity.

package shilpa;

public class Shop {
	int maggieQuantity, dosaQuantity, oilQuantity, panipuriQuantity, masalaQuantity;
	
	void Inventory(int maggie,int dosa, int oil,int panipuri,int masala ) {
		maggieQuantity = maggie;
		dosaQuantity = dosa;
		oilQuantity = oil;
		panipuriQuantity = panipuri;
		masalaQuantity = masala;	
	}
	
	void customer(int maggieOrder,int dosaOrder, int oilOrder,int panipuriOrder,int masalaOrder) {
		if(maggieQuantity == 0) 
		{
			System.out.println("Maggie Packets running out of stock");
		}
		
		else if(maggieQuantity < maggieOrder)
		{
			int remainingmaggy = maggieOrder - maggieQuantity;
			System.out.println("Sorry we have only "+maggieQuantity+" packets of maggie available, please purchase "+remainingmaggy+" Packets later.");
			maggieQuantity = 0;
		}else 
		{
			maggieQuantity=maggieQuantity-maggieOrder;
		}
	
		
		if(dosaQuantity == 0)
		{
			System.out.println("Dosa Packets running out of stock");
		}
		else if(dosaQuantity < dosaOrder)
		{
			int remainingdosa = dosaOrder-dosaQuantity;
			System.out.println("Sorry we have only "+dosaQuantity+" packets of Dosa available, please purchase "+remainingdosa+" Packets later.");
			dosaQuantity = 0;
		}
		else 
		{
			dosaQuantity=dosaQuantity-dosaOrder;
		}
		

		if(oilQuantity == 0)
		{
			System.out.println("Oil Packets running out of stock");
		}
		else if(oilQuantity < oilOrder)
		{
			int remainingoil = oilOrder - oilQuantity;
			System.out.println("Sorry we have only "+oilQuantity+" packets of Oil available, please purchase "+remainingoil+" Packets later.");
			oilQuantity = 0;
		}
		else 
		{
			oilQuantity=oilQuantity-oilOrder;
		}
		

		if(panipuriQuantity == 0)
		{
			System.out.println("Panipuri Packets running out of stock");
		}
		else if(panipuriQuantity < panipuriOrder)
		{
			int remainingpanipuri = panipuriOrder - panipuriQuantity;
			System.out.println("Sorry we have only "+panipuriQuantity+" packets of Panipuri available, please purchase "+remainingpanipuri+" Packets later.");
			panipuriQuantity = 0;
		}
		
		
		else 
		{
			panipuriQuantity=panipuriQuantity-panipuriOrder;
		}

		
		if(masalaQuantity == 0)
		{
			System.out.println("Masala Packets running out of stock");
		}
		else if(masalaQuantity < masalaOrder)
		{
			int remainingmasala = masalaOrder - masalaQuantity;
			System.out.println("Sorry we have only "+masalaQuantity+" packets of Masala available, Please purchase "+remainingmasala+" Packets later.");
			masalaQuantity = 0;
		}
		else 
		{
			masalaQuantity=masalaQuantity-masalaOrder;
		}
	}
	
	void OutOfStockItems()
	{
		
		System.out.println("Out of stock items");
		if(maggieQuantity == 0)
		{
			System.out.println("Maggie");
		}
		
		if(dosaQuantity == 0)
		{
			System.out.println("Dosa Packets");
		}
		
		if(oilQuantity == 0)
		{
			System.out.println("Oil Packets");
		}
		
		if(panipuriQuantity == 0)
		{
			System.out.println("Panipuri Packets");
		}
		
		if(masalaQuantity == 0)
		{
			System.out.println("Masala Packets");
		}
		
	}
	
	void ItemsInStock() {
		System.out.println("Items in Stock");
		if(maggieQuantity > 0)
		{
			System.out.println("Maggie Packets - " +maggieQuantity);
		}
		
		if(dosaQuantity > 0)
		{
			System.out.println("Dosa Packets - " + dosaQuantity);
		}
		
		if(oilQuantity > 0)
		{
			System.out.println("Oil Packets - " + oilQuantity);
		}
		
		if(panipuriQuantity > 0)
		{
			System.out.println("Panipuri Packets - "+ panipuriQuantity);
		}
		
		if(masalaQuantity > 0)
		{
			System.out.println("Masala Packets - "+ masalaQuantity);
		}
		
	}
	
	public static void main(String[] args) {
	Shop shop = new Shop();
	shop.Inventory(0,43,50,43,73);
	shop.customer(10,45,25,40,100);
	System.out.println(" ");
	shop.OutOfStockItems();
	System.out.println(" ");
	shop.ItemsInStock();
		
	}
			
	

}
