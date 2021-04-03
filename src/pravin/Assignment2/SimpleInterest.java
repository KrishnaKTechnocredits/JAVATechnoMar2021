/*Assignment no 2
Write a Java program to compute simple interest   
Simple Interest = (P x T x R)/100 
Where,P is the principle amount T is the time [year] and R is the rate*/
package pravin.Assignment2;
class SimpleInterest {

	void Interest (int Num1,int Num2,int Num3){
		int  P = Num1;
		int  T = Num2;
		int  R = Num3;
		int Interest = (P * T * R)/100;

		System.out.println("Simple Interest is " +Interest);
	}
	public static void main(String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.Interest (10,20,30);
	}
}


