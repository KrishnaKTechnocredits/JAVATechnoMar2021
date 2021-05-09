package technocredits;

public class Example7 {

	void numberValidate(int num) {
		if(num >=18)
			System.out.println(num + " is valid");
	}
	
	void validateString(String str) {
		if(str.length() % 2 == 0)
			System.out.println("Techno");
		else
			System.out.println("Credits");
	}
	
	void validateAllString(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			validateString(arr[index]);
		}
	}
	
	void validateAllNumbers(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			numberValidate(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] num = {12,44,58,17,1,67};
		new Example7().validateAllNumbers(num);
	}
	
}
