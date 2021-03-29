//Write a Java program to compute simple interest   
//Simple Interest = (P x T x R)/100 
//Where, 
	//P is the principle amount 
	//T is the time [year] and 
	//R is the rate
package komal;

class SimpleInterest{
	
	void interest(int P,int T,int R){
		int simpleinterest=(P*T*R)/100;
		System.out.println("Simple interest is "+simpleinterest);
	}	
	public static void main(String[] args){
		SimpleInterest SI = new SimpleInterest();
		SI.interest(2000,3,20);
	}
}
			