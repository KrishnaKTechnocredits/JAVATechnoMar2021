package trupti.String.Assi25_26;

public class MaximumDigits {
	String getMaximumDigits(String[] arr){
		char c;
		String maxDigitString="";
		int maxDigitCount=0 , count=0;
		
		for(int outIndex=0;outIndex<arr.length;outIndex++) {
			String str = arr[outIndex];
			for(int innIndex=0;innIndex<str.length();innIndex++) {
				c=str.charAt(innIndex);
				if(Character.isDigit(c)) {
					count++;	
				}
			}
			
			if(maxDigitCount < count) {
				maxDigitCount = count;
				maxDigitString=str;
			}
		}
		return maxDigitString;

	}

	public static void main(String[] args) {
		MaximumDigits maximumdigits=new MaximumDigits();
		String [] arr={"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};

		String ans=maximumdigits.getMaximumDigits(arr);
		System.out.println("String with maximum digit count is :  "+ans);
	}

}
