package technocredits.StringDemo;

public class Example14 {

	public static void main(String[] args) {
		String str1 = "Aashviz"; // 122 - 97 [25]
		String str2 = "Aashvi";
		
		int ans = str2.compareTo(str1);
		System.out.println(ans); // 0
		
		if(str1.compareTo(str2) == 0)
			System.out.println("Identical");
		else
			System.out.println("Different String");
		
	}
}
