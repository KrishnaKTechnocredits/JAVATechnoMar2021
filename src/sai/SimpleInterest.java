package sai;

class SimpleInterest{
		
	void simpleInt(int p, int t, int r){
		float si = (p*t*r)/100;
		System.out.println("Simple Interest is " + si);
	}
		
	public static void main(String[] args){
		SimpleInterest SI = new SimpleInterest();
		SI.simpleInt(11,11,11);
	}
}