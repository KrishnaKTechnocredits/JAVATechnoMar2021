package sandesh.OWN_Practice_Sandesh_1;

public class ReverseUsingStringBuffer {

	public static void main(String[] args) {
		String str = "NAMANT";
		StringBuffer sb = new StringBuffer(str); // Created StringBuffer and passed str to it.
		sb.reverse();						 // StringBuffer is mutable, so reversed the string using .reverse() method of StringBuffer.
		if(sb.toString().equals(str))	     // .equals() method of StringBuffer compares the memory address. So converting the SB back to string and then using .equals() method of String class which overrides .equals() of Object class. It simply compares the content.
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is NOT a Palindrome");
		
		StringBuffer sb1 = new StringBuffer(str);
		if(sb1.equals(sb1))
			System.out.println("sb1's memory address is indeed same as sb1's memory address");
		if(sb.equals(sb1))
			System.out.println("sb and sb1 have same memory address");
		else
			System.out.println("Hence Proved. sb and sb1 have different memory address coz .equals() method in case of SB is not overridden. It uses .equals() of Object class which compares memory addresses.");
	}
}
