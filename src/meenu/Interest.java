package meenu;

/*Assignment_2 -> Program_3: Write a Java program to compute simple interest
 */ 
 
class Interest{

	void calcInterest(float principal, float rateOfInterest, float time){
		float simpleInterest = (principal*rateOfInterest*time)/100;
		System.out.println("Simple Interest is "+simpleInterest);
	}

	public static void main(String[] args){
		Interest interest1 = new Interest();
		interest1.calcInterest(1000,10,4);
	}
}	