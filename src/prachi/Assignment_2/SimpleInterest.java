package prachi.Assignment_2;

//Assignment_2_Program_3
//3. Write a Java program to compute simple interest   
//	Simple Interest = (P x T x R)/100 
//	Where, 
//	P is the principle amount 
//	T is the time [year] and 
//	R is the rate

class SimpleInterest{
	int p =15;
	int t = 2;
	int r = 10;
	int x =100;
	
	void CalculateSimpleInterest(int num1, int num2, int num3, int num4){
		double CalculateSimpleInterest = p*t*r/x;
		System.out.println("Simple Interest is: "+CalculateSimpleInterest);
	}
	
	public static void main(String[] args){
		SimpleInterest SI = new SimpleInterest();
		SI.CalculateSimpleInterest(15, 2, 10, 100);
	}
}