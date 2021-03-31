// program to find simple interest.
package monali;

class Simpleinterest{
	
	void interest(float P,float R,float T){
		float ans =(P*R*T)/100;
		System.out.println("Simple interest of number is" +ans);
	}

	public static void main(String[] a){
		Simpleinterest simpleinterest = new Simpleinterest();
		simpleinterest.interest(1500,10,5);
		}
		}
		