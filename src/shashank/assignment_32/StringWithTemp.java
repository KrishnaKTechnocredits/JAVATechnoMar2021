package shashank.assignment_32;

public class StringWithTemp {
	void stringSwap(String str1, String str2) {
		String temp = "";
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("Swapped strings are string1:- " + str1 + " string2:- " + str2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWithTemp stringWithTemp = new StringWithTemp();
		String str1 = "Techno", str2 = "Credits";
		System.out.println("Given strings are string1:- " + str1 + " string2:- " + str2);
		stringWithTemp.stringSwap(str1, str2);
	}

}
