package technocredits.StringDemo;

public class Example5 {

	public static void main(String[] args) {
		String str1 = "Techno";
		String str2 = "TechnoCredits";
		String str3 = str2.substring(0,6); // "Techno"
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		String str4 = "Techno";
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
		String str5 = new String("Techno");
		System.out.println(str5.equals(str1)); // true
		
	}
}
