package purva.Assignment_24;

public class MiddleCharOfString {
	
	void getMidChar(String[] input) {
		int midChar = 0;
		int index = 0;
		for(index = 0; index<input.length;index++) {
			if(input[index].length() %2 == 0) {
				midChar = (input[index].length()/2 -1);
			}
			else {
				midChar = input[index].length()/2;
			}
			System.out.print(input[index].charAt(midChar)+" ");
		}

	}
	
	public static void main(String[] a) {
		
		MiddleCharOfString middleCharOfString = new MiddleCharOfString();
		String[] input = {"Techno","Hello","Credits"};
		middleCharOfString.getMidChar(input);
		
	}
	

}
