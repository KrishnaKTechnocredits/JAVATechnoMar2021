package kapil.CodingTest.Test5;

public class ReverseString {

	
	
	void getRevWordString(String[] input1) {
		{ for(int index =0; index<input1.length;index++)
			{
		StringBuffer sb1 = new StringBuffer(input1[index]);
		
		sb1.reverse();
		 
	System.out.println(sb1.toString());}}
		}

	
	public static void main(String[] args) {
		ReverseString reversestring = new ReverseString();
		String input = "hi hello how are you";
		String[] input1 = input.split(" ");
		reversestring.getRevWordString(input1);
	}
}
