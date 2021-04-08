package siddhant;

class Switch{
	void Switch1(char vowel){
		switch(vowel){
			case 'a' :
			case 'A' :
						System.out.println(vowel + " is a vowel");
						break;
			case 'e' :
			case 'E' :
						System.out.println(vowel + " is a vowel");
						break;
			case 'i' :
			case 'I' :
						System.out.println(vowel + " is a vowel");
						break;
			case 'o' :
			case 'O' :
						System.out.println(vowel + " is a vowel");
						break;
			case 'u' :
			case 'U' :
						System.out.println(vowel + " is a vowel");
						break;
			default	:
						System.out.println(vowel + " is not a vowel");
		}
	}
	public static void main(String[]args){
		Switch sw = new Switch();
		sw.Switch1('I');
		sw.Switch1('d');
		sw.Switch1('u');
	}
}
		
		