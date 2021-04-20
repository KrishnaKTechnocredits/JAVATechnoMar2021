package trupti.String.Assi25_26;

public class StringSumDigit {
	int getDigitSum(String str) {
		char c;
		int ascii;
		int sum=0;
		for(int index=0;index<str.length();index++) {
			c=str.charAt(index);
			ascii=c;
			if(Character.isDigit(c)) {
				sum=sum+Character.getNumericValue(c);
			}
		
		}
		return sum;
	}

	public static void main(String[] args) {
		StringSumDigit stringsumdigit=new StringSumDigit();
		String [] arr={"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		System.out.println("Sum of digits present in String is : ");
			for(int index=0;index<arr.length;index++) {
				int ans=stringsumdigit.getDigitSum(arr[index]);
				System.out.println((arr[index]));
				System.out.println(ans);
			}

	}

}
