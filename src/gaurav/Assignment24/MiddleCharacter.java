package gaurav.Assignment24;

public class MiddleCharacter {
	public static void main(String[] args) {
		String[] arr= {"Techno","Hello","Credits"};
		 for(int i=0;i<arr.length;i++) {
			 char ch=middle(arr[i]);
			 System.out.println(ch +" ");		 
		 }
	}

	public static char middle(String str) {
		int len = str.length();
		int middle=len/2;	
		return str.charAt(middle);
			
	}

}
