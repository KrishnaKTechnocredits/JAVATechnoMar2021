package krishna.Assignment_1_5;
class SimpleInterest{
	void interest(int principal,int time,double rate){
		double SimpleInterest;
		SimpleInterest = ((principal * time * rate)/100);
		System.out.println("Simple interest is: "+SimpleInterest);
	}
	public static void main(String[] args){
		SimpleInterest simpleInterest= new SimpleInterest();
		simpleInterest.interest(10000,2,5.56);
	}
}