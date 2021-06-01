package milind.Assignment_20;

public class SumOfDigitString {
	void sumOfDigit(String str) {
		int size=str.length();
		int sum=0;
		for(int index=0;index < size;index++) {
			if(Character.isDigit(str.charAt(index))) {
				int numericValue=Character.getNumericValue((str.charAt(index)));
				sum=sum + numericValue;
			}
		}
		System.out.println("Digit count in String is: "+sum);
	}
	public static void main(String[] args) {
		SumOfDigitString sumOfDigitString=new SumOfDigitString();
		String str="A5AA889bbb^&%^$8";
		int size=str.length();	
		System.out.println("String is :" +str);
		System.out.println("---------");
		sumOfDigitString.sumOfDigit(str);
	}

}
