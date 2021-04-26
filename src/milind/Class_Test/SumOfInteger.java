package milind.Class_Test;

public class SumOfInteger {
	
	void sumOfNum(String input) {
		int sum=0;
		for(int index=0;index < input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all Integer in String is: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfInteger SumOfInteger=new SumOfInteger();
		SumOfInteger.sumOfNum("12h14i4w8sdc15");
	}

}
