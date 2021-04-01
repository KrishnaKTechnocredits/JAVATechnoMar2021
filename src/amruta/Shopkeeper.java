package amruta;

class Shopkeeper{
	String panipuri;
	int panipuriQuantity;
	String khakra;
	int khakraQuantity;
	
	void setInitialQuantity(int panipuri, int khakra){
		panipuriQuantity = panipuri;
		khakraQuantity = khakra;
	}
	void requestedQuantity(int reqpq, int reqkq, boolean PartialallowStatus){
		if(panipuriQuantity == 0){	
			System.out.println("Panipuri is out of stock");
		}else if(reqpq <= panipuriQuantity){
			panipuriQuantity = panipuriQuantity - reqpq;
		}else{
			
			System.out.println("Sorry we dont have sufficient quantity we can give you only "+panipuriQuantity);
			System.out.println("Actual quantity of Panipuri is "+panipuriQuantity+" Requested quantity of Panipuri is "+reqpq);
			
			if(PartialallowStatus){
				panipuriQuantity=0; 	
			}
		}
		
		if(khakraQuantity == 0){
			System.out.println("khakra is out of stock");
		}
		else if(reqkq <= khakraQuantity){
			khakraQuantity = khakraQuantity - reqkq;
		}else{
			
			System.out.println("Sorry we dont have sufficient quantity we can give you only "+khakraQuantity);
			System.out.println("Actual quantity of Khakra is "+khakraQuantity+" Requested quantity of Khakra is "+reqkq);
			
			if(PartialallowStatus){
				khakraQuantity=0; 	
			}else{
				System.out.println("Sorry for");
			}
		}
	}
	void display(){
		System.out.println("----------------------------------------------------------");
		System.out.println("Panipuri quantity : "+panipuriQuantity);
		System.out.println("khakra quantity : "+khakraQuantity);
		System.out.println("----------------------------------------------------------");
	}
	
	public static void main(String[] args){
	Shopkeeper shopkeeper = new Shopkeeper();
	shopkeeper.setInitialQuantity(100,100);
	shopkeeper.display();
	System.out.println("--------------------------First Order----------------------");
	shopkeeper.requestedQuantity(200,400,true);
	shopkeeper.display();
	System.out.println("--------------------------Second Order----------------------");
	shopkeeper.requestedQuantity(400,700,false);
	shopkeeper.display();
	}
}

