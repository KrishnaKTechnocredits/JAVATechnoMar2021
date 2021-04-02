package  kapil;

public class Shop{
	
	String maggie;
    int maggieQ;
    
    String dosa;
    int dosaQ;
    
    String pouches;
    int pouchesQ;
    
    String panipuri;
    int panipuriQ;
    
    String masala;
    int masalaQ;
    
    void setintialQ(int maggie, int dosa, int pouches, int panipuri, int masala ) {
    	maggieQ = maggie;
    	dosaQ = dosa;
    	pouchesQ = pouches;
    	panipuriQ = panipuri;
    	masalaQ = masala;
    	
    }
    
    void outStockQ(int reqmaggie, int reqdosa) {
         if(reqmaggie >= maggieQ)
        	  System.out.println("maggie is out of stock");
         if (reqdosa >= dosaQ )
        	 System.out.println("dosa is out of stock");
    }
    
    void requestedQ(int reqpouches, int reqpanipuri, int reqmasala) {
    	if (reqpouches <= pouchesQ) {
    		pouchesQ = pouchesQ - reqpouches;
    	}else {
    		
    		System.out.println("Not sufficent Q"  + " but give you partial " +reqpouches);
    		pouchesQ = 0;
    	}
    	if (reqpanipuri <= panipuriQ) {
    System.out.println("panipuri avilabe stock is " + panipuriQ + " and reqested is " +reqpanipuri);
    	}
    	if (reqmasala <= masalaQ) {
    		System.out.println("masala avilabe stock is " + masalaQ + " and reqested is " +reqmasala);
    	} 		
    	} 
    	
    public static void main (String[] args) {
    	Shop shop = new Shop();
    	shop.setintialQ(50,43,39,43,73);
    	shop.outStockQ(51,62);
    	shop.requestedQ(41,39,70);
    }
    
     
}
