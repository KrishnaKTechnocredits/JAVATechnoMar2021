package surabhi.assignment24;

public class StringMiddleChar {
	char[] findMiddleChar(String[] str) {
		char[] arr=new char[str.length];
		for(int index=0;index<str.length;index++) {
			if(str[index].length()%2!=0) {
				arr[index]=str[index].charAt(str[index].length()/2);
			}else
				arr[index]=str[index].charAt((str[index].length()/2)-1);
		}
		return arr;
	} 
	 

	public static void main(String[] args) {
		StringMiddleChar stringMiddleChar=new StringMiddleChar();
		String[] arr= {"Techno", "Hello", "Credits"};
		char[] result=new char[arr.length];
		result=stringMiddleChar.findMiddleChar(arr);
		 for(int index=0; index<result.length;index++) { 
			 System.out.println(result[index]);
		 }
	}

}
