package ravindra_J.coding_exam_2;

/*
Coding Exam - 2 : 26th April 2021
Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53
package ravindra_J.coding_exam_2;
*/
public class SumOfInteger {

	 void getSumOfInterger(String str1){
		int sum =0;
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if(Character.isDigit(ch)) {
				String st = String.valueOf(ch);
				int st1= Integer.parseInt(st);
				
				sum = sum+st1;
			}
		}
		System.out.println("Sum of integer from string is -->" +sum);
		
	}
	
	
	public static void main(String[] args) {
		SumOfInteger integersum= new SumOfInteger();
		String str = "12h14i4w8sdc15";
		
		integersum.getSumOfInterger(str);

	}

}
