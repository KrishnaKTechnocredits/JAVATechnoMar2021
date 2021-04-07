package gaurav;

//Assignment 1

class Calculater {
     int x = 20;
	 int y = 5;
	 
	 void add(){
	    int answer = x+y;
		System.out.println("addtion of two variable is "+answer);
	
    }
	  void sub(){
	    int answer = x-y;
		System.out.println("sub of two variable is "+answer);
		}
	 
	 void muti(){
	    int answer = x*y;
		System.out.println("muti of two variable "+answer);
		}
		
		public static void main(String[]args){
		Calculater calculater1 = new Calculater();
		calculater1.add();
		calculater1.sub();
		calculater1.muti();
		
	 
	 }
}