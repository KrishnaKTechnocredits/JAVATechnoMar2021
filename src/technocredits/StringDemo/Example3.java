package technocredits.StringDemo;

public class Example3 {

	void countVowel(String word) {
		int count = 0;
		System.out.println(word + "->" + count);
	}
	
	static String[] m1() {
		String arr[] = {"Hi","Hello"};
		return arr;
	}
	
	public static void main(String[] args) {
		String input = "Hi He12llo Techno Credits Aashvi";
		String name = "Maulik \"Kanani";
		System.out.println(name);
		String[] arr = input.split("");
		System.out.println(arr.length);
		Example3 example3 = new Example3();
		for(int index=0;index<arr.length;index++) {
			example3.countVowel(arr[index]);
		}
	}
}
