package dipali;

public class Assignment20 {
	
	public void getCount(String input) {
		int asciiUpper=0;
		int asciilower=0;
		int digit=0;
		int len=0;
		int specialchar=0;
		if(input!=null) {
			len=input.length();
			char[] ch=input.toCharArray();
			for (char chara : ch) {
				if(Character.isLowerCase(chara))
					asciilower++;
				else if(Character.isUpperCase(chara))
					asciiUpper++;
				else if(Character.isDigit(chara))
					digit++;
				else 
					specialchar++;
			}
		
		}
			System.out.println("String contains total letters "+len);
			System.out.println("Total upper case characters are "+asciiUpper);
			System.out.println("Total lower case characters are "+asciilower);
			System.out.println("Total digits in the string are "+digit);
			System.out.println("Total Special characters in the string are "+specialchar);
	}
	public static void main(String[] args) {
		Assignment20 assignment20=new Assignment20();
		assignment20.getCount("1rRpd3F9#K(E");
	}
}
