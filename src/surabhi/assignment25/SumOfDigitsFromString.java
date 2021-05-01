package surabhi.assignment25;

public class SumOfDigitsFromString {
	
	void findSum(String[] str) {
		int sum=0;
		for(int index=0;index<str.length;index++) {
			for(int innerIndex=0;innerIndex<str[index].length();innerIndex++) {
				if(Character.isDigit(str[index].charAt(innerIndex))) {
					sum=sum+Character.getNumericValue(str[index].charAt(innerIndex));
				}
			}
			System.out.print(sum+" ");
			sum=0;
		}
		
	}
	
	public static void main(String[] args) {
		SumOfDigitsFromString sumOfDigitsFromString=new SumOfDigitsFromString();
		String[] str={"Tech1No2Credits3", "Ha6rs8h", "Su9ra3bhi", "Shr1yas5h9", "Ash3vi4", "1Krishna3"};
		sumOfDigitsFromString.findSum(str);

	}

}
