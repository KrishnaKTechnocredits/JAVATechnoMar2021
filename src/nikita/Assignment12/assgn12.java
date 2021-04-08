package nikita.Assignment12;

public class assgn12 {
	 
	double sum( double a, double b, double c) {
		double f= a+b+c;
		return f;
	}
	
	double avg(double a, double b, double c) {
		sum(10, 20, 30);
		double g= a+b+c/3;
		return g;	
	}
	
	boolean AnswerAboveExpectation(double ans) {
	
		
		if(ans>50) {
			return true;
		}
		else
			return false;
			

		
}
	
	public static boolean Eligible(double ans) {
		
		
		if (ans>50 || ans%2==0) {
			
			System.out.println("Candidate is Eligible");
			 return true;
		}
		else {
			System.out.println("Candidate is not Eligible");
			return false;
		}
				
			
		}
	
	static void getYourGrade(double ans) {
		
		if (ans>80)
			System.out.println("Grade A");
			else
				System.out.println("Grade B");
	}
	
public static void main(String args[]) {
	assgn12 a= new assgn12();
	double ans=(a.avg(10,20,30));
	Eligible(ans);
	getYourGrade(ans);

	
	
	
}
	
			
	}
