package sangeeta;

public class Shop {
	int MaggieQ = 50;
	int DosaQ = 43;
	int Oil_PoucheQ = 39;
	int PanipuriQ = 43; 
	int Masala_PacketQ = 73;
	String Maggie, Dosa, Oil_Pouche, Panipuri, Masala_Packet;
	
	void requestedQuantity(int reqMaggieQ, int reqDosaQ, int reqOil_PoucheQ, int reqPanipuriQ, int reqMasala_PacketQ) {
			if(reqMaggieQ<=MaggieQ)
				MaggieQ = MaggieQ - reqMaggieQ;
			if(reqDosaQ<=DosaQ)
				DosaQ = DosaQ - reqDosaQ;
			if(reqOil_PoucheQ<=Oil_PoucheQ)
				Oil_PoucheQ = Oil_PoucheQ - reqOil_PoucheQ;
			if(reqPanipuriQ<=PanipuriQ)
				PanipuriQ = PanipuriQ - reqPanipuriQ;
			if(reqMasala_PacketQ<=Masala_PacketQ)
				Masala_PacketQ = Masala_PacketQ - reqMasala_PacketQ;
	}
	
	void outOfStockItems() {
			if(MaggieQ==0 || DosaQ ==0 || Oil_PoucheQ == 0 || PanipuriQ == 0 || Masala_PacketQ == 0)
				System.out.println("Sorry,"+ MaggieQ+" Maggie running out of stock");
				System.out.println("Sorry,"+ DosaQ+" Dosa running out of stock");
				System.out.println("Sorry,"+ Oil_PoucheQ+" Oil Pouche running out of stock");
				System.out.println("Sorry,"+ PanipuriQ +" Panipuri running out of stock");
				System.out.println("Sorry,"+ Masala_Packet +" Masala Packets running out of stock");
				}
	
	void availableStock() {
		if(MaggieQ!=0 || DosaQ !=0 || Oil_PoucheQ != 0 || PanipuriQ != 0 || Masala_PacketQ != 0)
			System.out.println("Available quantily for Maggie is "+ MaggieQ);
			System.out.println("Available quantily for Dosa is "+ DosaQ);
			System.out.println("Available quantily for Oil_Pouche is "+ Oil_PoucheQ);
			System.out.println("Available quantily for Panipuri is "+ PanipuriQ);
			System.out.println("Available quantily for Masala_Packet is "+ Masala_PacketQ);
			}
	
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.requestedQuantity(30,40,60,25,80);
		shop.outOfStockItems();
		shop.availableStock();
}
	
}
