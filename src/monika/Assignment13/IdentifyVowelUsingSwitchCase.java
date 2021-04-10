package monika.Assignment13;

/*Assignment - 13 : 7th April'2021
WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
sample input2 : I
sample output2 : I is a vowel
sample input3 : i
sample output3 : i is a vowel*/
public class IdentifyVowelUsingSwitchCase {
	void isVowel(char ch) {
		char c = Character.toUpperCase(ch);
		switch(c){
			case 'A':
				System.out.println(c+" is a vowel");
				break;
			case 'E':
				System.out.println(c+" is a vowel");
				break;
			case 'I':
				System.out.println(c+" is a vowel");
				break;
			case 'O':
				System.out.println(c+" is a vowel");
				break;
			case 'U':
				System.out.println(c+" is a vowel");
				break;
			default:
				System.out.println(c+" is not a vowel");
				break;
		}
	}
	public static void main(String[] args) {
		IdentifyVowelUsingSwitchCase obj = new IdentifyVowelUsingSwitchCase();
		obj.isVowel('d');
		obj.isVowel('Z');
		obj.isVowel('A');
		obj.isVowel('e');
	}
}
