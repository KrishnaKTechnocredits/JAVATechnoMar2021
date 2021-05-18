package meenu.assignment_25;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/

public class StringWithNum {
	
	String[] getStringWithNum(String[] names) {
		String[] outputArray = new String[names.length];
		int outputArrayIndex = 0;
			for (int index = 0; index < names.length; index++) {
				for (int stringIndex = 0; stringIndex < names[index].length(); stringIndex++)
					if (Character.isDigit(names[index].charAt(stringIndex))) {
						outputArray[outputArrayIndex] = names[index];
						outputArrayIndex++;
						break;
					}
			}	
		return outputArray;
	}

	public static void main(String[] args) {
		String[] names = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		StringWithNum stringWithNum = new StringWithNum();
		String[] outputArray = stringWithNum.getStringWithNum(names);
		
		for(int index = 0;index<outputArray.length;index++) {
			if(outputArray[index]!= null)
				System.out.println(outputArray[index]);
		}
	}	

}
