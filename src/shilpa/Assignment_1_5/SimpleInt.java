//Write a Java program to compute simple interest  
package shilpa;

class SimpleInt{
	
	void simpleinterest(int p, int t, int r){		
		int si = (p*t*r)/100;
		System.out.println("Simple interest is: "+ si);
	}
	
	public static void main(String[] arg){
		SimpleInt si1 = new SimpleInt();
		si1.simpleinterest(3000,3,2);
		
	}
}