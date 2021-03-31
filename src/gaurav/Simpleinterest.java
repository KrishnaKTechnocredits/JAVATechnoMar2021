package gaurav;

//Write a Java program to compute simple interest   
//Assignment 2

class Simpleinterest{

   void compute(int p,int t,double r){
     double interest=(p*t*r)/100;
	 System.out.println("calculate simple interest" +interest);
    }
	public static void main(String[]args){
	  Simpleinterest simpleinterest1= new Simpleinterest();
	  simpleinterest1.compute(25,6,3.6);
	  }
}	  