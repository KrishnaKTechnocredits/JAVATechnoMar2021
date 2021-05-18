package trupti.String;

public class MiddleChar {
	char getMiddleChar(String str) {
		char middleChar;
		if(str.length() % 2 == 0) {
			middleChar = str.charAt((str.length()-1)/2);
		}
		else {
			middleChar = str.charAt(str.length()/2);
		}
		return middleChar;
	}

	public static void main(String[] args) {
		MiddleChar middlechar=new MiddleChar();
		String[] arr={"Techno", "Hello", "Credits"};

		for(int index = 0; index < arr.length; index ++) {
			char ch = middlechar.getMiddleChar(arr[index]);
			System.out.println(index + 1 + ")" +" Middle character of "+arr[index]+ " is " + ch);
		}
		
	}

}
