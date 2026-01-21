package amrutaM.Assignment26;

/*Program : 1  WAP to print Reverse a given String. 
input : This is technocredits 
output : stiderconhcet si sihT
*/
public class P1_printReverseString {

	void getReverseString(String input) {
		String reverse = "";
		for(int index=input.length()-1;index>=0;index--) {
			reverse+=input.charAt(index);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		String input = "This is technocredits";
		new P1_printReverseString().getReverseString(input);
	}
}
