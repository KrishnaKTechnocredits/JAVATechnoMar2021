class SimpleInterest
{
	void CalSimpleInterest(float intPrinciple, float intTime,float intRate){
		float fltSimpleInterest=(intPrinciple * intTime * intRate)/100;
		System.out.println("Principle  = " + intPrinciple);
		System.out.println("Time = " + intTime);
		System.out.println("Rate = " + intRate);
		System.out.println("Simple Interest = " + fltSimpleInterest);
	}
	
	public static void main(String[] agrs){
		SimpleInterest objSimInt =new SimpleInterest();
		objSimInt.CalSimpleInterest(1000,3,2);		
	}	
}