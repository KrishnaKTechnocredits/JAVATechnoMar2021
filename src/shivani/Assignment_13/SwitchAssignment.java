package shivani.Assignment_13;

public class SwitchAssignment {
	
	void  switchex1(char vowel) {
		switch(vowel) {
		case 'a':
		case 'A' :	
			System.out.println(vowel + " is a vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(vowel + " is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(vowel + " is a vowel");
			break;
			
		case 'o':
		case 'O':
			System.out.println(vowel +" is a vowel");
			break;
			
		case 'u':
		case 'U':
			System.out.println(vowel + " is a vowel");
			break;
			default:
				System.out.println(vowel + " is not a vowel");
			
			
				
	}

}
	public static void main(String[] args) {
		SwitchAssignment switchAssignment =new SwitchAssignment();
		switchAssignment.switchex1('d');
		switchAssignment.switchex1('i');
		switchAssignment.switchex1('I');
	}
}
