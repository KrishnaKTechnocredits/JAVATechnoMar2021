/*
 * Assignment2_3
 * Write a Java program to compute simple interest 
 */
package neha_Rathi;

class Interest {
	void simpleInterest(int pric, float time, float rate) {
		float SI = pric * time * rate / 100;
		System.out.println("Simple interest is: " + SI);
	}

	public static void main(String[] args) {
		Interest interest = new Interest();
		interest.simpleInterest(100, 5.5f, 7.79f);
	}
}