	/*Assignment - 32 : 4th May'2021
	program 1: swap 2 String without using temporary variable.
	input : input1 = "Techno" , input2 = "Credits";
	output : input1 = "Credits", input2 = "Techno"*/
    package pravin.Assignment_32;
	public class SwapStringWithoutTemp {

		void getSwappedString(String str1, String str2) {
			System.out.println("Original Strings: " + str1 + " " + str2);
			str1 = str1 + str2;
			str2 = str1.substring(0, (str1).length() - str2.length());
			str1 = str1.substring(str2.length());
			System.out.println("Swapped Strings: " + str1 + " " + str2);
		}

		public static void main(String[] args) {
			new SwapStringWithoutTemp().getSwappedString("Techno", "Credits");
		}
	}

