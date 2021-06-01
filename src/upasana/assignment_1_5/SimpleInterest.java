package upasana.assignment_1_5;

class SimpleInterest{
	
	void simpleInterest(float p,float r, float t){
		System.out.println("Simple Interest calculated is "+(p*r*t)/100);
	}
	
	public static void main(String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.simpleInterest(3,6,4);
	}
}