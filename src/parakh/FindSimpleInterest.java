package parakh;

public class FindSimpleInterest{

      void computerSimpleInterest(int principal, int time, int rate){
	       System.out.println("Simple Interest is: " +(principal*time*rate)/100);
	  }
	  
	  public static void main(String args[]){
	       FindSimpleInterest findSimpleInterest = new FindSimpleInterest();
		   findSimpleInterest.computerSimpleInterest(2500, 10, 2);
	  }
}