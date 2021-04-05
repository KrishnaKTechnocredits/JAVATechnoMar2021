package aashay.staticNonStaticMethods;

		
	
public class StaticNonStaticReturnTypes {
	
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
		
	}
	double average(double num1, double num2, double num3) {
		double addition=  sum(num1,num2,num3);
		double average = addition/3;
		return average;
	}
	static boolean isAnswerAboveExpecation(double avrge) {
		if(avrge >50 ) {
			return true ;
		}else
			return false;
	}
	static boolean booleanisEligible(double avrge) {
		if(avrge >50 || (avrge%2 ==0)) {
			return true ;
		}else
			return false;
	}
	static String getYourGrade(double avrge) {
		if (avrge > 80 )		
			return "A garde";
		else
			return "B Grade";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticReturnTypes staticNonStaticReturnTypes = new StaticNonStaticReturnTypes();
		double avrge = staticNonStaticReturnTypes.average(10,20,30);
		//boolean isAnswerAboveExpe = StaticNonStaticReturnTypes.isAnswerAboveExpecation(avrge);
		boolean isEligible =  StaticNonStaticReturnTypes.booleanisEligible(avrge);
			if(isEligible== true)
				System.out.println("Candidate is eligible");
			else
				System.out.println("Candidate is not eligible");
		String yourGrade = StaticNonStaticReturnTypes.getYourGrade(avrge);
		System.out.println("Candidate obtained "+yourGrade);
		
		avrge = staticNonStaticReturnTypes.average(50,20,20);
		//boolean isAnswerAboveExpe = StaticNonStaticReturnTypes.isAnswerAboveExpecation(avrge);
		isEligible =  StaticNonStaticReturnTypes.booleanisEligible(avrge);
			if(isEligible== true)
				System.out.println("Candidate is eligible");
			else
				System.out.println("Candidate is not eligible");
		yourGrade = StaticNonStaticReturnTypes.getYourGrade(avrge);
		System.out.println("Candidate obtained "+yourGrade);
		
		
		
		}

}
