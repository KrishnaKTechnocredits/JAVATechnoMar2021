package rashmi;
public class SimpleInterst{
	
	void simpInt(float p, float t, float r){
		float result = (p*t*r)/100;
		System.out.println("Simple interest is " + result);
	}
	
	public static void main(String[] args){
		SimpleInterst simpleinterest = new SimpleInterst();
		simpleinterest.simpInt(400,5,3);
	}
}