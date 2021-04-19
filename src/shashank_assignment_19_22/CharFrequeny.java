package shashank_assignment_19_22;

public class CharFrequeny {

	private void oneCharFrequency(String str1,char ch) {
			int cnt=0;
			for (int index=0;index<str1.length();index++) {
				if (str1.charAt(index)==ch) {
					cnt++;
				}
			}
			System.out.println("Occurance of "+ch+" in "+str1+" is "+cnt+" times" );
		
	}
	private void countFrequency(String str,char ch) {
		int count=0;	
		for (int index=0;index<str.length();index++) {
				if (str.charAt(index)==ch)
					count++;
			}
		System.out.println(ch +" occures "+count +"times");
	}
	
	private void allCharFrequency(String str2) {
		for (int index=0;index<str2.length();index++) {
				if (str2.indexOf(str2.charAt(index))==index) {
						countFrequency(str2,str2.charAt(index));
				}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharFrequeny charFrequeny = new CharFrequeny();
		String str1="technocredits";
		charFrequeny.oneCharFrequency(str1,'e');
		String str2="aakanksha";
		charFrequeny.allCharFrequency(str2);
		
	}

}
