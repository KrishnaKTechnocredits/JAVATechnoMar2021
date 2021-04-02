package gaurav;

public class Shop {
	String maggi;
	int maggiQty;
	String dosa;
	int dosaQty;
	String pouches;
	int pouchesQty;
	String panipuri;
	int panipuriQty;
	String masala;
	int masalaQty;

	void initialQty(int maggi, int dosa, int pouches, int panipuri, int masala) {
		maggiQty = maggi;
		dosaQty = dosa;
		pouchesQty = pouches;
		panipuriQty = panipuri;
		masalaQty = masala;
	}

	void requestQty(int maggi, int dosa, int pouches, int panipuri, int masala) {
		maggiQty = maggiQty - maggi;
		dosaQty = dosaQty - dosa;
		pouchesQty = pouchesQty - pouches;
		panipuriQty = panipuriQty - panipuri;
		masalaQty = masalaQty - masala;
	}
	
	void availbleStock(){
		System.out.println("######Availble Stock#######");
		
		if(maggiQty>0)
			System.out.println(" maggi :" +maggiQty);
		if(dosaQty>0)
			System.out.println(" dosa :" +dosaQty);
		if(pouchesQty>0)
			System.out.println(" pouches :" +pouchesQty);
		if(panipuriQty>0)
			System.out.println(" panipuri :" +panipuriQty);
		if(masalaQty>0)
			System.out.println(" masala :" +masalaQty);
	}
	
	void outOfStock(){
		System.out.println("#######outOfStock#####");
		if(maggiQty==0)
			System.out.println(" maggi :" +maggiQty);
		if(dosaQty==0)
			System.out.println(" dosa :" +dosaQty);
		if(pouchesQty==0)
			System.out.println(" pouches :"+pouchesQty);
		if(panipuriQty==0)
			System.out.println(" panipuri :" +panipuriQty);
		if(masalaQty==0)
			System.out.println(" masala :" +masalaQty);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop1 = new Shop();
		shop1.initialQty(50, 43, 39, 43, 73);
		shop1.requestQty(20,43,20,43,50);
		shop1.availbleStock();
		shop1.outOfStock();
	}

}
