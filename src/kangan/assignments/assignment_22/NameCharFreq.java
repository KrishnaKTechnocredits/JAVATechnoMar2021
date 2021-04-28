package kangan.assignments.assignment_22;

/*Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
Output : r -> 1 time in raj
         a -> 1 time in raj
         j -> 1 time in raj
    =====================
    a -> 3 time in aarya
        r -> 1 time in aarya
         y -> 1 time in aarya
    ====================
    And so on....	-------------------------------*/
    
public class NameCharFreq {

public static void main(String[] args) {
	AllCharFrequency allCharFrequency = new AllCharFrequency();
	String[] word = {"raj", "aarya", "aavruti", "shruti"};
	for (int index = 0; index < word.length; index++) {
		System.out.println("Word :  " + word[index]);
		allCharFrequency.getFreqOfAllChar(word[index]);
	}
}
}
	