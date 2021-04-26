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
	int sum, num;
	int getSumOfInteger(String str){
		String concateDigit = "0";
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);

			if(Character.isDigit(ch)) {
				concateDigit = concateDigit+ch;				
				num = Integer.parseInt(String.valueOf(concateDigit));
			}
			else {
				int num = Integer.parseInt(String.valueOf(concateDigit)); 
				sum += num;
				concateDigit = "0";
			}

		}
		return sum += num;
	}


	public static void main(String[] args) {
		SumOfInteger integersum= new SumOfInteger();
		String str = "12h14i4w8sdc15";
		int displaySum= integersum.getSumOfInteger(str);	
		System.out.println(displaySum);


	}

}
