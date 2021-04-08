package monali.Assignment_12;

public class Assi_12_Static {
	
	    double num1;
		double num2;
        double num3;


	  double sum()  {
		double Answer = num1+num2+num3;
		return Answer; 
	}
	
	double average1(){
		double sum1 = sum();
	    double average =sum1 /3;
	    return average;
	}
	
	boolean isAnswerAboveExpectation() {
		double average1 = average1();
		if(average1 >= 50) {
		System.out.println("Answer is above Expectation");
		return true;
		}
		else{
			System.out.println("Answer is below Expectation");
			return false;
		}
	}
		
		static boolean isEligible() {
			Assi_12_Static assi_12_static = new Assi_12_Static();
			 double average1 = assi_12_static.average1();
		if(average1 >= 50 || average1 %2 ==0) {
	    System.out.println("candidate is eligible");
		return true;
		}
	     else {
	    	 System.out.println("candidate is not eligible");
		      return false;
	}
}
	
	
	static char getYourGrade() {
		Assi_12_Static assi_12_static = new Assi_12_Static();
		 double average1 = assi_12_static.average1();
		 if(average1 >= 80) { 
		System.out.println("candidate obtained A grade");
		return 'A';
	}
		 else if(average1 <= 80) {
			 System.out.println("candidate obtained B grade");
		 }
			 return 'B';
		 
	}

	
		public static void main(String[] a) {
		Assi_12_Static assi_12_static = new Assi_12_Static();
		assi_12_static.num1 = 30.3;
		assi_12_static.num2 = 20.10;
		assi_12_static.num3 = 10.5;
		assi_12_static.average1();
		assi_12_static.isAnswerAboveExpectation();
		assi_12_static.isEligible();
	    assi_12_static.getYourGrade();
		}
}
	
	
	


