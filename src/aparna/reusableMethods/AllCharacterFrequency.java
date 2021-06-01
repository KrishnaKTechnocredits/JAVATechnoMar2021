/*Assignment 22:-
 * b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
 */
//modular approach
package aparna.reusableMethods;

public class AllCharacterFrequency {

	void getAllCharacterFrequency(String inputString) {
		TargetCharacterFrequency targetCharacterFrequency = new TargetCharacterFrequency();
		for (int index = 0; index < inputString.length(); index++) {
			char eachWord = inputString.charAt(index);
			if (index == inputString.indexOf(eachWord))
				targetCharacterFrequency.getTargetCharacterFrequency(inputString, inputString.charAt(index));// reusability
																												// of
																												// Method
		}
		System.out.println("=====================================================");
	}

	public static void main(String[] args) {
		AllCharacterFrequency allCharacterFrequency = new AllCharacterFrequency();
		allCharacterFrequency.getAllCharacterFrequency("aakanksha");
	}

}
