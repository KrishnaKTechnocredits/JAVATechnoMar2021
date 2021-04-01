package prashant;

public class SimpleInt {
	
	void simpleint(int P, double T, double R) {
		
		double si=(P*T*R)/100;
				System.out.println("Simple intrest of given P=1000, time=1 ,Rate=8.5  :" + si);
		
	}

	public static void main(String[] args) {
		SimpleInt si = new SimpleInt();
		si.simpleint(12000, 1, 6.5);
				
	}
	
}
