package dipali;

public class Assignment24 {
	
	public void findMiddleCharFromString(String [] arr) {
		if(arr!=null) {
			int len=arr.length;
			for(int cnt=0 ;cnt<=len-1;cnt++) {
				int lenOfEacharr=arr[cnt].length();
				for(int c=0 ; c<=lenOfEacharr-1;c++) {
					int charat=(lenOfEacharr-1)/2;
					char ch=arr[c].charAt(charat);
					System.out.println(ch);
					if((len-1)==c)
						break;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment24 assignment24=new Assignment24();
		String [] arr= {"Techno", "Hello", "Credits"};
		assignment24.findMiddleCharFromString(arr);

	}

}
