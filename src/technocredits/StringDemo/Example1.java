package technocredits.StringDemo;

public class Example1 {

	public static void main(String[] args) {
		String str = "TechnoCREditS";
		//char ch = str.charAt(1);
		
		System.out.println(Character.isUpperCase(str.charAt(1)));
		
		char ch = '1'; // 1
		int sum = 10;
		
		sum = sum + (int)ch; // 49
		
		System.out.println(sum); // 11
	}
}
