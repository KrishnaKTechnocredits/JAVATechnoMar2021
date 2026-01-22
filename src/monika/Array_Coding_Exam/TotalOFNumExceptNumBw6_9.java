package monika.Array_Coding_Exam;
/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.
input 1: [1,3,5]
output 1: 9
input 2 : [4,5,6,12,2,9,1,3]
output 2: 13
input 3 : [2,1,6,9,11,6,19,12,9,2]
output 3: 16
input 4 : [6,1,4,5,9]
output 4 : 0*/
public class TotalOFNumExceptNumBw6_9 {

	public static int returnSumOfNum(int[] num, int startNum, int endNum) {
		int temp =0;
		for(int index = 0;index<num.length;index++) {
			 if(num[index] == startNum) {
				 for(int j = index+1;j<num.length;j++) {
					 if(num[j] == endNum) {
						 index = j;
						 break;
					 }
				 }
			}else {
				temp = temp + num[index];	
			}
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		int[] num1 = {1,3,5};
		int[] num2 = {4,5,6,12,2,9,1,3};
		int[] num3 = {2,1,6,9,11,6,19,12,9,2};
		int[] num4 = {6,1,4,5,9};
		
		System.out.println(returnSumOfNum(num2,6,9));
	}

}
