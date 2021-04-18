package dipali;

public class Assignment22PC {
	
	public void findallFrequencyOfCharacterFromStringArray(char ch ,String[] arr) {
		if(arr.length!=0) {
			int len=arr.length;
			int cnt=0;
			for(;cnt<len;cnt++) {
				int length=arr[cnt].length();
				int charCount=0;
				for(int counter=0;counter<length;counter++) {
					if(arr[cnt].charAt(counter)==ch) 
						charCount++;
				}
				
				if(charCount>0) 
					System.out.println("Character ["+ch+"] found in String ["+arr[cnt]+"] for ["+charCount+"] times");
				else
					System.out.println("Character ["+ch+"] not found in String ["+arr[cnt]+"]");
			}	
		}
	}

	public static void main(String[] args) {
		Assignment22PC assignment22pc=new Assignment22PC();
		String[] arr= {"raj", "aarya", "aavruti", "shruti"};
		assignment22pc.findallFrequencyOfCharacterFromStringArray('a', arr);
		assignment22pc.findallFrequencyOfCharacterFromStringArray('j', arr);
		assignment22pc.findallFrequencyOfCharacterFromStringArray('r', arr);
	}

}
