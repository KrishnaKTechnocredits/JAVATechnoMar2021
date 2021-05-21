/*Assignment 22:-
 * a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits 
 */
package aparna.reusableMethods;

public class TargetCharacterFrequency {

	void getTargetCharacterFrequency(String inputString, char targetCharacter) {
		int targetCharCount = 0;
		inputString = inputString.toUpperCase();
		targetCharacter = Character.toUpperCase(targetCharacter);

		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == targetCharacter) {
				targetCharCount++;
			}

		}
		System.out.println(targetCharacter + " ->  " + targetCharCount + " time in " + inputString);
	}

	public static void main(String[] args) {
		TargetCharacterFrequency targetCharacterFrequency = new TargetCharacterFrequency();
		targetCharacterFrequency.getTargetCharacterFrequency("Technocredits", 'e');
	}

}
