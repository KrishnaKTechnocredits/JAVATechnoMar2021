package technocredits.StringDemo;

public class Example15 {

	public static void main(String[] args) {
		String temp1 = "technocredits";
		System.out.println(temp1.indexOf(""));
		System.out.println(temp1.lastIndexOf(""));
		
		
		String[] temp2 = temp1.split("");
		System.out.println(temp2.length);
		
		String str1 = new String("Hi");
		String str2 = "Hi"; // SCP
		String str3 = str1.intern(); // Object
		
		System.out.println(str2 == str3);
		
		int x = 10;
		String str = String.valueOf(10.10); // "10.10"
		System.out.println(str);//
		
		String temp = String.valueOf(x);
		
		String str5 = "H i";
		StringBuffer str6 = new StringBuffer("Hi");
		System.out.println(str5.contentEquals(str6));
		
		char[] ch = str5.toCharArray();
		//System.out.println(ch[0]); // H
		//System.out.println(ch[1]); // i
		System.out.println(ch.length);
		
		String str7 = "technocredits"; // 
		char[] ch1 = new char[5];
		str7.getChars(1,5,ch1,1);
		System.out.println("---" + ch1[0]); // 
		System.out.println("***" + ch1[1]); // 
		
		
	}
}
