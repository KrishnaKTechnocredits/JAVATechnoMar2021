package kapil;

class Human{

    String Name;
	boolean Speak;
	int Age;
	
	void human( String A, boolean B, int C){
	    Name = A;
		Speak = B;
		Age = C;
		}
	void showDetails(){
	      System.out.println(" Name = "+Name);
		  System.out.println(" Human can speak = "+Speak);
		  System.out.println(" Human age = "+Age);
		 }
	public static void main (String[] args){
	     Human human1 = new Human();
		 human1.human("Harish",true,23);
		 human1.showDetails();
		 }	 
}	 