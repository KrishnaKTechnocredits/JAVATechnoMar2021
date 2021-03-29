package pallavi;

class SimpleInterest{
	float principal;
	float time;
	float rate;
	float si;
	
	void calculate(float p,float r,float t){
	si=(p*r*t)/100;
	System.out.println(si);
	
	}

	public static void main(String args[]){
	SimpleInterest simpleInterest= new SimpleInterest();
	simpleInterest.calculate(200,10,2);
	}
}