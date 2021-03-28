package bhavana;
class SimpleInterest{
	
	void simpleInterestShow(float principle_amount,float time,float rate){
		float simple_interest;
		simple_interest=(principle_amount*time*rate)/100;
		System.out.println("Simple interest is:" +simple_interest);
	}
	
	public static void main(String [] args){
		SimpleInterest si= new SimpleInterest();
		si.simpleInterestShow(20,40,48);
	}
}