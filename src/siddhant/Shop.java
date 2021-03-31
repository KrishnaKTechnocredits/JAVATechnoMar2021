package siddhant;

public class Shop{
	int maggie;
	int dosa;
	int masala;
	int panipuri;
	int pouches;
	void setinitial(int maggie1, int dosa1, int masala1, int panipuri1, int pouches1){
		maggie = maggie1;
		dosa = dosa1;
		masala = maggie1;
		panipuri = panipuri1;
		pouches = pouches1;
	}
	void Requestedquantity(int reqmaggie1,int reqdosa1, int reqmasala1, int reqpanipuri1, int reqpouches1){
		if(reqdosa1<=dosa){
			dosa=dosa - reqdosa1;
		}else{
			System.out.println("Sorry not sufficient quantity we can only give you : " +dosa);
			System.out.println("Product " +dosa+ " running out of stock");
			dosa =0;
		}if(reqmaggie1<=maggie){
			maggie = maggie - reqmaggie1;
		}else{
			System.out.println("Sorry not sufficient quantity we can only give you : " +maggie);
			System.out.println("Product " +maggie+ " running out of stock");
			maggie =0;
		}if(reqmasala1 <= masala){
			masala =masala - reqmasala1;
		}else{
			System.out.println("Sorry not sufficient quantity we can only give you : " +masala);
			System.out.println("Product " +masala+ " running out of stock");
			masala =0;
		}if(reqpanipuri1 <=panipuri){
			panipuri = panipuri - reqpanipuri1;
		}else{
			System.out.println("Sorry not sufficient quantity we can only give you : " +panipuri);
			System.out.println("Product " +panipuri+ " running out of stock");
			panipuri =0;
		}if(reqpouches1<=pouches){
			pouches = pouches - reqpouches1;
		}else{
			System.out.println("Sorry not sufficient quantity we can only give you : " +pouches);
			System.out.println("Product " +pouches+ " running out of stock");
			pouches=0;
		}
	}
	void display(){
		System.out.println("Panipuri remaining in the stock is : " +panipuri);
		System.out.println("Maggie remaining in the stock is : " +maggie);
		System.out.println("Dosa remaining in the stock is : " +dosa);
		System.out.println("Masala remaining in the stock is : " +masala);
		System.out.println("Pouches remaining in the stock is : " +pouches);
	}
	public static void main(String[]args){
		Shop shop1 = new Shop();
		shop1.setinitial(50,43,73,43,39);
		shop1.display();
		shop1.Requestedquantity(50,40,73,40,39);
		shop1.display();
	}
}
		
	
		
		