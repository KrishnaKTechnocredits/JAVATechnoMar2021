// WAP to calculate simple interst.

package ashwini;

class simpleInterst{
	double principle, rate , time;
	double interst;
	
	void simpleInterst( double p , double r , double t){
		interst = (p*r*t)/100;
		System.out.println("Simple Interst is :"+ interst);
	}
	public static void main(String args[]){
		simpleInterst simpleInterst1 = new simpleInterst();
		simpleInterst1.simpleInterst(20202, 2.5, 3);
	}
}
	