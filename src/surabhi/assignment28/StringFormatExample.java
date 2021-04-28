package surabhi.assignment28;

public class StringFormatExample {
	String processStringFormat(String str) {
		String numericStr="", capitalCase="", smallCase="";
		char ch=' ';
		for(int index=0;index<str.length();index++) {
			ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				numericStr=numericStr+ch;
			}else if(Character.isUpperCase(ch)) {
				capitalCase=capitalCase+ch;
			}else if(Character.isLowerCase(ch)) {
				smallCase=smallCase+ch;
			}
		}
		
		return (numericStr+capitalCase+smallCase);
	}

	public static void main(String[] args) {
		StringFormatExample stringFormatExample=new StringFormatExample();
		String str=stringFormatExample.processStringFormat("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(str);

	}

}
