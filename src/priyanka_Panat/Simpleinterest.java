package priyanka_Panat;
/*
 Assignment 2
 */
class Simpleinterest{
	void interest(int p,int t,int r){
		int SI=(p*t*r)/100;
		System.out.println("Simple Interest is "+ SI);
	}
	public static void main(String[] args){
		Simpleinterest s= new Simpleinterest();
		s.interest(800,2,80);
	}
}
		