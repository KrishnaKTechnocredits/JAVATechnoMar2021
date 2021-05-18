package shashank.assignment_32;

public class StringWithoutTemp {
	void stringSwap(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Swapped strings are string1:- " + str1 + " string2:- " + str2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWithoutTemp stringWithoutTemp = new StringWithoutTemp();
		String str1 = "Techno", str2 = "Credits";
		System.out.println("Given strings are string1:- " + str1 + " string2:- " + str2);
		stringWithoutTemp.stringSwap(str1, str2);
	}

}
