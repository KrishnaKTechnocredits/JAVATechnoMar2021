package renuka.assignment12;

/*Assignment 12 : 5th April 2021
Design to test static, non static, return type concepts.
1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.
Sample input2 : 
50,20,20
Sample output2 : 
Candidate is Eligible
Candidate obtained A grade.
Note :Sum method should not be called from main method, it should be called from Average method (think about code reusability).
 */

public class ReturnTypeStaticNonStatic {
	
	double sum(double num1, double num2, double num3) {
		double sumAnswer = num1 + num2 + num3;
		System.out.println("Sum of 3 number is: " + num1 + ", " + num2 + ", " + num3 + " is : " + sumAnswer);
		return sumAnswer;
	}

	double average(double num1, double num2, double num3) {
		double sumAnswer = sum(num1, num2, num3);
		double averageAnswer = sumAnswer / 3;
		System.out.println(
				"Average of 3 number is: " + num1 + ", " + num2 + ", " + num3 + " is : " + averageAnswer);
		return averageAnswer;
	}

	boolean isAnswerAboveExpecation(double averageAnswer) {
        if (averageAnswer > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double averageAnswer) {
		if (averageAnswer > 50 || averageAnswer % 2==0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double averageAnswer) {
		if (averageAnswer > 80)
			return "A Grade";
		else
			return "B Grade";
	}


	public static void main(String[] args) {
		
		ReturnTypeStaticNonStatic returnTypeStaticNonStatic = new ReturnTypeStaticNonStatic();
        double averageAnswer = returnTypeStaticNonStatic.average(10, 20, 30);// average() is non static method
        
        boolean eligiblityCriteria = isEligible(averageAnswer);//isEligible() is static method
        if (eligiblityCriteria == true)
        System.out.println("Candidate is Eligible");
        else
        System.out.println("Candidate is not Eligible");

        String grade = getYourGrade(averageAnswer);//getYourGrade() is static method
        System.out.println("Candidate obtained " + grade + "\n");
        

        ReturnTypeStaticNonStatic returnTypeStaticNonStatic1 = new ReturnTypeStaticNonStatic();// Another
		
        double averageAnswer1 = returnTypeStaticNonStatic1.average(90, 80, 80);// average() is non static method
        boolean eligiblityCriteria1 = isEligible(averageAnswer1);//isEligible() is static method
        if (eligiblityCriteria1 == true)
        System.out.println("Candidate is Eligible");
        else
        System.out.println("Candidate is not Eligible");

        String grade1 = getYourGrade(averageAnswer1);// getYourGrade() is static method
        System.out.println("Candidate obtained " + grade1);

	}

}
