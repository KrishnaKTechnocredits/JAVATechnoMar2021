package amrutaM.Assignment22;

/*Program 1 : 
Find total digits in a given string. 
String str = "Te1ch2no3cr4ed3it4s"  
output : 6
*/
public class TotalCountOfDigits {

	void getTotal(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		System.out.println("Total digits in the given string are " + count);
	}

	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		new TotalCountOfDigits().getTotal(str);
	}
}
