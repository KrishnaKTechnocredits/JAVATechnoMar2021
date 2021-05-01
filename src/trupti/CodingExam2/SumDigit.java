package trupti.CodingExam2;

public class SumDigit {
	int getSumDigitWithConsecutive(String str) {
		char c;
		int sum=0;
		String tempStr="";
		for(int index=0;index<str.length();index++) {
			c=str.charAt(index);
			if(Character.isDigit(c)) {
				tempStr=tempStr+c;
				if(index==str.length()-1)
					sum=sum+Integer.parseInt(tempStr);
			}
			else {
				if(tempStr!="") {
					sum=sum+Integer.parseInt(tempStr);
					tempStr="";
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumDigit sumdigit=new SumDigit();
		int ans1=sumdigit.getSumDigitWithConsecutive("12h14i4w8sdc15");
		System.out.println("Output :"+ans1);

	}
}
