package dipali;

public class ComputeSimpleInterest{
	double si;
	
	void calculateSimpleInterest(double amount,int years,double rate){
		si=(amount*years*rate)/100;
		System.out.println("Calculated simple interest is ["+si+"]");
	}
	
	public static void main(String []args){
		ComputeSimpleInterest si=new ComputeSimpleInterest();
		si.calculateSimpleInterest(10000,5,6.7);	
	}
}