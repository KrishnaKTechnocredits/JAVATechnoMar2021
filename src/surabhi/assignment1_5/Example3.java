package surabhi.assignment1_5;
/*
 * 
 * Assignment num 2
 * */
class Example3{

	void simpleInterest(int amount, int year, double rate){
	double interest=amount*year*rate/100;
	System.out.println("Simple interest is :" +interest);
	}
	
	public static void main(String argsp[]){
	Example3 exm3=new Example3();
	exm3.simpleInterest(800, 3, 5.6); //134.4
	}
}