//Assignment 2

package rupali;
class SimpleInterest{
	
	void interest(int p,int n,int r){
		System.out.println("The Simple Interest is:"+(p*n*r)/100);
	}
	
	public static void main(String[] args){
		int principle,year,rate;
		SimpleInterest simpleinterest= new SimpleInterest();
		principle=10000;
		year=5;
		rate=10;
		simpleinterest.interest(principle,year,rate);
	}
}