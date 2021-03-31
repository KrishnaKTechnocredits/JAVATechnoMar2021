package meenu;

public class TestDisplay {
   String name;
 
   void setName(String personName) {
	   name = personName;
   }
   
   void dispaly() {
	   System.out.println("Name is "+name);
   }
  
   public static void main(String[] args) {
	   TestDisplay testDisplay = new TestDisplay();
	   testDisplay.setName("Meenu");
	   testDisplay.dispaly();

	}

}
