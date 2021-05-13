package madhavi_Khasbage.Coding_Exam_5;

/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy*/

public class ReverseString {

	String getOutPut(String my_str) {
		String output = "";		
		String[] arr=my_str.split(" ");
		for (int index = 0; index < arr.length; index++) {			
			 StringBuffer sbuffer = new StringBuffer(arr[index]);
			 output += sbuffer.reverse() +" ";		 
		}
		return output;
	}	
	
	public static void main(String[] args) {
		ReverseString reverseString1 = new ReverseString();
		System.out.println("Reverse string :" + reverseString1.getOutPut("hi hello how are you  good"));
	}
}
