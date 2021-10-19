package amrutaM;
/*find the substring starting from last hi to first Globant. 
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
public class Assignment38SubString {

	static void getDesiredSubstring(String input) {
		String ans="";
		for(int index= 0; index<input.length();index++) {
			ans = input.substring(input.lastIndexOf("Hi"), input.indexOf("Globant")+"Globant".length());
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		getDesiredSubstring(str);
	}
}
