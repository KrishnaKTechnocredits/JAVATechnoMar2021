//Assign 2- program3-- WAP to compute simple interest
//si- ptr/100
package kajal;

class SimpleInterest{
	
	void calculate(int principal,int time, int rate){
		double SI = (principal * time * rate)/ 100;
		System.out.println("simple Interest is " +SI);
	}
	public static void main(String [] args){
		SimpleInterest simple = new SimpleInterest();
		simple.calculate(2000,2,20);
		}
	}
		
		
