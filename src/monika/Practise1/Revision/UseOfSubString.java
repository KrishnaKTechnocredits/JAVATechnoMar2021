package monika.Practise1.Revision;

public class UseOfSubString {
	String generateOutput(String[] arr) {
		String temp = "";
		for(int index=0;index<arr.length;index++) {
			temp = temp + "_" + arr[index];
		}
		return temp.substring(1);
	}

	public static void main(String[] args) {
		UseOfSubString obj = new UseOfSubString();
		String[] input = {"Hello", "Hi", "Technocredits"};
		String s = obj.generateOutput(input);
		System.out.println(s);
	}

}
