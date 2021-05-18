/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
*/
package sourabh.CodingExam_6;

public class FindCharhavingMaxFrequency {
	char getCharhavingMaxFrequency(String strInput) {
		int maxCount=0;
		char maxChar=' ';
		for(int index=0; index<strInput.length(); index++) {
			//char checkCh= strInput.charAt(index); 
			int count=1;		
			for(int innerIndex= index+1; innerIndex<strInput.length(); innerIndex++) {
				if(strInput.charAt(index)==strInput.charAt(innerIndex))
					count++;
				
			}
			if(maxCount<count) {
				maxCount= count;
				maxChar= strInput.charAt(index);
			}
		}
		return maxChar;
		
	}
	public static void main(String[] args) {
		FindCharhavingMaxFrequency findCharhavingMaxFrequency= new FindCharhavingMaxFrequency();
		char maxCh= findCharhavingMaxFrequency.getCharhavingMaxFrequency("globant india is hiring");
		System.out.println("output : "+maxCh);
	}
}
