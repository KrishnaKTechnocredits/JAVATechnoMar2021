package gauravk;

public class ShopOrderingSystem {
	int stockCandy = 600;
	int stockWater = 200;
	
	void order(int orderCandy, int orderWater) {
		if(orderCandy >0) {
			if(orderCandy <= stockCandy) {
				System.out.println("Order accepted for "+orderCandy+" Candy(ies)");
				stockCandy = stockCandy - orderCandy;
				System.out.println("Remaining stock of candy: "+stockCandy);
			} else System.out.println("We can only provide you "+stockCandy+ " candies max. Please change and confirm order.");
		} else {System.out.println("Sorry order quantity of candy must be positive");}
		if(orderWater >0) {
			if(orderWater <= stockWater) {
				System.out.println("Order accepted for "+orderWater+" Water bottles");
				stockWater = stockWater - orderWater;
				System.out.println("Remaining stock of water bottles: "+stockWater);
			} else System.out.println("We can only provide you "+stockWater+ " water bottles max. Please change and confirm order.");
		} else {System.out.println("Sorry order quantity of water bottles must be positive");}
	}
	
	public static void main(String[] args) {
		ShopOrderingSystem shopOrderingSystem = new ShopOrderingSystem();
		shopOrderingSystem.order(70, 20);	
	}
}
