package technocredits.StringDemo;

public class Example13 {

	public static void main(String[] args) {
		String str1 = "naman";
		StringBuffer sb1 = new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str1);
		sb2 = sb1.reverse();
		
		System.out.println(sb2.toString());
		
		if (sb1.toString().equals(str1))
			System.out.println("palindrome");
		else
			System.out.println("not");
		
		String obj1 = new String("Maulik");
		String obj2 = new String("maulik");
		System.out.println(obj1.equalsIgnoreCase(obj2));
	}
}

