package renuka.exam6;

/*Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/

public class MaximumFrequency {
	
	char getMaxFrequency(String str) {
		int count = 0;
		int maxCount = 0;
		char ch = ' ';
		for(int index = 0; index < str.length(); index++){
			char ch1 = str.charAt(index);
			for(int innerIndex = index +1; innerIndex < str.length(); innerIndex++) {
				if(ch1 == (str.charAt(innerIndex))) {
					count++;
				}
			}
			if(maxCount < count) {
			maxCount = count;
			ch = ch1;
			count = 0;
			}
			else
			count = 0;
		}
		return ch;
		    
	}
	
	public static void main(String[] args) {
		MaximumFrequency maximumFrequency = new MaximumFrequency();
		  String str = "globant india is hiring";
		  //String str[] = str1.split(" ");
		  System.out.println("Maximum frequency word is: " + maximumFrequency.getMaxFrequency(str));

	}

}
