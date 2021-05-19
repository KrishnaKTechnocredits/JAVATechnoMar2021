package ankit.coding_exam_10;

public class ReverseStringInPlaceUsingBRMethod {

	public static void main(String[] args) {
		String input = "Techno";
		char temp = ' ';
		StringBuffer sb = new StringBuffer(input);
		for(int i = 0 , j = input.length()-1 ; i<j ; i++, j--) {
			sb.setCharAt(i, input.charAt(j)); 
			sb.setCharAt(j, input.charAt(i));
		}
		System.out.print(sb);
		}
	}

