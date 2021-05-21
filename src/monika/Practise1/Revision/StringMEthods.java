package monika.Practise1.Revision;

public class StringMEthods {

	public static void main(String[] args) {
		String str1 = "as";
		String str2 = "a";
		int ans = str1.compareTo(str2);
		int ans1 = str2.compareTo(str1);
		//compareTo method compares askii value of chars
		//if one of the string is blank then it takes length of string 1 - 0 and gives result;		int ans = str1.compareTo(str2);
		//it compares char vs char ascii value and if one string has more length and rest of the value is same then also it will send result based on length
		System.out.println(ans);
		System.out.println(ans1);
		
		System.out.println(str1.replace("a", "h"));
		System.out.println(str1.replace('s', 'm'));
		String s1 = new String("Hi");
		String s2 = "Hi";
		String s3 = s1.intern();
		System.out.println(s1 ==s2);
		System.out.println(s3 == s3);		
	}
}
