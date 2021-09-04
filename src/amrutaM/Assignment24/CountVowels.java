package amrutaM.Assignment24;

/*Program 1: 
Java Program to Count the Number of Vowels in user defined string. 
Input : technocredits 
output : vowels are e , o, i 
*/
public class CountVowels {
	void getVowelsCount(String input) {
		System.out.println("Vowels are --> ");
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u') {
				//if(input.indexOf(ch)==input.lastIndexOf(ch))
				System.out.println(ch );
			}
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		new CountVowels().getVowelsCount(input);
	}
}
