package kangan.assignments.assignment_22;

/*Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
     k -> 2
         n -> 1
         s -> 1
         h -> 1*/
         
public class AllCharFrequency {
	
	void getFreqOfAllChar(String word) {
		
		for (int index=0;index<word.length();index++) {
			char target = word.charAt(index);
			if(word.indexOf(target)== index) {
				compare(word, target);
			}
		}	
	}
	void compare(String word, char target){
		int count =0;
		
		for (int index=0;index<word.length();index++) {
			if(word.charAt(index)==target)
				count++;
		}
		//System.out.println(count);
		System.out.println("Frequecy of letter " + target + " in word " + word + " is " + count);
	}
		
		
	public static void main(String[] args) {
		AllCharFrequency allCharFrequency = new AllCharFrequency();
		String word = "aakanksha";
		allCharFrequency.getFreqOfAllChar(word);
		
	}
}
