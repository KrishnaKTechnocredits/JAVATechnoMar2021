/*1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) 
and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 
or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) 
and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 
or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.*/

package krati_Shukla.ReturningValues;

public class SumAverage {
	
	double totalSum (double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
	}
	
	double average (double num1, double num2, double num3) {
		double sum = totalSum(num1, num2, num3);
		double avg = (sum)/3;
		return avg;
	}
	
	boolean isAnswerAboveExpecation(double avg) {
		if (avg>50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double avg) {
		SumAverage sumAverage1 = new SumAverage();
		boolean eligible = sumAverage1.isAnswerAboveExpecation(avg);
		if ((eligible == true) || (avg%2==0))
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double avg) {
		if ((avg<=100) && (avg !=0)){
			if (avg>80)
				return "A";
			else
				return "B";
		}else
		return "invalid number";
	}
	
	public static void main(String[] a) {
		SumAverage sumAverage = new SumAverage();
		double avg = sumAverage.average(10, 20, 30);
		boolean eligible = SumAverage.isEligible(avg);
		if (eligible == true)
			System.out.println("Candidate is eligible");
		else
			System.out.println("Candidate is not eligible");
		String grade = SumAverage.getYourGrade(avg);
		System.out.println("Candidate obtained "+grade);	
		
		
		SumAverage sumAverage2 = new SumAverage();
		double avg1 = sumAverage2.average(90, 82, 90);
		boolean eligible1 = SumAverage.isEligible(avg1);
		if (eligible1 == true)
			System.out.println("Candidate is eligible");
		else
			System.out.println("Candidate is not eligible");
		String grade1 = SumAverage.getYourGrade(avg1);
		System.out.println("Candidate obtained "+grade1);
	}

}
