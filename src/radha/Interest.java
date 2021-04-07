//Assignment2- Write a Java program to compute simple interest

package radha;

class Interest{
	void simpleInterest(long principle, int time, double rate){
		double simpleInt = (principle*time*rate)/100;
		System.out.println("Simple interest is:"+ simpleInt);
	}
	
	public static void main(String[] args){
		Interest si = new Interest();
		si.simpleInterest(15000,3,3.5);
	}
}