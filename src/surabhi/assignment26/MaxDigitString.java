package surabhi.assignment26;

public class MaxDigitString {
	void findMaxDigitString(String[] str) {
		 int count=0; int maxCount=0; String maxStr="";
		 for(int index=0;index<str.length;index++) {
			  for(int innerIndex=0;innerIndex<str[index].length();innerIndex++) {
				  if(Character.isDigit(str[index].charAt(innerIndex))) {
					  count++;
				  }
			  }
			  if(count>maxCount) {
				  maxCount=count;
				  maxStr=str[index];
				  count=0;
			  }
		 }
		  System.out.println(maxStr);
	}

	public static void main(String[] args) {
		MaxDigitString maxDigitString=new MaxDigitString();
		String[] str={"S1u2r2bhi", "1H2arsh", "9S4hreyas4h4", "1K2r3ishna", "4A4a5s5h1v1i93"};
		maxDigitString.findMaxDigitString(str);

	}

}
