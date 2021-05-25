package krati_Shukla.Exam6;

public class MaxLetter {
	void MaxCount(String str) {
		int oldCount=0;
		int newCount=1;
		char newMaxFreq =' ';
		char oldMaxFreq =' ';
		
		int length = str.length();
		
		for(int index=0; index<length ; index++) {
			char ch = str.charAt(index);
			for(int newIndex=0; newIndex<length ; newIndex++) {
				if(ch == str.charAt(newIndex) && (index !=newIndex) && (Character.isLetter(ch))) {
					newCount++;
					newMaxFreq = str.charAt(newIndex);
				}
			}
			if(oldCount < newCount) {
				oldCount = newCount;
				oldMaxFreq = newMaxFreq;
			}
			newCount=1;
		}
		System.out.println("Character :"+oldMaxFreq);
	}
	
	public static void main(String[] a) {
		String input = "Aashvi Krati technocredits pune";
		MaxLetter maxLetter = new MaxLetter();
		maxLetter.MaxCount(input);
	}

}
