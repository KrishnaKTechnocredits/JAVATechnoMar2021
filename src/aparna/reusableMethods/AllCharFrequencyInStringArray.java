/*Assignment 22:-
 * c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	-------------------------------
 */
//modular approach
package aparna.reusableMethods;

public class AllCharFrequencyInStringArray {

	void getAllCharFrequencyInArray(String[] inputString) {
		AllCharacterFrequency allCharacterFrequency = new AllCharacterFrequency();
		for (int index = 0; index < inputString.length; index++) {
			allCharacterFrequency.getAllCharacterFrequency(inputString[index]);// reusability of Method
		}

	}

	public static void main(String[] args) {
		AllCharFrequencyInStringArray allCharFrequencyInStringArray = new AllCharFrequencyInStringArray();
		String[] inputString = { "raj", "aarya", "aavruti", "shruti" };
		allCharFrequencyInStringArray.getAllCharFrequencyInArray(inputString);
	}

}
